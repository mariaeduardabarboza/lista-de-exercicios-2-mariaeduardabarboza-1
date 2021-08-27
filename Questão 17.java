public class Questão17 {
    static final int minimo = 1;
    static final int maximo = 999;
    static final String[] RN_C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static final String[] RN_X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static final String[] RN_I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String generate(int number) {
        if (number < minimo || number > maximo) {
            throw new IllegalArgumentException(
                    String.format(
                            "The number must be in the range [%d, %d]",
                            minimo,
                            maximo
                    )
            );
        }

        return new StringBuilder()
                .append(RN_C[number % 1000 / 100])
                .append(RN_X[number % 100 / 10])
                .append(RN_I[number % 10])
                .toString();
    }
}

        
