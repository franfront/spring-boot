package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{

    @Override
    public String operacion(){
        return "ejecutando algun proceso importante simple...";
    }

}
