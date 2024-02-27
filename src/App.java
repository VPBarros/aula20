import java.util.Locale;
import java.util.Scanner;

import entidade.EstudanteNota;

public class App {
    public static void main(String[] args)  {
        //Poo 
        //programa p/ ler 3 notas que o aluno teve no tres trimestre/imprimir aprovado para + de 60 e reprovado p/ - de 60 
		//e quanto ficou faltando.
		
        System.out.println("Digite o nome do aluno e as notas: ");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		EstudanteNota estudanteNota = new EstudanteNota();
		
		estudanteNota .nome = sc.nextLine();
		estudanteNota .nota1 = sc.nextDouble();
		estudanteNota .nota2 = sc.nextDouble();
		estudanteNota .nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n" ,estudanteNota.notaFinal());
		if (estudanteNota.notaFinal() <60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltam %.2f Pontos%n" , estudanteNota.pontosFaltam());
		}
		else {
			System.out.println("Aprovada!");
		}
		sc.close();
    }
}
