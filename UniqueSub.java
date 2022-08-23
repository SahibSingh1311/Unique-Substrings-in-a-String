//Using HashSet
import java.util.*;

public class UniqueSub{
	public static void main(String[] args){
		String s1= "banana";
		System.out.println(uniqueSubstring(s1));
}

	public static HashSet<String> uniqueSubstring(String str){
	HashSet<String> substrs=new HashSet<String>();
	for(int i = 0; i<str.length();i++){
		for(int j=0;j<str.length()-i;j++){
			String sub = str.substring(j,j+(i+1));
			 substrs.add(sub);

}
}
	return substrs;	
}
}