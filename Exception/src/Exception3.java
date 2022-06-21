import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
		/*q. 
		 data={"hong45","lee90","kang100","park70","kim72"};
		 해당 배열 데이터 값을 main2라는 메소드로 값을 던진다
		 해당 값을 던질 때 예외처리를 무조건 발생 시켜야 하며,
		 최초 값을 던질 때는 가공없이 던지게 됩니다.
		 mian2에서는 해당 배ㅕㅇㄹ 값을 받은 후 해당 점수를 모두 합산 한 결과가 나와야한다.
		 단, 숫자 변환 시 문제가 발생 할 경우 finally로 체크 후 main2메소드로 다시 호출하여 정상적으로 데이터가 나오도록.	 */
		
		String data[]={"hong45","lee90","kang100","park70","kim72"};
		
		try {
			total_method(data);
		}
		catch(Exception z){
			System.out.println(z);
		}
		finally {
			ArrayList<String> rdata =new ArrayList<>();
			int j = 0;
			String modify;
			while(j<data.length) {
				modify= data[j].replaceAll("[a-zA-z]","");
				rdata.add(modify);
				j++;
			}
			String cdata[]=new String[rdata.size()];
			int q=0;
			do {
				cdata[q]=rdata.get(q);
				q++;
			}while(q<rdata.size());
			
			try {
				total_method(cdata);
			}
			catch(Exception h) {
				if(h.getMessage()==null) {
					System.exit(0);
				}
				else {
					System.out.println(h);					
				}					
			}
		}
	}
	public static void total_method(String db[]) throws Exception{
	
		int w=0;
		int ea=db.length;
		int values;
		int sum=0;
		while(w<ea) {
			values=Integer.valueOf(db[w]);
			sum += values;
			w++;
		}
		System.err.println(sum);
		Exception c= new Exception();
		throw c;
	}

}
