package relatorio;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controller.MedicoController;
import controller.ProcedimentoController;
import dao.RelatorioDao;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Consulta_Paciente;
import model.Medico;
import model.Procedimento;

public class GerarPdf {
    private final Document document = new Document();
    private List<Consulta_Paciente> listaConsulta;
    private List<Medico> listaMedico;
    private List<Procedimento> listaProcedimento;
    private Integer codigoPaciente;
    private String nomePaciente,cpfPaciente,telefonePaciente,emailPaciente,enderecoPaciente;
    
    public GerarPdf(Integer codigoPaciente2) throws SQLException{
        try {
            this.listaMedico = MedicoController.obterInstancia().listarMedico();
            this.listaProcedimento = ProcedimentoController.obterInstancia().obterLista();
        } catch (Exception ex) {
            Logger.getLogger(GerarPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        exportar(codigoPaciente2);
        gerarPdf();
        executar();
        
      
    } 
    
    
    private void gerarPdf(){
        try { 
        PdfWriter.getInstance(document, new FileOutputStream("Relatorios\\"+nomePaciente+".pdf"));
        document.open();
        // adicionando um parágrafo no documento
        Font f = new Font(FontFamily.TIMES_ROMAN, 20, Font.BOLD);
        Paragraph titulo = new Paragraph("Relatorio de Paciente por Consulta",f);
        titulo.setAlignment(Element.ALIGN_CENTER);
        titulo.setSpacingAfter(20);
        document.add(titulo); 
        
        Paragraph nome = new Paragraph("Codigo: "+codigoPaciente+"     Nome: "+nomePaciente);
        document.add(nome);
        Paragraph cpf = new Paragraph("CPF: "+cpfPaciente);
        document.add(cpf);
        Paragraph telefone = new Paragraph("Telefone: "+telefonePaciente);
        document.add(telefone);
        Paragraph email = new Paragraph("E-mail: "+emailPaciente);
        document.add(email);
        Paragraph endereco = new Paragraph("Endereco: "+enderecoPaciente);
        endereco.setSpacingAfter(50);
        document.add(endereco);
        
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100);
        PdfPCell header = new PdfPCell(new Paragraph("Dados das Consultas"));
        header.setHorizontalAlignment(Paragraph.ALIGN_CENTER);
        header.setColspan(4);
        table.addCell(header);
        table.addCell("Código");
        table.addCell("Data");
        table.addCell("Médico");
        table.addCell("Procedimento");
        
        for(int i=0; i< this.listaConsulta.size();i++){
            table.addCell(this.listaConsulta.get(i).getConsultaCodigo().toString());
            table.addCell(this.listaConsulta.get(i).getConsultaData().toString());
            
            for (Medico listaMedico1 : this.listaMedico) {
                if (this.listaConsulta.get(i).getMedicoCodigo().equals(listaMedico1.getCodigo())) {
                    table.addCell(listaMedico1.getNome());
                }
            }
            for (Procedimento listaProcedimento1 : this.listaProcedimento) {
                if (this.listaConsulta.get(i).getCodProcedimento().equals(listaProcedimento1.getCodigo())) {
                    table.addCell(listaProcedimento1.getDescricao());
                }
            }
        }
        
        document.add(table);
         
    }catch(DocumentException | IOException de){
        System.err.println(de.getMessage());
    }
         document.close();
    }

    public void exportar(Integer codigoPaciente) throws SQLException {
        RelatorioDao relatorio = new RelatorioDao();
        listaConsulta = relatorio.listarEspecial(codigoPaciente);
        this.codigoPaciente = codigoPaciente;
        for(int i=0; i< this.listaConsulta.size();i++){
            this.nomePaciente = listaConsulta.get(i).getPacienteNome();
            this.cpfPaciente = listaConsulta.get(i).getPacienteCPF();
            this.telefonePaciente = listaConsulta.get(i).getPacienteFone();
            this.emailPaciente = listaConsulta.get(i).getPacienteEmail();
            this.enderecoPaciente = listaConsulta.get(i).getPacienteEndereco();
        }
        
    }

    private void executar(){
        File file = new File("Relatorios\\"+nomePaciente+".pdf");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(GerarPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}

