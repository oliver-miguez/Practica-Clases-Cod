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
        vidas = vidas - danho ;
        return vidas;
    }


    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }




}//end class
