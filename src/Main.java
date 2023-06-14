import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrom(scannerWord()));

    }
    public static boolean isPalindrom (String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt((word.length())-i-1)){
                return false;
            }
        }
        return true;
    }
    public static String scannerWord (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}