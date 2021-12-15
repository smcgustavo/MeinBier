package MeinBier.view;

import MeinBier.controller.ControladorReceita;
import MeinBier.model.Equipamento;
import MeinBier.model.Ingrediente;
import java.time.LocalTime;
import java.util.ArrayList;

public class TelaCriarReceita extends javax.swing.JFrame {
    
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public TelaCriarReceita() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ingredNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ingredQuant = new javax.swing.JTextField();
        addIngrediente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        equipNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        equipFabri = new javax.swing.JTextField();
        addEquipamento = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tempo = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        preco = new javax.swing.JFormattedTextField();
        salvarReceita = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        voltarInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MeinBier - Criar Receita");

        jPanel3.setBackground(new java.awt.Color(234, 212, 145));

        jLabel3.setFont(new java.awt.Font("Cinzel Black", 0, 24)); // NOI18N
        jLabel3.setText("MeinBier");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verceja_5050.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cinzel Black", 0, 18)); // NOI18N
        jLabel2.setText("Ingredientes");

        jLabel4.setFont(new java.awt.Font("Cinzel Black", 0, 14)); // NOI18N
        jLabel4.setText("Nome");

        ingredNome.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        ingredNome.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Cinzel Black", 0, 14)); // NOI18N
        jLabel5.setText("QUANTIDADE");

        ingredQuant.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        addIngrediente.setFont(new java.awt.Font("Cinzel Black", 0, 12)); // NOI18N
        addIngrediente.setText("Adicionar");
        addIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cinzel Black", 0, 14)); // NOI18N
        jLabel6.setText("Tempo de produção (por litro)");

        equipNome.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        equipNome.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Cinzel Black", 0, 18)); // NOI18N
        jLabel7.setText("equipamentos");

        jLabel8.setFont(new java.awt.Font("Cinzel Black", 0, 14)); // NOI18N
        jLabel8.setText("fabricante");

        equipFabri.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N

        addEquipamento.setFont(new java.awt.Font("Cinzel Black", 0, 12)); // NOI18N
        addEquipamento.setText("Adicionar");
        addEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEquipamentoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Cinzel Black", 0, 14)); // NOI18N
        jLabel9.setText("Nome");

        try {
            tempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setFont(new java.awt.Font("Cinzel Black", 0, 14)); // NOI18N
        jLabel10.setText("preço (por litro)");

        try {
            preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        salvarReceita.setFont(new java.awt.Font("Cinzel Black", 0, 12)); // NOI18N
        salvarReceita.setText("salvar receita");
        salvarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarReceitaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Cinzel Black", 0, 11)); // NOI18N
        jLabel11.setText("R$");

        voltarInicio.setFont(new java.awt.Font("Cinzel Black", 0, 12)); // NOI18N
        voltarInicio.setText("voltar");
        voltarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(407, 407, 407))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingredNome)
                            .addComponent(equipNome, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(addIngrediente)
                            .addComponent(addEquipamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ingredQuant))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equipFabri, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarReceita)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarInicio)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ingredNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ingredQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addIngrediente)
                .addGap(90, 90, 90)
                .addComponent(jLabel7)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equipNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(equipFabri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(addEquipamento)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel10))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarReceita)
                        .addGap(46, 46, 46)
                        .addComponent(voltarInicio)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarReceitaActionPerformed
        ControladorReceita controller = new ControladorReceita();
        controller.criarReceita(ingredientes, equipamentos, LocalTime.parse(tempo.getText()), Float.parseFloat(preco.getText()));
    }//GEN-LAST:event_salvarReceitaActionPerformed

    private void addIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredienteActionPerformed
        Ingrediente ingred = new Ingrediente(ingredNome.getText(), Integer.parseInt(ingredQuant.getText().toString()));
        this.ingredientes.add(ingred);
    }//GEN-LAST:event_addIngredienteActionPerformed

    private void addEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEquipamentoActionPerformed
        Equipamento equip = new Equipamento(equipNome.getText(), equipFabri.getText());
        this.equipamentos.add(equip);
        
    }//GEN-LAST:event_addEquipamentoActionPerformed

    private void voltarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarInicioActionPerformed
        TelaInicio tela = new TelaInicio();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarInicioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCriarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarReceita().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEquipamento;
    private javax.swing.JButton addIngrediente;
    private javax.swing.JTextField equipFabri;
    private javax.swing.JTextField equipNome;
    private javax.swing.JTextField ingredNome;
    private javax.swing.JTextField ingredQuant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField preco;
    private javax.swing.JButton salvarReceita;
    private javax.swing.JFormattedTextField tempo;
    private javax.swing.JButton voltarInicio;
    // End of variables declaration//GEN-END:variables
}
