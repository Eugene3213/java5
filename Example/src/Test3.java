
public class Test3 {

	public static void main(String[] args) {
		int w=1;
		int e=1;
		int total=0;		
		
		while(w<6) {
			
			while(e<10) {
				
				total=total+(w+e);
				e++;
			}
			
			w++;
		}
		System.out.println("ÃÖÁ¾°ª: "+total);
	}

}
