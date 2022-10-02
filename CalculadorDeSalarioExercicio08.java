package ListaDeExerc�cios;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * 
 * @author Renner Alves Martins
 * Este � um programa que recebe o valor que voc� recebe por horas trabalhadas e 
 * o n�mero de horas trabalhadas por m�s, imprimindo na tela o valor do seu sal�rio
 * mensal com base nestas duas informa��es.
 * 
 */
public class CalculadorDeSalarioExercicio08 {

	
	
	public static void main(String[] args) {
		
		double salarioPorHora = 0.0;
		double horasTrabalhadas = 0.0;
		double salarioFinal = 0.0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Insira quanto voc� recebe por horas trabalhadas: ");
		
		
		try {
			salarioPorHora = scanner.nextDouble();
			System.out.println();
			System.out.println("Agora, insira quantas horas voc� trabalhou por m�s:");
			horasTrabalhadas = scanner. nextDouble();
			
		} catch (InputMismatchException ex) {
			System.out.println("Error, insira um valor v�lido. Se possuir casas decimais"
					+ ", fa�a a separa��o por v�rgulas.");
		}
		
		salarioFinal = salarioPorHora * horasTrabalhadas;
		
		System.out.println("O seu sal�rio final por m�s, com base nos dados informados, �: ");
		System.out.println(salarioFinal + "R$");

	}

}
