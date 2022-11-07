package domstrachow;

import java.util.ArrayList;
import java.util.List;

import MIEJSCA.Mieszkaniekredyt;
import MIEJSCA.Mieszkaniewoda;
import MIEJSCA.Staryzamek;
import MIEJSCA.Szpital;

public class Demonstrator {
	public static void main(String[] args) {
		List<Gosc> lista = new ArrayList<Gosc>(); 
		
		for (int i=0;i<5;i++) {
			lista.add(new Student());
			lista.add(new Turysta());
			
		}
		
		Mieszkaniewoda mieszkanieWoda = new Mieszkaniewoda();
        Mieszkaniekredyt mieszkanieKredyt = new Mieszkaniekredyt();
        Szpital opuszczonySzpital = new Szpital();
        Staryzamek staryZamek = new Staryzamek();
        for(Gosc guest : lista){
            mieszkanieWoda.nawiedz(guest);
            mieszkanieKredyt.nawiedz(guest);
            opuszczonySzpital.nawiedz(guest);
            staryZamek.nawiedz(guest);
        }
		
		
	}
	

}
