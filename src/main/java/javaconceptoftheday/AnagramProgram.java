package javaconceptoftheday;

public class AnagramProgram {

	public static boolean isAnagram(String str1, String str2) {
		  StringBuilder builder1 = new StringBuilder(str1.toLowerCase().replaceAll(" ",""));

	      StringBuilder builder2 = new StringBuilder(str2.toLowerCase().replaceAll(" ",""));
	        
	        for(int i =0;i<builder1.length();i++){
	            char c = builder1.charAt(i);
	            int index = builder2.indexOf(String.valueOf(c));
	            if(index==-1){
	                return false;
	            }else{
	                builder2.deleteCharAt(index);
	            }
	            
	        }
	        
	        return true;

	}

	public static void main(String args[]) {
		System.out.println(isAnagram("peek", "keep"));
		System.out.println(isAnagram("Mother In Law","Hitler Woman"));
	}
}
