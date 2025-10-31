/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lorra
 */
import org.junit.Test;
import static org.junit.Assert.*;
import service.ClienteService;

public class ClienteServiceTest {

    @Test
    public void testCPFValido() {
        ClienteService service = new ClienteService();
        boolean resultado = service.validarCPF("12345678900");
        assertTrue(resultado);
    }

    @Test
    public void testCPFInvalido() {
        ClienteService service = new ClienteService();
        boolean resultado = service.validarCPF("abc123");
        assertFalse(resultado);
    }
}

