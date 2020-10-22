package br.com.fiap.spring.repository;

import br.com.fiap.spring.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    List<Pagamento> findByStudentIdAndUpdateDateBetween(String idEstudante, LocalDateTime startLocalDateTime, LocalDateTime endDate);
}
