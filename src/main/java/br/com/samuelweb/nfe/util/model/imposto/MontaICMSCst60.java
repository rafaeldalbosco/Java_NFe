package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

import java.math.BigDecimal;

public class MontaICMSCst60 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        if (icms.getvBCSTDest() == null || icms.getvICMSSTDest() == null
                || (icms.getvBCSTDest().compareTo(BigDecimal.ZERO) == 0
                    && icms.getvICMSSTDest().compareTo(BigDecimal.ZERO) == 0)) {
            buildIcms(imposto, icms);
        } else {
            buildIcmsSt(imposto, icms);
        }
    }

    private void buildIcms(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS60 icms60 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS60();
        if (icms.getOrig() != null) {
            icms60.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms60.setCST(icms.getCST().getValue());
        }
        if (icms.getvBCSTRet() != null) {
            icms60.setVBCSTRet(BigDecimalUtil.format(icms.getvBCSTRet()));
        }
        if (icms.getpST() != null) {
            icms60.setPST(BigDecimalUtil.format(icms.getpST()));
        }
        if (icms.getvICMSSTRet() != null) {
            icms60.setVICMSSTRet(BigDecimalUtil.format(icms.getvICMSSTRet()));
        }
        if (icms.getvBCFCPSTRet() != null) {
            icms60.setVBCFCPSTRet(BigDecimalUtil.format(icms.getvBCFCPSTRet()));
        }
        if (icms.getpFCPSTRet() != null) {
            icms60.setPFCPSTRet(BigDecimalUtil.format(icms.getpFCPSTRet()));
        }
        if (icms.getvFCPSTRet() != null) {
            icms60.setVFCPSTRet(BigDecimalUtil.format(icms.getvFCPSTRet()));
        }
        imposto.setICMS60(icms60);
    }

    private void buildIcmsSt(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSST icmsSt = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSST();
        if (icms.getOrig() != null) {
            icmsSt.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icmsSt.setCST(icms.getCST().getValue());
        }
        if (icms.getvBCSTRet() != null) {
            icmsSt.setVBCSTRet(icms.getvBCSTRet().toString());
        }
        if (icms.getvICMSSTRet() != null) {
            icmsSt.setVICMSSTRet(icms.getvICMSSTRet().toString());
        }
        if (icms.getvBCSTDest() != null) {
            icmsSt.setVBCSTDest(icms.getvBCSTDest().toString());
        }
        if (icms.getvICMSSTDest() != null) {
            icmsSt.setVICMSSTDest(icms.getvICMSSTDest().toString());
        }
        imposto.setICMSST(icmsSt);
    }
}
