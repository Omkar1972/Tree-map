import java.util.TreeMap;

public class T21 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(30, "Black");
		tm.put(40, "White");
		tm.put(50, "Pink");
		
		System.out.println("Orginal TreeMap content: "+tm);
		
		System.out.println();
		System.out.println("Keys are greater than or equal to 20: "+tm.tailMap(20));
	}

}
//Test input:
//{10=Red, 20=Green, 30=Black, 40=White, 50=Pink }
//
//
//Sample Output:Orginal TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink
//}
//Keys are greater than or equal to 20: {20=Green, 30=Black, 40=White, 50
//=Pink}