package br.ufmt.alg3;


import java.util.Scanner;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;


public class App
{
   public static void main( String[] args )
   {
       Curso[] respostas;
       respostas = new Curso[3];

       //int[][] mat = new int[2][3];//Criar matriz em java

       Scanner teclado;
       teclado = new Scanner(System.in);

     

       for(int i = 0; i < respostas.length; i++){
       Curso c = new Curso();
       System.out.print("Digite o nome do curso: ");
       String nome = teclado.nextLine();
       
       c.setNome(nome);
       respostas[i] = c;
       }

       for (Curso curso : respostas) {
        System.out.println("Curso avaliado: " + curso.getNome());
       }


   }
}

