package com.example.poo.tp1.martinasantacruz.cliente;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter // consulta los atributos
@Setter // permite modificar los atributos
@ToString(callSuper = true) // muestra también los datos heredados de Cliente


public class clienteEmpresa extends cliente {


    private String nombreFantasia; // nombre de fantasía de la empresa
    private String cuit; // CUIT de la empresa


    public clienteEmpresa(int nroCliente, String nombreFantasia, String cuit) {
        super(nroCliente); // llama al constructor de la clase padre
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
}


