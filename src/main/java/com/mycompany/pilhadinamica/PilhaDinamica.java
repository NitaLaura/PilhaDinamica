/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilhadinamica;
import javax.swing.JOptionPane;
/**
 *
 * @author Nyta
 */
public class PilhaDinamica {

    public static void main(String[] args) {
        String expressao = JOptionPane.showInputDialog("Digite a expressão:");

        VerificadorExpressao verificador = new VerificadorExpressao();

        if (verificador.verificaExpressao(expressao)) {
            JOptionPane.showMessageDialog(null, "Expressão correta!");
        } else {
            JOptionPane.showMessageDialog(null, "Expressão incorreta!");
        }
    }
}
