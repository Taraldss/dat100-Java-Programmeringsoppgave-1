package no.tarald.skaar;

import static javax.swing.JOptionPane.*;


public class Progoppgave1 {

	public static void main(String[] args) {
		System.out.println("oppgave4");
		oppgave4();
		System.out.println();
		System.out.println("oppgave 5");
		oppgave5();
		System.out.println();
		System.out.println("oppgave 6");
		oppgave6(20);

	}
	public static void oppgave4() {
		
		int bruttoInntekt = Integer.parseInt(showInputDialog("Skriv inn din bruttoinntekt: "));
		double trinn1 = 0.93;
		double trinn2 = 2.41;
		double trinn3 = 11.52;
		double trinn4 = 14.52;
		int inntekt1 = 164100;
		int inntekt2 = 230950;
		int inntekt3 = 580650;
		int inntekt4 = 934050;
		
		double trinnSkatt = 0.0;
		
		if(bruttoInntekt > inntekt1 && bruttoInntekt < inntekt2) {
			trinnSkatt = (bruttoInntekt * trinn1)/100;
		}else if(bruttoInntekt > inntekt2 && bruttoInntekt < inntekt3) {
			trinnSkatt = (bruttoInntekt * trinn2)/100;
		}else if(bruttoInntekt > inntekt3 && bruttoInntekt < inntekt4) {
			trinnSkatt = (bruttoInntekt * trinn3)/100;
		}else if(bruttoInntekt > inntekt4) {
			trinnSkatt = (bruttoInntekt * trinn4)/100;
		}
		if(bruttoInntekt < 164100){
			showMessageDialog(null, "Du trneger ikkje betale skatt");
			System.out.println("Du trenger ikkje betale skatt");
		}else {
			showMessageDialog(null, "Du må betale " + trinnSkatt + "kr i skatt");
			System.out.println("Du må betale " + trinnSkatt + "kr i skatt");
		}
	}
	public static void oppgave5() {
		String antallPoeng;
		String melding = "fikk karakteren ";
		char bokstavKarakter = 'a';
		
		
		for(int studentNr = 1; studentNr <= 10; studentNr++) {
			{
			
			antallPoeng = showInputDialog("Poengsum student" + studentNr + ": " );
			int finalScore = Integer.parseInt(antallPoeng);
				
			if(finalScore >= 90 && finalScore <= 100) {
				bokstavKarakter = 'A';
							
			}else if(finalScore >= 80 && finalScore <= 89) {
				bokstavKarakter = 'B';
							
			}else if(finalScore >= 60 && finalScore <= 79) {
				bokstavKarakter = 'C';
							
			}else if(finalScore >= 50 && finalScore <= 59) {
				bokstavKarakter = 'D';
							
			}else if(finalScore >= 40 && finalScore <= 49) {
				bokstavKarakter = 'E';
				
			}else if(finalScore >= 0 && finalScore <= 39) {
				bokstavKarakter = 'F';
				
			}
			if(finalScore > 100 || finalScore < 0) {
				showMessageDialog(null, "Poengsum kan bare vere mellom 0 og 100");
				studentNr--;
			}else {
				System.out.println( "Student nummer" + studentNr +" "+ melding + bokstavKarakter);

			}
			
			}
			
		}
		
	}
	private static void oppgave6(int n) {
		
		long fakultet = 1;
		
		if(n > 20) {
			
			System.out.println("long klarer ikkje lagre verdier større en 20 fakultet");
			
		}else {
			
			for(int i = 1; i <= n; i++) {
				
				fakultet *= i;
				
			}
		}
		System.out.println(fakultet);
	}

}

