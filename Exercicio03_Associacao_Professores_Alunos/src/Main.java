// Author: WIlliam David Martins de Almeida
// Data: 24.08.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		int numeroProfessores, numeroAlunos;
		
		
		numeroProfessores = Integer.parseInt(JOptionPane.showInputDialog("Numero de professores: "));
		numeroAlunos = Integer.parseInt(JOptionPane.showInputDialog("Numero de alunos: "));
		
		
		Professor professor[] = new Professor[numeroProfessores];
		Aluno aluno[] = new Aluno[numeroAlunos];
		
		
		for(int i=0;i<professor.length;i++) {
			nome = JOptionPane.showInputDialog(null, "Informa o nome do Professor: ");
			professor[i] = new Professor(nome);
			
		}
		
		for(int k=0;k<aluno.length;k++) {
			nome = JOptionPane.showInputDialog(null, "Informa o nome do aluno: ");
			aluno[k] = new Aluno(nome);
			
		}
		int resposta, incluirAluno;
		for(int k=0;k<professor.length;k++) {
			resposta  = Integer.parseInt(JOptionPane.showInputDialog("Professor: " + professor[k].getNomeProfessor()+" Deseja incluir alunos?\n[1]"
					+ "-sim\n[2]-nao"));
			
			if(resposta == 1) {
				for(int l=0;l<aluno.length;l++) {
					incluirAluno = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar o aluno: " + aluno[l].getNomeAluno()+" para o professor "+
				professor[k].getNomeProfessor()+"\n[1]-Sim\n[2]-Nao"));
					if(incluirAluno == 1) {
						professor[k].alocarAluno(aluno[l]);
						aluno[l].alocarProfessor(professor[k]);
						
					}else if(incluirAluno == 2) {
						System.out.println("Não acontece nada");
					}
				}
			
			}else if(resposta ==2) {
				System.out.println("Nao acontece nada");
			}
			
		
			
		}
		
		for(int i=0;i<professor.length;i++) {
			for(int j=0;j<professor[j].getAlunos().size();j++) {
				System.out.println(professor[j].getAlunos().get(j).getNomeAluno());
			}
		}
		

		

	}

}
