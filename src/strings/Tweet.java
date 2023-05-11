package strings;
import java.util.Random;
import java.util.Scanner;

public class Tweet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the text: ");
        String txt = scan.nextLine();

        Tweet text = new Tweet(txt.toCharArray());
        System.out.println("tweet has " + text.countChars() + " chars");
        System.out.println("tweet has " + text.countWords() + " words");
        System.out.println("tweet has " + text.countPhrases() + " phrases");
        System.out.println("Type the word you want to count: ");
        String word = scan.nextLine();
        System.out.println("tweet has " + text.wordCounter(word) + " " + word + "'s" );
        System.out.println(Tweet.randomParagragh());
    }


    char[] paragraph = new char[144];


    public Tweet(char[] paragraph) {
        this.setParagraph(paragraph);
    }


    public void setParagraph(char[] paragraph) { this.paragraph = paragraph;}


    public int countChars(){
        int counter = 0;

        for(char c : paragraph){
            if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) counter++;
        }

        return counter;
    }

    public int countWords(){
        int counter = 1;
        for (int i = 0; i < paragraph.length;i++) {
            if ((paragraph[i] == ' ') && (i + 1 != paragraph.length) ) {
                if (i == 0) counter = 0;

                if ((paragraph[i+1] >= 65 && paragraph[i+1] <= 90) || (paragraph[i+1] >= 97 && paragraph[i+1] <= 122)){
                    counter++;
                }
            }
        }
        return counter;
    }


    public int countPhrases(){
        int counter = 1;
        for (char c : paragraph) {
            if (c == '.') {
                counter++;
            }
        }
        return counter;
    }


    public int wordCounter(String word){
        char[] wordChars = word.toCharArray();
        int wordCounter = 0, letterCounter = 0 ;

        for (char c : paragraph) {
            for (char wordChar : wordChars) {
                if (c == wordChar) letterCounter++;
            }
            if ((letterCounter != 0) && (letterCounter % wordChars.length) == 0) {
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
                    wordCounter++;
            }
        }
        return wordCounter;
    }


    public static String randomParagragh(){
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 5; i++){
            text.append((char) random.nextInt());
        }
        return text.toString();
    }
}
