import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("**********************");
        System.out.println("**   Screen Match   **");
        System.out.println("**********************");

        Scanner reading = new Scanner(System.in);

        System.out.println("Olá! Qual é o seu nome?");
        String name = reading.nextLine();

        System.out.printf("%s, bem-vindo(a) ao Screen Match!!!", name);

        // Declaração de variáveis
        int releaseYear = 1982;
        String movie = "Top Gun - Maverick";
        boolean included = false;
        double review = 8.1;

        System.out.printf("O filme '%s' foi lançado em %d. Incluído no plano? %b.%n", movie, releaseYear, included);

        if(releaseYear >= 2022)
        {
            System.out.printf("O '%s' é um lançamento que os clientes estão curtindo.%n", movie);
        }
        else
        {
            System.out.printf("O '%s' é um filme retrô que tem o seu lugar.%n", movie);
        }
    }
}

