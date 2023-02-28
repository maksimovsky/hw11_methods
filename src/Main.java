import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        isYearLeap(2021);

        System.out.println("\nЗадача 2");
        knowVersionApp(0, 2015);

        System.out.println("\nЗадача 3");
        knowDeliveryDays(95);

        System.out.println("\nЗадача повышенной сложности 4");
        int[] arr = {3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("\nЗадача повышенной сложности 5");
        String str = "aabccddefgghiijjkk";
        findDouble(str);

        System.out.println("\nЗадача повышенной сложности 6");
        int[] arr2 = generateRandomArray(30);
        double avg = findAverageOfArray(arr2);
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", avg);
    }

    // для задачи 1
    public static void isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    // для задачи 2
    public static void knowVersionApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    // для задачи 3
    public static void knowDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    // для задачи 4
    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // для задачи 5
    public static void findDouble(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("Дублируется символ " + str.charAt(i));
                return;
            }
        }
        System.out.println("В строке нет дублей");
    }

    // для задачи 6
    public static int[] generateRandomArray(int num) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(100_000) + 100_000;
        return arr;
    }

    public static double findAverageOfArray(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return (double) sum / arr.length;
    }
}