package com.ufps.microservice.tutoring.tutoring.infraestructura.endpoint.tema;

import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.tema.ManejadorGuardarTemas;
import com.ufps.microservice.tutoring.tutoring.dominio.modelo.Tema;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static com.ufps.microservice.tutoring.comun.infraestructura.utils.PersonalizedNameCustomer.REST_CONTROLADOR;
import static com.ufps.microservice.tutoring.comun.infraestructura.utils.PersonalizedNameCustomer.REST_SAVE;
import static com.ufps.microservice.tutoring.comun.infraestructura.utils.PersonalizedNameCustomer.REST_TEMA;

@RestController
@RequestMapping(REST_CONTROLADOR+REST_TEMA)
@RequiredArgsConstructor
@Validated
@CrossOrigin(origins = "*")
public class EndPointGuardarTema {

    @Autowired
    private ManejadorGuardarTemas manejadorGuardarTemas;

    //---GUARDAR---
    @PostMapping(REST_SAVE)
    @ApiOperation("guarda un tema")
    @ApiResponse(code = 201, message = "CREATED")
    public ResponseEntity<Tema> save(@RequestBody Tema tema) throws NotFoundException {
        Tema temaGuardar = manejadorGuardarTemas.guardar(tema);
        return new ResponseEntity<>(temaGuardar, HttpStatus.OK);
    }
}
