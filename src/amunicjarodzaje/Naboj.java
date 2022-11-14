package amunicjarodzaje;

import java.util.Arrays;
import java.util.List;

public class Naboj extends Amunicja{
	public enum Kaliber{
	    PROD("4/5"), 
	    SIT("56/7"), 
	    CIT("62/9/12"), 
	    DEV("7");
	 
	    private String kaliber;
	 
	    Kaliber(String envUrl) {
	        this.kaliber = envUrl;
	    }
	 
	    public String getUrl() {
	        return kaliber;
	    }
	}

	private Kaliber kaliber;

	public Naboj(Kaliber kaliber) {
		super();
		this.kaliber = kaliber;
	}
	
	
	
	}


