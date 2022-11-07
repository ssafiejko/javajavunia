package domstrachow;

import java.util.Random;

public abstract class Gosc {
	public enum stan {
		NORMALNY, PRZERAZONY, PANIKA
	}
	
	protected int odpornosc;
	protected stan elo= stan.NORMALNY;
	
	public Gosc() {
		super();
		Random random = new Random();
		this.odpornosc= random.nextInt(10) +10;
	}

	@Override
	public String toString() {
		return "Gosc [odpornosc=" + odpornosc + ", elo=" + elo + "]";
	}
	
	public abstract void nastraszMnie( int moc);

	public int getOdpornosc() {
		return odpornosc;
	}

	public void setOdpornosc(int odpornosc) {
		this.odpornosc = odpornosc;
	}

	public stan getElo() {
		return elo;
	}

	public void setElo(stan elo) {
		this.elo = elo;
	}
	

}
