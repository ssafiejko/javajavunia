package amunicjarodzaje;

public abstract class Granat extends Amunicja {
	protected boolean zabezpieczony;

	public Granat(boolean zabezpieczony) {
		this.zabezpieczony= zabezpieczony;
	}

	public boolean isZabezpieczony() {
		return zabezpieczony;
	}
}
