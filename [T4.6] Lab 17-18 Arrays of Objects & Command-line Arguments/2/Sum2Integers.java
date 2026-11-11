public class Sum2Integers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Sum2Integers <num1> <num2>");
            return;
        }
        int total = 0;
        total = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("The sum is " + total);
    }
}
