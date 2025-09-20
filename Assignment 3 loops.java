import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("give me a word, or string of words:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for (int i = 0; i < input.length();i++){
            System.out.println(input.charAt(i));

        }


    }
}

// here i used the CharAt function again.  I googled how to use print a character at a specified point for the last file, and used it again here but not in reverse this time
// to translate the code in simple terms, i ask the user for input, and set that equal to a variable.  
// then i set i equal to zero bc were starting at 0 characters printed and I want to go through the entire string
// so while i is smaller to the legnth of the string, i want it to go through and print each character on a line one by once, hence the i++
// then it is printing each character at point i which i already explained

