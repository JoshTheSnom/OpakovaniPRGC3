class Prvocisla {	
	public static void main(String[] args) {
		int Cislo, Kontrola, Pocet;
		for(Cislo = 1; Cislo <= 100; Cislo++) {
			int kolikDelitelne = 0;
			for(Kontrola = 1; Kontrola <= Cislo; Kontrola++) {
				if(Cislo%Kontrola == 0) kolikDelitelne++;
			}
			if(kolikDelitelne == 2) System.out.println(Cislo);
		}
		
	}
}