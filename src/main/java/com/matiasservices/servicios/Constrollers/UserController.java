package com.matiasservices.servicios.Constrollers;

import com.matiasservices.servicios.Model.Cuota;
import com.matiasservices.servicios.Model.Usuario;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class UserController {

    @RequestMapping(value = "Usuario", method = RequestMethod.GET)
    public Usuario obtenerUsuario(){
        return new Usuario("Matias", "Figueroa",
                "Belgrano 5758");
    }

    @RequestMapping(value = "MiAmor", method = RequestMethod.GET)
    public Usuario miamor(){
        return obtenerUsuario();
    }

    @RequestMapping(value = "Cuota", method = RequestMethod.GET)
    public Cuota coutaTest(){
        Cuota cuota =  new Cuota(123, 2000, "Mayo", 0, 220801);
        return cuota;
    }
}
