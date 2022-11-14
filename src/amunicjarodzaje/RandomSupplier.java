package amunicjarodzaje;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
	Random random= new Random();
	
	
	Supplier<String> provideRandomCaliberGenerator= () -> Naboj.nameskaliber.get(Random.nextInt(Naboj.getNameskaliber.size()));

	
}
