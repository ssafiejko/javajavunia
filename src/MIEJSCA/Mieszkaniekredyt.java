package MIEJSCA;

import java.util.Random;

import domstrachow.Gosc;
import staryszydlaki.straszydlo;

public class Mieszkaniekredyt extends Mieszkania {
	public Mieszkaniekredyt() {
			Random random= new Random();
		
			this.kwotazaleglosci=random.nextInt(9999) +1;
	}

	@Override
	public void nawiedz(Gosc gosc) {
		nawiedzLazienke(gosc);
		nawiedzPralnie(gosc);
	}

	@Override
	protected void nawiedzLazienke(Gosc gosc) {
		Duchkomornika komornik1= new Duchkomornika();
		Duchkomornika komornik2= new Duchkomornika();
		komornik1.nastraszKogos(gosc);
		komornik2.nastraszKogos(gosc);

	}

	@Override
	protected void nawiedzPralnie(Gosc gosc) {
		Duchkomornika komornik1= new Duchkomornika();
		komornik1.nastraszKogos(gosc);
		
	}

	
	
	

}
