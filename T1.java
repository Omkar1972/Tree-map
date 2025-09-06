import java.util.TreeMap;

public class T1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		
		tm.put(1,"Red");
		tm.put(2, "Green");
		tm.put(3, "Black");
		tm.put(4, "White");
		tm.put(5, "Blue");
			
		System.out.println(tm);
		System.out.println();
		for(int i=1;i<tm.size()+1;i++)
		{
			System.out.println(i+"=>"+tm.get(i));
		}
		
		
	}

}
//Test input:
//1 Red 2 Green 3 Black 4 White 5 Blue
//
//
//Sample Output:
//1=>Red
//2=>Green
//3=>Black
//4=>White
//5=>Blue