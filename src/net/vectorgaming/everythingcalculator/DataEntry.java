package net.vectorgaming.everythingcalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Kenny
 */
public class DataEntry extends javax.swing.JFrame
{
    private DefaultListModel<Double> listValues = new DefaultListModel<>();
    
    /**
     * Creates new form DataEntry
     */
    public DataEntry()
    {
        initComponents();
        this.getRootPane().setDefaultButton(jButton1);
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        inputField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        editValue = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        meanLbl = new javax.swing.JLabel();
        sLbl = new javax.swing.JLabel();
        minLbl = new javax.swing.JLabel();
        q1Lbl = new javax.swing.JLabel();
        medLbl = new javax.swing.JLabel();
        q3Lbl = new javax.swing.JLabel();
        maxLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        maxResult = new javax.swing.JLabel();
        minResult = new javax.swing.JLabel();
        q1Result = new javax.swing.JLabel();
        medResult = new javax.swing.JLabel();
        meanResult = new javax.swing.JLabel();
        q3Result = new javax.swing.JLabel();
        sResult = new javax.swing.JLabel();
        nLbl = new javax.swing.JLabel();
        nResult = new javax.swing.JLabel();
        zScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        inputField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                inputFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(list);

        jButton2.setText("Remove Selected");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Entry");

        editValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editValue.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editValueActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        meanLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meanLbl.setText("Mean");

        sLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sLbl.setText("Standard Deviation");

        minLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minLbl.setText("Minimum");

        q1Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        q1Lbl.setText("Q1");

        medLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        medLbl.setText("Median");

        q3Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        q3Lbl.setText("Q3");

        maxLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxLbl.setText("Maximum");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        maxResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        maxResult.setText("Maximum");

        minResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        minResult.setText("Minimum");

        q1Result.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        q1Result.setText("Q1");

        medResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        medResult.setText("Median");

        meanResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        meanResult.setText("Mean");

        q3Result.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        q3Result.setText("Q3");

        sResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sResult.setText("Standard Deviation");

        nLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nLbl.setText("N");

        nResult.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nResult.setText("N");

        zScore.setText("Z-Score Analysis");
        zScore.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                zScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editValue, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sLbl)
                            .addComponent(meanLbl)
                            .addComponent(nLbl)
                            .addComponent(maxLbl)
                            .addComponent(minLbl)
                            .addComponent(q1Lbl)
                            .addComponent(medLbl)
                            .addComponent(q3Lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sResult)
                            .addComponent(meanResult)
                            .addComponent(maxResult)
                            .addComponent(minResult)
                            .addComponent(q1Result)
                            .addComponent(medResult)
                            .addComponent(q3Result)
                            .addComponent(nResult)))
                    .addComponent(zScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(meanLbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sLbl)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editValue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(minResult)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(q1Result)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(medResult)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(q3Result)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maxResult))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(q1Lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(medLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(q3Lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maxLbl)))
                                .addGap(18, 18, 18)
                                .addComponent(zScore))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meanResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nResult)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.requestFocus();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_inputFieldActionPerformed
    {//GEN-HEADEREND:event_inputFieldActionPerformed
        
    }//GEN-LAST:event_inputFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        addButtonExecute();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addButtonExecute()
    {
        double input;
        try
        {
            input = Double.parseDouble(inputField.getText());
        }catch(Exception e)
        {
            return;
        }
        listValues.addElement(input);
        list.setModel(listValues);
        inputField.requestFocusInWindow();
        inputField.selectAll();
        updateStats();
    }
    
    private void updateStats()
    {
        if(listValues.size() < 1)
        {
            resetResultsLabels();
            return;
        }
        if(listValues.size() == 1)
        {
            double v = listValues.get(0);
            meanResult.setText(v+"");
            sResult.setText("0");
            nResult.setText("1");
            minResult.setText(v+"");
            maxResult.setText(v+"");
            q1Result.setText(v+"");
            q3Result.setText(v+"");
            medResult.setText(v+"");
            return;
        }
        
        double mean;
        double min = 0;
        double max = 0;
        double topTotal = 0;
        int n = listValues.size();
        ArrayList<Double> listValuesArray = new ArrayList<>();
        
        //calculate mean
        for(int i = 0; i < listValues.size(); i++)
        {
            double val = listValues.get(i);
            listValuesArray.add(val);
            topTotal += val;
            
            if(val > max)
                max = val;
            if(val < min)
                min = val;
        }
        mean = topTotal / n;
        
        //calculate s
        double totalDiff2 = 0;
        double variance = 0;
        double s = 0;
        for(int i = 0; i < listValues.size(); i++)
        {
            double diff = listValues.get(i) - mean;
            double diff2 = diff * diff;
            totalDiff2 += diff2;
        }
        variance = totalDiff2 / (n - 1);
        s = Math.sqrt(variance);
        
        //calculate median
        double median = findMedian(listValuesArray);
        
        ArrayList<Double> q1Array = new ArrayList<>();
        ArrayList<Double> q3Array = new ArrayList<>();
        if(listValues.size() % 2 == 0)
        {
            for(int i = 0; i < (n/2); i++)
                q1Array.add(listValues.get(i));
            
            for(int i = (n/2); i < listValues.size(); i++)
                q3Array.add(listValues.get(i));
        }else
        {
            for(int i = 0; i < (n/2); i++)
                q1Array.add(listValues.get(i));
            for(int i = (n/2) + 1; i < listValues.size(); i++)
                q3Array.add(listValues.get(i));
        }
        double q1 = findMedian(q1Array);
        double q3 = findMedian(q3Array);
        
        DecimalFormat df = new DecimalFormat("#.###");
        meanResult.setText(df.format(mean));
        sResult.setText(df.format(s));
        nResult.setText(n+"");
        minResult.setText(df.format(min));
        q1Result.setText(df.format(q1));
        medResult.setText(df.format(median));
        q3Result.setText(df.format(q3));
        maxResult.setText(df.format(max));
    }
    
    private double findMedian(ArrayList<Double> valueList)
    {
        int n = valueList.size();
        double median = 0;
        if(n % 2 == 0)
        {
            int medIndex1 = n/2;
            int medIndex2 = (n/2) - 1;
            double total = valueList.get(medIndex1) + valueList.get(medIndex2);
            median = total / 2;
            //System.out.println(median);
        }else
        {
            double medIndex = (n/2) + .5;
            median = valueList.get((int) medIndex);
            //System.out.println(median);
        }
        return median;
    }
    
    private void resetResultsLabels()
    {
        meanResult.setText("0");
        sResult.setText("0.0");
        nResult.setText("0");
        minResult.setText("0");
        q1Result.setText("0");
        medResult.setText("0");
        q3Result.setText("0");
        maxResult.setText("0");
    }
    
    private void editValueActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editValueActionPerformed
    {//GEN-HEADEREND:event_editValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editValueActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        listValues.clear();
        resetResultsLabels();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        int index = list.getAnchorSelectionIndex();
        if(index < 0)
            return;
        listValues.remove(index);
        list.setModel(listValues);
        updateStats();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void zScoreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_zScoreActionPerformed
    {//GEN-HEADEREND:event_zScoreActionPerformed
        
    }//GEN-LAST:event_zScoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try
//        {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
//            {
//                if ("Nimbus".equals(info.getName()))
//                {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex)
//        {
//            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex)
//        {
//            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex)
//        {
//            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex)
//        {
//            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new DataEntry().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editValue;
    private javax.swing.JTextField inputField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList list;
    private javax.swing.JLabel maxLbl;
    private javax.swing.JLabel maxResult;
    private javax.swing.JLabel meanLbl;
    private javax.swing.JLabel meanResult;
    private javax.swing.JLabel medLbl;
    private javax.swing.JLabel medResult;
    private javax.swing.JLabel minLbl;
    private javax.swing.JLabel minResult;
    private javax.swing.JLabel nLbl;
    private javax.swing.JLabel nResult;
    private javax.swing.JLabel q1Lbl;
    private javax.swing.JLabel q1Result;
    private javax.swing.JLabel q3Lbl;
    private javax.swing.JLabel q3Result;
    private javax.swing.JLabel sLbl;
    private javax.swing.JLabel sResult;
    private javax.swing.JButton zScore;
    // End of variables declaration//GEN-END:variables
}
