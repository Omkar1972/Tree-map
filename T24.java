import java.util.Map;
import java.util.TreeMap;

public class T24 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(40, "Black");
		tm.put(50, "White");
		tm.put(60, "Pink");
		
		System.out.println("Orginal TreeMap content: "+tm);
		
		int[] testKeys = {20, 40, 50};

		System.out.println();
        for (int key : testKeys) {
            Map.Entry<Integer, String> entry = tm.ceilingEntry(key);
            System.out.print("Keys greater than or equal to " + key + ": ");
            if (entry != null) {
                System.out.println(entry.getKey());
            } else {
                System.out.println("null");
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
//Keys greater than or equal to 20: 20
//Keys greater than or equal to 30: 40
//Keys greater than or equal to 50: 50