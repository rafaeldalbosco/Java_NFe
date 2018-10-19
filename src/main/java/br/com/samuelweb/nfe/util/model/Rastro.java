package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Rastro {

    @NfeCampo(tipo = String.class
            , id = "I81", tag = "nLote"
            , tamanhoMinimo = 1, tamanhoMaximo = 20, ocorrencias = 1
            , descricao = NfeConsts.DSC_NLOTE)
    private String nLote;

    @NfeCampo(tipo = BigDecimal.class
            , id = "I82", tag = "qLote", decimais = 3, precisao = 11
            , tamanhoMinimo = 0, tamanhoMaximo = 11, ocorrencias = 1
            , descricao = NfeConsts.DSC_QLOTE)
    private BigDecimal qLote;

    @NfeCampo(tipo = LocalDate.class
            , id = "I83", tag = "dFab"
            , tamanhoMinimo = 10, tamanhoMaximo = 10, ocorrencias = 1
            , descricao = NfeConsts.DSC_DFAB)
    private LocalDate dFab;

    @NfeCampo(tipo = LocalDate.class
            , id = "I84", tag = "dVal"
            , tamanhoMinimo = 10, tamanhoMaximo = 10, ocorrencias = 1
            , descricao = NfeConsts.DSC_DVAL)
    private LocalDate dVal;

    @NfeCampo(tipo = String.class
            , id = "I85", tag = "cAgreg"
            , tamanhoMinimo = 1, tamanhoMaximo = 20, ocorrencias = 0
            , descricao = NfeConsts.DSC_CAGREG)
    private String cAgreg;

    public TNFe.InfNFe.Det.Prod.Rastro build() {
        TNFe.InfNFe.Det.Prod.Rastro rastro = new TNFe.InfNFe.Det.Prod.Rastro();
        rastro.setNLote(this.getnLote());
        if (this.getqLote() != null) {
            rastro.setQLote(BigDecimalUtil.format(this.getqLote()));
        }
        if (this.getdFab() != null) {
            rastro.setDFab(this.getdFab().format(DateTimeFormatter.ISO_DATE));
        }
        if (this.getdVal() != null) {
            rastro.setDVal(this.getdVal().format(DateTimeFormatter.ISO_DATE));
        }
        rastro.setCAgreg(this.getcAgreg());
        return rastro;
    }

    public String getnLote() {
        return nLote;
    }

    public BigDecimal getqLote() {
        return qLote;
    }

    public LocalDate getdFab() {
        return dFab;
    }

    public LocalDate getdVal() {
        return dVal;
    }

    public String getcAgreg() {
        return cAgreg;
    }

    public Rastro setnLote(String nLote) {
        this.nLote = nLote;
        return this;
    }

    public Rastro setqLote(BigDecimal qLote) {
        this.qLote = qLote;
        return this;
    }

    public Rastro setdFab(LocalDate dFab) {
        this.dFab = dFab;
        return this;
    }

    public Rastro setdVal(LocalDate dVal) {
        this.dVal = dVal;
        return this;
    }

    public Rastro setcAgreg(String cAgreg) {
        this.cAgreg = cAgreg;
        return this;
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }
}