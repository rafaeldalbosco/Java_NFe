package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCst20 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS20 icms20 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS20();
        if (icms.getOrig() != null) {
            icms20.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms20.setCST(icms.getCST().getValue());
        }
        if (icms.getModBC() != null) {
            icms20.setModBC(icms.getModBC().getValue().toString());
        }
        if (icms.getvBC() != null) {
            icms20.setVBC(BigDecimalUtil.format(icms.getvBC()));
        }
        if (icms.getpICMS() != null) {
            icms20.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
        }
        if (icms.getvICMS() != null) {
            icms20.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
        }
        if (icms.getpRedBC() != null) {
            icms20.setPRedBC(BigDecimalUtil.format(icms.getpRedBC()));
        }
        if (icms.getvBCFCP() != null) {
            icms20.setVBCFCP(BigDecimalUtil.format(icms.getvBCFCP()));
        }
        if (icms.getpFCP() != null) {
            icms20.setPFCP(BigDecimalUtil.format(icms.getpFCP()));
        }
        if (icms.getvFCP() != null) {
            icms20.setVFCP(BigDecimalUtil.format(icms.getvFCP()));
        }
        if (icms.getvICMSDeson() != null) {
            icms20.setVICMSDeson(BigDecimalUtil.format(icms.getvICMSDeson()));
        }
        if (icms.getMotDesICMS() != null) {
            icms20.setMotDesICMS(icms.getMotDesICMS().getValue().toString());
        }
        imposto.setICMS20(icms20);
    }
}
