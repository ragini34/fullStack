class I 
{
	public static void main(String[] args) 
	{
		int x = 0;
		//     y=  0  + 1 + 2 +   3 = 6 , x=3
		int y = x++ + x++ + x++ +x;
		System.out.println(x);//3
		System.out.println(y);//6
	}
}
