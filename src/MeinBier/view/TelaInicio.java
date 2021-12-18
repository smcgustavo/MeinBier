package MeinBier.view;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import MeinBier.controller.Sistema;
import MeinBier.model.Consumidor;
import MeinBier.model.Produtor;
import java.util.ArrayList;

public class TelaInicio extends javax.swing.JFrame {
    public TelaInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
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

        jPanel19.setBackground(new java.awt.Color(234, 212, 145));
        jPanel19.setPreferredSize(new java.awt.Dimension(1225, 649));

        jLabel60.setFont(new java.awt.Font("Cinzel Black", 0, 36)); // NOI18N
        jLabel60.setText("MeinBier");

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verceja_5050.png"))); // NOI18N

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main_bier_v3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addComponent(jLabel60)
                                .addGap(9, 9, 9)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel62))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(0.0F);

        jMenu1.setText("Produtor");
        jMenu1.setFont(new java.awt.Font("Cinzel Black", 1, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

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
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

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
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarReceitaActionPerformed
        TelaCriarReceita criarReceita = new TelaCriarReceita();
        criarReceita.setProdutor(produtorDefault);
        criarReceita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criarReceitaActionPerformed

    private void solicitarProducaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarProducaoActionPerformed
        TelaSolicitacao solicitarReceita = new TelaSolicitacao();
        solicitarReceita.setProdutores(produtores);
        solicitarReceita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_solicitarProducaoActionPerformed

    private void consultarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarReceitaActionPerformed
        TelaConsultarReceita consultarReceita = new TelaConsultarReceita();
        consultarReceita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultarReceitaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    public static void main(String args[]) {
        sistema = new Sistema();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);   
            }
        });
    }
    
    private static Sistema sistema;
    private Consumidor consumidorDefault = sistema.iniciaC();
    private ArrayList<Produtor> produtores = sistema.iniciaPs();
    private Produtor produtorDefault = sistema.iniciaP();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEquipamento;
    private javax.swing.JButton addEquipamento1;
    private javax.swing.JButton addEquipamento2;
    private javax.swing.JButton addEquipamento3;
    private javax.swing.JButton addIngrediente;
    private javax.swing.JButton addIngrediente1;
    private javax.swing.JButton addIngrediente2;
    private javax.swing.JButton addIngrediente3;
    private javax.swing.JMenuItem consultarReceita;
    private javax.swing.JMenuItem criarReceita;
    private javax.swing.JTextField equipFabri;
    private javax.swing.JTextField equipFabri1;
    private javax.swing.JTextField equipFabri2;
    private javax.swing.JTextField equipFabri3;
    private javax.swing.JTextField equipNome;
    private javax.swing.JTextField equipNome1;
    private javax.swing.JTextField equipNome2;
    private javax.swing.JTextField equipNome3;
    private javax.swing.JTextField ingredNome;
    private javax.swing.JTextField ingredNome1;
    private javax.swing.JTextField ingredNome2;
    private javax.swing.JTextField ingredNome3;
    private javax.swing.JTextField ingredQuant;
    private javax.swing.JTextField ingredQuant1;
    private javax.swing.JTextField ingredQuant2;
    private javax.swing.JTextField ingredQuant3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JFormattedTextField preco;
    private javax.swing.JFormattedTextField preco1;
    private javax.swing.JFormattedTextField preco2;
    private javax.swing.JFormattedTextField preco3;
    private javax.swing.JButton salvarReceita;
    private javax.swing.JButton salvarReceita1;
    private javax.swing.JButton salvarReceita2;
    private javax.swing.JButton salvarReceita3;
    private javax.swing.JMenuItem solicitarProducao;
    private javax.swing.JButton voltarInicio;
    private javax.swing.JButton voltarInicio1;
    private javax.swing.JButton voltarInicio2;
    private javax.swing.JButton voltarInicio3;
    private javax.swing.JButton voltarInicio4;
    private javax.swing.JButton voltarInicio5;
    private javax.swing.JButton voltarInicio6;
    // End of variables declaration//GEN-END:variables
}
