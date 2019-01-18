/* CSC 120 PA7
 * AJ Hammond
 * 11/18
 *
 * Project Description: Counter Strike arrays & processing different statistics & conditions in the array using for and if 
 *
 * Acknowledgements: array help from lab 9 & 10, some help from Prof. Cindric
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUFrame extends javax.swing.JFrame {

    
    private CStrikePlayer[] cStrikeTwo;
    
    // declare private data here
    
    
    
    
    
    
    
    // constructor method
    public MUFrame() {
        initComponents();

        

        
        
        
        
        //instantiate objects one at a time
        
        
        
        
    
        
    } // end of constructor
    
    
    
    
    
    
    
    
   public void displayAllPlayers(){
    
    topLabelText.setText("Displaying all players...");
       
    outputArea.append("============================================");
    outputArea.append("\n");
       
       for(Integer index = 0; index < cStrikeTwo.length; index++) {
           
           outputArea.append(cStrikeTwo[index].toString());
           outputArea.append("\n");
                     
       }
        
        outputArea.append("============================================");
        outputArea.append("\n"); 
        
    }//end displayAllPlayers
   
   
   
   
   
   
   
   
   
   public void displayBestFrags(){
      
       outputArea.append("============================================");
       outputArea.append("\n");
               
       
       topLabelText.setText("Displaying the best frags in the array...");
       
       Double bestFrags = cStrikeTwo[1].getFrags();
       String bestfragsName = cStrikeTwo[1].getName();
       
       for(Integer index = 0; index < cStrikeTwo.length; index++){
           
           
           
           if( cStrikeTwo[index].getFrags() > bestFrags){
               
               bestFrags = cStrikeTwo[index].getFrags();
               bestfragsName = cStrikeTwo[index].getName();
               
           }
           
       }
      outputArea.append("The highest amount of frags on this list is " + bestFrags + ", held by " + bestfragsName + "."); 
      outputArea.append("\n");
   } //end bestFrags
    
   
   
   
   
   
   
   
   
   public void displayWorstFrags(){
       
       outputArea.append("============================================");
       outputArea.append("\n");
       
       topLabelText.setText("Displaying the worst frags in the array...");
       
       Double worstFrags = cStrikeTwo[1].getFrags();
       String worstfragsName = cStrikeTwo[1].getName();
       
       for(Integer index = 0; index < cStrikeTwo.length; index++){
           
           if( cStrikeTwo[index].getFrags() < worstFrags){
               
               worstFrags = cStrikeTwo[index].getFrags();
               worstfragsName = cStrikeTwo[index].getName();
               
           }
           
       }
      outputArea.append("The least amount of frags on this list is " + worstFrags + ", held by " + worstfragsName + "."); 
      outputArea.append("\n");
       
   } //end worstFrags
   
   
   
   
   
   
   
   
   public void displayFazePlayers(){
     outputArea.append("============================================");
     outputArea.append("\n");
     outputArea.append("The following Counter-Strike players are players for FaZe:");
     outputArea.append("\n");

     topLabelText.setText("Displaying FaZe players...");    
       
     for(Integer index = 0; index < cStrikeTwo.length; index++){
         
         if( cStrikeTwo[index].getTeam().equals("FaZe")){
             
             outputArea.append(cStrikeTwo[index].getName().toString());
             outputArea.append("\n");
         }
         
     }
  

       
   } //end displayFazePlayers
   
   
   
   
   
   
   
   
   
   public void displayMIBRPlayers(){
       
       outputArea.append("============================================");
       outputArea.append("\n");
       
       outputArea.append("The following Counter-Strike players are players for MIBR, and we are not a fan of them:");
       outputArea.append("\n");

               
       topLabelText.setText("Displaying MIBR players...");
       
       
       
       for(Integer index = 0; index < cStrikeTwo.length; index++){
           
           if( cStrikeTwo[index].getTeam().equals("MIBR")){
               
               outputArea.append(cStrikeTwo[index].getName().toString());
               outputArea.append("\n");
               
           }
           
           
       }
    
   } //end displayMIBRplayers
   
   
   
   
   
   
   
   
   
   
   
   public void displayRetiredPlayers(){
      
      topLabelText.setText("Displaying retired or non-pro players...");              
       
      outputArea.append("============================================");
      outputArea.append("\n");
       
      outputArea.append("The following players are retired or non-professionals: ");
      outputArea.append("\n");

      
      for(Integer index = 0; index < cStrikeTwo.length; index++){
          
          if( cStrikeTwo[index].getTeam().equals("Retired") || cStrikeTwo[index].getTeam().equals("Not a professional")){
              
              outputArea.append(cStrikeTwo[index].getName().toString());
              outputArea.append("\n");
              
          }
          
          
      }
     
       
   } //end displayretiredplayers
   
   
   
   
   
   
   
   
   
    // declare other methods here
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        displayPlayersButton = new javax.swing.JButton();
        bestFragsButton = new javax.swing.JButton();
        worstFragsButton = new javax.swing.JButton();
        fazePlayersButton = new javax.swing.JButton();
        displayMIBRButton = new javax.swing.JButton();
        retiredPlayersButton = new javax.swing.JButton();
        processData = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        processDataTextfield = new javax.swing.JTextArea();
        topLabelText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        displayPlayersButton.setText("Display All Players");
        displayPlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPlayersButtonActionPerformed(evt);
            }
        });

        bestFragsButton.setText("Display Best frags");
        bestFragsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestFragsButtonActionPerformed(evt);
            }
        });

        worstFragsButton.setText("Display worst frags");
        worstFragsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worstFragsButtonActionPerformed(evt);
            }
        });

        fazePlayersButton.setText("Display FaZe players");
        fazePlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazePlayersButtonActionPerformed(evt);
            }
        });

        displayMIBRButton.setText("Display MIBR players, who we are not fans of ");
        displayMIBRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayMIBRButtonActionPerformed(evt);
            }
        });

        retiredPlayersButton.setText("Display retired and non-professional players");
        retiredPlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiredPlayersButtonActionPerformed(evt);
            }
        });

        processData.setText("Process Data");
        processData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processDataActionPerformed(evt);
            }
        });

        processDataTextfield.setColumns(20);
        processDataTextfield.setRows(5);
        jScrollPane2.setViewportView(processDataTextfield);

        topLabelText.setText("Fun with Counter-Strike stats!");

        jLabel1.setText("Input your own data, separated by \",\"");

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drawingPanelLayout.createSequentialGroup()
                        .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayPlayersButton)
                            .addComponent(bestFragsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processData)
                        .addGap(96, 96, 96))
                    .addGroup(drawingPanelLayout.createSequentialGroup()
                        .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(worstFragsButton)
                            .addComponent(fazePlayersButton)
                            .addComponent(displayMIBRButton)
                            .addComponent(retiredPlayersButton)
                            .addGroup(drawingPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))))
                        .addContainerGap(31, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topLabelText)
                .addGap(629, 629, 629))
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drawingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topLabelText)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drawingPanelLayout.createSequentialGroup()
                        .addGroup(drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayPlayersButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bestFragsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drawingPanelLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(processData)
                        .addGap(32, 32, 32)))
                .addComponent(worstFragsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fazePlayersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayMIBRButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(retiredPlayersButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void worstFragsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worstFragsButtonActionPerformed

        displayWorstFrags();

        // TODO add your handling code here:
    }//GEN-LAST:event_worstFragsButtonActionPerformed

    private void bestFragsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestFragsButtonActionPerformed

        displayBestFrags();

        // TODO add your handling code here:
    }//GEN-LAST:event_bestFragsButtonActionPerformed

    private void displayPlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPlayersButtonActionPerformed

        displayAllPlayers();

        // TODO add your handling code here:
    }//GEN-LAST:event_displayPlayersButtonActionPerformed

    private void fazePlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazePlayersButtonActionPerformed
        
        displayFazePlayers();

        // TODO add your handling code here:
    }//GEN-LAST:event_fazePlayersButtonActionPerformed

    private void displayMIBRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayMIBRButtonActionPerformed

       displayMIBRPlayers();

        // TODO add your handling code here:
    }//GEN-LAST:event_displayMIBRButtonActionPerformed

    private void retiredPlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiredPlayersButtonActionPerformed
        
        displayRetiredPlayers();

        // TODO add your handling code here:
    }//GEN-LAST:event_retiredPlayersButtonActionPerformed

    private void processDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processDataActionPerformed
        
        
        String input = processDataTextfield.getText();
        outputArea.setText(" ");
        
        
        String[] lineOfInput;
        
        
        
        lineOfInput = input.split("\n");
        
        
        
        cStrikeTwo = new CStrikePlayer[lineOfInput.length];
        
        for (Integer index = 0; index < lineOfInput.length; index++){
            
        
            
            String[] part = lineOfInput[index].split(",");
        
            
            for (Integer i = 0; i < part.length; i++){
                
                
                part[i] = part[i].trim();
                
                
            } //end for
            
            
            cStrikeTwo[index] = new CStrikePlayer(part[0], part[1], Double.parseDouble( part[2] ), Double.parseDouble( part[3] ), Double.parseDouble( part[4] ));
            
            outputArea.append(cStrikeTwo[index].toString() + "\n");
            
        } // end for
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        




// TODO add your handling code here:
    }//GEN-LAST:event_processDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MUFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestFragsButton;
    private javax.swing.JButton displayMIBRButton;
    private javax.swing.JButton displayPlayersButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton fazePlayersButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton processData;
    private javax.swing.JTextArea processDataTextfield;
    private javax.swing.JButton retiredPlayersButton;
    private javax.swing.JLabel topLabelText;
    private javax.swing.JButton worstFragsButton;
    // End of variables declaration//GEN-END:variables
}
