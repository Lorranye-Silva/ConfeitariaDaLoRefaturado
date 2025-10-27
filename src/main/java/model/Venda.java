/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author lorra
 */
import java.util.Date;

public class Venda {
    private int id;
    private int Funcionario_id; 
    private int Clientes_id;    
    private Date data;
    private String produtoNome;
    private double valor_total;

    
    public Venda() { }

    
    public Venda(int id, int Funcionario_id, int Clientes_id, Date data, String produtoNome, double valor_total) {
        this.id = id;
        this.Funcionario_id = Funcionario_id;
        this.Clientes_id = Clientes_id;
        this.data = data;
        this.produtoNome = produtoNome;
        this.valor_total = valor_total;
    }

    
    public Venda(int Funcionario_id, int Clientes_id, Date data, String produtoNome, double valor_total) {
        this.Funcionario_id = Funcionario_id;
        this.Clientes_id = Clientes_id;
        this.data = data;
        this.produtoNome = produtoNome;
        this.valor_total = valor_total;
    }

   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getFuncionario_id() { return Funcionario_id; }
    public void setFuncionario_id(int Funcionario_id) { this.Funcionario_id = Funcionario_id; }

    public int getClientes_id() { return Clientes_id; }
    public void setClientes_id(int Clientes_id) { this.Clientes_id = Clientes_id; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public String getProdutoNome() { return produtoNome; }
    public void setProdutoNome(String produtoNome) { this.produtoNome = produtoNome; }

    public double getValor_total() { return valor_total; }
    public void setValor_total(double valor_total) { this.valor_total = valor_total; }
}
