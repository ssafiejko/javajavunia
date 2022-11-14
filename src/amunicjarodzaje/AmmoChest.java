package amunicjarodzaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import amunicjarodzaje.Naboj.Kaliber;

public class AmmoChest {
	public static List<Amunicja> generuj(int n) {
		Random random= new Random();
		List<Amunicja> lista = new ArrayList<>();
		for (int i=0; i<20;i++) {
		lista.add(new GranatObronny(
				random.nextBoolean()));
		lista.add(new GranatPrzeciwpancerny(
				random.nextBoolean(), 
				random.nextInt(30)+220));
		lista.add(new GranatZaczepny(
				random.nextBoolean()));
		
		
		}
		for (int i =0; i<2000;i++) {
			lista.add(new Naboj(Kaliber.values()[random.nextInt(Kaliber.values().length)]));
		}
		
		
		return lista;
	}
	
	
	
	public static void przelatujesb(List<Amunicja> lista) {
		
		Consumer<Amunicja> getEcoArmourPiercingGrenades = (a) ->{
			if (a instanceof GranatPrzeciwpancerny) {
				if (((GranatPrzeciwpancerny) a).getEmisja()<=225) {
					return a;
				}
				else {
					
				}
			}
		};
		
	}

}
