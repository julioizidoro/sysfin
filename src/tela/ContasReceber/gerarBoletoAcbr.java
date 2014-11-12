/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasReceber;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Wolverine
 */
public class gerarBoletoAcbr {
    
    private FileWriter arquivo;
    
    public void gerarBoleto() throws IOException{
        File verArquivo = new File("C:\\DELL\\cedente.ini");
        if (verArquivo.exists()){
            verArquivo.delete();
        }
        arquivo = new FileWriter("C:\\DELL\\cedente.ini", true);
        BufferedWriter escrever = new BufferedWriter(arquivo);
        escrever.write("[Cedente]");
        escrever.newLine();
        escrever.write("Nome=JULIO IZIDORO DA SILVA JUNIOR");
        escrever.write("[Cedente]");
        escrever.newLine();
        escrever.write("CNPJCPF=000.070.499-78");
        escrever.newLine();

        escrever.write("Logradouro=Rodvia Tertuliano de Brito Xavier");
        escrever.newLine();
//
        escrever.write("Numero=1993");
        escrever.newLine();
//
        escrever.write("Bairro=Canasvieiras");
        escrever.newLine();
//
        escrever.write("Cidade=Florianópolis");
        escrever.newLine();
//CEP=18.270-000
        escrever.write("CEP=88.054-600");
        escrever.newLine();
//Complemento=Sala 10
        escrever.write("Complemento=Apto 105");
        escrever.newLine();
//UF=SP
        escrever.write("UF=SC");
        escrever.newLine();
//RespEmis=0
        escrever.write("RespEmis=0");
        escrever.newLine();
//TipoPessoa=1
        escrever.write("TipoPessoa=1");
        escrever.newLine();
//CodigoCedente=123456
        escrever.write("CodigoCedente=123456");
        escrever.newLine();
//LayoutBol=3
        escrever.write("LayoutBol=0");
        escrever.newLine();
//CaracTitulo=0
        escrever.write("CaracTitulo=0");
        escrever.newLine();
//
//[Conta]
        escrever.write("[Conta]");
        escrever.newLine();
//Conta=99999
        escrever.write("Conta=15987");
        escrever.newLine();
//DigitoConta=9
        escrever.write("DigitoConta=4");
        escrever.newLine();
//Agencia=9999
        escrever.write("Agencia=1575");
        escrever.newLine();
//DigitoAgencia=9
        escrever.write("DigitoAgencia=0");
        escrever.newLine();
//
//[Banco]
        escrever.write("[Banco]");
        escrever.newLine();
//Numero=237
        escrever.write("Numero=341");
        escrever.newLine();
//CNAB=1
        escrever.write("CNAB=1");
        escrever.newLine();
//IndiceACBr=5
        escrever.write("IndiceACBr=6");
        escrever.newLine();
    

        
        
        escrever.close();
        arquivo.close();
        
        File verTitulo = new File("C:\\DELL\\titulos.ini");
        if (verTitulo.exists()){
            verTitulo.delete();
        }
        FileWriter titulo = new FileWriter("C:\\DELL\\titulos.ini", true);
        BufferedWriter esTitulo = new BufferedWriter(titulo);
        esTitulo.write("[Titulo1]");
        esTitulo.newLine();
        esTitulo.write("NumeroDocumento=000010");
        esTitulo.newLine();
        esTitulo.write("NossoNumero=0000001");
        esTitulo.newLine();
        esTitulo.write("Carteira=20");
        esTitulo.newLine();
        esTitulo.write("ValorDocumento=100,50");
        esTitulo.newLine();
        esTitulo.write("Vencimento=10/09/2010");
        esTitulo.newLine();
        esTitulo.write("ValorMoraJuros=0,50");
        esTitulo.newLine();
        esTitulo.write("DataDocumento=10/08/2010");
        esTitulo.newLine();
        esTitulo.write("DataProcessamento=10/08/2010");
        esTitulo.newLine();
        esTitulo.write("DataAbatimento=05/09/2010");
        esTitulo.newLine();
        esTitulo.write("DataDesconto=07/09/2010");
        esTitulo.newLine();
        esTitulo.write("DataMoraJuros=12/09/2010");
        esTitulo.newLine();
        esTitulo.write("DataProtesto=10/10/2010");
        esTitulo.newLine();
        esTitulo.write("ValorAbatimento=5,00");
        esTitulo.newLine();
        esTitulo.write("ValorDesconto=0,50");
        esTitulo.newLine();
        esTitulo.write("ValorMoraJuros=0,55");
        esTitulo.newLine();
        esTitulo.write("ValorIOF=3,50");
        esTitulo.newLine();
        esTitulo.write("ValorOutrasDespesas=2,50");
        esTitulo.newLine();
        esTitulo.write("PercentualMulta=05,00");
        esTitulo.newLine();
        esTitulo.write("LocalPagamento=Pagável em qualquer agência bancária mesmo após o vencimento");
        esTitulo.newLine();
        esTitulo.write("EspecieDoc=DM");
        esTitulo.newLine();
        esTitulo.write("EspecieMod=R$");
        esTitulo.newLine();
        esTitulo.write("Sacado.NomeSacado=Sacado Teste");
        esTitulo.newLine();
        esTitulo.write("Sacado.CNPJCPF=999.999.999.99");
        esTitulo.newLine();
        esTitulo.write("Sacado.Pessoa=0");
        esTitulo.newLine();
        esTitulo.write("Sacado.Logradouro=Rua Jose Rodrigues");
        esTitulo.newLine();
        esTitulo.write("Sacado.Numero=100");
        esTitulo.newLine();
        esTitulo.write("Sacado.Bairro=Jardim Moderno");
        esTitulo.newLine();
        esTitulo.write("Sacado.Complemento=Casa");
        esTitulo.newLine();
        esTitulo.write("Sacado.Cidade=Tatui");
        esTitulo.newLine();
        esTitulo.write("Sacado.UF=SP");
        esTitulo.newLine();
        esTitulo.write("Sacado.CEP=18277.500");
        esTitulo.newLine();
        esTitulo.write("Sacado.Email=teste@email.com");
        esTitulo.newLine();
        esTitulo.write("Mensagem=teste1|teste2");
        esTitulo.newLine();
        esTitulo.write("Instrucao1=10");
        esTitulo.newLine();
        esTitulo.write("Instrucao2=11");
        esTitulo.newLine();
        esTitulo.write("Aceite=1");
        esTitulo.newLine();
        esTitulo.write("OcorrenciaOriginal=0");
        esTitulo.newLine();
        esTitulo.write("Parcela=1");
        esTitulo.newLine();
        esTitulo.write("TotalParcelas=1");
        esTitulo.newLine();
        esTitulo.write("SeuNumero=000020");
        esTitulo.newLine();
        esTitulo.close();
        titulo.close();

        File ver = new File("C:\\ACBrMonitor\\ENT.TXT");
        if (ver.exists()){
            ver.delete();
        }
        FileWriter ent = new FileWriter("C:\\ACBrMonitor\\ENT.TXT", true);
        BufferedWriter esEnt = new BufferedWriter(ent);
        esEnt.write("BOLETO.IncluirTitulos(" + "\"C:\\DELL\\titulos.ini\"" + "," +  "\"P\")");
        esEnt.close();
        ent.close();
        
                
//CNPJCPF= 99.999.999/9999-99
//Logradouro=Rua Evaristo Mendes
//Numero=200
//Bairro=Centro
//Cidade=Tatui
//CEP=18.270-000
//Complemento=Sala 10
//UF=SP
//RespEmis=0
//TipoPessoa=1
//CodigoCedente=123456
//LayoutBol=3
//CaracTitulo=0
//
//[Conta]
//Conta=99999
//DigitoConta=9
//Agencia=9999
//DigitoAgencia=9
//
//[Banco]
//Numero=237
//CNAB=1
//IndiceACBr=5
    }
    
}
