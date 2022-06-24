package java_test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class pay_abstract {
	FileReader fr= null;
	ArrayList<String> em_name =null;
	protected final int money=87000000;
	
	public void start(String a) {};			//오버로딩
	public abstract void start();
	abstract void db() throws IOException;		
	public abstract int[] check();		//getter 	(return 2개 이상일 경우 ) 
}
