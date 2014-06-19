/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.MedicoDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Medico;

/**
 *
 * @author Lucas
 */
public class MedicoController {
    
    private static MedicoController instanciaRep;
    private List<Medico> listaMedico;
    
    public static MedicoController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new MedicoController();
        }
        return instanciaRep;
    }
    
    public void cadastar(Medico medico) throws Exception{
        if(medico.getNome().isEmpty()){
            throw new Exception("Nome Invalido !!");
        }else{
           this.verificarNome(medico.getNome());
        }
        if(medico.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF Invalido !!");
        }else{
            this.verificaCPF(medico.getCpf());
        }
        if(medico.getCrm() == null){
            throw new Exception("CRM Invalido !!");
        }else{
            this.verificaCRM(medico.getCrm());
        }
        if(medico.getCodigoEspecialidade().equals(0)){
            throw new Exception("Especialidade Invalido !!");
        }
        if(medico.getTelefone().isEmpty()){
            throw new Exception("Telefone Invalido !!");
        }
        if(medico.getEndereco().isEmpty()){
            throw new Exception("Endereço Invalido !!");
        }
        
        MedicoDao.obterInstancia().incluir(medico);
    }
    
    public List<Medico> listarMedico() throws Exception{
        return MedicoDao.obterInstancia().obterLista();
    }

    public void alterar(Medico medicoAnt) throws Exception {
        if(medicoAnt.getNome().isEmpty()){
            throw new Exception("Nome Invalido !!");
        }else{
            this.verificarNome(medicoAnt.getNome());
        }
        if(medicoAnt.getCpf().equals("   .   .   -  ")){
            throw new Exception("CPF Invalido !!");
        }else{
            this.verificaCPF(medicoAnt.getCpf());
        }
        if(medicoAnt.getCrm() == null){
            throw new Exception("CRM Invalido !!");
        }else{
            this.verificaCRM(medicoAnt.getCrm());
        }
           
        if(medicoAnt.getCodigoEspecialidade().equals(0)){
            throw new Exception("Especialidade Invalido !!");
        }
        if(medicoAnt.getTelefone().isEmpty()){
            throw new Exception("Telefone Invalido !!");
        }
        if(medicoAnt.getEndereco().isEmpty()){
            throw new Exception("Endereço Invalido !!");
        }
        
        MedicoDao.obterInstancia().alterar(medicoAnt);
    }
    
    private void verificarNome(String medico) throws Exception{
         for(int i=0;i<medico.length();i++){
                if(Character.isDigit(medico.charAt(i))){
                     throw new Exception("Contem numero no nome");
                }
          }
    }
    
    private void verificaCRM(Integer crm) throws Exception{
        try {
            listaMedico = MedicoDao.obterInstancia().obterLista();
        } catch (SQLException ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0; i< this.listaMedico.size();i++){
            if(this.listaMedico.get(i).getCrm().equals(crm)){
                throw new Exception("CRM Invalido !! CRM já existe");
            }
        }
    }
    
    private void verificaCPF(String cpf) throws Exception{
        try {
            listaMedico = MedicoDao.obterInstancia().obterLista();
        } catch (SQLException ex) {
            Logger.getLogger(MedicoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0; i< this.listaMedico.size();i++){
            if(this.listaMedico.get(i).getCpf().equals(cpf)){
                throw new Exception("CPF Invalido !! CPF já existe");
            }
        }
    }

    public void remover(Integer codigo) throws Exception {
        MedicoDao.obterInstancia().remover(codigo);
    }

   
    
}
