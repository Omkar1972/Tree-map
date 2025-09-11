import java.util.TreeMap;

public class T8 {

	public static void main(String[] args) {
		
		TreeMap<String,String> tm=new TreeMap<String,String>();
		
		tm.put("C1","Red");
		tm.put("C2","Green");
		tm.put("C3","Black");
		tm.put("C4", "White");

		System.out.println("Orginal TreeMap content: "+tm);
		
		System.out.println();
		System.out.println("Greatest key: "+tm.firstEntry());
		System.out.println("Least key: "+tm.lastEntry());
		
		
	}

}
//Test input:
//{C1=Red, C2=Green, C3=Black, C4=White}
//
//
//Sample output:Orginal TreeMap content: {C1=Red, C2=Green, C3=Black, C4=White}
//Greatest key: C1=Red
//Least key: C4=White