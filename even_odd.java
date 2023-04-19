class  even_odd
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=100;
		while(a<= b)
		{
          if (a%3==0 && a%7==0)
          {
			  System.out.println(a);
			   
          }
		  a++;
		}
		 
	}
}
// All numbers divisible by 3 and 7 between 1 to 100