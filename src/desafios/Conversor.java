package desafios;

public class Conversor
{
    public static void main(String[] args)
    {
        System.out.println("***************************************************");
        System.out.println("**   Conversor de Graus Celsius para Fahrenheit  **");
        System.out.println("***************************************************");

        int celsius = 30;
        int fahrenheit = (int)((celsius * 1.8) + 32);

        System.out.printf("%dºC equivalem a %dºF.", celsius, fahrenheit);
    }
}
