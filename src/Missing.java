
public class Missing {
	 public static int findMissingNumber(int[] x) {
	        int n = x.length;
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;

	        for (int num : x) {
	            actualSum += num;
	        }

	        return expectedSum - actualSum;
	    }

	    public static void main(String[] args) {
	        int[] x = {};
	        int missingNumber = findMissingNumber(x);
	        System.out.println("The missing number is: " + missingNumber);
	    }
	}
	

	
		

	


