package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.PIS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaPISQtde implements MontaImposto<TNFe.InfNFe.Det.Imposto.PIS, PIS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.PIS imposto, PIS pis) {
        TNFe.InfNFe.Det.Imposto.PIS.PISQtde pisQtde = new TNFe.InfNFe.Det.Imposto.PIS.PISQtde();
        if (pis.getCST() != null) {
            pisQtde.setCST(pis.getCST().getValue());
        }
        if (pis.getqBCProd() != null) {
            pisQtde.setQBCProd(BigDecimalUtil.format(pis.getqBCProd()));
        }
        if (pis.getvAliqProd() != null) {
            pisQtde.setVAliqProd(BigDecimalUtil.format(pis.getvAliqProd()));
        }
        if (pis.getvPIS() != null) {
            pisQtde.setVPIS(BigDecimalUtil.format(pis.getvPIS()));
        }
        imposto.setPISQtde(pisQtde);
    }
}
