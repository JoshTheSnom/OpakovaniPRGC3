class Prvocisla {	
	public static void main(String[] args) {
		int Cislo, Kontrola, Pocet;
		int Prvocislo[] = new int[100];
		for(Cislo = 1; Cislo <= 100; Cislo++) {
			Pocet = 0;
			for(Kontrola = 1; Kontrola <= 100; Kontrola++) {
				if(Cislo%Kontrola == 0) Pocet++;
			}
			if(Pocet == 2) System.out.println(Cislo);
		}
		
	}
}