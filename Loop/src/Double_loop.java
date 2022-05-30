import java.text.SimpleDateFormat;
import java.util.Date;

public class Double_loop {

	public static void main(String[] args) {
	
		Date today =new Date();
			System.out.println(today);
			
		SimpleDateFormat date =new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time =new SimpleDateFormat("h:m:s");
			System.out.println(date.format(today));
			System.out.println(time.format(today));
			//format : 규격화된 형태로 값을 표현할때 사용하게 됩니다.
			
		
			int f,ff;
			int total;
			for(f=1;f<=3;f++) {
				//System.out.println(f);
		
					for(ff=1;ff<=4;ff++) {
						total=f+ff;
						System.out.println(f+" "+ff);
					}
			}
	}
}
