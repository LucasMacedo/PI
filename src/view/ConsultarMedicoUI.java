/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.EspecialidadeController;
import controller.MedicoController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Especialidade;
import model.Medico;

/**
 *
 * @author Lucas
 */
public class ConsultarMedicoUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarMedico
     */
    
    private List<Medico> listaMedico;
    private List<Especialidade> listaEspecialidade;
    private DefaultTableModel modelo;
    
    public ConsultarMedicoUI(){
        initComponents();
        ComboBoxEspecialidade();
        this.zerarLista();
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
        JLNome = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JLCrm = new javax.swing.JLabel();
        JTFCrm = new javax.swing.JTextField();
        JLEspecialidade = new javax.swing.JLabel();
        JCBEspecialidade = new javax.swing.JComboBox();
        JBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTListaMedico = new javax.swing.JTable();
        JBListar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBAdicionar = new javax.swing.JButton();
        JBRemover = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta de Medicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JLNome.setText("Nome :");

        JLCrm.setText("CRM :");

        JLEspecialidade.setText("Especialidade :");

        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JTListaMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CRM", "Nome", "Especialidade"
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
        jScrollPane1.setViewportView(JTListaMedico);

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
        JBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(JBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLEspecialidade)
                            .addComponent(JLNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JCBEspecialidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLCrm)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFCrm, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(JBPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLNome)
                    .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCrm)
                    .addComponent(JTFCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEspecialidade)
                    .addComponent(JCBEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        this.zerarModelo();
        try{
           JTListaMedico.setModel(verificarFiltros(modelo)); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro: "+e.getMessage(),"ERRO", 0);
        }
    }//GEN-LAST:event_JBPesquisarActionPerformed
 
    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
        this.zerarModelo();
        for (Medico listaMedico1 : this.listaMedico) {
            String especialidade = null;
            for (Especialidade listaEspecialidade1 : this.listaEspecialidade) {
                if (listaMedico1.getCodigoEspecialidade().equals(listaEspecialidade1.getCodigo())) {
                    especialidade = listaEspecialidade1.getNome();
                }
            }
            modelo.addRow(new Object[]{listaMedico1.getCrm(), listaMedico1.getNome(), especialidade});
        }
        
        JTListaMedico.setModel(modelo);
    }//GEN-LAST:event_JBListarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
       this.zerarModelo();
       int crm;
       try{
           int linha = JTListaMedico.getSelectedRow();
           if( linha >= 0){
                 crm = (int) JTListaMedico.getValueAt(linha,0);
           }else{
               throw new Exception("Nenhum medico foi selecionado");
           }
           for (Medico listaMedico1 : this.listaMedico) {
               if (crm == listaMedico1.getCrm()) {
                   CadastrarMedicoUI cadastroMedico = new CadastrarMedicoUI(listaMedico1);
                   cadastroMedico.setVisible(true);
                   PrincipalUI.obterInstancia().obterTela().add(cadastroMedico);
                   cadastroMedico.toFront();
               }
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex.getMessage());
       }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
       CadastrarMedicoUI cadastroMedico = new CadastrarMedicoUI(null);
       cadastroMedico.setVisible(true);
       PrincipalUI.obterInstancia().obterTela().add(cadastroMedico);
       cadastroMedico.toFront();
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverActionPerformed
         this.zerarModelo();
        int crm;      
        try{
            int linha = JTListaMedico.getSelectedRow();
            if( linha >= 0){
                 crm = (int) JTListaMedico.getValueAt(linha,0);
            }else{
               throw new Exception("Nenhum medico foi selecionado");
            }
            for (Medico listaMedico1 : this.listaMedico) {
                if (crm == listaMedico1.getCrm()) {
                   MedicoController.obterInstancia().remover(listaMedico1.getCodigo());
                }
            }
            
            JOptionPane.showMessageDialog(this, "Removido com sucesso !");
            this.zerarLista();
            this.zerarModelo();
        }catch(Exception ex){
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_JBRemoverActionPerformed

    private void ComboBoxEspecialidade(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            this.listaEspecialidade = EspecialidadeController.obterInstancia().obterLista();
        } catch (Exception ex) {
            Logger.getLogger(ConsultarMedicoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Especialidade listaEspecialidade1 : this.listaEspecialidade) {
            modelo.addElement(listaEspecialidade1.getNome());
        }
        JCBEspecialidade.setModel(modelo);
    }
  
    private DefaultTableModel verificarFiltros(DefaultTableModel modelo) throws Exception{
        String nome = JTFNome.getText(); // Recebe o nome escrito no filtro
        Integer especialidade = JCBEspecialidade.getSelectedIndex(); // Recebe a especialidade
        String nomeEsp = null; // Armazena o nome da especialidade 
        Integer crm;  // Recebe o crm escrito no filtro
        
        this.verificarNome(JTFNome.getText());
        // Transforma o CRM em numero
          try{
              crm  = Integer.parseInt(JTFCrm.getText());
          }catch(NumberFormatException e){
              crm = null;
          }
          
        for (int i=0; i < this.listaMedico.size(); i++) {
            for (Especialidade listaEspecialidade1 : this.listaEspecialidade) {
                if (this.listaMedico.get(i).getCodigoEspecialidade().equals(listaEspecialidade1.getCodigo())) {
                    nomeEsp = listaEspecialidade1.getNome();
                }
            }
            
            if(nome.isEmpty() && crm == null && especialidade.equals(0)){
                modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
            }else
            if(!nome.isEmpty()){
                if(crm == null && especialidade.equals(0)){
                    if(this.listaMedico.get(i).getNome().contains(nome)){
                        modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                    }
                }else
                if(crm != null && especialidade.equals(0)){
                    if(this.listaMedico.get(i).getNome().contains(nome) &&
                            this.listaMedico.get(i).getCrm().equals(crm)){
                        modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                    }
                }else
                if(crm == null && !especialidade.equals(0)){
                    if(this.listaMedico.get(i).getNome().contains(nome) &&
                            this.listaMedico.get(i).getCodigoEspecialidade().equals(especialidade)){
                        modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                    }
                }else
                if(crm != null && !especialidade.equals(0)){
                    if(this.listaMedico.get(i).getNome().contains(nome) &&
                            this.listaMedico.get(i).getCrm().equals(crm) &&
                                this.listaMedico.get(i).getCodigoEspecialidade().equals(especialidade)){
                        modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                    }
                }
            }else
            if(crm != null){
                if(especialidade.equals(0)){
                    if(this.listaMedico.get(i).getCrm().equals(crm)){
                        modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                    }
                }else
                if(!especialidade.equals(0)){
                    if(this.listaMedico.get(i).getCrm().equals(crm) &&
                            this.listaMedico.get(i).getCodigoEspecialidade().equals(especialidade)){
                        modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                    }
                }
            }else
            if(!especialidade.equals(0)){
                if(this.listaMedico.get(i).getCodigoEspecialidade().equals(especialidade)){
                    modelo.addRow(new Object[]{this.listaMedico.get(i).getCrm(),
                                           this.listaMedico.get(i).getNome(),
                                           nomeEsp});
                }
            }
            
        }
        
        if(modelo.getRowCount() != 0){
            return modelo;
        }else{
            throw new Exception("Nenhum dado Cadastrado");
        }
    }
    
    private void zerarModelo(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"CRM","Nome","Especialidade"});
    }
    
    private void verificarNome(String nome) throws Exception{
         for(int i=0;i<nome.length();i++){
                if(Character.isDigit(nome.charAt(i))){
                       throw new Exception("Contem numero no nome");
                }
          }
    }

    private void zerarLista(){
        try {
            this.listaMedico = MedicoController.obterInstancia().listarMedico();
        } catch (Exception ex) {
            Logger.getLogger(ConsultarMedicoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBRemover;
    private javax.swing.JComboBox JCBEspecialidade;
    private javax.swing.JLabel JLCrm;
    private javax.swing.JLabel JLEspecialidade;
    private javax.swing.JLabel JLNome;
    private javax.swing.JTextField JTFCrm;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTable JTListaMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
