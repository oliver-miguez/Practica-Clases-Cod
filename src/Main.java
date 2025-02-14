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



        //test4
        personaje1.setVidas(100);
        int danho4 = -1000;
        int respuesta_esperada4 = 100;
        int vidas_restantes4 = personaje1.perderVida(danho4);
        if(vidas_restantes4 == respuesta_esperada4){System.out.println("4: ok");} else System.out.println("4: error");
    }//end main
}//end class