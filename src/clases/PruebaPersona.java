package clases;

public class PruebaPersona {
    public static void main(String [] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Fides";
        persona1.apellido = "JouJou";
        persona1.desplegarInfo();

        Persona persona2 = new Persona();

        persona2.nombre = "Kira";
        persona2.apellido = "Sensei";
        persona2.desplegarInfo();
    }
}
