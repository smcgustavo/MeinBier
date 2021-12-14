package MeinBier.view;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class TelaInicio extends javax.swing.JFrame {

    public TelaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        criarReceita = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main_bier_v2.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verceja_5050.png"))); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu1.setText("Produtor");
        jMenu1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N

        jMenu3.setText("Receita");
        jMenu3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N

        criarReceita.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        criarReceita.setText("Criar");
        criarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarReceitaActionPerformed(evt);
            }
        });
        jMenu3.add(criarReceita);

        jMenuItem6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jMenuItem6.setText("Consultar");
        jMenu3.add(jMenuItem6);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consumidor");
        jMenu2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jMenuItem1.setText("Solicitar");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarReceitaActionPerformed
        TelaProdutor tela = new TelaProdutor();
        tela.setVisible(true);
    }//GEN-LAST:event_criarReceitaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem criarReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
