package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringExercise {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type in the first string:");
            String firstString = scanner.nextLine();
            System.out.println("Type in the second string:");
            String secString = scanner.nextLine();

            //----------------------------------------------------------------------------------------
            if (StringExercise.getNumberOfVowels(firstString) == 1) {
                System.out.println("there is " + StringExercise.getNumberOfVowels(firstString) + " vowel");
            } else {
                System.out.println("there are " + StringExercise.getNumberOfVowels(firstString) + " vowels");
            }
            //----------------------------------------------------------------------------------------
            System.out.println(StringExercise.removeVowels(firstString));
            //----------------------------------------------------------------------------------------
            System.out.println(StringExercise.removeRepeatedLetters(firstString));
            //----------------------------------------------------------------------------------------
            System.out.println(StringExercise.createCommonLettersString(firstString, secString));
            //--------------------------------------------------------------------------------------
            System.out.println(StringExercise.createCommonVowelsString(firstString, secString));

        }
        public static char[] stringToChars(String str){
            char[] firstStringChars;
            firstStringChars = new char[str.length()];
            for(int i = 0; i < str.length(); i++){
                firstStringChars[i] = str.charAt(i);
            }
            return firstStringChars;
        }


        public static String tobetterLookingString(String str){
            str = str.replaceAll("\\s", "");
            str = str.replaceAll(",", "");
            str = str.replaceAll("\\[", "");
            str = str.replaceAll("]", "");

            return str;
        }


        public static int getNumberOfVowels(String firstString){
            int contador = 0;
            char[] firstStringChars = StringExercise.stringToChars(firstString);
            for (char c : firstStringChars){
                if (c == 'a' || c == 'a' - 26 || c == 'e' || c == 'e' - 26 ||
                        c == 'i' || c == 'i' - 26 || c == 'o' || c == 'o' - 26 || c == 'u' || c == 'u' - 26){
                    contador++;
                }
            }
            return contador;
        }


        public static String removeVowels(String firstString){
            char[] firstStringChars = StringExercise.stringToChars(firstString);

            for(int i = 0; i < firstStringChars.length; i++){
                if (firstStringChars[i] == 'a' || firstStringChars[i] == (int) 'a' - 26 ||
                        firstStringChars[i] == 'e' || firstStringChars[i] == (int) 'e' - 26 ||
                        firstStringChars[i] == 'i' || firstStringChars[i] == (int) 'i' - 26 ||
                        firstStringChars[i] == 'o' || firstStringChars[i] == (int) 'o' - 26 ||
                        firstStringChars[i] == 'u' || firstStringChars[i] == (int) 'u' - 26) {

                    firstStringChars[i]  = ' ';
                }
            }

            String newString = Arrays.toString(firstStringChars);
            newString = StringExercise.tobetterLookingString(newString);

            return newString;
        }


        public static String removeRepeatedLetters(String firstString) {
            char[] firstStringChars = StringExercise.stringToChars(firstString);

            for (int i = 0; i < firstStringChars.length; i++) {
                for (int j = firstStringChars.length - 1; j >= 0; j--) {
                    if (j != i){
                        if (firstStringChars[j] == firstStringChars[i]) {
                            firstString = firstString.replace(firstStringChars[j], ' ');
                        }
                    }
                }
            }

            firstString = StringExercise.tobetterLookingString(firstString);
            return  firstString;
        }


        public static String createCommonLettersString(String firstString, String secString){
            ArrayList<Character> resultantStringChars = new ArrayList<>();
            char[] firstStringChars = StringExercise.stringToChars(firstString);
            char[] secStringChars = StringExercise.stringToChars(secString);

            for (char firstStringChar : firstStringChars) {
                for (char secStringChar : secStringChars) {
                    if (firstStringChar == secStringChar) {
                        resultantStringChars.add(firstStringChar);
                    }
                }
            }
            String resultantString = resultantStringChars.toString();
            resultantString = StringExercise.tobetterLookingString(resultantString);
            return resultantString;


        }


        public static String createCommonVowelsString(String firstString, String secString){
            String resultantString = firstString + secString;
            char[] vowels = {'a', 'e', 'i', 'o', 'u',
                    'A', 'E', 'I', 'O', 'U'};
            char[] resultantStringChars = StringExercise.stringToChars(resultantString);
            for (int i = 0; i < resultantStringChars.length; i++){
                boolean isVowel = false;
                for (char vowel : vowels){
                    if (resultantStringChars[i] == vowel) {
                        isVowel = true;
                        break;
                    }
                }
                if (!isVowel)
                    resultantStringChars[i] = ' ';

            }
            resultantString = Arrays.toString(resultantStringChars);
            resultantString = StringExercise.tobetterLookingString(resultantString);
            return resultantString;
        }



}
