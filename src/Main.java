public class Main {
    public static void main(String[] args) {
        // Примеры использования методов
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        int[] array4 = {1, 0, 0, 3};

        System.out.println("Количество четных элементов в array1: " + countEvens(array1)); // 3
        System.out.println("Количество четных элементов в array2: " + countEvens(array2)); // 3
        System.out.println("Количество четных элементов в array3: " + countEvens(array3)); // 0

        System.out.println("Разница между максимальным и минимальным элементами в array1: " + differenceMaxMin(array1)); // 2
        System.out.println("Разница между максимальным и минимальным элементами в array2: " + differenceMaxMin(array2)); // 2

        System.out.println("Есть ли два соседних нуля в array4: " + hasAdjacentZeros(array4)); // true
        System.out.println("Есть ли два соседних нуля в array1: " + hasAdjacentZeros(array1)); // false
    }

    // Метод для подсчета четных элементов массива
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Метод для вычисления разницы между максимальным и минимальным элементами
    public static int differenceMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    // Метод для проверки наличия двух соседних нулевых элементов
    public static boolean hasAdjacentZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}