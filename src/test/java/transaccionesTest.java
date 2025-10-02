import org.junit.jupiter.api.BeforeEach;
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
    //Retiro válido
    @Test
    public void testRetirar(){
        cb.retirar(50.0);
        assertEquals(0.0, cb.getSaldo());
    }
    //Retiro con valor excedente invalido
    @Test
    public void testRetirarInsuf(){
        cb.retirar(60.0);
        assertEquals(50, cb.getSaldo());
    }
}
