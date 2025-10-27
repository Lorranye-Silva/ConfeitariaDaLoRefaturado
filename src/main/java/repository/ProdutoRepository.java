/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author lorra
 */
import model.Produto;
import util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoRepository {
    public void salvar(Produto produto) {
        try (Connection conn = ConexaoBD.getConnection()) {
            String sql = "INSERT INTO produto (nome, preco, quantidade_disponivel) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade_disponivel());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar produto: " + e.getMessage());
        }
    }
}

