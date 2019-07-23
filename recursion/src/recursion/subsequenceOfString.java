package recursion;
import java.util.ArrayList;

public class subsequenceOfString {
	
	
public static ArrayList<String> getsSubsequence(String str){
	
	ArrayList<String> getSS = new ArrayList<String>();
	    
	
	
	for(int i = 0 ; i  < str.length(); i++) {
		for(int j = i ; j  < str.length(); j ++)
		{
			for(int k = i ; k <= j ; k++)
			{
				getSS.add(str.charAt(k));
			}
		}
	}
	  
	
	
	return getSS;
}


	public static void main(String[] args) {
		
		ArrayList<String> subSS = new ArrayList<String>();

		subSS = getsSubsequence("abc");
		
		System.out.println(subSS);
		
	}

}
