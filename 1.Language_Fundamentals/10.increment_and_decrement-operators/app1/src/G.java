class G 
{
	public static void main(String[] args) 
	{
		int i = 0;
		//    i=  0  +  1 + 1  +2 = 4
		int j = i++ + i + i++ +i;
		System.out.println(i);
		System.out.println(j);
	}
}
