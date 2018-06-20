package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.inf.portalfiscal.nfe.schema_4.nfe.TNFe;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;

public class Cana {

    @NfeCampo(tipo = String.class
            , id = "ZC02", tag = "safra"
            , tamanhoMinimo = 4, tamanhoMaximo = 9, ocorrencias = 0
            , descricao = NfeConsts.DSC_SAFRA)
    private String safra;

    @NfeCampo(tipo = String.class
            , id = "ZC03", tag = "ref"
            , tamanhoMinimo = 4, tamanhoMaximo = 9, ocorrencias = 0
            , descricao = NfeConsts.DSC_REF)
    private String ref;

    @NfeCampo(tipo = BigDecimal.class
            , id = "ZC14", tag = "vTotDed", decimais = 2, precisao = 15
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = NfeConsts.DSC_VTOTDED)
    private BigDecimal vTotDed;

    @NfeCampo(tipo = BigDecimal.class
            , id = "ZC15", tag = "vLiqFor"
            , tamanhoMinimo = 1, tamanhoMaximo = 15
            , precisao = 15, decimais = 2, ocorrencias = 1,
            descricao = NfeConsts.DSC_VLIQFOR)
    private BigDecimal vLiqFor;

    @NfeCampo(tipo = BigDecimal.class
            , id = "ZC07", tag = "qTotMes"
            , tamanhoMinimo = 1, tamanhoMaximo = 21, ocorrencias = 1
            , decimais = 10, precisao = 21
            , descricao = NfeConsts.DSC_QTOTMES)
    private BigDecimal qTotMes;

    @NfeCampo(tipo = BigDecimal.class, id = "ZC08", tag = "qTotAnt"
            , tamanhoMinimo = 1, tamanhoMaximo = 21, ocorrencias = 1
            , decimais = 10, precisao = 21
            , descricao = NfeConsts.DSC_QTOTANT)
    private BigDecimal qTotAnt;

    @NfeCampo(tipo = BigDecimal.class, id = "ZC09", tag = "qTotGer"
            , tamanhoMinimo = 1, tamanhoMaximo = 21, ocorrencias = 1
            , decimais = 10, precisao = 21
            , descricao = NfeConsts.DSC_TOTGER)
    private BigDecimal qTotGer;

    @NfeCampo(tipo = BigDecimal.class, id = "ZC13", tag = "vFor"
            , tamanhoMinimo = 1, tamanhoMaximo = 15, ocorrencias = 1
            , decimais = 2, precisao = 15
            , descricao = NfeConsts.DSC_VFOR)
    private String vFor;

    private List<ForDia> forDia;
    private List<Deduc> deduc;

    public TNFe.InfNFe.Cana build() {
        if ((StringUtils.isNotBlank(this.safra) || StringUtils.isNotBlank(this.ref)) ||
                ((this.forDia != null && this.forDia.size() > 0) || (this.deduc != null && this.deduc.size() > 0))) {

            TNFe.InfNFe.Cana cana = new TNFe.InfNFe.Cana();

            cana.setSafra(this.safra);
            cana.setRef(this.ref);

            if (this.forDia != null) {
                this.forDia.forEach(dia -> cana.getForDia().add(dia.build()));
            }

            if (this.deduc != null){
                this.deduc.forEach(deduc -> cana.getDeduc().add(deduc.build()));
            }
            if (this.vTotDed != null) {
                cana.setVTotDed(this.vTotDed.toString());
            }

            if (this.vLiqFor != null) {
                cana.setVLiqFor(this.vLiqFor.toString());
            }

            if (this.qTotMes != null) {
                cana.setQTotMes(this.qTotMes.toString());
            }

            if (this.qTotAnt != null) {
                cana.setQTotAnt(this.qTotAnt.toString());
            }

            if (this.qTotGer != null) {
                cana.setQTotGer(this.qTotGer.toString());
            }
            return cana;
        }
        return null;
    }
}