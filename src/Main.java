public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dragon Ball");
        Personaje personaje1 = new Personaje(); //crea un personaje con datos ya guardados en el
        Personaje personaje2 = new Personaje("Vegeta");//crea un personaje en el cual tú tienes que meter los datos en la main
        System.out.println("hola "+ personaje1.nome);
        System.out.println("hola " +personaje2.nome);

        int una_variable = personaje1.perderVida(15);
        if(una_variable == 985) System.out.println("Daño quitado ");
        else System.out.println("no furrula");

        System.out.println("vidas personaje 1: "+ personaje1.getVidas());
        System.out.println("Vidas Personaje 1: "+ una_variable);

        //test1
        personaje1.setVidas(1000);
        int danho = 100;
        int respuesta_esperada = 900;
        int vidas_restantes = personaje1.perderVida(danho);
        if(vidas_restantes == respuesta_esperada){System.out.println("1: ok");} else System.out.println("1: error");


        //test2
        personaje1.setVidas(1000);
        int danho2 = 1100;
        int respuesta_esperada2 = 0;
        int vidas_restantes2 = personaje1.perderVida(danho2);
        if(vidas_restantes2 == respuesta_esperada2){System.out.println("2: ok");} else System.out.println("2: error");


    }//end main
}//end class