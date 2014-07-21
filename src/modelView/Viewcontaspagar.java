/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelView;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewcontaspagar")
public class Viewcontaspagar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idcontasPagar")
    @Id
    private int idcontasPagar;
    @Column(name = "dataVencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Column(name = "descricao")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Float valor;
    @Column(name = "razaoSocial")
    private String razaoSocial;
    @Column(name = "usuariocadastrou")
    private Integer usuariocadastrou;
    @Column(name = "usuariobaixou")
    private Integer usuariobaixou;
    @Column(name = "usuarioagendou")
    private Integer usuarioagendou;
    @Basic(optional = false)
    @Column(name = "planocontas_idplanocontas")
    private int planocontasIdplanocontas;
    @Basic(optional = false)
    @Column(name = "banco_idbanco")
    private int bancoIdbanco;
    @Column(name = "competencia")
    private String competencia;
    @Column(name = "dataAgendamento")
    @Temporal(TemporalType.DATE)
    private Date dataAgendamento;
    @Column(name = "dataCompensacao")
    @Temporal(TemporalType.DATE)
    private Date dataCompensacao;
    @Basic(optional = false)
    @Column(name = "cliente_idcliente")
    private int clienteIdcliente;
    @Column(name = "contaPaga")
    private String contaPaga;
    @Column(name = "dataLiberacao")
    @Temporal(TemporalType.DATE)
    private Date dataLiberacao;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "marcar")
    private String marcar;
    @Column(name = "autorizarPagamento")
    private String autorizarPagamento;
    

    public Viewcontaspagar() {
    }

    public int getIdcontasPagar() {
        return idcontasPagar;
    }

    public void setIdcontasPagar(int idcontasPagar) {
        this.idcontasPagar = idcontasPagar;
    }

    public String getAutorizarPagamento() {
        return autorizarPagamento;
    }

    public void setAutorizarPagamento(String autorizarPagamento) {
        this.autorizarPagamento = autorizarPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContaPaga() {
        return contaPaga;
    }

    public void setContaPaga(String contaPaga) {
        this.contaPaga = contaPaga;
    }

    public Date getDataLiberacao() {
        return dataLiberacao;
    }

    public void setDataLiberacao(Date dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Integer getUsuariocadastrou() {
        return usuariocadastrou;
    }

    public void setUsuariocadastrou(Integer usuariocadastrou) {
        this.usuariocadastrou = usuariocadastrou;
    }

    public Integer getUsuariobaixou() {
        return usuariobaixou;
    }

    public void setUsuariobaixou(Integer usuariobaixou) {
        this.usuariobaixou = usuariobaixou;
    }

    public Integer getUsuarioagendou() {
        return usuarioagendou;
    }

    public void setUsuarioagendou(Integer usuarioagendou) {
        this.usuarioagendou = usuarioagendou;
    }

    public int getPlanocontasIdplanocontas() {
        return planocontasIdplanocontas;
    }

    public void setPlanocontasIdplanocontas(int planocontasIdplanocontas) {
        this.planocontasIdplanocontas = planocontasIdplanocontas;
    }

    public int getBancoIdbanco() {
        return bancoIdbanco;
    }

    public void setBancoIdbanco(int bancoIdbanco) {
        this.bancoIdbanco = bancoIdbanco;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Date getDataCompensacao() {
        return dataCompensacao;
    }

    public void setDataCompensacao(Date dataCompensacao) {
        this.dataCompensacao = dataCompensacao;
    }

    public int getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }
    
}
