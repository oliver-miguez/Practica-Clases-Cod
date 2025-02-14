import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test
    @DisplayName("Números Positivos")
    void valoresPositivos() {
        Personaje p = new Personaje();
        p.setVidas(1000);
        int daño = 100;
        assertEquals(900,p.perderVida(daño)); // 900 es el valor esperado , y p.vidas es el valor que se espera que sea 900 sabiendo que le quitan 100 de daño

    }//end valoresPositivos

    @Test
    @DisplayName("Números negativos")
    void numeroNegativo(){
        Personaje p2 = new Personaje();
        p2.setVidas(1000);
        int daño = -100;
        assertEquals(1000, p2.perderVida(daño));
    }//end numeroNegativo

    @Test
    @DisplayName("Daño mayor que vida")
    void dañoMayor(){
        Personaje p3 = new Personaje();
        p3.setVidas(1000);
        int danho = 1100;
        assertEquals(0,p3.perderVida(danho));

    }//end daño mayor

}//end class