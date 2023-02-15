
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public double add(double[] nums) {
		double sum = 0;
		for(double num : nums)
			sum += num;
		return sum;
	}
	
	public double multiply(double[] nums) {
		double product = 1;
		for(double num : nums)
			product *= num;
		return product;
	}

}
