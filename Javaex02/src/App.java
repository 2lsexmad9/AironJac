import java.util.Scanner;

public class App //ejercicio 1
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe aquí cuántos años tienes: ");
        int edad = scanner.nextInt();

        if (edad < 6 || edad > 120)
        System.out.println("Error");

        else if (edad >=6 && edad <= 12)
        System.out.println("Estas en primaria");

        else if (edad >=13 && edad <= 17)
        System.out.println("Estas en secundaria");

        else if (edad >=18 && edad <= 23)
        System.out.println("Estas en la universidad");
        
        else
        System.out.println("Estas trabajando");
        
        scanner.close();
    }
}

/*public class App //ejerecicio 2
{
        public static void main(String[] args) throws Exception
    {
        int i = 20;
        int j = i * i;

        while (i != 9)
        {
        System.out.println(i);
        System.out.println(j);
        i--;
        }

    }
}*/

/*public class App  //ejercicio 3
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu padre: ");
        String nombrep = scanner.nextLine();

        System.out.println("Escribe el nombre de tu madre: ");
        String nombrem = scanner.nextLine();

        System.out.println("Escribe la edad de tu padre: ");
        int edadp = scanner.nextInt();

        System.out.println("Escribe la edad de tu madre: ");
        int edadm = scanner.nextInt();

        double mediaedad = (edadp + edadm) / 2.0;
        System.out.println("La media de la edad de tus padres es: " + mediaedad);

        scanner.close();
    }
}*/