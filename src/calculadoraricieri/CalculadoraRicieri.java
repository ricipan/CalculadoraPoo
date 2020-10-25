
package calculadoraricieri;

import java.util.Scanner;


public class CalculadoraRicieri {

    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double n1 = Double.parseDouble(console.nextLine());
        
        System.out.println("Digite o segundo número:");
        double n2 = Double.parseDouble(console.nextLine());
        
        Operacao[] operacoes = new Operacao[] {
				new Soma(),
				new Subtracao(),
				new Multiplicacao(),
				new Divisao(),
				new RestoDaDivisao(),
				new Exponenciacao()
		};
		
		System.out.println("Operações disponíveis: ");
		for (int i = 0; i < operacoes.length; i++) {
			System.out.println(i + " - " + operacoes[i].getDescricao());
		}
		System.out.print("Qual a operação desejada: ");
		int opcao = Integer.parseInt(console.nextLine());
		
		
		Operacao escolhida = operacoes[opcao]; 
		double resultado = escolhida.calcular(n1, n2);
		
		System.out.println(resultado);
	}

}