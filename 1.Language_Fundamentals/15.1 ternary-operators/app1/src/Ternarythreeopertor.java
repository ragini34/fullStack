class Ternarythreeopertor 
{
	public static void main(String[] args) 
	{
		int i = 300, j = 200, k = 100, min = 0;
		min = ((i < j && i < k) ? i : (j < k)  j : k);
		if((i == j) && (i == k) && (j == k))
		{
			System.out.println("all value are equal");
		}
		else
		{
          System.out.println("minimum: " + min);
		}
	}
}
