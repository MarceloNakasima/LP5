/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import query.JDlgConsultaCliente;
import query.JDlgConsultaFuncionario;
import query.JDlgConsultaProduto;
import query.JDlgConsultaUsuarios;
import query.JDlgConsultaVenda;

/**
 *
 * @author u71665822198
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal(){
        initComponents();
        setTitle("Vendas de Roupas");
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    public JFrmPrincipal(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnProdutos = new javax.swing.JButton();
        jBtnVendas = new javax.swing.JButton();
        jBtnCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuCadastros = new javax.swing.JMenu();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuProdutos = new javax.swing.JMenuItem();
        jMnuFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimento = new javax.swing.JMenu();
        jMnuVendas = new javax.swing.JMenuItem();
        jMnuConsultas = new javax.swing.JMenu();
        jMnuVendas1 = new javax.swing.JMenuItem();
        jMnuFuncionarios1 = new javax.swing.JMenuItem();
        jMnuProduto1 = new javax.swing.JMenuItem();
        jMnuUsuarios1 = new javax.swing.JMenuItem();
        jMnuClientes1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendas de Roupas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtnProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/open-box.png"))); // NOI18N
        jBtnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProdutosActionPerformed(evt);
            }
        });

        jBtnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/payment-method.png"))); // NOI18N
        jBtnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVendasActionPerformed(evt);
            }
        });

        jBtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/clientes.png"))); // NOI18N
        jBtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnCliente)
                    .addComponent(jBtnVendas)
                    .addComponent(jBtnProdutos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMnuCadastros.setText("Cadastros");

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/clientes.png"))); // NOI18N
        jMnuClientes.setMnemonic('C');
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuClientes);

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cliente_1.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('U');
        jMnuUsuarios.setText("Usuários");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuUsuarios);

        jMnuProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/open-box.png"))); // NOI18N
        jMnuProdutos.setMnemonic('P');
        jMnuProdutos.setText("Produto");
        jMnuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProdutosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuProdutos);

        jMnuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/funcionario.png"))); // NOI18N
        jMnuFuncionarios.setMnemonic('F');
        jMnuFuncionarios.setText("Funcionários");
        jMnuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionariosActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuFuncionarios);
        jMnuCadastros.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/exit.png"))); // NOI18N
        jMnuSair.setMnemonic('S');
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastros.add(jMnuSair);

        jMenuBar1.add(jMnuCadastros);

        jMnuMovimento.setText("Movimento");

        jMnuVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/trade.png"))); // NOI18N
        jMnuVendas.setMnemonic('V');
        jMnuVendas.setText("Vendas");
        jMnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendasActionPerformed(evt);
            }
        });
        jMnuMovimento.add(jMnuVendas);

        jMenuBar1.add(jMnuMovimento);

        jMnuConsultas.setText("Consultas");

        jMnuVendas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/payment-method.png"))); // NOI18N
        jMnuVendas1.setText("Consulta Vendas");
        jMnuVendas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendas1ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuVendas1);

        jMnuFuncionarios1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuFuncionarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/funcionario.png"))); // NOI18N
        jMnuFuncionarios1.setText("Consulta Funcionarios");
        jMnuFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuFuncionarios1ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuFuncionarios1);

        jMnuProduto1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuProduto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/open-box.png"))); // NOI18N
        jMnuProduto1.setText("Consulta Produto");
        jMnuProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProduto1ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuProduto1);

        jMnuUsuarios1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cliente.png"))); // NOI18N
        jMnuUsuarios1.setText("Consulta Usuarios");
        jMnuUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuarios1ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuUsuarios1);

        jMnuClientes1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMnuClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/clientes.png"))); // NOI18N
        jMnuClientes1.setText("Consulta Cliente");
        jMnuClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientes1ActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMnuClientes1);

        jMenuBar1.add(jMnuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
           
            JDlgCliente jDlgCLientes = new JDlgCliente(null, true);
            jDlgCLientes.setVisible(true);

    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
            JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(null, true);
            jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
     
    }//GEN-LAST:event_formWindowActivated

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProdutosActionPerformed
        // TODO add your handling code here:
        JDlgProdutoNovo jDlgProdutos = new JDlgProdutoNovo(null,true);
        jDlgProdutos.setVisible(true);
    }//GEN-LAST:event_jMnuProdutosActionPerformed

    private void jMnuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionariosActionPerformed
        // TODO add your handling code here:
        JDlgFuncionarioNovo jDlgFuncionarios = new JDlgFuncionarioNovo(null, true);
        jDlgFuncionarios.setVisible(true);
        
    }//GEN-LAST:event_jMnuFuncionariosActionPerformed

    private void jMnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendasActionPerformed
        JDlgVendas jDlgVendas = new JDlgVendas(null, true);
        jDlgVendas.setVisible(true);
    }//GEN-LAST:event_jMnuVendasActionPerformed

    private void jBtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClienteActionPerformed
        JDlgConsultaCliente jDlgConsultaCliente = new JDlgConsultaCliente(null, true);
        jDlgConsultaCliente.setVisible(true);
    }//GEN-LAST:event_jBtnClienteActionPerformed

    private void jBtnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVendasActionPerformed
         JDlgConsultaVenda jDlgConsultaVenda = new JDlgConsultaVenda(null, true);
        jDlgConsultaVenda.setVisible(true);
    }//GEN-LAST:event_jBtnVendasActionPerformed

    private void jMnuProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProduto1ActionPerformed
        JDlgConsultaProduto jDlgConsultaProduto = new JDlgConsultaProduto(null, true);
        jDlgConsultaProduto.setVisible(true);
    }//GEN-LAST:event_jMnuProduto1ActionPerformed

    private void jMnuUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuarios1ActionPerformed
        JDlgConsultaUsuarios jDlgConsultaUsuarios = new JDlgConsultaUsuarios(null, true);
        jDlgConsultaUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuarios1ActionPerformed

    private void jMnuClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientes1ActionPerformed
        JDlgConsultaCliente jDlgConsultaCliente = new JDlgConsultaCliente(null, true);
        jDlgConsultaCliente.setVisible(true);
    }//GEN-LAST:event_jMnuClientes1ActionPerformed

    private void jBtnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProdutosActionPerformed
        JDlgConsultaProduto jDlgConsultaProduto = new JDlgConsultaProduto(null, true);
        jDlgConsultaProduto.setVisible(true);
    }//GEN-LAST:event_jBtnProdutosActionPerformed

    private void jMnuVendas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendas1ActionPerformed
        JDlgConsultaVenda jDlgConsultaVenda = new JDlgConsultaVenda(null, true);
        jDlgConsultaVenda.setVisible(true);
    }//GEN-LAST:event_jMnuVendas1ActionPerformed

    private void jMnuFuncionarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuFuncionarios1ActionPerformed
        JDlgConsultaFuncionario jDlgConsultaFuncionario = new JDlgConsultaFuncionario(null, true);
        jDlgConsultaFuncionario.setVisible(true);
    }//GEN-LAST:event_jMnuFuncionarios1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCliente;
    private javax.swing.JButton jBtnProdutos;
    private javax.swing.JButton jBtnVendas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnuCadastros;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenuItem jMnuClientes1;
    private javax.swing.JMenu jMnuConsultas;
    private javax.swing.JMenuItem jMnuFuncionarios;
    private javax.swing.JMenuItem jMnuFuncionarios1;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenuItem jMnuProduto1;
    private javax.swing.JMenuItem jMnuProdutos;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuUsuarios1;
    private javax.swing.JMenuItem jMnuVendas;
    private javax.swing.JMenuItem jMnuVendas1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
