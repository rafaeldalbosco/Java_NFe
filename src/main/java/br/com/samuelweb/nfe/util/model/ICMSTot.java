package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.math.BigDecimal;

public class ICMSTot {

    @NfeCampo(tipo = BigDecimal.class, id = "W03", tag = "vBC"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VBC)
    private BigDecimal vbc;

    @NfeCampo(tipo = BigDecimal.class, id = "W04", tag = "vICMS"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VICMS)
    private BigDecimal vicms;

    @NfeCampo(tipo = BigDecimal.class, id = "W04a", tag = "vICMSDeson"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VICMSDESON)
    private BigDecimal vicmsDeson;

    @NfeCampo(tipo = BigDecimal.class, id = "W04c", tag = "vFCPUFDest"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VICMS)
    private BigDecimal vfcpufDest;

    @NfeCampo(tipo = BigDecimal.class, id = "W04e", tag = "vICMSUFDest"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VICMS)
    private BigDecimal vicmsufDest;

    @NfeCampo(tipo = BigDecimal.class, id = "W04g", tag = "vICMSUFRemet"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VICMS)
    private BigDecimal vicmsufRemet;

    @NfeCampo(tipo = BigDecimal.class, id = "W04h", tag = "vFCP"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VFCP)
    private BigDecimal vfcp;

    @NfeCampo(tipo = BigDecimal.class, id = "W05", tag = "vBCST"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VBCST)
    private BigDecimal vbcst;

    @NfeCampo(tipo = BigDecimal.class, id = "W06", tag = "vST"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VST)
    private BigDecimal vst;

    @NfeCampo(tipo = BigDecimal.class, id = "W06a", tag = "vFCPST"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VFCPST)
    private BigDecimal vfcpst;

    @NfeCampo(tipo = BigDecimal.class, id = "W06b", tag = "vFCPSTRet"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VFCPSTRET)
    private BigDecimal vfcpstRet;

    @NfeCampo(tipo = BigDecimal.class, id = "W07", tag = "vProd"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VPROD)
    private BigDecimal vProd;

    @NfeCampo(tipo = BigDecimal.class, id = "W08", tag = "vFrete"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VFRETE)
    private BigDecimal vFrete;

    @NfeCampo(tipo = BigDecimal.class, id = "W09", tag = "vSeg"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VSEG)
    private BigDecimal vSeg;

    @NfeCampo(tipo = BigDecimal.class, id = "W10", tag = "vDesc"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VDESC)
    private BigDecimal vDesc;

    @NfeCampo(tipo = BigDecimal.class, id = "W11", tag = "vII"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VII)
    private BigDecimal vii;

    @NfeCampo(tipo = BigDecimal.class, id = "W12", tag = "vIPI"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VIPI)
    private BigDecimal vipi;

    @NfeCampo(tipo = BigDecimal.class, id = "W12a", tag = "vIPIDevol"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15, valorDefault = "0"
            , descricao = NfeConsts.DSC_VIPIDEVOL)
    private BigDecimal vipiDevol;

    @NfeCampo(tipo = BigDecimal.class, id = "W13", tag = "vPIS"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VPIS)
    private BigDecimal vpis;

    @NfeCampo(tipo = BigDecimal.class, id = "W14", tag = "vCOFINS"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VCOFINS)
    private BigDecimal vcofins;

    @NfeCampo(tipo = BigDecimal.class, id = "W15", tag = "vOutro"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VOUTRO)
    private BigDecimal vOutro;

    @NfeCampo(tipo = BigDecimal.class, id = "W16", tag = "vNF"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VNF)
    private BigDecimal vnf;

    @NfeCampo(tipo = BigDecimal.class, id = "W16a", tag = "vTotTrib"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 0
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VTOTTRIB)
    private BigDecimal vTotTrib;

