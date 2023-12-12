import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        findAbbreviations(inputText);

        scanner.close();
    }

    private static void findAbbreviations(String text) {
        System.out.println("Аббревиатуры:");

        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}