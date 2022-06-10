
public class Test5 {

	public static void main(String[] args) {
	

		int w=1;
		int total=0;
		
		while(w<101) {
			
			total=total+w;
			
			if(total>4000) {
				System.out.println(total);
				break;
			}
				
			w++;
		}
	}
		
} 

