/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.Vendas;

import java.util.Date;

/**
 *
 * @author Wolverine
 */
public class ParcelasBean {
    
    private String numeroDocumento;
    private Date dataLancamento;
    private int numeroParcela;
    private Float valorParcelas;
    private Date dataVenciemnto;
    private String tipoDocumento;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Float getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(Float valorParcelas) {
        this.valorParcelas = valorParcelas;
    }

    public Date getDataVenciemnto() {
        return dataVenciemnto;
    }

    public void setDataVenciemnto(Date dataVenciemnto) {
        this.dataVenciemnto = dataVenciemnto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
    
}
