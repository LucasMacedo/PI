﻿/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.PacienteController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Paciente;

/**
 *
 * @author Lucas
 */
public class ConsultarPacienteUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarPaciente2
     */
    
    private ArrayList<Paciente> listaPaciente;
    private DefaultTableModel modelo;
    
    public ConsultarPacienteUI() {
        initComponents();
        
        this.listaPaciente = PacienteController.obterInstancia().listarPaciente();
        this.zerarModelo();
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
        JLCodigo = new javax.swing.JLabel();
        JTFCodigo = new javax.swing.JTextField();
        JLNome = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JLCpf = new javax.swing.JLabel();
        JFTFCpf = new javax.swing.JFormattedTextField();
        JBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTListaPaciente = new javax.swing.JTable();
        JBListar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JLCodigo.setText("Codigo: ");

        JLNome.setText("Nome :");

        JLCpf.setText("CPF :");

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

        JTListaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTListaPaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTListaPaciente);

        JBListar.setText("Listar");
        JBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBAdicionar.setText("Adicionar");
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        JBRemover.setText("Remover");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JLCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JLCpf)
                                .addGap(18, 18, 18)
                                .addComponent(JFTFCpf)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(JLNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFNome, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addGap(118, 118, 118))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(JBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLNome)
                    .addComponent(JLCodigo)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCpf)
                    .addComponent(JBPesquisar)
                    .addComponent(JFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBEditar)
                    .addComponent(JBListar)
                    .addComponent(JBAdicionar)
                    .addComponent(JBRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
        this.zerarModelo();
        for(int i=0; i< listaPaciente.size();i++){
            modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),this.listaPaciente.get(i).getNome(),this.listaPaciente.get(i).getCpf()});
        }
        
        JTListaPaciente.setModel(modelo);                
    }//GEN-LAST:event_JBListarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        this.zerarModelo();
        int codigo;      
        try{
            int index = JTListaPaciente.getSelectedRow();
            if(index >= 0){
                codigo = (int) JTListaPaciente.getValueAt(index,0);
            }else{
                throw new Exception("Nenhum paciente foi selecionado");

        int index = JTListaPaciente.getSelectedRow();
        try{
            for(int i=0; i < this.listaPaciente.size(); i++){
                if(codigo == this.listaPaciente.get(i).getCodigo()){
                    
                    CadastrarPacienteUI cadastroPaciente =
                            new CadastrarPacienteUI(this.listaPaciente.get(i));
                    cadastroPaciente.setVisible(true);
                    PrincipalUI.obterInstancia().obterTela().add(cadastroPaciente);
                }

            }
             for(int i=0; i < this.listaPaciente.size(); i++){
                 if(codigo == this.listaPaciente.get(i).getCodigo()){

                     CadastrarPacienteUI cadastroPaciente =
                                new CadastrarPacienteUI(this.listaPaciente.get(i));
                     cadastroPaciente.setVisible(true);
                     PrincipalUI.obterInstancia().obterTela().add(cadastroPaciente);
                     cadastroPaciente.toFront();
                 }
            }
         }catch(Exception ex){
             JOptionPane.showMessageDialog(this, ex.getMessage());
         }     
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        CadastrarPacienteUI cadastroPaciente = new CadastrarPacienteUI(null);
        cadastroPaciente.setVisible(true);
        PrincipalUI.obterInstancia().obterTela().add(cadastroPaciente);
        cadastroPaciente.toFront();
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        this.zerarModelo();
        try{
            JTListaPaciente.setModel(verificarFiltros(modelo));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Erro: "+e.getMessage(),"ERRO",0);
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed

    public DefaultTableModel verificarFiltros(DefaultTableModel modelo) throws Exception{
        String nome = JTFNome.getText();
        String cpf = JFTFCpf.getText();
        Integer codigo;
               
        this.verificarNome(JTFNome.getText());
        try{
            codigo = Integer.parseInt(JTFCodigo.getText());
        }catch(NumberFormatException e){
            codigo = null;
        }
        
        if(cpf.equals("   .   .   -  ")){
            cpf = null;
        }
        
        for(int i=0;i< this.listaPaciente.size();i++){
            if(codigo != null && !nome.isEmpty() && cpf != null){
                
                if(this.listaPaciente.get(i).getCodigo().equals(codigo)&&
                        this.listaPaciente.get(i).getNome().equals(nome) &&
                            this.listaPaciente.get(i).getCpf().equals(cpf)){
                    modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                                 this.listaPaciente.get(i).getNome(),
                                                 this.listaPaciente.get(i).getCpf()});
                }else
                if(this.listaPaciente.get(i).getCodigo().equals(codigo) &&
                        !this.listaPaciente.get(i).getNome().equals(nome)){
                    if(this.listaPaciente.get(i).getCpf().equals(cpf)){
                        throw new Exception("Dados Incorretos !! O nome esta Incorreto");
                    }else
                    if(!this.listaPaciente.get(i).getCpf().equals(cpf)){
                        throw new Exception("Dados Incorretos !! O nome e o cpf esta Incorretos");
                    }
                }
                
            }else
            if(codigo == null && !nome.isEmpty() && cpf != null){
                if(this.listaPaciente.get(i).getNome().equals(nome)&&
                        this.listaPaciente.get(i).getCpf().equals(cpf)){
                    
                    modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                                 this.listaPaciente.get(i).getNome(),
                                                 this.listaPaciente.get(i).getCpf()}); 
                }else
                if(this.listaPaciente.get(i).getNome().equals(nome) &&
                        !this.listaPaciente.get(i).getCpf().equals(cpf)){
                    throw new Exception("Dados Incorretos !! Nome e CPF não conferem");
                }
                
            }else
            if(codigo != null && !nome.isEmpty() && cpf == null){
                
                if(this.listaPaciente.get(i).getCodigo().equals(codigo) &&
                        this.listaPaciente.get(i).getNome().equals(nome)){
                   
                    modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                                this.listaPaciente.get(i).getNome(),
                                                this.listaPaciente.get(i).getCpf()});
                }else
                if(this.listaPaciente.get(i).getCodigo().equals(codigo) &&
                        !this.listaPaciente.get(i).getNome().equals(nome)){
                    throw new Exception("Dados Incorretos !! Codigo e Nome não conferem");
                }
                
            }else
            if(codigo != null && nome.isEmpty() && cpf == null){ // Verifica pelo Codigo
                if(this.listaPaciente.get(i).getCodigo().equals(codigo)){
                    modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                                 this.listaPaciente.get(i).getNome(),
                                                 this.listaPaciente.get(i).getCpf()});
                }
            }else
            if(codigo == null && !nome.isEmpty() && cpf == null){ // Verifica pelo nome
                if(this.listaPaciente.get(i).getNome().contains(nome)){
                    modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                                this.listaPaciente.get(i).getNome(),
                                                this.listaPaciente.get(i).getCpf()});
                }
            }else
            if(codigo == null && nome.isEmpty() && cpf != null){ // Verifica pelo CPF
                if(this.listaPaciente.get(i).getCpf().equals(cpf)){
                    modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                                this.listaPaciente.get(i).getNome(),
                                                this.listaPaciente.get(i).getCpf()});
                }
            }else
            if(codigo == null && nome.isEmpty() && cpf == null){ // Verifica se todos esta nulos
                modelo.addRow(new Object[] {this.listaPaciente.get(i).getCodigo(),
                                            this.listaPaciente.get(i).getNome(),
                                            this.listaPaciente.get(i).getCpf()});
            }
            
        }
        
        if(modelo.getRowCount() != 0){
             return modelo;
        } else {
            throw new Exception("Nenhum dado cadastrado");
        }
        
       
    }
    
    private void zerarModelo(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"Codigo","Nome","CPF"});
    }
    
    private void verificarNome(String paciente) throws Exception{
         for(int i=0;i<paciente.length();i++){
                if(Character.isDigit(paciente.charAt(i))){
                       throw new Exception("Contem numero no nome");
                }
          }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JFormattedTextField JFTFCpf;
    private javax.swing.JLabel JLCodigo;
    private javax.swing.JLabel JLCpf;
    private javax.swing.JLabel JLNome;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTable JTListaPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
