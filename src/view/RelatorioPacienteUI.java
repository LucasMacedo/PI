/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProcedimentoController;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.Procedimento;

/**
 *
 * @author alexsandro_cota
 */
public class RelatorioPacienteUI extends javax.swing.JInternalFrame {
    
    private ArrayList<Procedimento> listaProcedimento;
    /**
     * Creates new form RelatorioMedicoUI
     */
    public RelatorioPacienteUI() {
        initComponents();
        ComboBox();
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
        JLPaciente = new javax.swing.JLabel();
        JTFPaciente = new javax.swing.JTextField();
        JLPeriodo = new javax.swing.JLabel();
        JFTDataInicio = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        JFTDataFim = new javax.swing.JFormattedTextField();
        JLProcedimento = new javax.swing.JLabel();
        JCBProcedimento = new javax.swing.JComboBox();
        JLCpf = new javax.swing.JLabel();
        JFTFCpf = new javax.swing.JFormattedTextField();
        JBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabelaPaciente = new javax.swing.JTable();
        JBExportar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relatório de Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JLPaciente.setText("Paciente:");

        JLPeriodo.setText("Periodo:");

        try {
            JFTDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("á");

        try {
            JFTDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JLProcedimento.setText("Procedimento:");

        JCBProcedimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JLCpf.setText("CPF:");

        try {
            JFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JTabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Paciente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTabelaPaciente);
        if (JTabelaPaciente.getColumnModel().getColumnCount() > 0) {
            JTabelaPaciente.getColumnModel().getColumn(0).setMinWidth(50);
            JTabelaPaciente.getColumnModel().getColumn(0).setMaxWidth(120);
            JTabelaPaciente.getColumnModel().getColumn(1).setMinWidth(150);
            JTabelaPaciente.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        JBExportar.setText("Exportar");
        JBExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLProcedimento)
                    .addComponent(JLPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLPeriodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JCBProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(JLCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JFTDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFTDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(JBExportar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPaciente)
                    .addComponent(JTFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLPeriodo)
                    .addComponent(jLabel3)
                    .addComponent(JFTDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFTDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLCpf)
                        .addComponent(JLProcedimento)
                        .addComponent(JCBProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBPesquisar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBExportar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBExportarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBPesquisarActionPerformed

    private void ComboBox(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        this.listaProcedimento = ProcedimentoController.obterInstancia().obterLista();
        for (Procedimento listaProcedimento1 : this.listaProcedimento) {
            modelo.addElement(listaProcedimento1.getDescricao());
        }
        JCBProcedimento.setModel(modelo);
    }
    
    private void verificaFiltros(){
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBExportar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JComboBox JCBProcedimento;
    private javax.swing.JFormattedTextField JFTDataFim;
    private javax.swing.JFormattedTextField JFTDataInicio;
    private javax.swing.JFormattedTextField JFTFCpf;
    private javax.swing.JLabel JLCpf;
    private javax.swing.JLabel JLPaciente;
    private javax.swing.JLabel JLPeriodo;
    private javax.swing.JLabel JLProcedimento;
    private javax.swing.JTextField JTFPaciente;
    private javax.swing.JTable JTabelaPaciente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
