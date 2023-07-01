
public class CmdLine {

	public static void main(String[] args) {
		
		int m=0;
		for(int i=0;i<args.length;i++) 
		{
			int k=2;
			m=Integer.parseInt(args[i]);
			
			while(k<=m/2)
			{
				if(m%k==0) {
					System.out.println(m/10);
					break;
				}
				else
				{
				for(int j=1;i<=10;i++) {
					System.out.println("jmyuy "+(m*j));
					
				}
				
			}
				break;
			
			}
			k++;
			
		}
		
		
	}
}
