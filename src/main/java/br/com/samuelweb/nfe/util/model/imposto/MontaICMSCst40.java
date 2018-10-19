package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.enumeration.CSTIcms;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TUf;

import java.math.BigDecimal;

public class MontaICMSCst40 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        if (icms.getCST().equals(CSTIcms.CST_41)
                && ((icms.getvBCSTRet() != null && icms.getvBCSTRet().compareTo(BigDecimal.ZERO) != 0))
                    || (icms.getvICMSSTRet() != null && (icms.getvICMSSTRet().compareTo(BigDecimal.ZERO) != 0))
                    || (icms.getvBCSTDest() != null && (icms.getvBCSTDest().compareTo(BigDecimal.ZERO) != 0))
                    || (icms.getvICMSSTDest() != null && (icms.getvICMSSTDest().compareTo(BigDecimal.ZERO) != 0))) {
            buildIcmsPartilha(imposto, icms);
        } else {
            buildIcms(imposto, icms);
        }
    }

    private void buildIcms(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS40 icms40 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS40();
        if (icms.getOrig() != null) {
            icms40.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms40.setCST(icms.getCST().getValue());
        }
        if (icms.getvICMSDeson() != null) {
            icms40.setVICMSDeson(BigDecimalUtil.format(icms.getvICMSDeson()));
        }
        if (icms.getMotDesICMS() != null) {
            icms40.setMotDesICMS(icms.getMotDesICMS().getValue().toString());
        }
        imposto.setICMS40(icms40);
    }

    private void buildIcmsPartilha(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart icmsPart = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart();
        if (icms.getOrig() != null) {
            icmsPart.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icmsPart.setCST(icms.getCST().getValue().toString());
        }
        if (icms.getModBC() != null) {
            icmsPart.setModBC(icms.getModBC().getValue().toString());
        }
        if (icms.getvBC() != null) {
            icmsPart.setVBC(BigDecimalUtil.format(icms.getvBC()));
        }
        if (icms.getpRedBC() != null) {
            icmsPart.setPRedBC(BigDecimalUtil.format(icms.getpRedBC()));
        }
        if (icms.getpICMS() != null) {
            icmsPart.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
        }
        if (icms.getvICMS() != null) {
            icmsPart.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
        }
        if (icms.getModBCST() != null) {
            icmsPart.setModBCST(icms.getModBCST().getValue().toString());
        }
        if (icms.getpMVAST() != null) {
            icmsPart.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
        }
        if (icms.getpRedBCST() != null) {
            icmsPart.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
        }
        if (icms.getvBCST() != null) {
            icmsPart.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
        }
        if (icms.getpICMSST() != null) {
            icmsPart.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
        }
        if (icms.getvICMSST() != null) {
            icmsPart.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
        }
        if (icms.getpBCOp() != null) {
            icmsPart.setPBCOp(BigDecimalUtil.format(icms.getpBCOp()));
        }
        if (icms.getUFST() != null) {
            icmsPart.setUFST(TUf.fromValue(icms.getUFST()));
        }
        imposto.setICMSPart(icmsPart);
    }
}
