/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author lorra
 */
import model.Produto;

public class ProdutoService {
    public boolean validarProduto(Produto produto) {
        return produto.getPreco() >= 0 && produto.getQuantidade_disponivel() >= 0;
    }
}

