import java.util.TreeMap;

public class T22 {

	public static void main(String[] args) {
		
	TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	
	tm.put(10, "Red");
	tm.put(20, "Green");
	tm.put(30, "Black");
	tm.put(40, "White");
	tm.put(50, "Pink");
	
	System.out.println("Orginal TreeMap content: "+tm);
	
	System.out.println("Keys are greater than 20: "+tm.tailMap(30));

	}

}
//Test input:
//{10=Red, 20=Green, 30=Black, 40=White, 50=Pink }
//
//
//Sample Output:Orginal TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink
//}
//Keys are greater than 20: {30=Black, 40=White, 50=Pink}