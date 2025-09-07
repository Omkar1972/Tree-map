import java.util.TreeMap;

public class T3 {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		
		tm.put("C1", "Red");
		tm.put("C2", "Green");
		tm.put("C3", "Black");
		tm.put("C4", "White");
		
		System.out.println(tm);
		
		
		if(tm.containsKey("C1"))
		{
			System.out.println();
			System.out.println("The Tree Map contains key C1");
		}
		else
		{
			System.out.println("The TreeMap does not contain key C1");
		}

		
		if(tm.containsKey("C5"))
		{
			System.out.println();
			System.out.println("The Tree Map contains key C5");
		}
		else
		{
			System.out.println("The TreeMap does not contain key C5");
		}

	}

}
//Test input:
//{C1=Red, C2=Green, C3=Black, C4=White} 
//
//
//Sample Output:{C1=Red, C2=Green, C3=Black, C4=White} 
//The Tree Map contains key C1 
//The TreeMap does not contain key C5