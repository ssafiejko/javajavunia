package MIEJSCA;

import java.util.Random;

import domstrachow.Gosc;
import staryszydlaki.straszydlo;

public abstract class Mieszkania extends Miejsce{
	protected int kwotazaleglosci;
	
	
	
	protected  abstract void nawiedzLazienke(Gosc gosc);
	
		
	
	protected abstract void nawiedzPralnie(Gosc gosc);
		
	
	
	protected class Duchkomornika extends straszydlo {

		@Override
		public void nastraszKogos(Gosc gosc) {
			gosc.nastraszMnie((int) kwotazaleglosci/500);
			
		}
		
	}

}
