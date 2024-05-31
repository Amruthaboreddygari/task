import java.util.Arrays;
public class Targetch {
	


		public static char[] characterArray(char[] x,char t) {
			int y=0,z=0;
			if(x==null || x.length==0) {
				return x;
				
			}
			for(int i=0;i<x.length;i++) {
				if(x[i]==t) {
					y=i+1;
					break;
				}
			}
			char[] ch=new char[x.length-y];
			for(int j=y;j<x.length;j++) {
				ch[z++]=x[j];
			}
			return ch;
			
		}
			

		    public static void main(String[] args) {
		    	char[] x= {'a','b','c','d','e','f'};
		    	char t='b';
		    	System.out.println(Arrays.toString(characterArray(x,t)));
		        
		}

	}



