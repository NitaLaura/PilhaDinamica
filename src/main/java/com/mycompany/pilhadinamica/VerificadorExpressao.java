/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhadinamica;
import java.util.Stack;
/**
 *
 * @author Nyta
 */
public class VerificadorExpressao {
    public boolean verificaExpressao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; // Não há correspondência para o fecha parênteses
                }

                char topo = pilha.pop();
                if (!corresponde(topo, caractere)) {
                    return false; // Não há correspondência entre abre e fecha parênteses
                }
            }
        }

        return pilha.isEmpty(); // A expressão é válida se a pilha estiver vazia no final
    }

    private boolean corresponde(char abre, char fecha) {
        return (abre == '(' && fecha == ')') ||
               (abre == '[' && fecha == ']') ||
               (abre == '{' && fecha == '}');
    }
}
