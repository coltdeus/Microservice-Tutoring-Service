package com.ufps.microservice.tutoring.tutoring.infraestructura.configuracion;

import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.categoria.ManejadorBuscarNombreCategorias;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.categoria.ManejadorEditarCategorias;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.categoria.ManejadorEliminarCategorias;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.categoria.ManejadorGuardarCategorias;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.categoria.ManejadorListarCategorias;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.tema.ManejadorBuscarNombreTemas;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.tema.ManejadorEditarTemas;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.tema.ManejadorEliminarTemas;
import com.ufps.microservice.tutoring.tutoring.aplicacion.manejador.tema.ManejadorGuardarTemas;
import com.ufps.microservice.tutoring.tutoring.dominio.repositorio.CategoriaRepositorioInterface;
import com.ufps.microservice.tutoring.tutoring.dominio.repositorio.TemaRepositorioInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracion {

    //Beans de categorias
    @Bean
    public ManejadorBuscarNombreCategorias  manejadorBuscarNombreCategorias(CategoriaRepositorioInterface categoriaRepositorioInterface){
        return new ManejadorBuscarNombreCategorias(categoriaRepositorioInterface);
    }

    @Bean
    public ManejadorEditarCategorias manejadorEditarCategorias(CategoriaRepositorioInterface categoriaRepositorioInterface){
        return new ManejadorEditarCategorias(categoriaRepositorioInterface);
    }

    @Bean
    public ManejadorEliminarCategorias manejadorEliminarCategorias(CategoriaRepositorioInterface categoriaRepositorioInterface){
        return new ManejadorEliminarCategorias(categoriaRepositorioInterface);
    }

    @Bean
    public ManejadorGuardarCategorias manejadorGuardarCategorias(CategoriaRepositorioInterface categoriaRepositorioInterface){
        return new ManejadorGuardarCategorias(categoriaRepositorioInterface);
    }

    @Bean
    public ManejadorListarCategorias manejadorListarCategorias(CategoriaRepositorioInterface categoriaRepositorioInterface){
        return new ManejadorListarCategorias(categoriaRepositorioInterface);
    }

    //Beans de Temas
    @Bean
    public ManejadorBuscarNombreTemas manejadorBuscarNombreTemas(TemaRepositorioInterface temaRepositorioInterface){
        return new ManejadorBuscarNombreTemas(temaRepositorioInterface);
    }

    @Bean
    public ManejadorEditarTemas manejadorEditarTemas(TemaRepositorioInterface temaRepositorioInterface){
        return new ManejadorEditarTemas(temaRepositorioInterface);
    }

    @Bean
    public ManejadorEliminarTemas manejadorEliminarTemas(TemaRepositorioInterface temaRepositorioInterface){
        return new ManejadorEliminarTemas(temaRepositorioInterface);
    }

    @Bean
    public ManejadorGuardarTemas manejadorGuardarTemas(TemaRepositorioInterface temaRepositorioInterface){
        return new ManejadorGuardarTemas(temaRepositorioInterface);
    }



}
