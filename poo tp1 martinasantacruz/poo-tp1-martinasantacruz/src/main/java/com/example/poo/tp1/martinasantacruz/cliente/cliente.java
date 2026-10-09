package com.example.poo.tp1.martinasantacruz.cliente;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


// Es una clase que sirve como base para las clases hijas
// (ClienteIndividual y ClienteEmpresa).


@Getter // genera el método para consultar nroCliente
@ToString // genera toString() para mostrar los datos del objeto
@AllArgsConstructor // genera un constructor que recibe nroCliente


public abstract class cliente {


    private final int nroCliente;
}


// No hay @Setter: no se puede modificar el número de cliente.


