import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLettersInString {
	
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter your name please");
		String name=sc.nextLine();
		System.out.println("Your entered string is   = "+name);
		int len=name.length();
		
		Map<String,Integer>  charCountMap=new LinkedHashMap<>();
		for(int i=0;i<len;i++) {
			char ch=name.charAt(i);
			if(charCountMap.containsKey(ch+"")) { //'a'+""="a"
				int count=charCountMap.get(ch+"");
				++count;
				charCountMap.put(ch+"",count);
			}else {
				charCountMap.put(ch+"",1);
			}
		}
		charCountMap.forEach((key,value)->{
			System.out.println("key = "+key);
			System.out.println("value = "+value);
		});
		System.out.println(charCountMap);
		
	}

}
