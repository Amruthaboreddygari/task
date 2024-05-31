
public class Characteroccurance {
	public static int occurance(char[] x, char c) {
		int count=0;
		for(char ch:x) {
			if(ch==c) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		char[] x= {'a','b','c','d','c','a','a'};
		char c='a';
		int occurances=occurance(x,c);
		System.out.println(c+": "+ occurances);


	}

}
