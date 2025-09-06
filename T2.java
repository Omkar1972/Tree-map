import java.util.TreeMap;

public class T2 {

	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		
		tm.put("C1","Red");
		tm.put("C2","Green");
		tm.put("C3","Black");
		tm.put("C4","White");
		tm.put("C5","Blue");
		
		System.out.println("Tree Map 1: "+tm);
		
		TreeMap<String,String> tm1=new TreeMap<String,String>();
		
		tm1.put("A1","Orange");
		tm1.put("A2","Pink");
		
		System.out.println();
		System.out.println("Tree Map 2: "+tm1);
		
	     tm1.putAll(tm);
		
	     System.out.println();
		System.out.println("After coping map2 to map1: "+tm1);
	}

}
//Test input:
//{C1=Red, C2=Green, C3=Black, C4=White, C5=Blue} 
//
//{A1=Orange, A2=Pink}
//
//
//Sample Output:Tree Map 1: {C1=Red, C2=Green, C3=Black, C4=White, C5=Blue} 
//Tree Map 2: {A1=Orange, A2=Pink}
//After coping map2 to map1: {A1=Orange, A2=Pink, C1=Red, C2=Green, C3=Bl
//ack, C4=White, C5=Blue}