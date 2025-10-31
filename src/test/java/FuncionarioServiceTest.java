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
import service.FuncionarioService;

public class FuncionarioServiceTest {

    @Test
    public void testLoginValido() {
        FuncionarioService service = new FuncionarioService();
        boolean resultado = service.validarLogin("ana123");
        assertTrue(resultado);
    }

    @Test
    public void testLoginInvalido() {
        FuncionarioService service = new FuncionarioService();
        boolean resultado = service.validarLogin("");
        assertFalse(resultado);
    }
}

