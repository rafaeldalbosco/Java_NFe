package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.COFINS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;

public class MontaCOFINSQtde implements MontaImposto<TNFe.InfNFe.Det.Imposto.COFINS, COFINS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.COFINS imposto, COFINS cofins) {
        TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde cofinsQtde = new TNFe.InfNFe.Det.Imposto.COFINS.COFINSQtde();
        if (cofins.getCst() != null) {
            cofinsQtde.setCST(cofins.getCst().getValue());
        }
        if (cofins.getqBCProd() != null) {
            cofinsQtde.setQBCProd(BigDecimalUtil.format(cofins.getqBCProd()));
        }
        if (cofins.getvAliqProd() != null) {
            cofinsQtde.setVAliqProd(BigDecimalUtil.format(cofins.getvAliqProd()));
        }
        if (cofins.getvCOFINS() != null) {
            cofinsQtde.setVCOFINS(BigDecimalUtil.format(cofins.getvCOFINS()));
        }
        imposto.setCOFINSQtde(cofinsQtde);
    }
}
