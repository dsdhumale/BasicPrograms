class NegativeException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }

}
public class Throw {
    static int divide (int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static double area(int r)throws NegativeException{
        if (r<0) {
            throw new NegativeException();
        } else {
            
        }
        double result = Math.PI *r;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c =divide(6, 0);
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hello everyone");
        
        try {
            double c = area(-6);
            System.out.println("---"+c);

        } catch (NegativeException e) {
            System.out.println(e);
        }

    }

}
