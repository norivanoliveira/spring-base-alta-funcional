package br.com.bancox.cobranca.service;

import br.com.bancox.cobranca.jpa.entity.Boleto;
import br.com.bancox.cobranca.jpa.repo.BoletoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BoletoService {
    @Autowired
    BoletoRepositoy repositoy;

    @Transactional
    public Boleto salvarBoleto(Boleto boleto){
        return repositoy.save(boleto);
    }

    public List<Boleto> obterTodosBoletos(){
        return repositoy.findAll();
    }

    public Boleto detalharBoleto(Integer id){
        return repositoy.findById(id).orElse(null);
    }
}
