package zadaca1;

import java.util.HashMap;
import java.util.Map;

public class Recnik {

	public static void main(String[] args) {

		Map<String, String> recnik = new HashMap<String, String>();
		recnik.put("hi", "zdravo");
		recnik.put("bye", "cao");
		recnik.put("morning", "utro");
		recnik.put("evening", "vecer");
		recnik.put("night", "nok");
		
		System.out.println("klucevi: " + recnik.keySet());
		System.out.println("vrednosti: " + recnik.values());
		
		for(Map.Entry<String, String> entry : recnik.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());

		}
		
		if(recnik.containsKey("hi")) {
			System.out.println(recnik.get("hi"));
		}
		else {
			System.out.println("go nema toj zbor");

		}


	}

}
