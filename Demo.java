import java.util.Scanner;

public class Demo {
    void display() {
        System.out.println("Display Message");
    }

    static void print() {
        System.out.println("Print Message");
    }
    static void checkOddOrEven(int a) {
        if (a%2 == 0) {
            System.out.println("Enter number is even");
        } else {
            System.out.println("Enter number is odd"); 
        }
        
    }
    static void checkGreater(int b, int c, int d){
        if (b >c && b>d) {
            System.out.println(b + " is greater");
        } else if(c >b && c>d){
            System.out.println(c + " is greater");
        } else if(d>b && d>c){
            System.out.println(d + " is greater");
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello everyone");
        Demo obj = new Demo();
        obj.display();
        print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value ");
        // int a = sc.nextInt();
        // System.out.println("Hello everyone " + a);
        // checkOddOrEven(a);
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        checkGreater(b, c, d);

    }

}