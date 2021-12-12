package com.ufps.microservice.tutoring.tutoring.infraestructura.endpoint.tutoria;

import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.tutoria.ManejadorGuardarTutorias;
import com.ufps.microservice.tutoring.tutoring.dominio.modelo.Tutoria;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.ufps.microservice.tutoring.comun.infraestructura.utils.PersonalizedNameCustomer.REST_CONTROLADOR;
import static com.ufps.microservice.tutoring.comun.infraestructura.utils.PersonalizedNameCustomer.REST_SAVE;
import static com.ufps.microservice.tutoring.comun.infraestructura.utils.PersonalizedNameCustomer.REST_TUTORIA;

@RestController
@RequestMapping(REST_CONTROLADOR+REST_TUTORIA)
@RequiredArgsConstructor
@Validated
@CrossOrigin(origins = "*")
public class EndPointGuardarTutoria {

    @Autowired
    private ManejadorGuardarTutorias manejadorGuardarTutorias;

    //---GUARDAR---
    @PostMapping(REST_SAVE)
    @ApiOperation("guarda una tutoria")
    @ApiResponse(code = 201, message = "CREATED")
    public ResponseEntity<Tutoria> save(@RequestBody Tutoria tutoria) throws NotFoundException {
        manejadorGuardarTutorias.guardar(tutoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
