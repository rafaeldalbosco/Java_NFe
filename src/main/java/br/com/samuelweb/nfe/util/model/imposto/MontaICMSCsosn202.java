package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCsosn202 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202 icmsSn202 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN202();
        if (icms.getOrig() != null) {
            icmsSn202.setOrig(icms.getOrig().toString());
        }
        if (icms.getCSOSN() != null) {
            icmsSn202.setCSOSN(icms.getCSOSN().getValue());
        }
        if (icms.getModBCST() != null) {
            icmsSn202.setModBCST(icms.getModBCST().getValue().toString());
        }
        if (icms.getpMVAST() != null) {
            icmsSn202.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
        }
        if (icms.getpRedBCST() != null) {
            icmsSn202.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
        }
        if (icms.getvBCST() != null) {
            icmsSn202.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
        }
        if (icms.getpICMSST() != null) {
            icmsSn202.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
        }
        if (icms.getvICMSST() != null) {
            icmsSn202.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
        }
        if (icms.getvBCFCPST() != null) {
            icmsSn202.setVBCFCPST(BigDecimalUtil.format(icms.getvBCFCPST()));
        }
        if (icms.getpFCPST() != null) {
            icmsSn202.setPFCPST(BigDecimalUtil.format(icms.getpFCPST()));
        }
        if (icms.getvFCPST() != null) {
            icmsSn202.setVFCPST(BigDecimalUtil.format(icms.getvFCPST()));
        }
        imposto.setICMSSN202(icmsSn202);
    }
}
