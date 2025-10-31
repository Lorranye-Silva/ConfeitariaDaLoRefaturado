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
import model.Produto;
import service.ProdutoService;

public class ProdutoServiceTest {

    @Test
    public void testProdutoValido() {
        Produto produto = new Produto("Bolo de Morango", 30.0, 2);
        ProdutoService service = new ProdutoService();
        boolean resultado = service.validarProduto(produto);
        assertTrue(resultado);
    }

    @Test
    public void testProdutoInvalido() {
        Produto produto = new Produto("", -10.0, 0);
        ProdutoService service = new ProdutoService();
        boolean resultado = service.validarProduto(produto);
        assertFalse(resultado);
    }
}

