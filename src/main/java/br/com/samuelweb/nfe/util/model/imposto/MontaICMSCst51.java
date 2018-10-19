package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCst51 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS51 icms51 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS51();
        if (icms.getOrig() != null) {
            icms51.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms51.setCST(icms.getCST().getValue());
        }
        if (icms.getModBC() != null) {
            icms51.setModBC(icms.getModBC().toString());
        }
        if (icms.getpRedBC() != null) {
            icms51.setPRedBC(BigDecimalUtil.format(icms.getpRedBC()));
        }
        if (icms.getvBC() != null) {
            icms51.setVBC(BigDecimalUtil.format(icms.getvBC()));
        }
        if (icms.getpICMS() != null) {
            icms51.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
        }
        if (icms.getvICMSOp() != null) {
            icms51.setVICMSOp(BigDecimalUtil.format(icms.getvICMSOp()));
        }
        if (icms.getpDif() != null) {
            icms51.setPDif(BigDecimalUtil.format(icms.getpDif()));
        }
        if (icms.getvICMSDif() != null) {
            icms51.setVICMSDif(BigDecimalUtil.format(icms.getvICMSDif()));
        }
        if (icms.getvICMS() != null) {
            icms51.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
        }
        if (icms.getvBCFCP() != null) {
            icms51.setVBCFCP(BigDecimalUtil.format(icms.getvBCFCP()));
        }
        if (icms.getpFCP() != null) {
            icms51.setPFCP(BigDecimalUtil.format(icms.getpFCP()));
        }
        if (icms.getvFCP() != null) {
            icms51.setVFCP(BigDecimalUtil.format(icms.getvFCP()));
        }
        imposto.setICMS51(icms51);
    }
}
