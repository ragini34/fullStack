class J 
{
	public static void main(String[] args) 
	{
		int i = 0;
          // 0 == 1    ||   1 == 1   one conditions is true
		if((++i == 1) || (i++ == 2))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
