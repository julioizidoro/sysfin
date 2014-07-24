/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "contaspagar")
public class Contaspagar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontasPagar")
    private Integer idcontasPagar;
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Column(name = "dataLiberacao")
    @Temporal(TemporalType.DATE)
    private Date dataLiberacao;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "dataAgendamento")
    @Temporal(TemporalType.DATE)
    private Date dataAgendamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @Column(name = "competencia")
    private String competencia;
    @Column(name = "dataCompensacao")
    @Temporal(TemporalType.DATE)
    private Date dataCompensacao;
    @Column(name = "dataEnvio")
    @Temporal(TemporalType.DATE)
    private Date dataEnvio;
    @Column(name = "movimentoBanco")
    private Integer movimentoBanco;
    @Column(name = "usuarioCadastrou")
    private Integer usuarioCadastrou;
    @Column(name = "usuarioAgendou")
    private Integer usuarioAgendou;
    @Column(name = "usuarioBaixou")
    private Integer usuarioBaixou;
    @Column(name = "contaPaga")
    private String contaPaga;
    @Column(name = "planoContas_idplanoContas")
    private int planocontas;
    @Column(name = "banco_idbanco")
    private int banco;
    @Column(name = "cliente_idcliente")
    private int cliente;
    @Column(name = "formaPagamento")
    private String formaPagamento;
    @Column(name = "vendaComissao")
    private int vendaComissao;
    
    @Column(name = "fornecedor")
    private String fornecedor;
    
    @Column(name = "numeroDocumento")
    private String numeroDocumento;
    
    @Column(name = "marcar")
    private String marcar;
    
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Column(name = "autorizarPagamento")
    private String autorizarPagamento;
    @Column(name = "usuarioAutorizou")
    private int usuarioAutorizou;
    
    
    public Contaspagar() {
        setVendaComissao(0);
    }

    public Contaspagar(Integer idcontasPagar) {
        this.idcontasPagar = idcontasPagar;
    }

    public int getUsuarioAutorizou() {
        return usuarioAutorizou;
    }

    public void setUsuarioAutorizou(int usuarioAutorizou) {
        this.usuarioAutorizou = usuarioAutorizou;
    }

    public Integer getIdcontasPagar() {
        return idcontasPagar;
    }
   
    public int getVendaComissao() {
        return vendaComissao;
    }

    public String getAutorizarPagamento() {
        return autorizarPagamento;
    }

    public void setAutorizarPagamento(String autorizarPagamento) {
        this.autorizarPagamento = autorizarPagamento;
    }

    public void setVendaComissao(int vendaComissao) {
        this.vendaComissao = vendaComissao;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public void setIdcontasPagar(Integer idcontasPagar) {
        this.idcontasPagar = idcontasPagar;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

   

    public String getDescricao() {
        return descricao;
    }

    public Date getDataLiberacao() {
        return dataLiberacao;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public void setDataLiberacao(Date dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }

    public void setContaPaga(String contaPaga) {
        this.contaPaga = contaPaga;
    }
    
    public String getContaPaga() {
        return this.contaPaga;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public Date getDataCompensacao() {
        return dataCompensacao;
    }

    public void setDataCompensacao(Date dataCompensacao) {
        this.dataCompensacao = dataCompensacao;
    }

    public Integer getMovimentoBanco() {
        return movimentoBanco;
    }

    public void setMovimentoBanco(Integer movimentoBanco) {
        this.movimentoBanco = movimentoBanco;
    }

    public Integer getUsuarioCadastrou() {
        return usuarioCadastrou;
    }

    public void setUsuarioCadastrou(Integer usuarioCadastrou) {
        this.usuarioCadastrou = usuarioCadastrou;
    }

    public Integer getUsuarioAgendou() {
        return usuarioAgendou;
    }

    public void setUsuarioAgendou(Integer usuarioAgendou) {
        this.usuarioAgendou = usuarioAgendou;
    }

    public Integer getUsuarioBaixou() {
        return usuarioBaixou;
    }

    public void setUsuarioBaixou(Integer usuarioBaixou) {
        this.usuarioBaixou = usuarioBaixou;
    }

    public int getPlanocontas() {
        return planocontas;
    }

    public void setPlanocontas(int planocontas) {
        this.planocontas = planocontas;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontasPagar != null ? idcontasPagar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contaspagar)) {
            return false;
        }
        Contaspagar other = (Contaspagar) object;
        if ((this.idcontasPagar == null && other.idcontasPagar != null) || (this.idcontasPagar != null && !this.idcontasPagar.equals(other.idcontasPagar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Contaspagar[ idcontasPagar=" + idcontasPagar + " ]";
    }
    
}
