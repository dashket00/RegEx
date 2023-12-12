import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        findInformation(inputText);

        scanner.close();
    }

    private static void findInformation(String text) {
        System.out.println("Информация:");

        // Паттерн для поиска электронной почты
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(text);

        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        // Паттерн для поиска номера документа
        Pattern documentPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher documentMatcher = documentPattern.matcher(text);

        if (documentMatcher.find()) {
            System.out.println("document number: " + documentMatcher.group());
        }

        // Паттерн для поиска номера телефона
        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7,}");
        Matcher phoneMatcher = phonePattern.matcher(text);

        if (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }
    }
}