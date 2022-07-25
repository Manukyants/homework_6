import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int [] arrayMonth = new int [30];
        for (int i = 0; i < arrayMonth.length; i++) {
            arrayMonth [i] = (int) Math.round ((Math.random() * 100_000) + 100_000);
        }
        int sum = Arrays.stream(arrayMonth).sum();
        System.out.println("—умма трат за мес€ц составила " + sum + " рублей.");

        int maxSummInMonth = -1;
        for (int i : arrayMonth) {
            if (i > maxSummInMonth) {
                maxSummInMonth = i;
            }
        }
        System.out.println("ћаксимальна€ сумма трат за день составила " + maxSummInMonth + " рублей.");
        int minSummInMonth = 200001;
        for (int i : arrayMonth) {
            if (i < minSummInMonth){
                minSummInMonth = i;
            }
        }
        System.out.println("ћинимальна€ сумма трат за день составила " + minSummInMonth + " рублей.");
        float averageSumInMonth = sum / 30f;
        System.out.println("—редн€€ сумма трат за мес€ц составила " + averageSumInMonth + " рублей.");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int h = reverseFullName.length - 1 ; h >= 0; h --) {
            System.out.print(reverseFullName[h]);




        }


    }
}
