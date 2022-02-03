package principal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GatoSimple Gato_de_Diego= new GatoSimple("macho");
        GatoSimple Gato_de_Andres= new GatoSimple("macho");

        System.out.println("El sexo del gato de Diego es: "+ Gato_de_Diego.getSexo());
        System.out.println("El sexo del gato de Andres es: "+ Gato_de_Andres.getSexo());
        Gato_de_Diego.maulla();
        Gato_de_Andres.ronronea();
        Gato_de_Andres.peleaCon(Gato_de_Diego);
        Gato_de_Andres.come("pescado");
        Gato_de_Diego.come("Pene");
    }
}
