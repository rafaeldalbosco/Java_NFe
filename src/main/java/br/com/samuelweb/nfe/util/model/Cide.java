package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.math.BigDecimal;

public class Cide {

    @NfeCampo(tipo = BigDecimal.class
            , id = "L106", tag = "qBCProd", decimais = 4, precisao = 16
            , tamanhoMinimo = 1, tamanhoMaximo = 16, ocorrencias = 1
            , descricao = DfeConsts.DSC_QBCPROD)
    private BigDecimal qbcProd;

    @NfeCampo(tipo = BigDecimal.class
            , id = "L107", tag = "vAliqProd", decimais = 4, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = DfeConsts.DSC_VALIQPROD)
    private BigDecimal vAliqProd;

    @NfeCampo(tipo = BigDecimal.class
            , id = "L108", tag = "vCIDE", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = NfeConsts.DSC_VCIDE)
    private BigDecimal vcide;

    public TNFe.InfNFe.Det.Prod.Comb.CIDE build() {
        TNFe.InfNFe.Det.Prod.Comb.CIDE cide = new TNFe.InfNFe.Det.Prod.Comb.CIDE();
        if (this.getQbcProd() != null) {
            cide.setQBCProd(BigDecimalUtil.format(this.getQbcProd()));
        }
        if (this.getvAliqProd() != null) {
            cide.setVAliqProd(BigDecimalUtil.format(this.getvAliqProd()));
        }
        if (this.getVcide() != null) {
            cide.setVCIDE(BigDecimalUtil.format(this.getVcide()));
        }
        return cide;
    }

    public BigDecimal getQbcProd() {
        return qbcProd;
    }

    public void setQbcProd(BigDecimal qbcProd) {
        this.qbcProd = qbcProd;
    }

    public BigDecimal getvAliqProd() {
        return vAliqProd;
    }

    public void setvAliqProd(BigDecimal vAliqProd) {
        this.vAliqProd = vAliqProd;
    }

    public BigDecimal getVcide() {
        return vcide;
    }

    public void setVcide(BigDecimal vcide) {
        this.vcide = vcide;
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }
}
