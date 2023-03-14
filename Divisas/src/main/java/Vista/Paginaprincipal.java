/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorDivisas;
import Controlador.ControladorTemperatura;
import Modelo.LogicaDivisas;
import Modelo.LogicaTemperatura;
import javax.swing.JOptionPane;
public class Paginaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form Paginaprincipal
     */
    public Paginaprincipal() {
        initComponents();
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttomTemperatura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttomDivisas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");

        buttomTemperatura.setText("Temperatura");
        buttomTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomTemperaturaActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione qué hacer");

        buttomDivisas1.setText("Divisas");
        buttomDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomDivisas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(buttomDivisas1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(buttomTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttomTemperatura)
                    .addComponent(buttomDivisas1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttomTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomTemperaturaActionPerformed
        Temperatura visTemp = new Temperatura();
        LogicaTemperatura modelTemp = new LogicaTemperatura();

        
        ControladorTemperatura crtlne = new ControladorTemperatura(visTemp,modelTemp);
            int valor = JOptionPane.showConfirmDialog(null, "Desea continuar a Temperatura?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
          
            if(valor==0){
                crtlne.IniciarTemp();
            }
            this.dispose();
     
    }//GEN-LAST:event_buttomTemperaturaActionPerformed

    private void buttomDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomDivisas1ActionPerformed
 //       SeleccionDivisas div= new SeleccionDivisas();
        SeleccionDivisas div = new SeleccionDivisas();
        LogicaDivisas model= new LogicaDivisas();
        ControladorDivisas crtlne = new ControladorDivisas(model,div);
        int valor = JOptionPane.showConfirmDialog(null, "Desea continuar a Divisas?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(valor==0){
            crtlne.IniciarDiv();
        }
        this.dispose();
            
    }//GEN-LAST:event_buttomDivisas1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Paginaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new Paginaprincipal().setVisible(true);
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buttomDivisas1;
    private javax.swing.JButton buttomTemperatura;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
