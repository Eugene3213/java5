import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
		/*q. 
		 data={"hong45","lee90","kang100","park70","kim72"};
		 �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� ������
		 �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿ� �ϸ�,
		 ���� ���� ���� ���� �������� ������ �˴ϴ�.
		 mian2������ �ش� ��Ť��� ���� ���� �� �ش� ������ ��� �ջ� �� ����� ���;��Ѵ�.
		 ��, ���� ��ȯ �� ������ �߻� �� ��� finally�� üũ �� main2�޼ҵ�� �ٽ� ȣ���Ͽ� ���������� �����Ͱ� ��������.	 */
		
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
