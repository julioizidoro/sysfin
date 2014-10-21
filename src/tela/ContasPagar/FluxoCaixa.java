/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela.ContasPagar;

import java.util.Date;

/**
 *
 * @author Julio
 */
public class FluxoCaixa {
    
    private Date data;
    private float ValorContasPagar;
    private float valorContasReceber;
    private float saldo;

    public FluxoCaixa(Date data, float ValorContasPagar, float valorContasReceber, float saldo) {
        this.data = data;
        this.ValorContasPagar = ValorContasPagar;
        this.valorContasReceber = valorContasReceber;
        this.saldo = saldo;
    }

    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorContasPagar() {
        return ValorContasPagar;
    }

    public void setValorContasPagar(float ValorContasPagar) {
        this.ValorContasPagar = ValorContasPagar;
    }

    public float getValorContasReceber() {
        return valorContasReceber;
    }

    public void setValorContasReceber(float valorContasReceber) {
        this.valorContasReceber = valorContasReceber;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
