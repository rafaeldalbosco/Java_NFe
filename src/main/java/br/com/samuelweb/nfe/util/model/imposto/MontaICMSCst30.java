package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCst30 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS30 icms30 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS30();
        if (icms.getOrig() != null) {
            icms30.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms30.setCST(icms.getCST().getValue());
        }
        if (icms.getModBCST() != null) {
            icms30.setModBCST(icms.getModBCST().getValue().toString());
        }
        if (icms.getpMVAST() != null) {
            icms30.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
        }
        if (icms.getpRedBCST() != null) {
            icms30.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
        }
        if (icms.getvBCST() != null) {
            icms30.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
        }
        if (icms.getpICMSST() != null) {
            icms30.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
        }
        if (icms.getvICMSST() != null) {
            icms30.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
        }
        if (icms.getvBCFCPST() != null) {
            icms30.setVBCFCPST(BigDecimalUtil.format(icms.getvBCFCPST()));
        }
        if (icms.getpFCPST() != null) {
            icms30.setPFCPST(BigDecimalUtil.format(icms.getpFCPST()));
        }
        if (icms.getvFCPST() != null) {
            icms30.setVFCPST(BigDecimalUtil.format(icms.getvFCPST()));
        }
        if (icms.getvICMSDeson() != null) {
            icms30.setVICMSDeson(BigDecimalUtil.format(icms.getvICMSDeson()));
        }
        if (icms.getMotDesICMS() != null) {
            icms30.setMotDesICMS(icms.getMotDesICMS().getValue().toString());
        }
        imposto.setICMS30(icms30);
    }
}
