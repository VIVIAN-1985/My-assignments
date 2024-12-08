package pavandemoday1;

public class demoelse {

	public static void main(String[] args) {
		
		/*
		int num = 2;
		
		if(num>0)
		{System.out.println("positive");
		}
		else
			if(num<0)
			{System.out.println("negative");
			}
			else
			{System.out.println("zero");
	}
		 
		 */

	/*
	 a>b and a>c -- a is largest
	 b>c and b>a -- b is largest
	 c>a and c>b -- c is largest
	 
	 */
	
	int a=10, b =20, c=40;
	if (a>b && b>c)
		{System.out.println("a is largest");
	}
	
	else
		if (b>a && b>c)
{System.out.println("b is largest");
	}
		else
		
			if (c>a && c>b)
			{
				System.out.println("c is largest");
			}
			}
}	
