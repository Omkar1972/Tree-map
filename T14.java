import java.util.Map;
import java.util.TreeMap;

public class T14 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(40, "Black");
		tm.put(50, "White");
		tm.put(60, "Pink");
		
		System.out.println("Orginal TreeMap content: "+tm);
		
          int[] keys={10,20,70};
		
		System.out.println();
		 for (int key : keys) {
	            Map.Entry<Integer, String> entry = tm.lowerEntry(key);
	            System.out.println("Checking the entry for " + key + ":");
	            if (entry != null) {
	                System.out.println("Key(s): " + entry.getKey() + "=" + entry.getValue());
	            } else {
	                System.out.println("Key(s): null");
	            }
	        }

	}

}
//Test input:
//{10=Red, 20=Green, 40=Black, 50=White, 60=Pink }
//
//
//Sample Output:Orginal TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink
//}
//Checking the entry for 10: 
//Key(s): null
//Checking the entry for 20:
//Key(s): 10=Red
//Checking the entry for 70:
//Key(s): 60=Pink