package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.com.samuelweb.nfe.util.enumeration.ModeloDocumento;
import br.com.samuelweb.nfe.util.validators.impl.*;
import br.inf.portalfiscal.nfe.schema_4.nfe.TNFe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Ide {

    @NfeCampo(tipo = Integer.class,
            id = "B02", tag = "cUF",
            tamanhoMinimo = 2, tamanhoMaximo = 2, ocorrencias = 1,
            descricao = DfeConsts.DSC_CUF, validadores = {ValidarCodigoUf.class}
            )
    private Integer cuf;
    
    @NfeCampo(tipo = String.class,
            id = "B03", tag = "cNF", 
            tamanhoMinimo = 8, tamanhoMaximo = 8, ocorrencias = 1, 
            descricao = DfeConsts.DSC_CNF)
    private String cnf;
    
    @NfeCampo(tipo = String.class,
            id = "B04", tag = "natOp",
            tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1,
            descricao = DfeConsts.DSC_NATOP)
    private String natOp;

    @NfeCampo(tipo = ModeloDocumento.class,
            id = "B06", tag = "mod", ocorrencias = 1, validadores = {ValidarModeloDocumento.class},
            descricao = DfeConsts.DSC_MOD)
    private String mod;

    @NfeCampo(tipo = Integer.class,
            id = "B07", tag = "serie",
            tamanhoMinimo = 1, tamanhoMaximo = 3, ocorrencias = 1,
            descricao = DfeConsts.DSC_SERIE)
    private Integer serie;

    @NfeCampo(tipo = Integer.class,
            id = "B08", tag = "nNF",
            tamanhoMinimo = 1, tamanhoMaximo = 9, ocorrencias = 1,
            descricao = DfeConsts.DSC_NNF)
    private Integer nnf;

    @NfeCampo(tipo = LocalDateTime.class,
            id = "B09", tag = "dhEmi", ocorrencias = 1,
            descricao = DfeConsts.DSC_DEMI)
    private LocalDateTime dhEmi;

    @NfeCampo(tipo = LocalDateTime.class,
            id = "B10", tag = "dhSaiEnt", ocorrencias = 0,
            descricao =  NfeConsts.DSC_DSAIENT)
    private LocalDateTime dhSaiEnt;

    @NfeCampo(tipo = Integer.class,
            id = "B11", tag = "tpNF",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarTipoOperacao.class},
            descricao = DfeConsts.DSC_TPNF)
    private Integer tpNF;

    @NfeCampo(tipo = Integer.class,
            id = "B11a", tag = "idDest",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarLocalOperacao.class},
            descricao = NfeConsts.DSC_IDDEST)
    private Integer idDest;

    @NfeCampo(tipo = Integer.class,
            id = "B12", tag = "cMunFG",
            tamanhoMinimo = 7, tamanhoMaximo = 7, ocorrencias = 1, validadores = {ValidarMunicipio.class},
            descricao = DfeConsts.DSC_CMUNFG)
    private Integer cMunFG;

    @NfeCampo(tipo = Integer.class,
            id = "B21", tag = "tpImp",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarTipoDanfe.class},
            descricao = DfeConsts.DSC_TPIMP)
    private Integer tpImp;

    @NfeCampo(tipo = Integer.class,
            id = "B22", tag = "tpEmis",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarTipoEmissaoNfe.class},
            descricao = DfeConsts.DSC_TPEMIS)
    private Integer tpEmis;

    @NfeCampo(tipo = Integer.class,
            id = "B23", tag = "cDV",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1,
            descricao = DfeConsts.DSC_CDV)
    private Integer cdv;

    @NfeCampo(tipo = Integer.class,
            id = "B24", tag = "tpAmb",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarAmbiente.class},
            descricao = DfeConsts.DSC_TPAMB)
    private Integer tpAmb;

    @NfeCampo(tipo = Integer.class,
            id = "B25", tag = "finNFe",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarFinalidadeNfe.class},
            descricao = NfeConsts.DSC_FINNFE)
    private Integer finNFe;

    @NfeCampo(tipo = Integer.class,
            id = "B25a", tag = "indFinal",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarIndFinal.class},
            descricao = NfeConsts.DSC_INDFINAL)
    private Integer indFinal;

    @NfeCampo(tipo = Integer.class,
            id = "B25b", tag = "indPres",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarIndPresencial.class},
            descricao = NfeConsts.DSC_INDPRES)
    private Integer indPres;

    @NfeCampo(tipo = Integer.class,
            id = "B26", tag = "procEmi",
            tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1, validadores = {ValidarProcEmi.class},
            descricao = DfeConsts.DSC_PROCEMI)
    private Integer procEmi;

    @NfeCampo(tipo = String.class,
            id = "B27", tag = "verProc",
            tamanhoMinimo = 1, tamanhoMaximo = 20, ocorrencias = 1,
            descricao = DfeConsts.DSC_VERPROC)
    private String verProc;

    @NfeCampo(tipo = LocalDateTime.class,
            id = "B28", tag = "dhCont",
            tamanhoMinimo = 5, tamanhoMaximo = 25, ocorrencias = 1,
            descricao = DfeConsts.DSC_DHCONT)
    private LocalDateTime dhCont;

    @NfeCampo(tipo = String.class,
            id = "B29", tag = "xJust",
            tamanhoMinimo = 1,tamanhoMaximo = 256, ocorrencias = 1,
            descricao = DfeConsts.DSC_XJUSTCONT)
    private String xJust;

    private List<NfRef> nfRef;

    public Ide() {
        nfRef = new ArrayList<>();
    }

    public TNFe.InfNFe.Ide build(){
        TNFe.InfNFe.Ide ide = new TNFe.InfNFe.Ide();
        ide.setCUF(this.cuf.toString());
        ide.setCNF(this.cnf);
        ide.setNatOp(this.natOp);
        ide.setMod(this.mod);
        ide.setSerie(this.serie.toString());
        ide.setNNF(this.nnf.toString());
        ide.setDhEmi(this.dhEmi
                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        if (this.mod.equals("55")) {
            ide.setDhSaiEnt(this.dhSaiEnt
                    .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        }
        ide.setTpNF(this.tpEmis.toString());
        ide.setIdDest(this.idDest.toString());
        ide.setCMunFG(this.cMunFG.toString());
        ide.setTpImp(this.tpImp.toString());
        ide.setTpEmis(this.tpEmis.toString());
        ide.setCDV(this.cdv.toString());
        ide.setTpAmb(this.tpAmb.toString());
        ide.setFinNFe(this.finNFe.toString());
        ide.setIndFinal(this.indFinal.toString());
        ide.setIndPres(this.indPres.toString());
        ide.setProcEmi(this.procEmi.toString());
        ide.setVerProc(this.verProc);
        if (this.dhCont != null || !this.xJust.isEmpty()){
            ide.setDhCont(this.dhCont.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
            ide.setXJust(this.xJust);
        }
        for (NfRef ref : nfRef) {
            ide.getNFref().add(ref.build());
        }
        return ide;
    }

    public Integer getCuf() {
        return cuf;
    }

    public void setCuf(Integer cuf) {
        this.cuf = cuf;
    }

    public String getCnf() {
        return cnf;
    }

    public void setCnf(String cnf) {
        this.cnf = cnf;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getNnf() {
        return nnf;
    }

    public void setNnf(Integer nnf) {
        this.nnf = nnf;
    }

    public LocalDateTime getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(LocalDateTime dhEmi) {
        this.dhEmi = dhEmi;
    }

    public LocalDateTime getDhSaiEnt() {
        return dhSaiEnt;
    }

    public void setDhSaiEnt(LocalDateTime dhSaiEnt) {
        this.dhSaiEnt = dhSaiEnt;
    }

    public Integer getTpNF() {
        return tpNF;
    }

    public void setTpNF(Integer tpNF) {
        this.tpNF = tpNF;
    }

    public Integer getIdDest() {
        return idDest;
    }

    public void setIdDest(Integer idDest) {
        this.idDest = idDest;
    }

    public Integer getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(Integer cMunFG) {
        this.cMunFG = cMunFG;
    }

    public Integer getTpImp() {
        return tpImp;
    }

    public void setTpImp(Integer tpImp) {
        this.tpImp = tpImp;
    }

    public Integer getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(Integer tpEmis) {
        this.tpEmis = tpEmis;
    }

    public Integer getCdv() {
        return cdv;
    }

    public void setCdv(Integer cdv) {
        this.cdv = cdv;
    }

    public Integer getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(Integer tpAmb) {
        this.tpAmb = tpAmb;
    }

    public Integer getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(Integer finNFe) {
        this.finNFe = finNFe;
    }

    public Integer getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(Integer indFinal) {
        this.indFinal = indFinal;
    }

    public Integer getIndPres() {
        return indPres;
    }

    public void setIndPres(Integer indPres) {
        this.indPres = indPres;
    }

    public Integer getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(Integer procEmi) {
        this.procEmi = procEmi;
    }

    public String getVerProc() {
        return verProc;
    }

    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }
}