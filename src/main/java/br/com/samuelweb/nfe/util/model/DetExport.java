package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.consts.NfeConsts;
import br.com.samuelweb.nfe.util.validators.impl.ValidarChaveAcesso;
import br.com.samuelweb.nfe.util.validators.impl.ValidarDrawback;
import br.com.samuelweb.nfe.util.validators.impl.ValidarRE;
import br.inf.portalfiscal.nfe.schema_4.nfe.TNFe;

import java.math.BigDecimal;

public class DetExport {

    @NfeCampo(tipo = String.class
            , id = "I51", tag = "nDraw", validadores = {ValidarDrawback.class}
            , tamanhoMinimo = 9, tamanhoMaximo = 11, ocorrencias = 0
            , descricao = NfeConsts.DSC_NDRAW)
    private String nDraw;
    
    @NfeCampo(tipo = String.class
            , id = "I53", tag = "nRE", validadores = {ValidarRE.class}
            , tamanhoMinimo = 12, tamanhoMaximo = 12, ocorrencias = 1
            , descricao = NfeConsts.DSC_NRE)
    private String nre;

    @NfeCampo(tipo = Integer.class
            , id = "I54", tag = "chNFe", validadores = {ValidarChaveAcesso.class}
            , tamanhoMinimo = 44, tamanhoMaximo = 44, ocorrencias = 1
            , descricao = DfeConsts.DSC_REFNFE)
    private String chNFe;
    
    @NfeCampo(tipo = BigDecimal.class
            , id = "I55", tag = "qExport", decimais = 4, precisao = 15
            , tamanhoMinimo = 0, tamanhoMaximo = 15, ocorrencias = 1
            , descricao = NfeConsts.DSC_QEXPORT)
    private BigDecimal qExport;

    public TNFe.InfNFe.Det.Prod.DetExport build() {
        TNFe.InfNFe.Det.Prod.DetExport detExport = new TNFe.InfNFe.Det.Prod.DetExport();
        TNFe.InfNFe.Det.Prod.DetExport.ExportInd exportInd = new TNFe.InfNFe.Det.Prod.DetExport.ExportInd();
        detExport.setNDraw(this.nDraw);
        if ((this.nre != null && !this.nre.isEmpty()) || (this.chNFe != null && !this.chNFe.isEmpty())) {
            exportInd.setNRE(this.nre);
            exportInd.setChNFe(this.chNFe);
            if (this.qExport != null) {
                exportInd.setQExport(this.qExport.toString());
            }
            detExport.setExportInd(exportInd);
        }
        return detExport;
    }

    public String getnDraw() {
        return nDraw;
    }

    public void setnDraw(String nDraw) {
        this.nDraw = nDraw;
    }

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getChNFe() {
        return chNFe;
    }

    public void setChNFe(String chNFe) {
        this.chNFe = chNFe;
    }

    public BigDecimal getqExport() {
        return qExport;
    }

    public void setqExport(BigDecimal qExport) {
        this.qExport = qExport;
    }
}