// Java program for the above approach
class Chiliagon{
	
// Function to check that if N is
// Chiliagon Number or not
static boolean is_Chiliagon(int N) 
{
	float n = (float)(996 + Math.sqrt(7984 * N + 
									992016)) / 1996;

	// Condition to check if N is a
	// Chiliagon Number
	return (n - (int) n) == 0;
}

// Driver Code
public static void main(String s[]) 
{
	// Given Number
	int N = 1000;

	// Function call
	if (is_Chiliagon(N)) 
	{
		System.out.print("Yes");
	} 
	else
	{
		System.out.print("No");
	}
}
}

// This code is contributed by rutvik_56
