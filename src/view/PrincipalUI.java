/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import javax.swing.JDesktopPane;

/**
 *
 * @author Lucas
 */
public class PrincipalUI extends javax.swing.JFrame {

    private static PrincipalUI instanciaRep;
    
    public static PrincipalUI obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new PrincipalUI();
        }
        return instanciaRep;
    }
    
    public JDesktopPane obterTela(){
        return obterInstancia().jdpTelaSecundaria;
    }
    
    public PrincipalUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jdpTelaSecundaria = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMCadastro = new javax.swing.JMenu();
        JMICadastroMedico = new javax.swing.JMenuItem();
        JMICadastroPaciente = new javax.swing.JMenuItem();
        JMICadastroConsulta = new javax.swing.JMenuItem();
        JMConsulta = new javax.swing.JMenu();
        JMIConsultaMedico = new javax.swing.JMenuItem();
        JMIConsultaPaciente = new javax.swing.JMenuItem();
        JMIConsultaConsulta = new javax.swing.JMenuItem();
        JMRelatorio = new javax.swing.JMenu();
        JMIRelatorioMedico = new javax.swing.JMenuItem();
        JMIRelatorioPaciente = new javax.swing.JMenuItem();
        JMIRelatorioConsulta = new javax.swing.JMenuItem();
        JMSair = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpTelaSecundaria.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jdpTelaSecundariaLayout = new javax.swing.GroupLayout(jdpTelaSecundaria);
        jdpTelaSecundaria.setLayout(jdpTelaSecundariaLayout);
        jdpTelaSecundariaLayout.setHorizontalGroup(
            jdpTelaSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jdpTelaSecundariaLayout.setVerticalGroup(
            jdpTelaSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );

        JMCadastro.setText("Cadastro");

        JMICadastroMedico.setText("Médico");
        JMICadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastroMedicoActionPerformed(evt);
            }
        });
        JMCadastro.add(JMICadastroMedico);

        JMICadastroPaciente.setText("Paciente");
        JMICadastroPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastroPacienteActionPerformed(evt);
            }
        });
        JMCadastro.add(JMICadastroPaciente);

        JMICadastroConsulta.setText("Consulta");
        JMICadastroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMICadastroConsultaActionPerformed(evt);
            }
        });
        JMCadastro.add(JMICadastroConsulta);

        jMenuBar1.add(JMCadastro);

        JMConsulta.setText("Consulta");

        JMIConsultaMedico.setText("Médicos");
        JMIConsultaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIConsultaMedicoActionPerformed(evt);
            }
        });
        JMConsulta.add(JMIConsultaMedico);

        JMIConsultaPaciente.setText("Paciente");
        JMIConsultaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIConsultaPacienteActionPerformed(evt);
            }
        });
        JMConsulta.add(JMIConsultaPaciente);

        JMIConsultaConsulta.setText("Consultas");
        JMIConsultaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMIConsultaConsultaActionPerformed(evt);
            }
        });
        JMConsulta.add(JMIConsultaConsulta);

        jMenuBar1.add(JMConsulta);

        JMRelatorio.setText("Relatorios");

        JMIRelatorioMedico.setText("Medico");
        JMRelatorio.add(JMIRelatorioMedico);

        JMIRelatorioPaciente.setText("Paciente");
        JMRelatorio.add(JMIRelatorioPaciente);

        JMIRelatorioConsulta.setText("Consulta");
        JMRelatorio.add(JMIRelatorioConsulta);

        jMenuBar1.add(JMRelatorio);

        JMSair.setText("Sair");
        jMenuBar1.add(JMSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaSecundaria)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaSecundaria)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMICadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastroMedicoActionPerformed
       CadastrarMedicoUI cadastroMedicoUI = new CadastrarMedicoUI(null);
       cadastroMedicoUI.setVisible(true);
       jdpTelaSecundaria.add(cadastroMedicoUI);
    }//GEN-LAST:event_JMICadastroMedicoActionPerformed

    private void JMICadastroPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastroPacienteActionPerformed
       CadastrarPacienteUI cadastroPacienteUI =  new CadastrarPacienteUI(null);
       cadastroPacienteUI.setVisible(true);
       jdpTelaSecundaria.add(cadastroPacienteUI);
    }//GEN-LAST:event_JMICadastroPacienteActionPerformed

    private void JMICadastroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMICadastroConsultaActionPerformed
       CadastrarConsultaUI cadastroConsultaUI = new CadastrarConsultaUI(null);
       cadastroConsultaUI.setVisible(true);
       jdpTelaSecundaria.add(cadastroConsultaUI);
    }//GEN-LAST:event_JMICadastroConsultaActionPerformed

    private void JMIConsultaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIConsultaMedicoActionPerformed
       ConsultarMedicoUI consultarMedico = new ConsultarMedicoUI();
       consultarMedico.setVisible(true);
       jdpTelaSecundaria.add(consultarMedico);
    }//GEN-LAST:event_JMIConsultaMedicoActionPerformed

    private void JMIConsultaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIConsultaPacienteActionPerformed
       ConsultarPacienteUI consultarPaciente = new ConsultarPacienteUI();
       consultarPaciente.setVisible(true);
       jdpTelaSecundaria.add(consultarPaciente);
    }//GEN-LAST:event_JMIConsultaPacienteActionPerformed

    private void JMIConsultaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMIConsultaConsultaActionPerformed
       ConsultarProntuarioUI consultarProntuario = new ConsultarProntuarioUI();
       consultarProntuario.setVisible(true);
       jdpTelaSecundaria.add(consultarProntuario);
    }//GEN-LAST:event_JMIConsultaConsultaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                obterInstancia().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMCadastro;
    private javax.swing.JMenu JMConsulta;
    private javax.swing.JMenuItem JMICadastroConsulta;
    private javax.swing.JMenuItem JMICadastroMedico;
    private javax.swing.JMenuItem JMICadastroPaciente;
    private javax.swing.JMenuItem JMIConsultaConsulta;
    private javax.swing.JMenuItem JMIConsultaMedico;
    private javax.swing.JMenuItem JMIConsultaPaciente;
    private javax.swing.JMenuItem JMIRelatorioConsulta;
    private javax.swing.JMenuItem JMIRelatorioMedico;
    private javax.swing.JMenuItem JMIRelatorioPaciente;
    private javax.swing.JMenu JMRelatorio;
    private javax.swing.JMenu JMSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JDesktopPane jdpTelaSecundaria;
    // End of variables declaration//GEN-END:variables
}
