class QueryExecution 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i + i-- + i + i-- + //0 + 1 + 1 + 0 + 0
			    i++ + i-- + i + i++ +//-1 + 0 + -1 + -1 + 
			    i-- + i + i++; //0 + -1 + -1
		System.out.println(i);//0
		System.out.println(j);//-3
	}
}