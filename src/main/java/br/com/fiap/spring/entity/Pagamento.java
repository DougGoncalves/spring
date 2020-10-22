package br.com.fiap.spring.entity;

import br.com.fiap.spring.enums.PagamentoStatus;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "PAGAMENTO")
@EntityListeners(AuditingEntityListener.class)
public class Pagamento {

    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(initialValue = 11, allocationSize = 1, name = "generator", sequenceName = "PAGAMENTO_SEQUENCE")
    @Column(name = "ID_PAGAMENTO")
    private Integer id;

    @Column(name = "ID_PEDIDO")
    private Integer idPedido;

    @Column(name = "TOTAL_PEDIDO")
    private BigDecimal totalPedido;

    @Column(name = "ID_ESTUDANTE")
    private String idEstudante;

    @Column(name = "STATUS")
    private PagamentoStatus status;

    @Column(name = "CREATION_DATE", nullable = false)
    @CreatedDate
    private LocalDateTime creationDate;

    @Column(name = "UPDATE_DATE")
    @LastModifiedDate
    private LocalDateTime updateDate;

    public Pagamento() {
    }

    public Pagamento(Integer idPedido, String idEstudante,  BigDecimal totalPedido, PagamentoStatus status) {
        this.idPedido = idPedido;
        this.idEstudante = idEstudante;
        this.totalPedido = totalPedido;
        this.status = status;
    }

    public Pagamento(Integer id, Integer idPedido, BigDecimal totalPedido, String idEstudante, PagamentoStatus status,
                   LocalDateTime creationDate, LocalDateTime updateDate) {
        this.id = id;
        this.idPedido = idPedido;
        this.totalPedido = totalPedido;
        this.idEstudante = idEstudante;
        this.status = status;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }


  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdPedido() {
    return this.idPedido;
  }

  public void setIdPedido(Integer idPedido) {
    this.idPedido = idPedido;
  }

  public BigDecimal getTotalPedido() {
    return this.totalPedido;
  }

  public void setTotalPedido(BigDecimal totalPedido) {
    this.totalPedido = totalPedido;
  }

  public String getIdEstudante() {
    return this.idEstudante;
  }

  public void setIdEstudante(String idEstudante) {
    this.idEstudante = idEstudante;
  }

  public PagamentoStatus getStatus() {
    return this.status;
  }

  public void setStatus(PagamentoStatus status) {
    this.status = status;
  }

  public LocalDateTime getCreationDate() {
    return this.creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDateTime getUpdateDate() {
    return this.updateDate;
  }

  public void setUpdateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
  }
    
}