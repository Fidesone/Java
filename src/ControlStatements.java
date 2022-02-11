import java.util.Scanner;

public class ControlStatements {
   /* public static void main(String[] args) {
        // Sentencias de control: IF- ELSE
        System.out.println("En que mes estamos? (del 1 al 12)");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
            System.out.println("Es el mes " + mes + " , asi que nos encontramos en " + estacion);


        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
            System.out.println("Es el mes " + mes + " , asi que nos encontramos en " + estacion);

        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
            System.out.println("Es el mes " + mes + " , asi que nos encontramos en " + estacion);

        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
            System.out.println("Es el mes " + mes + " , asi que nos encontramos en " + estacion);

        }


    }
}*/

    public static void main(String[] args) {
        // Sentencias de control: IF- ELSE
        System.out.println("En que mes estamos? (del 1 al 12)");
        Scanner consola = new Scanner(System.in);
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }
        System.out.println("Es el mes " + mes + " , asi que nos encontramos en " + estacion);

    }
}