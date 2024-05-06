package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miServicioComplejo")
@Primary // se le indica a Spring que este es el bean principal
public class MiServicioComplejo implements IServicio{

    @Override
    public String operacion(){
        return "ejecutando algun proceso importante complicado...";
    }

}
