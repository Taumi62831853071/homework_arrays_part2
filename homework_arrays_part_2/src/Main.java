public class Main {
    public static void main(String[] args) {

        int summPerMonth = 0;
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++)  {
            arr[i] = random.nextInt(100_000) + 100_000;
                summPerMonth = summPerMonth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summPerMonth + " рублей");

        int minExpenditure = 200000;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current < minExpenditure) {
                minExpenditure = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenditure + " рублей");

        int maxExpenditure = 100000;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > maxExpenditure) {
                maxExpenditure = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpenditure + " рублей");

        int summ = 0;
        int medExpenditure = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        medExpenditure = summ / arr.length;
        System.out.println("Средняя сумма трат за день составила " + medExpenditure + " рублей");

        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i-1]);
        }
        System.out.println();

    }
}
