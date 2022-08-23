import java.util.*;

public class UniqueSub{
	public static void main(String[] args){
		String s1= "abc";
		System.out.println(uniqueSubstring(s1));
}

	public static ArrayList<String> uniqueSubstring(String str){
	ArrayList<String> substrs=new ArrayList<String>();
	for(int i = 0; i<str.length();i++){
		for(int j=0;j<str.length()-i;j++){
			String sub = str.substring(j,j+(i+1));
			if(!substrs.contains(sub)){
				 substrs.add(sub);
}
}
}
	return substrs;	
}
}