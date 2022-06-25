package br.com.bancox.cobranca.jpa.repo;

import br.com.bancox.cobranca.jpa.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoletoRepositoy extends JpaRepository<Boleto, Integer>  {

}
