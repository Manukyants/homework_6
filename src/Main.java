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
        int sum = Arrays.stream(arrayMonth).sum();
        System.out.println ("Сумма трат за месяц составила " + sum + " рублей.");
        int maxSummInMonth = -1;
        for (int i : arrayMonth) {
            if (i > maxSummInMonth) {
                maxSummInMonth = i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSummInMonth + " рублей.");
        int minSummInMonth = sum + 1;
        for (int i : arrayMonth) {
            if (i < minSummInMonth) {
                minSummInMonth = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSummInMonth + " рубл6ей.");
        float averageSumInMonth = sum / arrayMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSumInMonth + " рублей.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        return arrayMonth;
    }
}
