package Ex_14;

public class Argument {

    public static int product(int... numbers) {
        if (numbers.length == 0)
            return 0;

        int total = 1;

        for (int number : numbers)
            total *= number;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(product());
        System.out.println(product(10));
        System.out.println(product(10, 10));
        System.out.println(product(10, 10, 10));
        System.out.println(product(10, 10, 10, 10));
    }
}