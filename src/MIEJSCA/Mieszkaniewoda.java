package MIEJSCA;

import java.util.Random;

import domstrachow.Gosc;
import staryszydlaki.straszydlo;

public class Mieszkaniewoda extends Mieszkania {
	public Mieszkaniewoda() {
		Random random= new Random();
		
		this.kwotazaleglosci=random.nextInt(999) +1;
	}

	@Override
	protected void nawiedzLazienke(Gosc gosc) {
		Duchplywaka duchplywaka1= new Duchplywaka();
		Duchplywaka duchplywaka2= new Duchplywaka();
		duchplywaka1.nastraszKogos(gosc);
		duchplywaka2.nastraszKogos(gosc);


		
	}

	@Override
	protected void nawiedzPralnie(Gosc gosc) {
		Duchkomornika duchkomornika= new Duchkomornika();
		duchkomornika.nastraszKogos(gosc);
		
		
	}
	private class Duchplywaka extends straszydlo{

		@Override
		public void nastraszKogos(Gosc gosc) {
			Random random= new Random();
			gosc.nastraszMnie(random.nextInt(20) + 10);
			
		}
		
	}

	@Override
	public void nawiedz(Gosc gosc) {
		Random random= new Random();
		if (random.nextBoolean()) {
			nawiedzLazienke(gosc);
		}
		else {
			nawiedzPralnie(gosc);
		}
		
	}

}
