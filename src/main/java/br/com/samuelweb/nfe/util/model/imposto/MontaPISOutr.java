package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.PIS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.math.BigDecimal;

public class MontaPISOutr implements MontaImposto<TNFe.InfNFe.Det.Imposto.PIS, PIS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.PIS imposto, PIS pis) {
        TNFe.InfNFe.Det.Imposto.PIS.PISOutr pisOutr = new TNFe.InfNFe.Det.Imposto.PIS.PISOutr();
        if (pis.getCST() != null) {
            pisOutr.setCST(pis.getCST().getValue());
        }
        if (pis.getqBCProd() != null && pis.getvAliqProd() != null
                && pis.getqBCProd().add(pis.getvAliqProd()).compareTo(BigDecimal.ZERO) > 0) {
            if (pis.getqBCProd() != null) {
                pisOutr.setQBCProd(BigDecimalUtil.format(pis.getqBCProd()));
            }
            if (pis.getvAliqProd() != null) {
                pisOutr.setVAliqProd(BigDecimalUtil.format(pis.getvAliqProd()));
            }
        } else {
            if (pis.getvBC() != null) {
                pisOutr.setVBC(BigDecimalUtil.format(pis.getvBC()));
            }
            if (pis.getpPIS() != null) {
                pisOutr.setPPIS(BigDecimalUtil.format(pis.getpPIS()));
            }
        }
        if (pis.getvPIS() != null) {
            pisOutr.setVPIS(BigDecimalUtil.format(pis.getvPIS()));
        }
        imposto.setPISOutr(pisOutr);
    }
}
