package br.com.fiap.spring.dto;

public class CartaoCreditoItemResponse {

  private Integer id;
  private String registro;
  private String nome;
  private String curso;
  private String dataValidade;
  private String verificador;


  public CartaoCreditoItemResponse(Integer id, String registro, String nome, String curso, String dataValidade, String verificador) {
    this.id = id;
    this.registro = registro;
    this.nome = nome;
    this.curso = curso;
    this.dataValidade = dataValidade;
    this.verificador = verificador;
  }


  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRegistro() {
    return this.registro;
  }

  public void setRegistro(String registro) {
    this.registro = registro;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getDataValidade() {
    return this.dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  public String getVerificador() {
    return this.verificador;
  }

  public void setVerificador(String verificador) {
    this.verificador = verificador;
  }
  
}
