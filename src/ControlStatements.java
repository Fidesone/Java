import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        // Sentencias de control: IF- ELSE
        System.out.println("En que mes estamos? (del 1 al 12)");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
            System.out.println( "Es el mes " + mes + " , asi que nos encontramos en "5 + estacion);


        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
            System.out.println( "Es el mes " + mes + " , asi que nos encontramos en " + estacion);

        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
            System.out.println( "Es el mes " + mes + " , asi que nos encontramos en " + estacion);

        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
            System.out.println( "Es el mes " + mes + " , asi que nos encontramos en " + estacion);

            // Sentencias de control: IF- ELSE
        }

    }
}