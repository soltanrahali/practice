// Java implementation of O(n^2)
// time and O(1) space method
// to find the longest palindromic substring
public class LongestPalinSubstring {

	// This function returns the longest palindrome substring
	static String longestPalSubstr(String s)
	{
		int n = s.length(); 
		if (n < 2) return s; 
		int maxLength = 1,start=0,low, high;
		
		for (int i = 0; i < n; i++) {
			low = i - 1;
			high = i + 1;
			while ( high < n && s.charAt(high) == s.charAt(i)) //increment 'high'	
				{
				System.out.println("1 "+s.charAt(high)+" =="+ s.charAt(i));
				high++;
				}
	
			while ( low >= 0 && s.charAt(low) == s.charAt(i)) // decrement 'low'	
				{
				System.out.println("2 "+s.charAt(low)+"=="+ s.charAt(i));
				low--;
				}
	
			while (low >= 0 && high < n && s.charAt(low) == s.charAt(high) ){
				System.out.println("3 low:"+low+", high:"+high+", "+s.charAt(low)+"=="+ s.charAt(high));
				low--;
				high++;
			}
			
				
		int length = high - low - 1;
		if (maxLength < length){
			maxLength = length;
			start=low+1;
		}
		System.out.println("start "+start+" maxLength"+maxLength);
	}
	
	return s.substring(start, start + maxLength) ;
	
}

	// Driver program to test above function
	public static void main(String[] args)
	{

		String s= "a";
		System.out.println(s);
		String result=longestPalSubstr(s);
		System.out.println("output: "+ result +" with a length of "+ result.length());
	}
}
// This is code is contributed by saurabh yadav
