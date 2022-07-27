import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayMonth = generateRandomArray();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arrayMonth = new int[30];
        for (int i = 0; i < arrayMonth.length; i++) {
            arrayMonth[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(Arrays.toString(arrayMonth));
        int sum = 0;
        for (int i = 0; i < arrayMonth.length; i++) {
            sum = sum + arrayMonth[i];
        }
        System.out.println ("Сумма трат за месяц составила " + sum + " рублей.");




        int maxSummInMonth = -1;
        int minSummInMonth = sum + 1;
        for (int comparisonMonth : arrayMonth){
            if (comparisonMonth < minSummInMonth){
                minSummInMonth = comparisonMonth;
            }
            if (comparisonMonth > maxSummInMonth){
                maxSummInMonth = comparisonMonth;
            }

        }
        System.out.println("Максимальная сумма трат за день составила " + maxSummInMonth + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minSummInMonth + " рублей.");






        float averageSumInMonth = sum / arrayMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSumInMonth + " рублей.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        return arrayMonth;
    }
}
