public class _1HelloWorld {
    public static void main(String[] args) {

        String greeting = "Hello world from Java";
        System.out.println(greeting.toUpperCase());

        int number = 10;
        System.out.println("Number is equal to: " + number);

        boolean value = true;
        int number2 = 5;
        if (value) {
            number2 = 7;
        }
        System.out.println("Number 2 is: " + number2);

        var number3 = "15";

        String name;
        name = "John";
        System.out.println(name + " is " + number3 + " years old.");
    }
}