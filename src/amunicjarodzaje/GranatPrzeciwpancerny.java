package amunicjarodzaje;

public class GranatPrzeciwpancerny extends Granat {
	 public GranatPrzeciwpancerny(boolean zabezpieczony, int emisja) {
		super(zabezpieczony);
		this.emisja=emisja;
		// TODO Auto-generated constructor stub
	}

	public int getEmisja() {
		return emisja;
	}

	private int emisja;
}
