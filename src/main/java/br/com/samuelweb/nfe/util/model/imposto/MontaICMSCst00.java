package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCst00 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS00 icms00 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS00();
        if (icms.getOrig() != null) {
            icms00.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms00.setCST(icms.getCST().getValue());
        }
        if (icms.getModBC() != null) {
            icms00.setModBC(icms.getModBC().getValue().toString());
        }
        if (icms.getvBC() != null) {
            icms00.setVBC(BigDecimalUtil.format(icms.getvBC()));
        }
        if (icms.getpICMS() != null) {
            icms00.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
        }
        if (icms.getvICMS() != null) {
            icms00.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
        }
        if (icms.getpFCP() != null) {
            icms00.setPFCP(BigDecimalUtil.format(icms.getpFCP()));
        }
        if (icms.getvFCP() != null) {
            icms00.setVFCP(BigDecimalUtil.format(icms.getvFCP()));
        }
        imposto.setICMS00(icms00);
    }

}
