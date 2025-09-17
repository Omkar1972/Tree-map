import java.util.TreeMap;

public class T16 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(40, "Black");
		tm.put(50, "White");
		tm.put(60, "Pink");
		
		System.out.println("Orginal TreeMap content: "+tm);
		
		System.out.println();
		System.out.println("Orginal TreeMap content: "+tm.navigableKeySet());
	}

}
//Test input:
//{10=Red, 20=Green, 40=Black, 50=White, 60=Pink }
//
//
//Sample Output:Orginal TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink
//}
//Orginal TreeMap content: [10, 20, 40, 50, 60]