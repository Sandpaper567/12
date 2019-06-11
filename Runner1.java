public class Runner1{
    interface printQuotient{
        void printQuotientOfNums(float n1 ,float n2);
    }

    public static void main(String[] args){
        printQuotient divide = (float num1, float num2) -> System.out.printf("Quotient is: %.3f\n", num1/num2);
        divide.printQuotientOfNums(3.0f, 2.0f);
    }
}
