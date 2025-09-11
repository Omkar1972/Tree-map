import java.util.TreeMap;

public class T9 {

	public static void main(String[] args) {
		
	TreeMap<String,String> tm=new TreeMap<String,String>();
	
	tm.put("C1","Green");
	tm.put("C2","Red");
	tm.put("C3","White");
	tm.put("C4","Black");

	System.out.println("Orginal TreeMap content: "+tm);
	
	System.out.println();
	System.out.println("Greatest key: "+tm.firstKey());
	
	System.out.println("Least key: "+tm.lastKey());
	}

}
//Test input:
//{C1=Green, C2=Red, C3=White, C4=Black}
//
//
//Sample Output:Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}
//Greatest key: C1
//Least key: C4
