public class SumIntegers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input!");
            return;
        }

        int total = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            total += num;
            System.out.print(num);
            if (i < args.length - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + total);
    }
}
