package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.IPI;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TIpi;

import java.math.BigDecimal;

public class MontaIPITrib implements MontaImposto<TIpi, IPI> {
    @Override
    public void build(TIpi imposto, IPI ipi) {
        br.inf.portalfiscal.nfe.schema_4.enviNFe.TIpi.IPITrib ipiTrib = new br.inf.portalfiscal.nfe.schema_4.enviNFe.TIpi.IPITrib();
        if (ipi.getCst() != null) {
            ipiTrib.setCST(ipi.getCst().getValue());
        }
        if (ipi.getvBC() != null) {
            ipiTrib.setVBC(BigDecimalUtil.format(ipi.getvBC()));
        }
        if (ipi.getqUnid() != null && ipi.getvUnid() != null
                && ipi.getqUnid().add(ipi.getvUnid()).compareTo(BigDecimal.ZERO) > 0) {
            ipiTrib.setQUnid(BigDecimalUtil.format(ipi.getqUnid()));
            ipiTrib.setVUnid(BigDecimalUtil.format(ipi.getvUnid()));
        } else {
            if (ipi.getvBC() != null) {
                ipiTrib.setVBC(BigDecimalUtil.format(ipi.getvBC()));
            }
            if (ipi.getpIPI() != null) {
                ipiTrib.setPIPI(BigDecimalUtil.format(ipi.getpIPI()));
            }
        }
        if (ipi.getvIPI() != null) {
            ipiTrib.setVIPI(BigDecimalUtil.format(ipi.getvIPI()));
        }
        imposto.setIPITrib(ipiTrib);
    }
}
