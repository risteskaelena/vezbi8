package zadaca2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Glavna {

	public static void main(String[] args) {

		try {
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
			String zbor=obj.readLine();
			
			Recnik objekt = new Recnik();
			objekt.zborovi();
			objekt.prevod(zbor);
		}
		catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	
}
