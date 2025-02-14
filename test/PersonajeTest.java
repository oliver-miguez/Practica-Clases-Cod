import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test
    @DisplayName("Números Positivos")
    void valoresPositivos() {
        Personaje p = new Personaje();
        p.setVidas(1000);
        int danho = 100;
        assertEquals(900,p.perderVida(danho)); // 900 es el valor esperado , y p.vidas es el valor que se espera que sea 900 sabiendo que le quitan 100 de daño

    }//end valoresPositivos

    @Test
    @DisplayName("Números negativos")
    void numeroNegativo(){
        Personaje p = new Personaje();
        p.setVidas(1000);
        int danho = -100;
        assertEquals(1000, p.perderVida(danho));
    }//end numeroNegativo

    @Test
    @DisplayName("Daño mayor que vida")
    void danhoMayor(){
        Personaje p = new Personaje();
        p.setVidas(1000);
        int danho = 1100;
        assertEquals(0,p.perderVida(danho));

    }//end danhoMayor



}//end class