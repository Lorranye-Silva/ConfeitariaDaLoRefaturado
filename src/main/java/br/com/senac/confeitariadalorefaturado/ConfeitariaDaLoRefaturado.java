/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.senac.confeitariadalorefaturado;

/**
 *
 * @author lorra
 */
import model.Cliente;
import model.Funcionario;
import model.Produto;
import service.ClienteService;
import service.FuncionarioService;
import service.ProdutoService;
import repository.ClienteRepository;
import repository.FuncionarioRepository;
import repository.ProdutoRepository;

public class ConfeitariaDaLoRefaturado {
    public static void main(String[] args) {
        // Teste Cliente
        Cliente cliente = new Cliente("Lorranye", "12345678900", "lo@email.com", "Rua Pastel, 123");
        ClienteService clienteService = new ClienteService();
        ClienteRepository clienteRepo = new ClienteRepository();

        if (clienteService.validarCPF(cliente.getCpf())) {
            clienteRepo.salvar(cliente);
            System.out.println("Cliente salvo com sucesso!");
        } else {
            System.out.println("CPF inválido.");
        }

        // Teste Produto
        Produto produto = new Produto("Bolo de Chocolate", 25.0, 3);
        ProdutoService produtoService = new ProdutoService();
        ProdutoRepository produtoRepo = new ProdutoRepository();

        if (produtoService.validarProduto(produto)) {
            produtoRepo.salvar(produto);
            System.out.println("Produto salvo com sucesso!");
        } else {
            System.out.println("Produto inválido.");
        }
// Teste Funcionário
       Funcionario funcionario = new Funcionario("Ana", "ana123", "Rua Doce, 456", "11999999999", "98765432100", "ana@email.com");

        FuncionarioService funcionarioService = new FuncionarioService();
        FuncionarioRepository funcionarioRepo = new FuncionarioRepository();

        if (funcionarioService.validarLogin(funcionario.getLogin())) {
            funcionarioRepo.salvar(funcionario);
            System.out.println("Funcionário salvo com sucesso!");
        } else {
            System.out.println("Login inválido.");
        }
    }
}
