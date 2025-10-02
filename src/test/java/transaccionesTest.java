import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import entidades.CuentaBancaria;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class transaccionesTest {
    //defino la variable de clase para almacenar el rdo de stup
    private CuentaBancaria cb;
    @BeforeEach
    public void setUp(){
        cb = new CuentaBancaria(50.0); //se ejecuta antes de cada prueba
    }

    @Test
    public void testRetirar(){
        cb.retirar(50.0);
        assertEquals(50.0, cb.getSaldo());
    }
}
