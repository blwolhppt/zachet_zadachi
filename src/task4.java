import java.util.HashMap;
import java.util.Scanner;

public class task4 {
    public static String calculate(String stroka) {
        // Разделение выражения на операнды и операцию
        String[] parts = stroka.split(" ");
        String num1 = parts[0];
        String operator = parts[1];
        String num2 = parts[2];

        // Преобразование чисел из слов в числовое представление
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("один", 1);
        numbers.put("два", 2);
        numbers.put("три", 3);
        numbers.put("четыре", 4);
        numbers.put("пять", 5);
        numbers.put("шесть", 6);
        numbers.put("семь", 7);
        numbers.put("восемь", 8);
        numbers.put("девять", 9);

        int num1Value = numbers.get(num1);
        int num2Value = numbers.get(num2);

        // Выполнение операции
        int result;
        switch (operator) {
            case "плюс":
                result = num1Value + num2Value;
                break;
            case "минус":
                result = num1Value - num2Value;
                break;
            case "умножить":
                result = num1Value * num2Value;
                break;
            default:
                return "Неверная операция";
        }

        // Преобразование результата в текстовое представление числа
        HashMap<Integer, String> words = new HashMap<>();
        words.put(1, "один");
        words.put(2, "два");
        words.put(3, "три");
        words.put(4, "четыре");
        words.put(5, "пять");
        words.put(6, "шесть");
        words.put(7, "семь");
        words.put(8, "восемь");
        words.put(9, "девять");

        String resultText = words.get(result);

        return resultText;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        String result = calculate(stroka);
        System.out.println(result);  // Выводит: "девять"
    }
}