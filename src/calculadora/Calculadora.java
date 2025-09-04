package calculadora;// Crie os testes para as seguintes operações:
//Subtração
//Multiplicação
//Divisão
//Potenciação (ab)
//Usando Ctrl+1, implemente as operações acima.
//Rode os testes e garanta que a barra fique verde no final.

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println ("Observação: o número 0 não vai dividir e nem potencializar.");

        System.out.println ("Digite o primeiro numero inteiro: ");
        int a = teclado.nextInt();

        System.out.println ("Digite o segundo numero inteiro: ");
        int b = teclado.nextInt();


        Calculadora calc = new Calculadora();


        System.out.println (" a subtração dos números que você digitou é: " + calc.subtracao(a, b));
        System.out.println (" a multiplicação dos números que você digitou é: " + calc.multiplicacao(a, b));
        System.out.println (" a divisao dos números que você digitou é: " + calc.divisao(a, b));
        System.out.println (" a potenciação dos números que você digitou é: " + calc.potenciacao(a, b));


        teclado.close();

    }

    public double soma (double a, double b) {
        return a + b;
    }

    public double subtracao (double a, double b) {
        return a - b;
    }
    public double multiplicacao (double a, double b) {
        return a * b;
    }
    public double divisao (double a, double b) {
        if (b == 0) {
            System.out.println(" Erro: não é possível dividir por zero!");
            return 0;
        }
        return a / b;
    }
    public double potenciacao (double a, double b) {
        return (int) Math.pow(a, b);
    }
}
