class S
{
	public static void main(String[] args) 
	{
		for(int i =0; i < 10; i++)
		{
			System.out.println("loop begin (i value)" + i);
			if(i > 5)
			{
				break;//it terminates the entire loop
				System.out.println("if block");
			}
		System.out.println("loop end (i value) " + i);
	 }
	 System.out.println("main end");
	}
}
//break or continue must be the last statement 
//we cant keep in middle 
//if we keep it becomes dead statement and throws error