package br.com.itau.cobranca.jpa.repo;

import br.com.itau.cobranca.jpa.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


@Repository
public interface BoletoRepositoy extends JpaRepository<Boleto, Integer>  {

}
