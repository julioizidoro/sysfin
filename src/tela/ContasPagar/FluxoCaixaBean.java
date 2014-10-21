/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasPagar;

import controller.ContasPagarController;
import controller.ContasReceberController;
import controller.FluxoCaixaController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Fluxocaixa;
import modelView.Viewcontaspagarfluxo;
import modelView.Viewcontasreceberfluxo;
import tela.util.Formatacao;

/**
 *
 * @author Julio
 */
public class FluxoCaixaBean {
    
    private List<Fluxocaixa> listaFluxo;
    private Cliente cliente;
    

    public FluxoCaixaBean(Date dataInicial, Date dataFinal, Cliente cliente, IContasPagar telaContas, String tipo) {
        this.cliente = cliente;
        carregarDias(dataInicial, dataFinal);
        gerarListaContasPagar(dataInicial, dataFinal, cliente);
        gerarListaContasReceber(dataInicial, dataFinal, cliente);
        salvarLista();
        telaContas.imprimirFluxo(tipo);
    }
    
    public void carregarDias(Date dataInicial, Date dataFinal){
        listaFluxo = new ArrayList<Fluxocaixa>();
        Date dataAtual = dataInicial;
        while (!dataAtual.after(dataFinal)){
            Fluxocaixa fluxo = new Fluxocaixa(dataAtual, 0.0f, 0.0f, 0.0f, cliente);
            listaFluxo.add(fluxo);
            dataAtual = Formatacao.SomarDiasData(dataAtual, 1);
        }
    }
    
    public void gerarListaContasPagar(Date dataInicial, Date dataFinal, Cliente cliente){
        String sql = "Select v from Viewcontaspagarfluxo v where v.clienteIdcliente=" + cliente.getIdcliente() +
                " and v.dataVencimento>='" + Formatacao.ConvercaoDataSql(dataInicial) + 
                "' and v.dataVencimento<='" + Formatacao.ConvercaoDataSql(dataFinal) + 
                "' order by v.dataVencimento";
        ContasPagarController contasPagarController = new ContasPagarController();
        List<Viewcontaspagarfluxo> listaContasPagar = contasPagarController.listaFluxo(sql);
        if (listaContasPagar!=null){
            for(int i=0;i<listaContasPagar.size();i++){
                acharDataContasPagar(listaContasPagar.get(i));
            }
        }
    }
    
    public void acharDataContasPagar(Viewcontaspagarfluxo contasPagar){
        for (int i=0;i<listaFluxo.size();i++){
            String data1 = Formatacao.ConvercaoDataPadrao(listaFluxo.get(i).getData());
            String data2 = Formatacao.ConvercaoDataPadrao(contasPagar.getDataVencimento());
            if (data1.equalsIgnoreCase(data2)){
                listaFluxo.get(i).setValorContasPagar(contasPagar.getValorDia().floatValue());
                i = listaFluxo.size()+10;
            }
        }
    }
    
    
    public void gerarListaContasReceber(Date dataInicial, Date dataFinal, Cliente cliente){
        String sql = "Select v from Viewcontasreceberfluxo v where v.clienteIdcliente=" + cliente.getIdcliente() +
                " and v.dataVencimento>='" + Formatacao.ConvercaoDataSql(dataInicial) + 
                "' and v.dataVencimento<='" + Formatacao.ConvercaoDataSql(dataFinal) + 
                "' order by v.dataVencimento";
        ContasReceberController contasReceberController = new ContasReceberController();
        List<Viewcontasreceberfluxo> listaContasReceber = contasReceberController.listaFluxo(sql);
        if (listaContasReceber!=null){
            for(int i=0;i<listaContasReceber.size();i++){
                acharDataContasReceber(listaContasReceber.get(i));
            }
        }
    }
    
    public void acharDataContasReceber(Viewcontasreceberfluxo contasReceber){
        for (int i=0;i<listaFluxo.size();i++){
            String data1 = Formatacao.ConvercaoDataPadrao(listaFluxo.get(i).getData());
            String data2 = Formatacao.ConvercaoDataPadrao(contasReceber.getDataVencimento());
            if (data1.equalsIgnoreCase(data2)){
                listaFluxo.get(i).setValorContasReceber(contasReceber.getValorDia().floatValue());
                i = listaFluxo.size()+10;
            }
        }
    }
    
    public void salvarLista(){
        if (listaFluxo!=null){
            FluxoCaixaController fluxoCaixaController = new FluxoCaixaController();
            for(int i=0;i<listaFluxo.size();i++){
                Fluxocaixa fluxo = listaFluxo.get(i);
                fluxo.setSaldo(fluxo.getValorContasReceber() - fluxo.getValorContasPagar());
                fluxoCaixaController.salvar(fluxo);
            }
        }
    }
}
