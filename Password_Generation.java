import java.util.*;
public class Password_Generation
 {

	static String password(String name , String num )
	{
		int len =name.length();
		while(len != 0)
		{
			if(num.contains(len+ ""))
			{
				char ch[] = name.toCharArray();
				return ch[len -1 ] +"";
				
			}
			else {
				len= len -1;
				}
		}
		return "X";
		}
	
	public static void main(String[] args) {
		
       Scanner s = new Scanner(System.in);
       System.out.println("Enter imput");
       String str = s.nextLine();
       String emp[] = str.split(",");
       String emp_name[],emp_number[];
       emp_name = new String[emp.length];
       emp_number = new String[emp.length];
       
       for(int i = 0; i < emp.length; i++)
       {
    	   String temp[] = emp[i].split(":");
    	   emp_name[i] = temp[0];
    	   emp_number[i] = temp[1];
       }
        for(int i = 0; i <emp_name.length; i++)
        {
        	System.out.print(password(emp_name[i],emp_number[i]));
        	
        }
       
       
	}

}
/*Enter imput
satya:12543,vivek:15323,sai:233
aki   */ 