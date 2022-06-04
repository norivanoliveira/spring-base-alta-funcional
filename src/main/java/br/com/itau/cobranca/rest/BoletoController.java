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

    @GetMapping("/boleto")
    public Boleto obterBoleto(@RequestParam(value = "id") Integer id) {
        // TODO: Início - Exercício 2: Pensando na realidade, o id do boleto não pode ser Inteiro. Tente resolver!
       return service.obterBoletoPorId(id);
        // TODO: Fim - Exercício 2: Pensando na realidade do banco, o id do boleto não pode ser Inteiro. Tente resolver!
    }

    @GetMapping("/lista")
    public List<Boleto> obterLstaBoleto() {

        return service.obterListaBoleto();
    }

    @PostMapping(value = "/boleto")
    public Boleto criarBoleto(BoletoDomain request) {

        // TODO: Início - Exercício 1: tente usar o BoletoMapper para criar o objeto Boleto ao invés de usar as linhas abaixo
        Boleto boleto =  new Boleto();
        boleto.setBeneficiario(request.getBeneficiario());
        boleto.setValor(new BigDecimal(request.getValor()));
        // TODO: Fim - Exercício 1.

        return service.salvarBoleto(boleto);

    }

}
