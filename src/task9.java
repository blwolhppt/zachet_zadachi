import java.util.*;

public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Получаем день, месяц и год от пользователя
        System.out.print("Введите дату в формате ДД.ММ.ГГГГ: ");
        String dateStr = input.next();

        // Разбиваем дату на составляющие
        String[] dateParts = dateStr.split("\\.");

        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // Создаем объект Calendar и устанавливаем заданную дату
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);  // Месяцы в Calendar начинаются с 0
        calendar.set(Calendar.DAY_OF_MONTH, day);

        // Получаем день недели в соответствии с заданной датой
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Преобразуем числовое представление дня недели в строку
        String[] daysOfWeek = {"Воскресенье", "Понедельник", "Вторник", "Среда",
                "Четверг", "Пятница", "Суббота"};
        String dayOfWeekStr = daysOfWeek[dayOfWeek - 1];

        System.out.println("День недели: " + dayOfWeekStr);
    }
}