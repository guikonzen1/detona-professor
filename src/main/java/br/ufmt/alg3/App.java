package br.ufmt.alg3;


import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;


public class App
{
   public static void main( String[] args )
   {
       Curso c = new Curso("SI");
       Curso c2 = new Curso();
       c2.setNota(0.f);
       c2.setPeriodo("Vespertino");
       System.out.println(c.getNome());
       System.out.println(c.getPeriodo());
       System.out.println("-----------------------");


       System.out.println(c2.getNome());
       System.out.println(c2.getNota());
       System.out.println(c2.getPeriodo());
       System.out.println(c2.getPeriodo());




       Professor p = new Professor(); // Usa new pra instanciar um novo objeto a uma variável
       p.setNome("Raphael");
       p.setareaAtuacao("TI");
       p.setdisciplina("Algoritmos III");
       p.setSemestre("2024/1");


       Professor p2 = new Professor();
       p2.setNome("OutroNome");


       Professor p3 = new Professor();
       Professor p4 = p3;
       p3 = p;
       //4 objetos e 5 variáveis
       System.out.println(p.getNome());


   }
}

