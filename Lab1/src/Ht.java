import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ht {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String ,String>hmap = new HashMap<String, String>();
		Map<String, String>tmap = new TreeMap<String,String>();

		String state,capital;
		int ch;
		while(true) {
			System.out.println("1.insert /n2.display hash /n3. display tree");
			System.out.println("enter ur choice");
			ch=sc.nextInt();

			switch (ch){
			case 1:
				System.out.println("enter a  state");
				state=sc.next();
				System.out.println("enter a capital");
				capital=sc.next();
				hmap.put(state, capital);
				tmap.put(state, capital);
				break;

			case 2:
				System.out.println("hash map");
				for(Map.Entry<String,String> e:hmap.entrySet()) {
					System.out.println("State: "+e.getKey()+",capital:"+e.getValue());



				}break;
			case 3:
				System.out.println("tree map");
				for(Map.Entry<String,String>e:tmap.entrySet()) {
					System.out.println("State: "+e.getKey()+"capital:"+e.getValue());
				}
			}
		}
	}
}