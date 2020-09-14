package converter;

import java.lang.reflect.Executable;

public class NumberToRomanNumeralConverter {

    private final String[] thousands = {"", "M", "MM", "MMM"};
    private final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private final String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String convertNumberToRoman(int i) throws Exception {
        if(i < 0) {
            throw new Exception("Values can't be 0 or less");
        }
        if(i >3999) {
            throw new Exception("Values can't be 4000 or above");
        }
        if(i == 0) {
            return null;
        }

        if(i == 1) {
            return "I";
        }

        else {

            return convert(i);

        }
    }

    private String convert(int i) {
        StringBuilder s = new StringBuilder();

        return s.append(convertThousandToM(i))
                .append(convertHundredToCAndCD(i))
                .append(convertTenToXAndXL(i))
                .append(convertOneToIAndV(i))
                .toString();

    }

    public String convertOneToIAndV(int i) {
        return ones[i % 10];
    }

    public String convertTenToXAndXL(int i) {
        return tens[i % 100 / 10];
    }

    public String convertHundredToCAndCD(int i) {
        return hundreds[i % 1000 / 100];
    }

    public String convertThousandToM(int i) {
        return thousands[i / 1000];
    }
}
