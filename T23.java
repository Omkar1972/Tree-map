import java.util.Map;
import java.util.TreeMap;

public class T23 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(10, "Red");
		tm.put(20, "Green");
		tm.put(30, "Black");
		tm.put(40, "White");
		tm.put(50, "Pink");
		
		System.out.println("Orginal TreeMap content: "+tm);
		
		int[] testKeys = {20, 40, 50};

		System.out.println();
        for (int key : testKeys) {
            Map.Entry<Integer, String> entry = tm.ceilingEntry(key);
            System.out.println("Keys greater than or equal to " + key + ": ");
            if (entry != null) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            } else {
                System.out.println("null");
            }
        }
		

	}

}
//Test input:
//{10=Red, 20=Green, 30=Black, 40=White, 50=Pink }
//
//
//Sample Output:Orginal TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink
//}
//Keys greater than or equal to 20: 
//20=Green
//Keys greater than or equal to 40:
//40=White
//Keys greater than or equal to 50: 
//50=Pink