// Author: William David Martins de Almeida
// Date: 21.08.2020
// Link repository: https://github.com/WillDavid/Java-OO
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Turma turma01[] = new Turma[5];
		Turma turma02[] = new Turma[5];
		Turma turma03[] = new Turma[5];
		double notas, somatorio = 0, somatorioGeral=0;
		
		
		// Calculo da Média da Turma 01
		for(int i=0; i<turma01.length;i++) {
			notas = Integer.parseInt(JOptionPane.showInputDialog("Notas turma 01: "));
			turma02[i] = new Turma(notas);
			somatorio = somatorio + notas;
		}
		CalculoMedia mediaTurma01 = new CalculoMedia(somatorio);
		System.out.println("Media turma 01: " + mediaTurma01.MediaTurma(somatorio));
		somatorioGeral = somatorioGeral + mediaTurma01.MediaTurma(somatorio);
		somatorio = 0;
		notas = 0;
		
		
		// Calculo da Média da Turma 02
		for(int j=0; j<turma01.length;j++) {
			notas = Integer.parseInt(JOptionPane.showInputDialog("Notas turma 02: "));
			turma02[j] = new Turma(notas);
			somatorio = somatorio + notas;
		}
		CalculoMedia mediaTurma02 = new CalculoMedia(somatorio);
		System.out.println("Media turma 02: " + mediaTurma02.MediaTurma(somatorio));
		somatorioGeral = somatorioGeral + mediaTurma02.MediaTurma(somatorio);
		somatorio = 0;
		notas = 0;
		
		// Calculo da Média da Turma 03
		for(int k=0; k<turma01.length;k++) {
			notas = Integer.parseInt(JOptionPane.showInputDialog("Notas turma 03: "));
			turma03[k] = new Turma(notas);
			somatorio = somatorio + notas;
		}
		CalculoMedia mediaTurma03 = new CalculoMedia(somatorio);
		System.out.println("Media turma 03: " + mediaTurma03.MediaTurma(somatorio));
		somatorioGeral = somatorioGeral + mediaTurma03.MediaTurma(somatorio);
		somatorio = 0;
		notas = 0;
		
		
		
		CalculoMedia mediaGeral = new CalculoMedia(somatorio);
		System.out.println("Média Geral: "+mediaGeral.MediaGeral(somatorioGeral));
		
		
		
		
		
		
		
		

	}

}
