package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCsosn500 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500 icmsSn500 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN500();
        if (icms.getOrig() != null) {
            icmsSn500.setOrig(icms.getOrig().toString());
        }
        if (icms.getCSOSN() != null) {
            icmsSn500.setCSOSN(icms.getCSOSN().getValue());
        }
        if (icms.getvBCSTRet() != null) {
            icmsSn500.setVBCSTRet(BigDecimalUtil.format(icms.getvBCSTRet()));
        }
        if (icms.getpST() != null) {
            icmsSn500.setPST(BigDecimalUtil.format(icms.getpST()));
        }
        if (icms.getvICMSSTRet() != null) {
            icmsSn500.setVICMSSTRet(BigDecimalUtil.format(icms.getvICMSSTRet()));
        }
        if (icms.getvBCFCPSTRet() != null) {
            icmsSn500.setVBCFCPSTRet(BigDecimalUtil.format(icms.getvBCFCPSTRet()));
        }
        if (icms.getpFCPSTRet() != null) {
            icmsSn500.setPFCPSTRet(BigDecimalUtil.format(icms.getpFCPSTRet()));
        }
        if (icms.getvFCPSTRet() != null) {
            icmsSn500.setVFCPSTRet(BigDecimalUtil.format(icms.getvFCPSTRet()));
        }
        imposto.setICMSSN500(icmsSn500);
    }
}
