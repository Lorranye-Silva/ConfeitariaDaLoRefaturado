/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author lorra
 */
import model.Funcionario;
import util.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FuncionarioRepository {
    public void salvar(Funcionario funcionario) {
        try (Connection conn = ConexaoBD.getConnection()) {
            String sql = "INSERT INTO funcionario (nome, cpf, telefone, login) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getLogin());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar funcionário: " + e.getMessage());
        }
    }
}
