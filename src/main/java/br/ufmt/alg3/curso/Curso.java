package br.ufmt.alg3.curso;


import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;


public class Curso {


    private String nome;
    private String periodo; //Matutino, Vespertino e Noturno
    private float nota; //Restrela 0-5 fracionada
    private String comentario;
    private String rga;
    private String semestre; //2024/1
 
 
    public Curso(){
        periodo = "Matutino";
 
 
    }
 
 
    public Curso(String nome){
        this.nome = nome;
        periodo = "Noturno";
    }
 
 
    public void setNome(String nome){
        this.nome = nome; // this é usado pra puxar a variável da class
    }
 
 
    public String getNome(){
        return nome;
    }
 
 
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
 
 
    public String getPeriodo(){
        return periodo;
    }
 
 
    public void setNota(float nota){
        this.nota = nota;
    }
 
 
    public float getNota(){
        return nota;
    }
 
 
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
 
 
    public String getComentario(){
        return comentario;
    }
 
 
    public void setRga(String rga){
        this.rga = rga;
    }
 
 
    public String getRga(){
        return rga;
    }
 
 
    public void setSemestre(String semestre){
        this.semestre = semestre;
    }
 
 
    public String getSemestre(){
        return semestre;
    }
   
 }
