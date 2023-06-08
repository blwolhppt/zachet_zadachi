import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class task2 {
    public static void main (String[]args){

        ArrayList<String> myArray = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();


        Pattern pattern = Pattern.compile("\\d+");

        // Создаем объект Matcher
        Matcher matcher = pattern.matcher(stroka);

        // Ищем совпадения и выводим найденные числа
        while (matcher.find()) {
            String number = matcher.group();
            myArray.add(number);
        }
        System.out.print(myArray);
    }
}
