import java.util.Scanner;

class Calculator {
    
    static Scanner sc = new Scanner(System.in);

    public static void add() {
        System.out.print("Enter : ");
        double n1 = sc.nextDouble();
        System.out.print("+");
        double n2 = sc.nextDouble();
        System.out.print("=");
        System.out.println(n1 + n2);
    }

    public static void subtract() {
        System.out.print("Enter : ");
        double n1 = sc.nextDouble();
        System.out.print("-");
        double n2 = sc.nextDouble();
        System.out.print("=");
        System.out.println(n1 - n2);
    }

    public static void multiply() {
        System.out.print("Enter : ");
        double n1 = sc.nextDouble();
        System.out.print("x");
        double n2 = sc.nextDouble();
        System.out.print("=");
        System.out.println(n1 * n2);
    }

    public static void divide() {
        System.out.print("Enter : ");
        double n1 = sc.nextDouble();
        System.out.print("/");
        double n2;
        do {
            n2 = sc.nextDouble();
            if (n2 == 0) {
                System.out.println("Denominator can't be 0");
            }
        } while (n2 == 0);
        System.out.print("=");
        System.out.println(n1 / n2);
    }

    public static void main(String[] args) {
        String x;
    int n;
        System.out.println("WELCOME TO OUR CALCULATOR !!");

        do {
            System.out.println("Please select any one : ");
            System.out.println("1 --> Addition");
            System.out.println("2 --> Subtraction");
            System.out.println("3 --> Multiplicaton");
            System.out.println("4 --> Division");
            do {
                System.out.print("Enter a number : ");
                n = sc.nextInt();
                switch (n) {
                    case 1: {
                        add();
                        break;
                    }
                    case 2: {
                        subtract();
                        break;
                    }
                    case 3: {
                        multiply();
                        break;
                    }
                    case 4: {
                        divide();
                        break;
                    }
                    default:
                        System.out.println("Enter a valid number");
                }
            } while (n != 1 && n != 2 && n != 3 && n != 4);

            do {
                System.out.println("Do you want to use it again (yes/no) : ");
                x = sc.next();
                if (!x.equalsIgnoreCase("Yes") && !x.equalsIgnoreCase("No")) {
                    System.out.println("Enter Yes/No please");
                }
            } while (!x.equalsIgnoreCase("Yes") && !x.equalsIgnoreCase("No"));

        } while (x.equalsIgnoreCase("yes"));
        System.out.println("Thank you for using this Calculator");
    }
}
