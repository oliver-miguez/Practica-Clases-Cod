import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonajeTest {

    @Test
    void perderVida() {
        Personaje p = new Personaje();
        p.setVidas(1000);
        int daño = 100;
        assertEquals(900,p.perderVida(daño)); // 900 es el valor esperado , y p.vidas es el valor que se espera que sea 900 sabiendo que le quitan 100 de daño
    }
}