    public TNFe.InfNFe.Total.ICMSTot build() {
        TNFe.InfNFe.Total.ICMSTot icmsTot = new TNFe.InfNFe.Total.ICMSTot();

        if (this.getVbc() != null) {
            icmsTot.setVBC(BigDecimalUtil.format(this.getVbc()));
        }
        if (this.getVicms() != null) {
            icmsTot.setVICMS(BigDecimalUtil.format(this.getVicms()));
        }
        if (this.getVicmsDeson() != null) {
            icmsTot.setVICMSDeson(BigDecimalUtil.format(this.getVicmsDeson()));
        }
        if (this.getVfcpufDest() != null) {
            icmsTot.setVFCPUFDest(BigDecimalUtil.format(this.getVfcpufDest()));
        }
        if (this.getVicmsufDest() != null) {
            icmsTot.setVICMSUFDest(BigDecimalUtil.format(this.getVicmsufDest()));
        }
        if (this.getVicmsufRemet() != null) {
            icmsTot.setVICMSUFRemet(BigDecimalUtil.format(this.getVicmsufRemet()));
        }
        if (this.getVfcp() != null) {
            icmsTot.setVFCP(BigDecimalUtil.format(this.getVfcp()));
        }
        if (this.getVbcst() != null) {
            icmsTot.setVBCST(BigDecimalUtil.format(this.getVbcst()));
        }
        if (this.getVst() != null) {
            icmsTot.setVST(BigDecimalUtil.format(this.getVst()));
        }
        if (this.getVfcpst() != null) {
            icmsTot.setVFCPST(BigDecimalUtil.format(this.getVfcpst()));
        }
        if (this.getVfcpstRet() != null) {
            icmsTot.setVFCPSTRet(BigDecimalUtil.format(this.getVfcpstRet()));
        }
        if (this.getvProd() != null) {
            icmsTot.setVProd(BigDecimalUtil.format(this.getvProd()));
        }
        if (this.getvFrete() != null) {
            icmsTot.setVFrete(BigDecimalUtil.format(this.getvFrete()));
        }
        if (this.getvSeg() != null) {
            icmsTot.setVSeg(BigDecimalUtil.format(this.getvSeg()));
        }
        if (this.getvDesc() != null) {
            icmsTot.setVDesc(BigDecimalUtil.format(this.getvDesc()));
        }
        if (this.getVii() != null) {
            icmsTot.setVII(BigDecimalUtil.format(this.getVii()));
        }
        if (this.getVipi() != null) {
            icmsTot.setVIPI(BigDecimalUtil.format(this.getVipi()));
        }
        if (this.getVipiDevol() != null) {
            icmsTot.setVIPIDevol(BigDecimalUtil.format(this.getVipiDevol()));
        }
        if (this.getVpis() != null) {
            icmsTot.setVPIS(BigDecimalUtil.format(this.getVpis()));
        }
        if (this.getVcofins() != null) {
            icmsTot.setVCOFINS(BigDecimalUtil.format(this.getVcofins()));
        }
        if (this.getvOutro() != null) {
            icmsTot.setVOutro(BigDecimalUtil.format(this.getvOutro()));
        }
        if (this.getVnf() != null) {
            icmsTot.setVNF(BigDecimalUtil.format(this.getVnf()));
        }
        if (this.getvTotTrib() != null) {
            icmsTot.setVTotTrib(BigDecimalUtil.format(this.getvTotTrib()));
        }

        return icmsTot;
    }

    public BigDecimal getVbc() {
        return vbc;
    }

    public BigDecimal getVicms() {
        return vicms;
    }

    public BigDecimal getVicmsDeson() {
        return vicmsDeson;
    }

    public BigDecimal getVfcpufDest() {
        return vfcpufDest;
    }

    public BigDecimal getVicmsufDest() {
        return vicmsufDest;
    }

    public BigDecimal getVicmsufRemet() {
        return vicmsufRemet;
    }

    public BigDecimal getVfcp() {
        return vfcp;
    }

    public BigDecimal getVbcst() {
        return vbcst;
    }

    public BigDecimal getVst() {
        return vst;
    }

