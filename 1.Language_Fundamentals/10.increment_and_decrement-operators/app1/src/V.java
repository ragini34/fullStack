class V 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = ++i + i-- + ++i + i +//1  + 1   +  1  +   1
		   i-- + i + --i + i + //1  +  0  +  -1  +  -1	 
          ++i + i++ + --i + i + //0  +  0  +  0   +  0 
          --i + i + i-- + i + //  -1  + -1  +  -1 + -2
          ++i + --i + ++i + i + //-1  +  -2  +  -1  +  -1  	 
          --i + i + --i + i +  //-2 + -2  +  -3  +  -3
		++i + i++ + --i + i +  //-2  +  -2   +  -2  +  -2 
		i-- + i + i-- + i;	//-2  +  -3 +  -3  + -4    
		System.out.println(i);
		System.out.println(j);
	}
}
//i=0, 1, 0, 1, 0, -1, 0, 1, 0, -1, -2, -1, -2, -3, -2, -1, -2, -3, -4