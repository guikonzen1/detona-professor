package br.ufmt.alg3.professor;


public class Professor {
   private String professor;
   private String nome;
   private String areaAtuacao;
   private String disciplina;
   private String semestre;
   private String departamento;
   private String comentario;
   private float nota;


  


   public void setProfessor(String professor){
       this.professor = professor;
   }


   public String getProfessor(){
       return professor;
   }
  
   public void setNome(String nome){
       this.nome = nome;
   }


   public String getNome (){
       return nome;
   }


   public void setareaAtuacao(String areaAtuacao){
       this.areaAtuacao = areaAtuacao;
   }


   public String getAreaAtuacao(){
       return areaAtuacao;
   }


   public void setdisciplina(String disciplina){
       this.disciplina = disciplina;
   }


   public String getdisciplina(){
       return disciplina;
   }


   public void setSemestre(String semestre){
       this.semestre = semestre;
   }


   public String getSemestre(){
       return semestre;
   }


   public void setDepartamento(String departamento){
       this.departamento = departamento;
   }


   public String getDepartamento(){
       return departamento;
   }


   public void setComentario(String comentario){
       this.comentario = comentario;
   }


   public String getComentario(){
       return comentario;
   }


   public void setNota(float nota){
       this.nota = nota;
   }


   public float getNota(){
       return nota;
   }


}
