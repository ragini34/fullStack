class Q
{
	public static void main(String[] args)
	{	
		int i,j;
		for(i=0, j =20; ((i < 15 & j > 15) & (i < 15 & j > 15)); i++, j--)//both the condition must be true
		{
			System.out.println(i + ":" + j);
		}
		System.out.println(i + ":" + j);
	}
}
//both are than only execution 
to see inc & dec System.out.println(i)