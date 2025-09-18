import java.util.TreeMap;

public class T18 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		 
		 tm.put(10, "Red");
		 tm.put(20, "Green");
		 tm.put(40, "Black");
		 tm.put(50, "White");
		 tm.put(60, "Pink");
		 
		 System.out.println("Value before poll: "+tm);
		 
		 System.out.println();
		 
		 System.out.println("Value returned: "+tm.pollLastEntry());
		 
		 System.out.println("Value after poll: "+tm);

	}

}
//Test input:
//{10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
//
//
//Sample Output:Value before poll: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
//Value returned: 60=Pink
//Value after poll: {10=Red, 20=Green, 40=Black, 50=White}