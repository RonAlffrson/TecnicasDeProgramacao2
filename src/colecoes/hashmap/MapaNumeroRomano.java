package colecoes.hashmap;

import java.util.HashMap;

public class MapaNumeroRomano {
    public static String ConvertToRoman(Integer number){
        if (number > 999) throw new IllegalArgumentException("Number exceeds 999");

        HashMap<Integer, String> units = new HashMap<>();
        units.put(0 , "");
        units.put(1, "I");
        units.put(2, "II");
        units.put(3, "III");
        units.put(4, "IV");
        units.put(5, "V");
        units.put(6, "VI");
        units.put(7, "VII");
        units.put(8, "VIII");
        units.put(9, "IX");
        HashMap<Integer, String> tens = new HashMap<>();
        tens.put(0, "");
        tens.put(1, "X");
        tens.put(2, "XX");
        tens.put(3, "XXX");
        tens.put(4, "XL");
        tens.put(5, "L");
        tens.put(6, "LX");
        tens.put(7, "LXX");
        tens.put(8, "LXXX");
        tens.put(9, "XC");
        HashMap<Integer, String> hundreds = new HashMap<>();
        hundreds.put(0, "");
        hundreds.put(1, "C");
        hundreds.put(2, "CC");
        hundreds.put(3, "CCC");
        hundreds.put(4, "CD");
        hundreds.put(5, "D");
        hundreds.put(6, "DC");
        hundreds.put(7, "DCC");
        hundreds.put(8, "DCCC");
        hundreds.put(9, "CM");
//----------------------------------------
        String stringNumbers = number.toString();
        StringBuilder romanNumbers = null;
        int aux = number;
        switch (stringNumbers.length()) {
            case 1 -> romanNumbers = new StringBuilder(units.get(number));
            case 2 -> {
                aux = aux / 10;
                romanNumbers = new StringBuilder(tens.get(aux));
                aux = number;
                aux = aux % 10;
                romanNumbers.append(units.get(aux));
            }
            case 3 -> {
                aux = aux / 100;
                romanNumbers = new StringBuilder(hundreds.get(aux));
                aux = number;
                aux = aux % 100;
                aux = aux / 10;
                romanNumbers.append(tens.get(aux));
                aux = number;
                aux = aux % 10;
                romanNumbers.append(units.get(aux));
            }
            default -> System.out.println("Error at the switch");
        }
        if (romanNumbers != null) return romanNumbers.toString();
        else return ("Error");
    }
    public static void main(String[] args) {
        System.out.println(MapaNumeroRomano.ConvertToRoman(110));
    }
}
