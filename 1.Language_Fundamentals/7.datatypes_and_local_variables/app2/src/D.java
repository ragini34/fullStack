import java.text.DecimalFormat;
class D 
{
	public static void main(String[] args) 
	{
		DecimalFormat df= new DecimalFormat("#.###");
		float i = 100.90f;
		System.out.println(df.format(i));
	}
}