    public BigDecimal getVfcpst() {
        return vfcpst;
    }

    public BigDecimal getVfcpstRet() {
        return vfcpstRet;
    }

    public BigDecimal getvProd() {
        return vProd;
    }

    public BigDecimal getvFrete() {
        return vFrete;
    }

    public BigDecimal getvSeg() {
        return vSeg;
    }

    public BigDecimal getvDesc() {
        return vDesc;
    }

    public BigDecimal getVii() {
        return vii;
    }

    public BigDecimal getVipi() {
        return vipi;
    }

    public BigDecimal getVipiDevol() {
        return vipiDevol;
    }

    public BigDecimal getVpis() {
        return vpis;
    }

    public BigDecimal getVcofins() {
        return vcofins;
    }

    public BigDecimal getvOutro() {
        return vOutro;
    }

    public BigDecimal getVnf() {
        return vnf;
    }

    public BigDecimal getvTotTrib() {
        return vTotTrib;
    }

    public ICMSTot setVbc(BigDecimal vbc) {
        this.vbc = vbc;
        return this;
    }

    public ICMSTot setVicms(BigDecimal vicms) {
        this.vicms = vicms;
        return this;
    }

    public ICMSTot setVicmsDeson(BigDecimal vicmsDeson) {
        this.vicmsDeson = vicmsDeson;
        return this;
    }

    public ICMSTot setVfcpufDest(BigDecimal vfcpufDest) {
        this.vfcpufDest = vfcpufDest;
        return this;
    }

    public ICMSTot setVicmsufDest(BigDecimal vicmsufDest) {
        this.vicmsufDest = vicmsufDest;
        return this;
    }

    public ICMSTot setVicmsufRemet(BigDecimal vicmsufRemet) {
        this.vicmsufRemet = vicmsufRemet;
        return this;
    }

    public ICMSTot setVfcp(BigDecimal vfcp) {
        this.vfcp = vfcp;
        return this;
    }

    public ICMSTot setVbcst(BigDecimal vbcst) {
        this.vbcst = vbcst;
        return this;
    }

    public ICMSTot setVst(BigDecimal vst) {
        this.vst = vst;
        return this;
    }

    public ICMSTot setVfcpst(BigDecimal vfcpst) {
        this.vfcpst = vfcpst;
        return this;
    }

    public ICMSTot setVfcpstRet(BigDecimal vfcpstRet) {
        this.vfcpstRet = vfcpstRet;
        return this;
    }

    public ICMSTot setvProd(BigDecimal vProd) {
        this.vProd = vProd;
        return this;
    }

    public ICMSTot setvFrete(BigDecimal vFrete) {
        this.vFrete = vFrete;
        return this;
    }

    public ICMSTot setvSeg(BigDecimal vSeg) {
        this.vSeg = vSeg;
        return this;
    }

    public ICMSTot setvDesc(BigDecimal vDesc) {
        this.vDesc = vDesc;
        return this;
    }

    public ICMSTot setVii(BigDecimal vii) {
        this.vii = vii;
        return this;
    }

    public ICMSTot setVipi(BigDecimal vipi) {
        this.vipi = vipi;
        return this;
    }

    public ICMSTot setVipiDevol(BigDecimal vipiDevol) {
        this.vipiDevol = vipiDevol;
        return this;
    }

    public ICMSTot setVpis(BigDecimal vpis) {
        this.vpis = vpis;
        return this;
    }

    public ICMSTot setVcofins(BigDecimal vcofins) {
        this.vcofins = vcofins;
        return this;
    }

    public ICMSTot setvOutro(BigDecimal vOutro) {
        this.vOutro = vOutro;
        return this;
    }

    public ICMSTot setVnf(BigDecimal vnf) {
        this.vnf = vnf;
        return this;
    }

    public ICMSTot setvTotTrib(BigDecimal vTotTrib) {
        this.vTotTrib = vTotTrib;
        return this;
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }
}