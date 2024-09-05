import java.util.Random;

public class Main {
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){ // этот метод генерирует случайный возраст
        Random random = new Random();
        return random.nextInt(100);
    }
    public static void main(String[] args) {
        System.out.println("1:" + permission(generateRandomAge(), 13));
        System.out.println("2:" + permission(generateRandomAge(), 6));
        System.out.println("3:" + permission(generateRandomAge(), 20));
        System.out.println("4:" + permission(generateRandomAge(), 35));
        System.out.println("5:" + permission(generateRandomAge(), -5));
    }
}