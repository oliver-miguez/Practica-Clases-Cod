public class Personaje {
    //nombre del personaje
    String nome ;

    //las vidas
    private int vidas;

    /**
     * Constructor por defecto
     * Personaje 1
     */
    public Personaje(){
        this.nome = "Mutenroy";
        this.vidas = 1000;
    }//end Personaje

    /**
     * Constructor que personaliza el nombre
     * Personaje 2
     * @param nuevoNombre del personaje
     */
     public Personaje(String nuevoNombre){
        this.nome = nuevoNombre;
        this.vidas = 100;
    }//end personaje

    /**
     * Disminuye la vida segun el tamaño
     * @param danho  es el daño causado
     * @return vidas que quedan
     */
    public int perderVida (int danho){
        if(danho < 0) danho = 0; //arregla el fallo de introducir daño negativo
        vidas = vidas - danho ;
        if(vidas < 0 ) vidas = 0; //arregla el fallo de vida negativa descubierto en los test

        return vidas;
    }


    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }




}//end class
