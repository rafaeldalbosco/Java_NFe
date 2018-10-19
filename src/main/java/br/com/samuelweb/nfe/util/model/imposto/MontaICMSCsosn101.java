package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaICMSCsosn101 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {

    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101 icmsSn101 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSSN101();
        if (icms.getOrig() != null) {
            icmsSn101.setOrig(icms.getOrig().toString());
        }
        if (icms.getCSOSN() != null) {
            icmsSn101.setCSOSN(icms.getCSOSN().getValue());
        }
        if (icms.getpCredSN() != null) {
            icmsSn101.setPCredSN(BigDecimalUtil.format(icms.getpCredSN()));
        }
        if (icms.getvCredICMSSN() != null) {
            icmsSn101.setVCredICMSSN(BigDecimalUtil.format(icms.getvCredICMSSN()));
        }
        imposto.setICMSSN101(icmsSn101);
    }
}
