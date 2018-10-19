package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.enumeration.IndISS;
import br.com.samuelweb.nfe.util.enumeration.SimNao;
import br.com.samuelweb.nfe.util.validators.impl.ValidarIndISS;
import br.com.samuelweb.nfe.util.validators.impl.ValidarMunicipio;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.math.BigDecimal;

public class ISSQN  {
    
    @NfeCampo(tipo = BigDecimal.class
            , id = "U02", tag = "vBC", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = DfeConsts.DSC_VBC)
    private BigDecimal vBC;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U03", tag = "vAliq", decimais = 4, precisao = 7
            , tamanhoMinimo = 1, tamanhoMaximo = 7, ocorrencias = 1
            , descricao = DfeConsts.DSC_VALIQ)
    private BigDecimal vAliq;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U04", tag = "vISSQN", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = DfeConsts.DSC_VISSQN)
    private BigDecimal vISSQN;

    @NfeCampo(tipo = Integer.class
            , id = "U05", tag = "cMunFG", validadores = {ValidarMunicipio.class}
            , tamanhoMinimo = 7, tamanhoMaximo = 7, ocorrencias = 1
            , descricao = DfeConsts.DSC_CMUNFG)
    private Integer cMunFG;

    @NfeCampo(tipo = String.class
            , id = "u06", tag = "cListServ"
            , tamanhoMinimo = 5, tamanhoMaximo = 5, ocorrencias = 1
            , descricao = DfeConsts.DSC_CLISTSERV)
    private String cListServ;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U07", tag = "vDeducao", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , descricao = DfeConsts.DSC_VDEDUCISS)
    private BigDecimal vDeducao;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U08", tag = "vOutro", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , descricao = DfeConsts.DSC_VOUTRO)
    private BigDecimal vOutro;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U09", tag = "vDescIncond", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , descricao = DfeConsts.DSC_VDESCINCOND)
    private BigDecimal vDescIncond;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U10", tag = "vDescCond", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , descricao = DfeConsts.DSC_VDESCCOND)
    private BigDecimal vDescCond;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U10", tag = "vISSRet", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , descricao = DfeConsts.DSC_VISSRET)
    private BigDecimal vISSRet;

    @NfeCampo(tipo = IndISS.class
            , id = "U12", tag = "indISS"
            , tamanhoMinimo = 2, tamanhoMaximo = 2, ocorrencias = 1
            , descricao = DfeConsts.DSC_INDISS)
    private IndISS indISS;

    @NfeCampo(tipo = BigDecimal.class
            , id = "U13", tag = "cServico"
            , tamanhoMinimo = 1, tamanhoMaximo = 20, ocorrencias = 0
            , descricao = DfeConsts.DSC_CSERVTRIBMUN)
    private String cServico;

    @NfeCampo(tipo = Integer.class
            , id = "U14", tag = "cMun", validadores = {ValidarMunicipio.class}
            , tamanhoMinimo = 7, tamanhoMaximo = 7, ocorrencias = 0
            , descricao = DfeConsts.DSC_CMUN)
    private Integer cMun;

    @NfeCampo(tipo = Integer.class
            , id = "U15", tag = "cPais"
            , tamanhoMinimo = 4, tamanhoMaximo = 4, ocorrencias = 0
            , descricao = DfeConsts.DSC_CPAIS)
    private Integer cPais;

    @NfeCampo(tipo = String.class
            , id = "U16", tag = "nProcesso"
            , tamanhoMinimo = 1, tamanhoMaximo = 30, ocorrencias = 0
            , descricao = DfeConsts.DSC_NPROCESSO)
    private String nProcesso;

    @NfeCampo(tipo = SimNao.class
            , id = "U17", tag = "indIncentivo"
            , tamanhoMinimo = 1, tamanhoMaximo = 1, ocorrencias = 1
            , descricao = DfeConsts.DSC_INDINCENTIVO)
    private SimNao indIncentivo;


    public boolean isEmpty() {
        return (vBC == null)
            && (vAliq == null)
            && (vISSQN == null)
            && (cListServ == null || cListServ.isEmpty())
            && (vDeducao == null)
            && (vOutro == null)
            && (vDescIncond == null)
            && (vDescCond == null)
            && (vISSRet == null)
            && (indISS == null)
            && (cServico == null || cServico.isEmpty())
            && (nProcesso == null || nProcesso.isEmpty())
            && (indIncentivo == null);
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }

    public TNFe.InfNFe.Det.Imposto.ISSQN build() {
        TNFe.InfNFe.Det.Imposto.ISSQN issqn = new TNFe.InfNFe.Det.Imposto.ISSQN();
        if (this.getvBC() != null) {
            issqn.setVBC(BigDecimalUtil.format(this.getvBC()));
        }
        if (this.getvAliq() != null) {
            issqn.setVAliq(BigDecimalUtil.format(this.getvAliq()));
        }
        if (this.getvISSQN() != null) {
            issqn.setVISSQN(BigDecimalUtil.format(this.getvISSQN()));
        }
        if (this.getcMunFG() != null) {
            issqn.setCMunFG(this.getcMunFG().toString());
        }
        if (this.getcListServ() != null) {
            issqn.setCListServ(this.getcListServ().toString());
        }
        if (this.getvDeducao()!= null) {
            issqn.setVDeducao(BigDecimalUtil.format(this.getvDeducao()));
        }
        if (this.getvOutro() != null) {
            issqn.setVOutro(BigDecimalUtil.format(this.getvOutro()));
        }
        if (this.getvDescIncond() != null) {
            issqn.setVDescIncond(BigDecimalUtil.format(this.getvDescIncond()));
        }
        if (this.getvDescCond() != null) {
            issqn.setVDescCond(BigDecimalUtil.format(this.getvDescCond()));
        }
        if (this.getvISSRet() != null) {
            issqn.setVISSRet(BigDecimalUtil.format(this.getvISSRet()));
        }
        if (this.getIndISS() != null) {
            issqn.setIndISS(this.getIndISS().getValue().toString());
        }
        issqn.setCServico(this.getcServico());
        if (this.getcMun() != null) {
            issqn.setCMun(this.getcMun().toString());
        }
        if (this.getcPais() != null) {
            issqn.setCPais(this.getcPais().toString());
        }
        issqn.setNProcesso(this.getnProcesso());
        if (this.getIndIncentivo() != null) {
            issqn.setIndIncentivo(this.getIndIncentivo().toString());
        }
        return issqn;
    }

    public BigDecimal getvBC() {
        return vBC;
    }

    public BigDecimal getvAliq() {
        return vAliq;
    }

    public BigDecimal getvISSQN() {
        return vISSQN;
    }

    public Integer getcMunFG() {
        return cMunFG;
    }

    public String getcListServ() {
        return cListServ;
    }

    public BigDecimal getvDeducao() {
        return vDeducao;
    }

    public BigDecimal getvOutro() {
        return vOutro;
    }

    public BigDecimal getvDescIncond() {
        return vDescIncond;
    }

    public BigDecimal getvDescCond() {
        return vDescCond;
    }

    public BigDecimal getvISSRet() {
        return vISSRet;
    }

    public IndISS getIndISS() {
        return indISS;
    }

    public String getcServico() {
        return cServico;
    }

    public Integer getcMun() {
        return cMun;
    }

    public Integer getcPais() {
        return cPais;
    }

    public String getnProcesso() {
        return nProcesso;
    }

    public SimNao getIndIncentivo() {
        return indIncentivo;
    }

    public ISSQN setvBC(BigDecimal vBC) {
        this.vBC = vBC;
        return this;
    }

    public ISSQN setvAliq(BigDecimal vAliq) {
        this.vAliq = vAliq;
        return this;
    }

    public ISSQN setvISSQN(BigDecimal vISSQN) {
        this.vISSQN = vISSQN;
        return this;
    }

    public ISSQN setcMunFG(Integer cMunFG) {
        this.cMunFG = cMunFG;
        return this;
    }

    public ISSQN setcListServ(String cListServ) {
        this.cListServ = cListServ;
        return this;
    }

    public ISSQN setvDeducao(BigDecimal vDeducao) {
        this.vDeducao = vDeducao;
        return this;
    }

    public ISSQN setvOutro(BigDecimal vOutro) {
        this.vOutro = vOutro;
        return this;
    }

    public ISSQN setvDescIncond(BigDecimal vDescIncond) {
        this.vDescIncond = vDescIncond;
        return this;
    }

    public ISSQN setvDescCond(BigDecimal vDescCond) {
        this.vDescCond = vDescCond;
        return this;
    }

    public ISSQN setvISSRet(BigDecimal vISSRet) {
        this.vISSRet = vISSRet;
        return this;
    }

    public ISSQN setIndISS(IndISS indISS) {
        this.indISS = indISS;
        return this;
    }

    public ISSQN setcServico(String cServico) {
        this.cServico = cServico;
        return this;
    }

    public ISSQN setcMun(Integer cMun) {
        this.cMun = cMun;
        return this;
    }

    public ISSQN setcPais(Integer cPais) {
        this.cPais = cPais;
        return this;
    }

    public ISSQN setnProcesso(String nProcesso) {
        this.nProcesso = nProcesso;
        return this;
    }

    public ISSQN setIndIncentivo(SimNao indIncentivo) {
        this.indIncentivo = indIncentivo;
        return this;
    }

}