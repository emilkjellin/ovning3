import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void hello() {

        for (int i = 0; i < 32; i++) {
            System.out.println("Hello world!");
        }
    }
            public static void square(int a) {
                System.out.println(a*a);
            }
            public static void multi(float a, float b)
            {
                System.out.println(a*b);
            }
            public static void RightTriangleArea(float a, float b)
            {
                System.out.println((a*b)/2);
            }
            public static void CircleArea(float a)
            {
                 System.out.println((a*a)*3.14);
            }

            public static void Getnumberinput()
            {
                Scanner intinput = new Scanner(System.in);
                while (true){
                 try {
                     System.out.println("Enter a number");
                     int number = intinput.nextInt();
                     System.out.println("you picked the number" + number);
                     break;
                 } catch (InputMismatchException e) {
                     intinput.nextLine();
                     System.out.println("please enter a number");
                 }
                }
            }
            

            public static void main(String[] args) {
                hello();
                 square(4);
                multi(4,6);
                RightTriangleArea(4,6);
                CircleArea(4);
                Getnumberinput();
            }
}