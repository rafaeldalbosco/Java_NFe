package br.com.samuelweb.nfe.util.model.imposto;

import br.com.samuelweb.nfe.util.BigDecimalUtil;
import br.com.samuelweb.nfe.util.model.ICMS;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TNFe;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TUf;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class MontaICMSCst90 implements MontaImposto<TNFe.InfNFe.Det.Imposto.ICMS, ICMS> {
    @Override
    public void build(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        if (StringUtils.isNotBlank(icms.getUFST())
                || icms.getpBCOp().compareTo(BigDecimal.ZERO) != 0) {
            buildIcmsPartilha(imposto, icms);
        } else{
            buildIcms(imposto, icms);
        }
    }

    private void buildIcms(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMS90 icms90 = new TNFe.InfNFe.Det.Imposto.ICMS.ICMS90();
        if (icms.getOrig() != null) {
            icms90.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icms90.setCST(icms.getCST().getValue());
        }
        if (icms.getvBC().compareTo(BigDecimal.ZERO) > 0
                || icms.getvICMS().compareTo(BigDecimal.ZERO) > 0) {
            if (icms.getModBC() != null) {
                icms90.setModBC(icms.getModBC().getValue().toString());
            }
            if (icms.getvBC() != null) {
                icms90.setVBC(BigDecimalUtil.format(icms.getvBC()));
            }
            if (icms.getpRedBC() != null) {
                icms90.setPRedBC(BigDecimalUtil.format(icms.getpRedBC()));
            }
            if (icms.getpICMS() != null) {
                icms90.setPICMS(BigDecimalUtil.format(icms.getpICMS()));
            }
            if (icms.getvICMS() != null) {
                icms90.setVICMS(BigDecimalUtil.format(icms.getvICMS()));
            }
        }

        if (icms.getvBCST().compareTo(BigDecimal.ZERO) > 0
                || icms.getvICMSST().compareTo(BigDecimal.ZERO) > 0) {
            if (icms.getModBCST() != null) {
                icms90.setModBCST(icms.getModBCST().toString());
            }
            if (icms.getpMVAST() != null) {
                icms90.setPMVAST(BigDecimalUtil.format(icms.getpMVAST()));
            }
            if (icms.getpRedBCST() != null) {
                icms90.setPRedBCST(BigDecimalUtil.format(icms.getpRedBCST()));
            }
            if (icms.getvBCST() != null) {
                icms90.setVBCST(BigDecimalUtil.format(icms.getvBCST()));
            }
            if (icms.getpICMSST() != null) {
                icms90.setPICMSST(BigDecimalUtil.format(icms.getpICMSST()));
            }
            if (icms.getvICMSST() != null) {
                icms90.setVICMSST(BigDecimalUtil.format(icms.getvICMSST()));
            }
        }
        if (icms.getvBCFCP() != null) {
            icms90.setVBCFCP(BigDecimalUtil.format(icms.getvBCFCP()));
        }
        if (icms.getpFCP() != null) {
            icms90.setPFCP(BigDecimalUtil.format(icms.getpFCP()));
        }
        if (icms.getvFCP() != null) {
            icms90.setVFCP(BigDecimalUtil.format(icms.getvFCP()));
        }
        if (icms.getvBCFCPST() != null) {
            icms90.setVBCFCPST(BigDecimalUtil.format(icms.getvBCFCPST()));
        }
        if (icms.getpFCPST() != null) {
            icms90.setPFCPST(BigDecimalUtil.format(icms.getpFCPST()));
        }
        if (icms.getvFCPST() != null) {
            icms90.setVFCPST(BigDecimalUtil.format(icms.getvFCPST()));
        }
        if (icms.getvICMSDeson() != null) {
            icms90.setVICMSDeson(BigDecimalUtil.format(icms.getvICMSDeson()));
        }
        if (icms.getMotDesICMS() != null) {
            icms90.setMotDesICMS(icms.getMotDesICMS().toString());
        }
        imposto.setICMS90(icms90);
    }

    private void buildIcmsPartilha(TNFe.InfNFe.Det.Imposto.ICMS imposto, ICMS icms) {
        TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart icmsPart = new TNFe.InfNFe.Det.Imposto.ICMS.ICMSPart();
        if (icms.getOrig() != null) {
            icmsPart.setOrig(icms.getOrig().toString());
        }
        if (icms.getCST() != null) {
            icmsPart.setCST(icms.getCST().getValue());
        }
        if (icms.getvBC().compareTo(BigDecimal.ZERO) > 0
                || icms.getvICMS().compareTo(BigDecimal.ZERO) > 0) {
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
        }
        if (icms.getvBCST().compareTo(BigDecimal.ZERO) > 0
                || icms.getvICMSST().compareTo(BigDecimal.ZERO) > 0) {
            if (icms.getModBCST() != null) {
                icmsPart.setModBCST(icms.getModBCST().toString());
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
