
public class AbstractTets {
	public static void main(String[] args) {
		MusicalInstrument mi = new Guitar();
		
		
		mi.play();
		mi.use();
//		mi.tuneString();
//		mi.pluck();
		
		StringBasedMusicalInstrument sb = new Guitar();
		sb.play();
		sb.tuneString();
//		sb.pluck();
		
		Guitar myGuitar = new Guitar();
		myGuitar.play();
		myGuitar.tuneString();
		myGuitar.pluck();
	}
}

interface Instrument {
	void use();
}

abstract class MusicalInstrument implements Instrument {
	abstract void play();
}

abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneString();
}

class Guitar extends StringBasedMusicalInstrument {
	void tuneString() {
		System.out.println("tunnig..");
	}
	
	void play() {
		System.out.println("playing...");
	}
	
	void pluck() {
		System.out.println("plucking..");
	}
	
	public void use() {
		System.out.println("using..");
	}
}
