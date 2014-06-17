package controller;

import dao.ConsultaDao;
import java.util.List;
import model.Consulta;

/**
 *
 * @author lucas_macedo
 */
public class ConsultaController {
    
    private static ConsultaController instanciaRep;
    
    public static ConsultaController obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new ConsultaController();
        }
        return instanciaRep;
    }
    
    public void cadastrar(Consulta consulta) throws Exception{
         if(consulta.getCodMedico() == null){
            throw new Exception("Medico não foi selecionado !");
        }
        if(consulta.getCodPaciente() == null){
            throw new Exception("Paciente não foi selecionado !");
        }
        if(consulta.getObservacao().isEmpty()){
            throw new Exception("Observação esta invalido !");
        }
        if(consulta.getCodProcedimento() == 0){
            throw new Exception("Procedimento esta invalido !");
        }
        if(consulta.getData().equals("  /  /   ")){
            throw new Exception("A data esta invalida !");
        }
        
        ConsultaDao.obterInstancia().incluir(consulta);
    }
    
    public List<Consulta> listar() throws Exception{
        return ConsultaDao.obterInstancia().listar();
    }

    public void alterar(Consulta consultaAnt) throws Exception {
        if(consultaAnt.getCodMedico() == null){
            throw new Exception("Medico não foi selecionado !");
        }
        if(consultaAnt.getCodPaciente() == null){
            throw new Exception("Paciente não foi selecionado !");
        }
        if(consultaAnt.getObservacao().isEmpty()){
            throw new Exception("Observação esta invalido !");
        }
        if(consultaAnt.getProcedimento().isEmpty()){
            throw new Exception("Procedimento esta invalido !");
        }
        if(consultaAnt.getData().equals("  /  /   ")){
            throw new Exception("A data esta invalida !");
        }
        
        ConsultaDao.obterInstancia().alterar(consultaAnt);
    }
}
