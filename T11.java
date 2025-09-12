import java.util.TreeMap;

public class T11 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(40, "Black");
		tm.put(50, "White");
		tm.put(60, "Pink");
		
		
		System.out.println("Orginal TreeMap content: "+tm);
		
		System.out.println();
		System.out.println("Checking the entry for 10: ");
		System.out.println("Value is: "+tm.floorEntry(10));
		
		System.out.println("Checking the entry for 30: ");
		System.out.println("Value is: "+tm.floorEntry(20));
		
		System.out.println("Checking the entry for 70: ");
		System.out.println("Value is: "+tm.floorEntry(60));
		
	}

}
//Test input:
//{10=Red, 20=Green, 40=Black, 50=White, 60=Pink }
//
//
//Sample Output:Orginal TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink
//}
//Checking the entry for 10:
//Value is: 10=Red 
//Checking the entry for 30:
//Value is: 20=Green
//Checking the entry for 70:
//Value is: 60=Pink