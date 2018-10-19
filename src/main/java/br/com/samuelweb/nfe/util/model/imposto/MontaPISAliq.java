package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.PIS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaPISAliq implements MontaImposto<TNFe.InfNFe.Det.Imposto.PIS, PIS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.PIS imposto, PIS pis) {
        TNFe.InfNFe.Det.Imposto.PIS.PISAliq pisAliq = new TNFe.InfNFe.Det.Imposto.PIS.PISAliq();
        if (pis.getCST() != null) {
            pisAliq.setCST(pis.getCST().getValue());
        }
        if (pis.getvBC() != null) {
            pisAliq.setVBC(BigDecimalUtil.format(pis.getvBC()));
        }
        if (pis.getpPIS() != null) {
            pisAliq.setPPIS(BigDecimalUtil.format(pis.getpPIS()));
        }
        if (pis.getvPIS() != null) {
            pisAliq.setVPIS(BigDecimalUtil.format(pis.getvPIS()));
        }
        imposto.setPISAliq(pisAliq);
    }
}
