/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import tela.manutencao.Manutencaocine;
import dao.DaoCine;
import javax.swing.JOptionPane;
import modelo.Cine;
import tela.manutencao.Manutencaocine;
/**
 *
 * @author Administrador
 */
public class ControladorCine {

    public static void inserir(Manutencaocine man){
        Cine objeto = new Cine();
        objeto.setEndereco(man.jtfEndereco.getText());
        objeto.setCapacidade(Integer.parseInt(man.jtfCapacidade.getText()));
        
        boolean resultado = DaoCine.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

}
