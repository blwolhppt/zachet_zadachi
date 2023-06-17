public class task11 {
    // Метод для вычисления факториала числа n
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Вычисляем факториал числа 5
        int n = 5;
        long result = factorial(n);
        System.out.println("Факториал " + n + " = " + result);
    }
}