package Selenium.Selenium;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalString = "02233114455";
		String modifiedString = originalString.substring(0,5)+ originalString.substring(7);
		//String modifiedString = 
		
		//String modifiedString = originalString.replaceFirst("0", "");
		System.out.println("Original String "+originalString); 
		System.out.println("Modified String "+modifiedString); 
		
		System.out.println("///////////////////");
		
	/*	String s = "022331140455";
		String ns = "";
		System.out.println("Original String "+s);
		for (int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if (c != '0') {
				
				ns = ns+ c;
			}
		}
		
		System.out.println("New String "+ns);
	*/	

	}

}
