import java.time.*;
import java.time.format.DateTimeFormatter;

public class task10 {
    public static void main(String[] args) {
        // Получаем дату от пользователя
        String dateStr = "08.01.20"; // Пример даты

        // Создаем объект LocalDate из строки и форматируем его
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        // Определяем год и день года
        int year = date.getYear();
        int dayOfYear = date.getDayOfYear();

        // Получаем день недели первого дня года и вычисляем номер недели
        LocalDate firstDayOfYear = LocalDate.ofYearDay(year, 1);
        DayOfWeek firstDayOfWeek = firstDayOfYear.getDayOfWeek();
        int firstWeekNumber = (firstDayOfWeek == DayOfWeek.MONDAY || firstDayOfWeek == DayOfWeek.TUESDAY ||
                firstDayOfWeek == DayOfWeek.WEDNESDAY) ? 1 : 0;

        int weekNumber = (dayOfYear - (8 - firstDayOfYear.getDayOfWeek().getValue()) - 1) / 7 + firstWeekNumber;

        System.out.println("Неделя " + weekNumber);
    }
}