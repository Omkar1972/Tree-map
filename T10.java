import java.util.TreeMap;

public class T10 {

	public static void main(String[] args) {
		
	TreeMap<String,String> tm=new TreeMap<String,String>();
		
		tm.put("C1","Green");
		tm.put("C2","Red");
		tm.put("C3","White");
		tm.put("C4","Black");

		System.out.println("Orginal TreeMap content: "+tm);
		
		System.out.println();
		System.out.println("Reverse order view of the keys: "+tm.descendingKeySet());
		

	}

}
//Test input:
//{C1=Green, C2=Red, C3=White, C4=Black}
//
//Sample Output:Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}
//Reverse order view of the keys: [C4, C3, C2, C1]