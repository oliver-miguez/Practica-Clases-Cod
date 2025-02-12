public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dragon Ball");
        Personaje personaje1 = new Personaje(); //crea un personaje con datos ya guardados en el
        Personaje personaje2 = new Personaje("Vegeta");//crea un personaje en el cual tú tienes que meter los datos en la main
        System.out.println("hola "+ personaje1.nome);
        System.out.println("hola " +personaje2.nome);
    }//end main
}//end class