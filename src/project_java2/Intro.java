/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java2;

import java.awt.Color;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;

/**
 *
 * @author Freddie
 */
public class Intro extends javax.swing.JFrame {

    /**
     * Creates new form Intro
     */
    int i = 0;
    public Intro() {
    
        initComponents();
        jLabel1.setForeground(new Color(255,255,255,0));
        
        
        timer();
        
        
        
        
    }
    
    

    public void timer(){
    final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    executorService.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
            black();
        }
    }, 0, (long) 20, TimeUnit.MILLISECONDS);
    }
    
    public void black(){
    Main_Menu mm = new Main_Menu();
        if (i == 200){
        mm.show();      
        }
        if (i > 200){
        this.dispose();
        }
        
    jLabel1.setForeground(new Color(255,255,255,i));
    jLabel1.repaint();     
    i += 1;
    
    
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Colors Of Autumn", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CON ARTIST PRODUCTION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 250, 360, 91);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java2/Images/BackGrounds/black.png"))); // NOI18N
        jLabel2.setText("  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1010, 800);

        setSize(new java.awt.Dimension(1000, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
