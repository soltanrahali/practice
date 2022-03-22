// Java program for checking
// balanced brackets
import java.util.*;

public class BalancedBrackets {

	// function to check if brackets are balanced
	static boolean isValid(String s)
	{
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack= new ArrayDeque<Character>();

		// Traversing the Expression
		for (int i = 0; i < s.length(); i++)
		{
			char x = s.charAt(i);

			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
			}else {

			// If current character is not opening bracket, then it must be closing. So stack cannot be empty
				if (stack.isEmpty())
					return false; 
				
				char check=stack.peek();
				switch (x) {
				case ')':
					if (check != '(')
						return false;
					break;
	
				case '}':
					if (check != '{' )
						return false;
					break;
	
				case ']':
					if (check != '[' )
						return false;
					break;
				}
				stack.pop();
			}
		}
		return (stack.isEmpty());
	}

	
	
	// Driver code
	public static void main(String[] args)
	{
		String s = "([{}])";

		// Function call
		if (isValid(s))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
