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
public class OperadorTernario {
    
    public static void main(String[] args) {
        
        int n1 = 90;
        int n2 = 60;
        int n3 = 00;
        int n4 = 80;
        double media = 0;
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        /* 
        if(media >=70) {
            System.out.println("Aluno aprovado! Media = " +media);
        } else if (media >=40) {
            System.out.println("Aluno em recuperacao! Media = " +media);
        } else {
            System.out.println("Aluno reprovado! Media = "+media);
        }
        */
        /* : -> Else */
        /* Operadores ternarios sao para validacoes de uma linha só*/
        //String saidaResultado = media>= 70 ? "Aluno aprovado" : "Aluno Reprovado";
        String saidaResultado = media>= 70 ? "Aluno aprovado" : (media >= 40 && media <=69) ? "Aluno em recuperação" : "Reprovado";
        System.out.println(saidaResultado);
    }
}
