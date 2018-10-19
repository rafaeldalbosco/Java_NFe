package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCst70 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS70 icms70 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS70();
        if (icms.getOrig() != null) {
            icms70.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms70.setCST(icms.getCST().getValue());
        }
        if (icms.getModBC() != null) {
            icms70.setModBC(icms.getModBC().getValue().toString());
        }
        if (icms.getpRedBC() != null) {
            icms70.setPRedBC(BigDecimalUtil.format(icms.getpRedBC()));
        }
        if (icms.getvBC() != null) {
            icms70.setVBC(BigDecimalUtil.format(icms.getvBC()));
        }
        if (icms.getpICMS() != null) {
            icms70.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
        }
        if (icms.getvICMS() != null) {
            icms70.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
        }
        if (icms.getvBCFCP() != null) {
            icms70.setVBCFCP(BigDecimalUtil.format(icms.getvBCFCP()));
        }
        if (icms.getpFCP() != null) {
            icms70.setPFCP(BigDecimalUtil.format(icms.getpFCP()));
        }
        if (icms.getvFCP() != null) {
            icms70.setVFCP(BigDecimalUtil.format(icms.getvFCP()));
        }
        if (icms.getModBCST() != null) {
            icms70.setModBCST(icms.getModBCST().getValue().toString());
        }
        if (icms.getpMVAST() != null) {
            icms70.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
        }
        if (icms.getpRedBCST() != null) {
            icms70.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
        }
        if (icms.getvBCST() != null) {
            icms70.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
        }
        if (icms.getpICMSST() != null) {
            icms70.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
        }
        if (icms.getvICMSST() != null) {
            icms70.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
        }
        if (icms.getvBCFCPST() != null) {
            icms70.setVBCFCPST(BigDecimalUtil.format(icms.getvBCFCPST()));
        }
        if (icms.getpFCPST() != null) {
            icms70.setPFCPST(BigDecimalUtil.format(icms.getpFCPST()));
        }
        if (icms.getvFCPST() != null) {
            icms70.setVFCPST(BigDecimalUtil.format(icms.getvFCPST()));
        }
        if (icms.getvICMSDeson() != null) {
            icms70.setVICMSDeson(BigDecimalUtil.format(icms.getvICMSDeson()));
        }
        if (icms.getMotDesICMS() != null) {
            icms70.setMotDesICMS(icms.getMotDesICMS().toString());
        }
        imposto.setICMS70(icms70); 
    }
}
