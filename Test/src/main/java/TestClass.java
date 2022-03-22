
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello");
		
		System.out.println(isPalindrome(144));
		
	}
    public static boolean isPalindrome(int x) {
        
        int palindrom=x;
        int reverse=0;
        
        while(palindrom!=0){
            
            int remainder=palindrom%10;
            reverse=reverse*10+remainder;
            palindrom=palindrom/10;
            
            System.out.println("R: "+remainder);
            System.out.println("rev: "+reverse);
            System.out.println("P/10: "+palindrom);
            System.out.println(""); 
        }
        
        return (x==reverse);
        
    }

}
