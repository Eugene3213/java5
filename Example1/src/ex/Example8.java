package ex;

import java.util.Arrays;

//interface
public class Example8 {
/*���� ���ó�� ������ �迭�� �������� ���� ������ ���� �迭�� �����ϱ� 
 	["ȫ�浿=95","�̼���=60","������=80","������=95"]		*/
	
	public static void main(String[] args) {
		box2 bx=new box2();
		bx.setter();
	}

}
//extends : abstract, �Ϲ� class ���
//implements : interface ���
class box2 implements interface8, interface8_1{
	
	
	@Override
	public void db() {
	
		
	}
	@Override
	public void setter() {
		System.out.println(Arrays.toString(this.user));
		System.out.println(Arrays.toString(this.number));
	}
	@Override
	public String getter() {
	
		return null;
	}
}