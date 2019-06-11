import java.lang.Math;
interface Square{
    boolean isSquare(int x);
 }
public class Runner{
    public static void main(String[] args){
        Square theSquare = (int x) -> {
									return (Math.pow((int)Math.sqrt(x),2) == x);
								};
        System.out.println(theSquare.isSquare(9));
    }
}