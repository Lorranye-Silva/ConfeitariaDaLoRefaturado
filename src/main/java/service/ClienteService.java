/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author lorra
 */
public class ClienteService {
    public boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }
}
