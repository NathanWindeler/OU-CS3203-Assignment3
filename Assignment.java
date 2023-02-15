
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Be careful when entering values - there's no error handling"); // I'm lazy lol
		System.out.println("Enter size of array (integer): ");
		int arrSize = kb.nextInt();
		double[] nums = new double[arrSize];
		System.out.println("Enter array contents (double): ");
		for(int i = 0; i < arrSize; i++)
			nums[i] = kb.nextDouble();
		double sum = add(nums);
		double product = multiply(nums);
		System.out.printf("The sum is: %f \n", sum);
		System.out.printf("The product is: %f \n", product);
	}
	
	public static double add(double[] nums) {
		double sum = 0;
		for(double num : nums)
			sum += num;
		return sum;
	}
	
	public static double multiply(double[] nums) {
		double product = 1;
		for(double num : nums)
			product *= num;
		return product;
	}

}
