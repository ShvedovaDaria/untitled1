

import java.util.Random;

public class Se {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) { // Змініть 10 на кількість чисел, яку ви бажаєте вивести.
            int randomNumber = random.nextInt(41) - 20; // Генеруємо випадкове число від -20 до 20.
            System.out.println(randomNumber);
        }
    }
}