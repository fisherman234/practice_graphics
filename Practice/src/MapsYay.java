import java.util.HashMap;

public class MapsYay {

	public static void main(String[] args) {
		HashMap<String,Integer> userData = new HashMap<>();
		
		userData.put("Hacker2009", 828939);
		userData.put("applepie", 123456);
		userData.put("user99393", 654321);
		userData.put("PROGamerOfdeYear", 838381);
		
		for(String i : userData.keySet()) {
			System.out.print(i+": ");
			System.out.println(userData.get(i));
		}
	}

}
