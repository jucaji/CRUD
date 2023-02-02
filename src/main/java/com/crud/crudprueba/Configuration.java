package com.crud.crudprueba;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

/**
 * Clase de configuracion para ModelMapper
 * @author Julian Jimenez
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    /**
     * Metodo para crear un bean de ModelMapper
     * @return ModelMapper
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
