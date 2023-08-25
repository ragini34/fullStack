class Q
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("loop begins");
			if(i < 5)
			{
			  continue;//without executing remaining for loop skipping iteration to next
			}
		System.out.println("loop end");
		}
		System.out.println("main end");
	}
}
//i = 0, 1,  2, 3, 4, 5, 6, 7, 9, 
//loop begins
/*loop begins
loop begins
loop begins
loop begins
loop begins
loop end
loop begins
loop end
loop begins
loop end
loop begins
loop end
loop begins
loop end
main end
*/