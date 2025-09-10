import java.util.TreeMap;

public class T5 {
	
	public static void main(String[] args) {
		
	TreeMap<String,String> tm=new TreeMap<String,String>();	
	
	tm.put("C1", "Red");
	tm.put("C2", "Green");
	tm.put("C3", "Black");
	tm.put("C4", "White");
	
	System.out.println(tm);
	
	System.out.println();
	for(String a:tm.keySet())
	{
		System.out.println(a);

	}
	
	
	
		

	}

}
//Test input:
//{"C1", "Red"    "C2", "Green"  "C3", "Black"  "C4", "White"}
//
//
//Sample Output:C1
//C2
//C3
//C4