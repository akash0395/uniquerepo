
public class ArgAddition {

	
		public static void main(String[] args)
		{
			if(args.length<1)
			{
				System.out.println("insufficient input");
			}
			else
			{
			System.out.println("enter numbers:");
			int x=Integer.parseInt(args[0]);
			int y=Integer.parseInt(args[1]);
			int sum=x+y;
			System.out.println("addition="+sum);
			
		}	
		}
	}


