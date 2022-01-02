package Assignment28;

public class Assignment28 {
	static void even(int num)
	{
		if(num!=0)
		{
			System.out.print(num+",");
			even(num-2);
		}
		else
			System.out.print(",");
	}
		
	
	

	public static void main(String[] args) {
		int num=76;
		even(num);
		
	}
}
	
	


