package MIEJSCA;

import domstrachow.Gosc;
import domstrachow.Gosc.stan;
import staryszydlaki.straszydlo;

public class Szpital extends Miejsce {

	@Override
	public void nawiedz(Gosc gosc) {
		new straszydlo() {

			@Override
			public void nastraszKogos(Gosc gosc) {
				if ( gosc.getElo()== stan.NORMALNY) {
					gosc.nastraszMnie(15);
				}
				
			}
			
		};
		
	}

}
