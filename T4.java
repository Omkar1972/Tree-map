import java.util.TreeMap;

public class T4 {

	public static void main(String[] args) {
		
		TreeMap<String,String> tm=new TreeMap<String,String>();
		
		tm.put("C1", "Red");
		tm.put("C2", "Green");
		tm.put("C3", "Black");
		tm.put("C4", "White");
		
		System.out.println(tm);
		
		
		if(tm.containsValue("Green"))
		{
			System.out.println();
			System.out.println("The Tree Map contains value Green");
		}
		else 
		{
			System.out.println();
			System.out.println("The TreeMap does not contain  value Green");
		}

		
		if(tm.containsValue("Pink"))
		{
			System.out.println();
			System.out.println("The Tree Map contains value Pink");
		}
		else 
		{
			System.out.println();
			System.out.println("The TreeMap does not contain value Pink");
		}


	}

}
//Test input:
//{C1=Red, C2=Green, C3=Black, C4=White} 
//
//
//Sample Output:
//The TreeMap contains value Green
//The TreeMap does not contain value Pink