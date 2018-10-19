package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCsosn900 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900 icmsSn900 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN900();
        if (icms.getOrig() != null) {
            icmsSn900.setOrig(icms.getOrig().toString());
        }
        if (icms.getCSOSN() != null) {
            icmsSn900.setCSOSN(icms.getCSOSN().getValue());
        }
        if (icms.getModBC() != null) {
            icmsSn900.setModBC(icms.getModBC().getValue().toString());
        }
        if (icms.getvBC() != null) {
            icmsSn900.setVBC(BigDecimalUtil.format(icms.getvBC()));
        }
        if (icms.getpRedBC() != null) {
            icmsSn900.setPRedBC(BigDecimalUtil.format(icms.getpRedBC()));
        }
        if (icms.getpICMS() != null) {
            icmsSn900.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
        }
        if (icms.getvICMS() != null) {
            icmsSn900.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
        }
        if (icms.getModBCST() != null) {
            icmsSn900.setModBCST(icms.getModBCST().getValue().toString());
        }
        if (icms.getpMVAST() != null) {
            icmsSn900.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
        }
        if (icms.getpRedBCST() != null) {
            icmsSn900.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
        }
        if (icms.getvBCST() != null) {
            icmsSn900.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
        }
        if (icms.getpICMSST() != null) {
            icmsSn900.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
        }
        if (icms.getvICMSST() != null) {
            icmsSn900.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
        }
        if (icms.getvBCFCPST() != null) {
            icmsSn900.setVBCFCPST(BigDecimalUtil.format(icms.getvBCFCPST()));
        }
        if (icms.getpFCPST() != null) {
            icmsSn900.setPFCPST(BigDecimalUtil.format(icms.getpFCPST()));
        }
        if (icms.getvFCPST() != null) {
            icmsSn900.setVFCPST(BigDecimalUtil.format(icms.getvFCPST()));
        }
        if (icms.getpCredSN() != null) {
            icmsSn900.setPCredSN(BigDecimalUtil.format(icms.getpCredSN()));
        }
        if (icms.getvCredICMSSN() != null) {
            icmsSn900.setVCredICMSSN(BigDecimalUtil.format(icms.getvCredICMSSN()));
        }
        imposto.setICMSSN900(icmsSn900);
    }
}
