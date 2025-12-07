public class Main
{
    public static void main(String[] args)
    {
        System.out.println("**********************");
        System.out.println("**   Screen Match   **");
        System.out.println("**********************");

        System.out.println("Bem-vindo ao Screen Match!!!");

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

