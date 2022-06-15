package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {

		//add(Ãß°¡), get(µ¥ÀÌÅÍ·Îµå), remove(»èÁ¦), size(index °³¼ö) : ArrayList¶ó´Â util ¸Ş¼Òµå¿¡¼­ »ç¿ë
		//Arrays.asList :  ·ÎµåÇÒ ¹è¿­ º¯¼ö¸¦ Àû¿ë
		//Áß¿ä: add´Â ÀÏ¹İÀûÀ¸·Î ¹«Á¶°Ç ¸Ç µÚ¿¡ µ¥ÀÌÅÍ°¡ Ãß°¡µÊ. ´Ü, index¹øÈ£¸¦ Àû¿ë ÈÄ °ªÀ» ½ÇÇàÇÏ¸é ÇØ´ç indexºÎºĞ¿¡ Ãß°¡µÊ.
		String member[]= {"ÀÌ¼ø½Å","È«±æµ¿","À¯°ü¼ø","°­°¨Âù"};
		ArrayList<String> mb =new ArrayList<>(Arrays.asList(member));
			//System.out.println(mb);

			int ea=mb.size();
			//System.out.println(ea);
			
			mb.add("±èÀ¯½Å");
			//System.out.println(mb);
			
			mb.remove(1);
			//System.out.println(mb);
	
			mb.add(3,"¼¼Á¾´ë¿Õ");
			//System.out.println(mb);
		
			String checks=mb.get(2);
			System.out.println(checks);
			
			//ArrayList¿¡´Â int¸¦ »ç¿ëÇÏÁö ¾ÊÀ½ (Integer) »ç¿ëµÊ
			/* µ¥ÀÌÅÍ ÀÔ´Ï´Ù. ÇØ´ç µ¥ÀÌÅÍ¸¦ Ä¿½ºÅÒÇÏ¿© ´ÙÀ½ °á°úÃ³·³ ­x·ÂÇÏ½Ã¿À. 
			 * [7,15,22,8,11,39,41]				*/
			Integer numbers[]= {15,22,37,8,11,19,41};
			
			ArrayList<Integer> it = new ArrayList<Integer>(Arrays.asList(numbers));
			
			it.add(0,7);
			it.remove(3);
			it.remove(5);
			it.add(5,39);
			System.out.println(it);
			
			
			
			
	}

}
