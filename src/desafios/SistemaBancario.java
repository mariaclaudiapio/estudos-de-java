package desafios;

import java.util.Scanner;

public class SistemaBancario
{
    public static void main(String[] args)
    {
        System.out.println("************************");
        System.out.println("**   Banco da Marie   **");
        System.out.println("************************\n");

        // Declaração de variáveis
        double balance = 2500;
        double value = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("""
                Escolha uma das opções a seguir:
                '1' para exibição do saldo;
                '2' para saque ou transferência;
                '3' para depósito;
                '4' sair.\n""");

        int option = reader.nextInt();

        System.out.printf("Você digitou a opção %d.%n", option);

        if (option == 1)
        {
            System.out.printf("Seu saldo é R$%.2f.%n", balance);
        }
        else if (option == 2)
        {
            System.out.println("Qual valor você deseja sacar?");
            value = reader.nextDouble();
            if ((value > balance) || (value < 0))
            {
                System.out.printf("""
                        Saque não permitido.
                        Por favor, digite um valor positivo menor ou igual a R$%.2f.
                        """, balance);
            }
            else
            {
                double subtracting = balance - value;
                System.out.printf(""" 
                        Operação realizada. Seu saldo agora é R$%.2f.
                        """, subtracting);
            }
        }
        else if(option == 3)
        {
            System.out.println("Qual valor você deseja depositar?");
            value = reader.nextDouble();
            if (value < 0)
            {
                System.out.println("Valor inválido. Por favor, digite um valor maior ou igual a zero.\n");
            }
            else
            {
                double adding = balance + value;
                System.out.printf(""" 
                        Operação realizada. Seu saldo agora é R$%.2f.
                        """, adding);
            }
        }
        else if(option == 4)
        {
            System.out.println("Saindo do programa...");
        }
        else
        {
            System.out.println("Opção inválida. Por favor, digite um número inteiro entre 1 e 4.");
        }



    }
}
