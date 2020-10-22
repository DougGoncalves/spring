package br.com.fiap.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "CARTAO_CREDITO")
public class CartaoCredito {

    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "generator", allocationSize = 1, sequenceName = "CARTAO_CREDITO_SEQUENCE")
    @Column
    private Integer id;
    @Column(name = "REGISTRO")
    private String registro;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CURSO")
    private String curso;
    @Column(name = "NUMERO_CARTAO")
    private String numeroCartao;
    @Column(name = "DATA_VALIDADE")
    private String dataValidade;
    @Column(name = "VERIFICADOR")
    private Integer verificador;

    public CartaoCredito() {
    }

    public CartaoCredito(String registro, String nome, String curso, String numeroCartao,
                   String dataValidade, Integer verificador) {
        this.registro = registro;
        this.nome = nome;
        this.curso = curso;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.verificador = verificador;
    }

    public CartaoCredito(Integer id, String registro, String nome, String curso, String numeroCartao,
                   String dataValidade, Integer verificador) {
        this.id = id;
        this.registro = registro;
        this.nome = nome;
        this.curso = curso;
        this.numeroCartao = numeroCartao;
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

  public String getNumeroCartao() {
    return this.numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getDataValidade() {
    return this.dataValidade;
  }

  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  public Integer getVerificador() {
    return this.verificador;
  }

  public void setVerificador(Integer verificador) {
    this.verificador = verificador;
  }

}