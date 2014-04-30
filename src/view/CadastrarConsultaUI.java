/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.MedicoController;
import controller.PacienteController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Medico;
import model.Paciente;

/**
 *
 * @author Lucas
 */
public class CadastrarConsultaUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarConsulta
     */
    private ArrayList<Paciente> listaPaciente;
    private ArrayList<Medico> listaMedico;
    
    public CadastrarConsultaUI() {
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

        JPPainelPrincipal = new javax.swing.JPanel();
        JPainelPaciente = new javax.swing.JPanel();
        JLNomePaciente = new javax.swing.JLabel();
        JTFNomePaciente = new javax.swing.JTextField();
        JBProcurarPaciente = new javax.swing.JButton();
        JLCodigoPaciente = new javax.swing.JLabel();
        JTFCodigoPaciente = new javax.swing.JTextField();
        JSPPaciente = new javax.swing.JScrollPane();
        JTabelaPaciente = new javax.swing.JTable();
        JPainelMedico = new javax.swing.JPanel();
        JLNomeMedico = new javax.swing.JLabel();
        JTFNomeMedico = new javax.swing.JTextField();
        JLCRM = new javax.swing.JLabel();
        JTFCRM = new javax.swing.JTextField();
        JBProcurarMedico = new javax.swing.JButton();
        JSPMedico = new javax.swing.JScrollPane();
        JTabelaMedico = new javax.swing.JTable();
        JLProcedimento = new javax.swing.JLabel();
        JLObservacao = new javax.swing.JLabel();
        JSPObservacao = new javax.swing.JScrollPane();
        JTAObservacao = new javax.swing.JTextArea();
        JSProcedimento = new javax.swing.JScrollPane();
        JTAProcedimento = new javax.swing.JTextArea();
        JLDataConsulta = new javax.swing.JLabel();
        JFTDataConsulta = new javax.swing.JFormattedTextField();
        JBSalvar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setClosable(true);

        JPPainelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JPainelPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        JLNomePaciente.setText("Nome do Paciente :");

        JBProcurarPaciente.setText("Procurar");
        JBProcurarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProcurarPacienteActionPerformed(evt);
            }
        });

        JLCodigoPaciente.setText("Codigo Paciente :");

        JTabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nome do Paciente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JSPPaciente.setViewportView(JTabelaPaciente);

        javax.swing.GroupLayout JPainelPacienteLayout = new javax.swing.GroupLayout(JPainelPaciente);
        JPainelPaciente.setLayout(JPainelPacienteLayout);
        JPainelPacienteLayout.setHorizontalGroup(
            JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPainelPacienteLayout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(JBProcurarPaciente)
                .addGap(41, 41, 41))
            .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPainelPacienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JSPPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(JPainelPacienteLayout.createSequentialGroup()
                            .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLNomePaciente)
                                .addComponent(JLCodigoPaciente))
                            .addGap(18, 18, 18)
                            .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFCodigoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JTFNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 119, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        JPainelPacienteLayout.setVerticalGroup(
            JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPainelPacienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JBProcurarPaciente)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPainelPacienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLNomePaciente)
                        .addComponent(JTFNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(JPainelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLCodigoPaciente)
                        .addComponent(JTFCodigoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(JSPPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        JPainelMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        JLNomeMedico.setText("Medico :");

        JLCRM.setText("CRM :");

        JBProcurarMedico.setText("Procurar");
        JBProcurarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProcurarMedicoActionPerformed(evt);
            }
        });

        JTabelaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CRM", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JSPMedico.setViewportView(JTabelaMedico);

        javax.swing.GroupLayout JPainelMedicoLayout = new javax.swing.GroupLayout(JPainelMedico);
        JPainelMedico.setLayout(JPainelMedicoLayout);
        JPainelMedicoLayout.setHorizontalGroup(
            JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPainelMedicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNomeMedico)
                    .addComponent(JLCRM))
                .addGap(18, 18, 18)
                .addGroup(JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBProcurarMedico)
                .addGap(45, 45, 45))
            .addGroup(JPainelMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSPMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPainelMedicoLayout.setVerticalGroup(
            JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPainelMedicoLayout.createSequentialGroup()
                .addGroup(JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPainelMedicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLNomeMedico)
                            .addComponent(JTFNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPainelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLCRM)
                            .addComponent(JTFCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPainelMedicoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(JBProcurarMedico)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSPMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        JLProcedimento.setText("Procedimento :");

        JLObservacao.setText("Observações :");

        JTAObservacao.setColumns(20);
        JTAObservacao.setRows(5);
        JSPObservacao.setViewportView(JTAObservacao);

        JTAProcedimento.setColumns(20);
        JTAProcedimento.setRows(5);
        JSProcedimento.setViewportView(JTAProcedimento);

        JLDataConsulta.setText("Data da Consulta :");

        try {
            JFTDataConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout JPPainelPrincipalLayout = new javax.swing.GroupLayout(JPPainelPrincipal);
        JPPainelPrincipal.setLayout(JPPainelPrincipalLayout);
        JPPainelPrincipalLayout.setHorizontalGroup(
            JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                        .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLProcedimento)
                                    .addComponent(JPainelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JSProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                                .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLObservacao)
                                    .addComponent(JSPObservacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JPainelMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLDataConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(JFTDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPPainelPrincipalLayout.setVerticalGroup(
            JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDataConsulta)
                    .addComponent(JFTDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                        .addComponent(JPainelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLProcedimento))
                    .addGroup(JPPainelPrincipalLayout.createSequentialGroup()
                        .addComponent(JPainelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLObservacao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JSPObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        JBSalvar.setText("Salvar");

        JBCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBSalvar)
                .addGap(18, 18, 18)
                .addComponent(JBCancelar)
                .addGap(323, 323, 323))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPPainelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSalvar)
                    .addComponent(JBCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBProcurarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProcurarPacienteActionPerformed
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.setColumnIdentifiers(new String[] {"Codigo","Nome"});
       this.listaPaciente = PacienteController.obterInstancia().listarPaciente();
       try{
       JTabelaPaciente.setModel(verificarPaciente(modelo));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage(),"ERRO",0);
       }
    }//GEN-LAST:event_JBProcurarPacienteActionPerformed

    private void JBProcurarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProcurarMedicoActionPerformed
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.setColumnIdentifiers(new String[] {"CRM","Nome"});
       this.listaMedico = MedicoController.obterInstancia().listarMedico();
       try{
       JTabelaMedico.setModel(verificarMedico(modelo));
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage(),"ERRO",0);
       }
    }//GEN-LAST:event_JBProcurarMedicoActionPerformed

    private DefaultTableModel verificarPaciente(DefaultTableModel modelo) throws Exception{
       String nome = JTFNomePaciente.getText();
       Integer codigo;
       try{
           codigo = Integer.parseInt(JTFCodigoPaciente.getText());
       }catch(Exception e){
           codigo = 0;
       }
       
       for(int i=0;i< this.listaPaciente.size(); i++){
          if(!nome.isEmpty() && codigo != 0){
              if(this.listaPaciente.get(i).getCodigo() == codigo && 
                       !this.listaPaciente.get(i).getNome().equals(nome)){
                  throw new Exception("Codigo e nome diferentes !!");
              }
              
              if(this.listaPaciente.get(i).getCodigo().equals(codigo)){
                  modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                              this.listaPaciente.get(i).getNome()});
              }              
          }else
          if(!nome.isEmpty() && codigo == 0){
              if(this.listaPaciente.get(i).getNome().contains(nome)){
                  modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                              this.listaPaciente.get(i).getNome()});
              }
          }else
          if(nome.isEmpty() && codigo != 0){
              if(this.listaPaciente.get(i).getCodigo().equals(codigo)){
                  modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                              this.listaPaciente.get(i).getNome()}); 
              }
          }else
          if(nome.isEmpty() && codigo ==0){
               modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                              this.listaPaciente.get(i).getNome()}); 
          }
       }
       
       return modelo;
    }
    
    private DefaultTableModel verificarMedico(DefaultTableModel modelo) throws Exception{
       String nome = JTFNomeMedico.getText();
       Integer codigo;
       try{
           codigo = Integer.parseInt(JTFCRM.getText());
       }catch(Exception e){
           codigo = 0;
       }
       
       for(int i=0;i< this.listaMedico.size(); i++){
          if(!nome.isEmpty() && codigo != 0){
              if(this.listaMedico.get(i).getCrm() == codigo && 
                       !this.listaMedico.get(i).getNome().equals(nome)){
                  throw new Exception("Codigo e nome diferentes !!");
              }
              
              if(this.listaMedico.get(i).getCrm()== codigo){
                  modelo.addRow(new Object[] {this.listaMedico.get(i).getCrm(),
                                              this.listaMedico.get(i).getNome()});
              }              
          }else
          if(!nome.isEmpty() && codigo == 0){
              if(this.listaMedico.get(i).getNome().contains(nome)){
                  modelo.addRow(new Object[] {this.listaMedico.get(i).getCrm(),
                                              this.listaMedico.get(i).getNome()});
              }
          }else
          if(nome.isEmpty() && codigo != 0){
              if(this.listaMedico.get(i).getCrm() == codigo){
                  modelo.addRow(new Object[] {this.listaMedico.get(i).getCrm(),
                                              this.listaMedico.get(i).getNome()}); 
              }
          }else
          if(nome.isEmpty() && codigo ==0){
               modelo.addRow(new Object[] {this.listaMedico.get(i).getCrm(),
                                              this.listaMedico.get(i).getNome()}); 
          }
       }
       
       return modelo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBProcurarMedico;
    private javax.swing.JButton JBProcurarPaciente;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JFormattedTextField JFTDataConsulta;
    private javax.swing.JLabel JLCRM;
    private javax.swing.JLabel JLCodigoPaciente;
    private javax.swing.JLabel JLDataConsulta;
    private javax.swing.JLabel JLNomeMedico;
    private javax.swing.JLabel JLNomePaciente;
    private javax.swing.JLabel JLObservacao;
    private javax.swing.JLabel JLProcedimento;
    private javax.swing.JPanel JPPainelPrincipal;
    private javax.swing.JPanel JPainelMedico;
    private javax.swing.JPanel JPainelPaciente;
    private javax.swing.JScrollPane JSPMedico;
    private javax.swing.JScrollPane JSPObservacao;
    private javax.swing.JScrollPane JSPPaciente;
    private javax.swing.JScrollPane JSProcedimento;
    private javax.swing.JTextArea JTAObservacao;
    private javax.swing.JTextArea JTAProcedimento;
    private javax.swing.JTextField JTFCRM;
    private javax.swing.JTextField JTFCodigoPaciente;
    private javax.swing.JTextField JTFNomeMedico;
    private javax.swing.JTextField JTFNomePaciente;
    private javax.swing.JTable JTabelaMedico;
    private javax.swing.JTable JTabelaPaciente;
    // End of variables declaration//GEN-END:variables
}
