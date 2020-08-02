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
public class IfElseAninhados {

    public static void main(String[] args) {

        int n1 = 90;
        int n2 = 60;
        int n3 = 70;
        int n4 = 80;
        double media = 0;

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >=50){
            if(media >=70){
                System.out.println("Aluno está aprovado direto");
            } else{
                System.out.println("Aluno está em recuperação");
            }
        } else {
            System.out.println("Aluno reprovado direto");
        }
    }
}
