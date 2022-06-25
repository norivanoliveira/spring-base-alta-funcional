package br.com.bancox.cobranca.mapper;

import br.com.bancox.cobranca.domain.BoletoDomain;
import br.com.bancox.cobranca.jpa.entity.Boleto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoletoMapper {

    BoletoMapper INSTANCE = Mappers.getMapper( BoletoMapper.class );

    Boleto mapRequestParaEntidade(BoletoDomain Boleto);

}