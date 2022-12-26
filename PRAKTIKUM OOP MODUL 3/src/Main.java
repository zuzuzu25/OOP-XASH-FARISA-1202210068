import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculation h = new Calculation();
        Thread t1 = new Thread(h);
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        do {
            try{
                System.out.println("\n==MenuProgram==");
                System.out.println("1.Square");
                System.out.println("2.Circle");
                System.out.println("3.Trapezoid");
                System.out.println("0.exit");
                System.out.print("SelectMenu: ");
                int menu = input.nextInt();
                switch(menu){
                    case 1:
                    System.out.print("Enter the length of the side of the square : ");
                    double side = input.nextDouble();
                    System.out.println("===Program Will Start In===");
                    h.setSquare(side);
                    t1.start();
                    t1.join();
                    System.out.println("\nThe calculation result: " + h.getSquare());
                    break;

                    case 2:
                    System.out.print("Enter the radius of circle : ");
                    double radius = input.nextDouble();
                    System.out.println("===Program Will Start In===");
                    h.setCircle(radius);
                    t1.start();
                    t1.join();
                    System.out.println("\nThe calculation result: " + h.getSquare());
                    break;

                    case 3:
                    System.out.print("Enter the side of the base of the trapezoid : ");
                    double a = input.nextDouble();
                    System.out.print("Enter the upper of the trapezoid : ");
                    double b = input.nextDouble();
                    System.out.print("Enter the height of the trapezoid : ");
                    double c = input.nextDouble();
                    h.setTrapezoid(a, b, c);
                    t1.start();
                    t1.join();
                    System.out.println("\nThe calculation result: " + h.getSquare());
                    break;

                    case 0:
                    repeat = false;
                    break;

                    default:
                    System.out.println("option not available");
                    break;
                }
    
            }
            catch(InputMismatchException e){
                System.out.println("Input must be a number.");
                input.nextLine();
                continue;
            }
            
        } while (repeat);
        input.close();

    }
}