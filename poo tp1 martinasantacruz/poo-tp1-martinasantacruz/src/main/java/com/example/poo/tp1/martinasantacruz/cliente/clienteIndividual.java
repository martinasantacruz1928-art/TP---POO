package com.example.poo.tp1.martinasantacruz.cliente;


import lombok.Getter;
import lombok.ToString;


@Getter // consulta los atributos
@ToString(callSuper = true) // muestra también los datos heredados de Cliente


public class clienteIndividual extends cliente {


    private String nombre;
    private String apellido;
    private String dni; // DNI del cliente individual


    // No hay @Setter: no quiero modificar los datos del cliente.


    public clienteIndividual(int nroCliente, String nombre, String apellido, String dni) {
        super(nroCliente); // llama al constructor de la clase padre
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}


