package exercises;
import java.util.Scanner;


public class Alice {
//    public static void main(String[] args) {
//        System.out.println("Hello, World");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hello, what is your name:");
//        String name = input.nextLine();
//        System.out.println("Hello " + name);
//    }

    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search within Alice’s Adventures. Enter a word:");
        String enteredWord = input.nextLine();
        if(sentence.toLowerCase().contains(enteredWord.toLowerCase())){
            System.out.println(sentence.toLowerCase().indexOf(enteredWord));
            remove(sentence.toLowerCase(), enteredWord);
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }




    static void remove(String str, String word)
        {
            // Split the string using split() method
            String msg[] = str.split(" ");
            String new_str = "";

            // Iterating the string using for each loop
            for (String words : msg) {

                // If desired word is found
                if (!words.equals(word)) {

                    // Concat the word not equal to the given
                    // word
                    new_str += words + " ";
                }
            }

            // Print the new String
            System.out.print(new_str);
        }



}
