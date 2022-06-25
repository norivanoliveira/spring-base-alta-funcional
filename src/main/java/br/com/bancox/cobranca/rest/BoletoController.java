package br.com.itau.cobranca.rest;

import br.com.itau.cobranca.domain.BoletoDomain;
import br.com.itau.cobranca.jpa.entity.Boleto;
import br.com.itau.cobranca.service.BoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@RestController
public class BoletoController {

    @Autowired
    BoletoService service;

    @RequestMapping("/")
    public String inicial() {
        return "<center><img src='https://logospng.org/download/itau/logo-itau-256.png'> </img><p>Bem vindo a baixa plataforma ;)</p></center>";
    }

    @GetMapping(value = "/boletos/{id}")
    public Boleto obterBoleto(@PathVariable Integer id){
        return service.detalharBoleto(id);
    }

    @GetMapping(value = "/boletos")
    public List<Boleto> obterBoletos(){
        return service.obterTodosBoletos();
    }

    @PostMapping(value = "/boletos")
    public Boleto criarBoleto(@RequestBody BoletoDomain request) {

        Boleto boleto =  new Boleto();
        boleto.setBeneficiario(request.getBeneficiario());
        boleto.setValor(new BigDecimal(request.getValor()));


        return service.salvarBoleto(boleto);

    }

}
