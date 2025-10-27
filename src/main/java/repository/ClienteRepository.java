/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author lorra
 */
import model.Cliente;
import util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteRepository {
    public void salvar(Cliente cliente) {
        try (Connection conn = ConexaoBD.getConnection()) {
            String sql = "INSERT INTO cliente (nome, cpf, email, endereco) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getEndereco());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        }
    }
}
