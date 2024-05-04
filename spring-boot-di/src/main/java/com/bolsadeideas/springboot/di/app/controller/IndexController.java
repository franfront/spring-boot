package com.bolsadeideas.springboot.di.app.controller;

import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private MiServicio servicio = new MiServicio();


    @GetMapping({ "/", "", "/index"})
    public String index(Model model) {

        model.addAttribute("objeto", servicio.operacion()); // se pasa el objeto a la vista

        return "index";
    }
}
