
public class Pairsum {
	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6,7};
		int sum=3;
		int low=0;
		int high=x.length-1;
		while(low<high) {
			if(x[low]+x[high]>sum) {
				high--;
			}
			else if(x[low]+x[high]<sum){
				low++;
			}
			else if(x[low]+x[high] == sum){
				System.out.println("pair ("+x[low]+","+x[high]+")");
				low++;
				high--;
				
				
			}
		}
	}

}
