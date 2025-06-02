import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe aquí tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ahora tus apellidos: ");
        String apellido = scanner.nextLine();

        System.out.print("Y ahora tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Te llamas " + nombre + " " + apellido + " y tienes " + edad + " años");

        scanner.close();
    }
}