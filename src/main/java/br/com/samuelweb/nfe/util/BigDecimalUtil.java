package br.com.samuelweb.nfe.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class BigDecimalUtil {

    public static String format(BigDecimal value) {
        String decimalMask = "";
        if (value.scale() > 0) {
            decimalMask = StringUtils.repeat("0", value.scale());
        }
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#0."+decimalMask, symbols);
        return decimalFormat.format(value);
    }
}
