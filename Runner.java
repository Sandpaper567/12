import java.lang.Math;
interface Square{
    boolean isSquare(int x);
 }
public class Runner{
    interface printQuotient{
        void printQuotientOfNums(float n1 ,float n2);
    }
    public static void main(String[] args){
        Square theSquare = (int x) -> {
									return (Math.pow((int)Math.sqrt(x),2) == x);
								};
        System.out.println(theSquare.isSquare(9));
        printQuotient divide = (float num1, float num2) -> System.out.printf("Quotient is: %.3f\n", num1/num2);
        divide.printQuotientOfNums(3.0f, 2.0f);
    }
}