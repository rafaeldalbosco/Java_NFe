package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCsosn201 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201 icmsSn201 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN201();
        if (icms.getOrig() != null) {
            icmsSn201.setOrig(icms.getOrig().toString());
        }
        if (icms.getCSOSN() != null) {
            icmsSn201.setCSOSN(icms.getCSOSN().getValue());
        }
        if (icms.getModBCST() != null) {
            icmsSn201.setModBCST(icms.getModBCST().getValue().toString());
        }
        if (icms.getpMVAST() != null) {
            icmsSn201.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
        }
        if (icms.getpRedBCST() != null) {
            icmsSn201.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
        }
        if (icms.getvBCST() != null) {
            icmsSn201.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
        }
        if (icms.getpICMSST() != null) {
            icmsSn201.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
        }
        if (icms.getvICMSST() != null) {
            icmsSn201.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
        }
        if (icms.getvBCFCPST() != null) {
            icmsSn201.setVBCFCPST(BigDecimalUtil.format(icms.getvBCFCPST()));
        }
        if (icms.getpFCPST() != null) {
            icmsSn201.setPFCPST(BigDecimalUtil.format(icms.getpFCPST()));
        }
        if (icms.getvFCPST() != null) {
            icmsSn201.setVFCPST(BigDecimalUtil.format(icms.getvFCPST()));
        }
        if (icms.getpCredSN() != null) {
            icmsSn201.setPCredSN(BigDecimalUtil.format(icms.getpCredSN()));
        }
        if (icms.getvCredICMSSN() != null) {
            icmsSn201.setVCredICMSSN(BigDecimalUtil.format(icms.getvCredICMSSN()));
        }
        imposto.setICMSSN201(icmsSn201);
    }
}
