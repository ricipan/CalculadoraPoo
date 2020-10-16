
package calculadoraricieri;

import java.util.Scanner;


public class CalculadoraRicieri {

    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double n1 = Double.parseDouble(console.nextLine());
        
        System.out.println("Digite o segundo número:");
        double n2 = Double.parseDouble(console.nextLine());
        
        Operacao[] operacoes = new Operacao[4];
        operacoes[0] = new Soma();
        operacoes[1] = new Subtracao();
        operacoes[2] = new Multiplicacao();
        operacoes[3] = new Divisao();
        
        System.out.println("Selecione a operação desejada: ");
        for (int i = 0; i < operacoes.length; i++){
        System.out.println(i + " - " + operacoes[i].getDescricao());
    }
        System.out.print("Operacao selecionada: ");
        int opcao = Integer.parseInt(console.nextLine());
        
        
        
        Operacao escolhida = operacoes[opcao];
        double resultado = escolhida.calcular(n1, n2);
        
        System.out.println(resultado);
    }
    
}
