package MIEJSCA;

import domstrachow.Gosc;
import staryszydlaki.straszydlo;

public class Staryzamek extends Miejsce {
	private static int forcewhite= 20;
	@Override
	public void nawiedz(Gosc gosc) {
		class Duch extends straszydlo {

			@Override
			public void nastraszKogos(Gosc gosc) {
				gosc.nastraszMnie(0);
				
			}
			
		}
		Duch duch1 = new Duch();
		Duch duch2 = new Duch();
		duch1.nastraszKogos(gosc);
		duch2.nastraszKogos(gosc);
	}
	
	
	
	public static class Bialadama extends straszydlo {
		Gosc gosc = new Gosc() {

			@Override
			public void nastraszMnie(int moc) {
				
				
			}
			
		};
		

		@Override
		public void nastraszKogos(Gosc gosc) {
			gosc.nastraszMnie(forcewhite);
			
			
		}
		
	}

}
