import java.lang.Math;
public class RandomNumber
{
	public static void main(String[] args) {
		int max=10,min=1;
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);
	}
}