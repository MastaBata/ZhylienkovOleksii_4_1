import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = cleanedWord.length() - 1;

        while (left < right) {
            if (cleanedWord.charAt(left) != cleanedWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть слово для перевірки на паліндром:");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " є паліндромом");
        } else {
            System.out.println(word + " не є паліндромом");
        }

        scanner.close();
    }
}
