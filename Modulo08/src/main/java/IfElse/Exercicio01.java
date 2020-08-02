/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfElse;

/**
 *
 * @author Andressa Silva
 */
public class Exercicio01 {
    
    public static void main(String[] args){
        
        int mediaAluno = 70;
        String nome = "Alex";
        
        if(mediaAluno >= 70 && nome.equals("Alex")){
            System.out.println("Parabens você está aprovado!");
        } else if (mediaAluno <70){
            System.out.println("Aluno reprovado");
        } else {
            System.out.println("Aluno não encontrado");
        }
    }
}