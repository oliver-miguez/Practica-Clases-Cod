public class Personaje {
    //nombre del personaje
    String nome ;

    //las vidas
    int vidas;

    /**
     * Constructor por defecto
     */
    public Personaje(){
        this.nome = "Mutenroy";
        this.vidas = 1000;
    }//end Personaje

    /**
     * Constructor que personaliza el nombre
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


}//end class
