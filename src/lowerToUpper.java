
public class lowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="SirI DurGA";
		String nStr="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			
			int c=(int)str.charAt(i);
		
			if(c>=65 && c<=90) {
				
				ch=Character.toLowerCase(str.charAt(i));
				
				nStr=nStr+ch;
				
				
			}
			
			else {
				
         ch=Character.toUpperCase(str.charAt(i));
				
				nStr=nStr+ch;
			}
		}

		System.out.println(nStr);
	}

}
