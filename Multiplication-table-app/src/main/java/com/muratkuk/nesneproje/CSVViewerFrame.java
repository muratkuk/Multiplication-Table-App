/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.muratkuk.nesneproje;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author muratkuk
 */
public class CSVViewerFrame extends javax.swing.JFrame {

    /**
     * Creates new form CSVViewerFrame
     */
    private String filename;
    private DefaultTableModel model;
    public CSVViewerFrame(String filename) {
        this.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                CSVViewerFrame.this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
                CSVViewerFrame.this.setVisible(false);
                CSVViewerFrame.this.dispose();       
            }
        });
        this.filename = filename;
        model = new DefaultTableModel(new String[]{"Questions", "Results", "ResponseTime"}, 0);
        initComponents();
        readCSVFile(filename);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(model);
        jLabel2 = new javax.swing.JLabel();
        speedScoreLabel = new javax.swing.JLabel();
        AccuracyScoreLabel = new javax.swing.JLabel();
        startTimeLabel = new javax.swing.JLabel();
        endTimeLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Exam Raport");

        jScrollPane1.setViewportView(table);

        jLabel2.setText("Questions");

        speedScoreLabel.setText("SpeedScore");

        AccuracyScoreLabel.setText("AccuracyScore");

        startTimeLabel.setText("StartTime");

        endTimeLabel.setText("EndTime");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speedScoreLabel)
                            .addComponent(AccuracyScoreLabel)
                            .addComponent(startTimeLabel)
                            .addComponent(endTimeLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(saveButton)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startTimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endTimeLabel)
                        .addGap(43, 43, 43)
                        .addComponent(speedScoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AccuracyScoreLabel)
                        .addGap(43, 43, 43)
                        .addComponent(saveButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a directory to save");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Allow only directories to be selected

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File dirToSave = fileChooser.getSelectedFile();
            System.out.println("Save to directory: " + dirToSave.getAbsolutePath());

            
            Path source = Paths.get(filename); 

            String destinationFileName = dirToSave.getAbsolutePath() + File.separator + filename; 
            Path destination = Paths.get(destinationFileName);
            try {
                Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }    
    }//GEN-LAST:event_saveButtonActionPerformed

    
    private void readCSVFile(String filename) {
        Path path = Paths.get(filename);

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            int rowNumber = 0;

            while ((line = reader.readLine()) != null) {
                rowNumber++;
                if(rowNumber==1){
                    String[] values = line.split(";;;;");
                    titleLabel.setText(values[0]);
                }
                if(rowNumber==2){
                    String[] values = line.split(";;;;");
                    startTimeLabel.setText(values[0]);
                }
                if(rowNumber==3){
                    String[] values = line.split(";;;;");
                    endTimeLabel.setText(values[0]);
                }
                if(rowNumber==5){
                    String[] values = line.split(";");
                    speedScoreLabel.setText("Speed Score: "+values[0]);
                    AccuracyScoreLabel.setText("AccuracyScore: "+values[1]);
                }
                if (rowNumber < 7) { // Skip the first 6 lines
                    continue;
                }

                String[] values = line.split(";");
                model.addRow(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccuracyScoreLabel;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel speedScoreLabel;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
