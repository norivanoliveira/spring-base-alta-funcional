package br.com.itau.cobranca.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.itau.cobranca.jpa.entity")
@EnableJpaRepositories("br.com.itau.cobranca.jpa.repo")
@ComponentScan({"br.com.itau.cobranca.rest","br.com.itau.cobranca.service"})
public class BoletoApp {

    public static void main(String[] args) {
        SpringApplication.run(BoletoApp.class, args);
    }

}
