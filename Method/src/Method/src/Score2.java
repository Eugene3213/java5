
public class Score2 {

	private String name;
	private String subject;
	private String sign ="false";
	private String score =null;
	
	public static void main(String[] args) {
			
	}
	public Score2() {	
	}
	
	public void stdata(String name,String subject) {
		this.name =name;
		this.subject=subject;
		
		
		// ����� ���� Ȯ�� �� ������ �˼� ��Ʈ
		String st[][] = {
				{"������","�̰���","���","������","������"},
				{"80","78","92","67","40"},
				{"40","80","80","92","100"},
				{"95","30","55","90","65"},
				{"20","80","100","95","30"}
			};
		//System.out.println(name+","+subject);

		int ea=st[0].length;
		int w=0;
		int index=0;
		while(w<ea) {
			if(this.subject==null) {
				if(this.name.equals(st[0][w])) {
					this.sign="true";
					index=w;
				}
				}
				else if(this.subject!=null) {
					if(this.name.equals(st[0][w])) {
						this.sign="true";
						index=w;
					
					switch(this.subject) {
					case "����":
						this.score=st[1][index];
						break;
					case "����":
						this.score=st[2][index];
						break;
					case "����":
						this.score=st[3][index];
						break;
					case "����":
						this.score=st[4][index];
						break;
						
					default:
						this.score=st[1][index]+","+st[2][index]+","+st[3][index]+","+st[4][index];
						break;
					}
				}
				
			}
			w++;
			
			}
		}
		
	public String gtdata() {		//getter
		if(this.subject==null) {
			return this.sign;
		}
		else {
			return this.score;
		}
	}	
			
}

	
	

