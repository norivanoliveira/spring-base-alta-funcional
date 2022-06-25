package br.com.bancox.cobranca.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoletoDomain {

    private String beneficiario;
    private String valor;
}
