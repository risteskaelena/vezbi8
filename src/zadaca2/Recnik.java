package zadaca2;

import java.util.HashMap;
import java.util.Map;

public class Recnik {

		Map<String, String> recnik = new HashMap<String, String>();
		
		public void zborovi() {
			recnik.put("hi", "zdravo");
			recnik.put("bye", "cao");
			recnik.put("morning", "utro");
			recnik.put("evening", "vecer");
			recnik.put("night", "nok");
		}
		
		public void prevod (String zbor) {
			if(recnik.containsKey(zbor)) {
				System.out.println(recnik.get(zbor));
			}
			else {
				System.out.println("go nema toj zbor");

			}
		}
}
