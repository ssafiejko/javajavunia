package domstrachow;

public class Turysta extends Gosc {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void nastraszMnie(int moc) {
		if (moc>this.odpornosc && this.elo==stan.NORMALNY ) {
			this.elo= stan.PRZERAZONY;
		}
		else if (moc>this.odpornosc && this.elo==stan.PRZERAZONY ) {
			this.elo= stan.PANIKA;
		}
		else if (moc<this.odpornosc && this.elo==stan.PRZERAZONY ) {
			this.elo= stan.NORMALNY;
		}
		else if (moc<this.odpornosc && this.elo==stan.PANIKA ) {
			this.elo= stan.PRZERAZONY;
		}
		
		
	}

}
