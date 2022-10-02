package ListaDeExercícios;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * 
 * @author Renner Alves Martins
 * Este é um programa que recebe o valor que você recebe por horas trabalhadas e 
 * o número de horas trabalhadas por mês, imprimindo na tela o valor do seu salário
 * mensal com base nestas duas informações.
 * 
 */
public class CalculadorDeSalarioExercicio08 {

	
	
	public static void main(String[] args) {
		
		double salarioPorHora = 0.0;
		double horasTrabalhadas = 0.0;
		double salarioFinal = 0.0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Insira quanto você recebe por horas trabalhadas: ");
		
		
		try {
			salarioPorHora = scanner.nextDouble();
			System.out.println();
			System.out.println("Agora, insira quantas horas você trabalhou por mês:");
			horasTrabalhadas = scanner. nextDouble();
			
		} catch (InputMismatchException ex) {
			System.out.println("Error, insira um valor válido. Se possuir casas decimais"
					+ ", faça a separação por vírgulas.");
		}
		
		salarioFinal = salarioPorHora * horasTrabalhadas;
		
		System.out.println("O seu salário final por mês, com base nos dados informados, é: ");
		System.out.println(salarioFinal + "R$");

	}

}
