package br.com.itau.cobranca.mapper;

import br.com.itau.cobranca.domain.BoletoDomain;
import br.com.itau.cobranca.jpa.entity.Boleto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoletoMapper {

    BoletoMapper INSTANCE = Mappers.getMapper( BoletoMapper.class );

    Boleto mapRequestParaEntidade(BoletoDomain Boleto);

}