package br.com.fiap.spring.repository;

import br.com.fiap.spring.entity.CartaoCredito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartaoCreditoRepository extends JpaRepository<CartaoCredito, Integer> {
    Page<CartaoCredito> findAll(Pageable pageable);
    CartaoCredito findByRegistration(String registro);
}
