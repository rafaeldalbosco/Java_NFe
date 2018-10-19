package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.com.samuelweb.nfe.util.validators.impl.ValidarCNPJ;
import br.com.samuelweb.nfe.util.validators.impl.ValidarCodigoUf;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TUfEmi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Avulsa {

    @NfeCampo(tipo = String.class, validadores = {ValidarCNPJ.class}
            , id = "D02", tag = "CNPJ", valorDefault = "00000000000000"
            , tamanhoMinimo = 14, tamanhoMaximo = 14, ocorrencias = 1
            , descricao = DfeConsts.DSC_CNPJ)
    private String cnpj;

    @NfeCampo(tipo = String.class
            , id = "D03", tag = "xOrgao"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = NfeConsts.DSC_XORGAO)
    private String xOrgao;

    @NfeCampo(tipo = String.class
            , id = "D04", tag = "matr"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = NfeConsts.DSC_MATR)
    private String matr;

    @NfeCampo(tipo = String.class
            , id = "D05", tag = "xAgente"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = NfeConsts.DSC_XAGENTE)
    private String xAgente;

    @NfeCampo(tipo = String.class
            , id = "D06", tag = "fone"
            , tamanhoMinimo = 6, tamanhoMaximo = 14, ocorrencias = 0
            , descricao = DfeConsts.DSC_FONE)
    private String fone;

    @NfeCampo(tipo = Integer.class
            , id = "D07", tag = "UF", validadores = {ValidarCodigoUf.class}
            , tamanhoMinimo = 2, tamanhoMaximo = 2, ocorrencias = 1
            , descricao = DfeConsts.DSC_UF)
    private Integer uf;

    @NfeCampo(tipo = String.class
            , id = "D08", tag = "nDAR"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 0
            , descricao = NfeConsts.DSC_nDAR)
    private String nDar;

    @NfeCampo(tipo = LocalDate.class
            , id = "D09", tag = "dEmi"
            , tamanhoMinimo = 10, tamanhoMaximo = 10, ocorrencias = 0
            , descricao = DfeConsts.DSC_DEMI)
    private LocalDate dEmi;

    @NfeCampo(tipo = BigDecimal.class
            , id = "D10", tag = "vDAR", precisao = 13, decimais = 2
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , descricao = NfeConsts.DSC_VDAR)
    private BigDecimal vDar;

    @NfeCampo(tipo = String.class
            , id = "D11", tag = "repEmi"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = NfeConsts.DSC_REPEMI)
    private String repEmi;

    @NfeCampo(tipo = LocalDate.class
            , id = "D12", tag = "dPag"
            , tamanhoMinimo = 10, tamanhoMaximo = 10, ocorrencias = 0
            , descricao = NfeConsts.DSC_DPAG)
    private LocalDate dPag;

    public TNFe.InfNFe.Avulsa build() {
        TNFe.InfNFe.Avulsa avulsa = new TNFe.InfNFe.Avulsa();
        avulsa.setCNPJ(this.getCnpj());
        avulsa.setXOrgao(this.getxOrgao());
        avulsa.setMatr(this.getMatr());
        avulsa.setXAgente(this.getxAgente());
        avulsa.setFone(this.getFone());
        if (this.getUf() != null) {
            avulsa.setUF(TUfEmi.fromValue(this.getUf().toString()));
        }
        avulsa.setNDAR(this.getnDar());
        if (this.getdEmi() != null) {
            avulsa.setDEmi(this.getdEmi().format(DateTimeFormatter.ISO_DATE));
        }
        if (this.getvDar() != null) {
            avulsa.setVDAR(BigDecimalUtil.format(this.getvDar()) );
        }
        avulsa.setRepEmi(this.getRepEmi());
        if (this.getdPag() != null ) {
            avulsa.setDPag(this.getdPag().format(DateTimeFormatter.ISO_DATE));
        }
        return avulsa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getxOrgao() {
        return xOrgao;
    }

    public String getMatr() {
        return matr;
    }

    public String getxAgente() {
        return xAgente;
    }

    public String getFone() {
        return fone;
    }

    public Integer getUf() {
        return uf;
    }

    public String getnDar() {
        return nDar;
    }

    public LocalDate getdEmi() {
        return dEmi;
    }

    public BigDecimal getvDar() {
        return vDar;
    }

    public String getRepEmi() {
        return repEmi;
    }

    public LocalDate getdPag() {
        return dPag;
    }

    public Avulsa setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public Avulsa setxOrgao(String xOrgao) {
        this.xOrgao = xOrgao;
        return this;
    }

    public Avulsa setMatr(String matr) {
        this.matr = matr;
        return this;
    }

    public Avulsa setxAgente(String xAgente) {
        this.xAgente = xAgente;
        return this;
    }

    public Avulsa setFone(String fone) {
        this.fone = fone;
        return this;
    }

    public Avulsa setUf(Integer uf) {
        this.uf = uf;
        return this;
    }

    public Avulsa setnDar(String nDar) {
        this.nDar = nDar;
        return this;
    }

    public Avulsa setdEmi(LocalDate dEmi) {
        this.dEmi = dEmi;
        return this;
    }

    public Avulsa setvDar(BigDecimal vDar) {
        this.vDar = vDar;
        return this;
    }

    public Avulsa setRepEmi(String repEmi) {
        this.repEmi = repEmi;
        return this;
    }

    public Avulsa setdPag(LocalDate dPag) {
        this.dPag = dPag;
        return this;
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }
}