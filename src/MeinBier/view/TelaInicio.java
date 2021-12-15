package MeinBier.view;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class TelaInicio extends javax.swing.JFrame {
    public TelaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        criarReceita = new javax.swing.JMenuItem();
        consultarReceita = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        solicitarProducao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MeinBier - Inicio");
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel3.setBackground(new java.awt.Color(234, 212, 145));

        jLabel3.setFont(new java.awt.Font("Cinzel Black", 0, 36)); // NOI18N
        jLabel3.setText("MeinBier");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verceja_5050.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main_bier_v3.jpg"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(234, 212, 145));
        jButton1.setFont(new java.awt.Font("Cinzel Black", 1, 24)); // NOI18N
        jButton1.setText("Produtor");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(234, 212, 145));
        jButton2.setFont(new java.awt.Font("Cinzel Black", 1, 24)); // NOI18N
        jButton2.setText("consumidor");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)))
                        .addGap(27, 27, 27)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(0.0F);

        jMenu1.setText("Produtor");
        jMenu1.setFont(new java.awt.Font("Cinzel Black", 1, 18)); // NOI18N

        jMenu3.setText("Receita");
        jMenu3.setFocusable(false);
        jMenu3.setFont(new java.awt.Font("Cinzel Black", 1, 16)); // NOI18N

        criarReceita.setFont(new java.awt.Font("Cinzel Black", 1, 14)); // NOI18N
        criarReceita.setText("Criar");
        criarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarReceitaActionPerformed(evt);
            }
        });
        jMenu3.add(criarReceita);

        consultarReceita.setFont(new java.awt.Font("Cinzel Black", 1, 14)); // NOI18N
        consultarReceita.setText("Consultar");
        consultarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarReceitaActionPerformed(evt);
            }
        });
        jMenu3.add(consultarReceita);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consumidor");
        jMenu2.setFont(new java.awt.Font("Cinzel Black", 1, 18)); // NOI18N

        solicitarProducao.setFont(new java.awt.Font("Cinzel Black", 1, 16)); // NOI18N
        solicitarProducao.setText("Solicitar");
        solicitarProducao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarProducaoActionPerformed(evt);
            }
        });
        jMenu2.add(solicitarProducao);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarReceitaActionPerformed
        TelaCriarReceita criarReceita = new TelaCriarReceita();
        criarReceita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criarReceitaActionPerformed

    private void solicitarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarProducaoActionPerformed
        TelaSolicitacao solicitarReceita = new TelaSolicitacao();
        solicitarReceita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_solicitarProducaoActionPerformed

    private void consultarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarReceitaActionPerformed
        TelaConsultarReceita consultarReceita = new TelaConsultarReceita();
        consultarReceita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultarReceitaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultarReceita;
    private javax.swing.JMenuItem criarReceita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem solicitarProducao;
    // End of variables declaration//GEN-END:variables
}
