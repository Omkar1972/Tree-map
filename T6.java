import java.util.TreeMap;

public class T6 {

	public static void main(String[] args) {
	TreeMap<String,String> tm=new TreeMap<String,String>();
	
	 tm.put("C1", "Red");
	 tm.put("C2", "Green");
	 tm.put("C3", "Black");
	 tm.put("C4", "White");
	 
	 System.out.println(tm);
	 
	 tm.clear();
	 
	 System.out.println("The New map:"+tm);
	
	}

}
//Test input:
//{C1=Red, C2=Green, C3=Black, C4=White}
//
//
//Sample Output:Orginal TreeMap content: {C1=Red, C2=Green, C3=Black, C4=White}
//The New map: {}