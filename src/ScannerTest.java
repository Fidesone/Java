import java.util.Scanner;

public class ScannerTest {

        public static void main(String [] args ) {
            System.out.println("Escribe tu nombre:");
            Scanner consola = new Scanner(System.in);
            var usuario = consola.nextLine();
            var saludo = "Hola, ";
            System.out.println( saludo + usuario);

        }

}
