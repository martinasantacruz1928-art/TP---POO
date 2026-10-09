package com.example.poo.tp1.martinasantacruz.cuenta;


import com.example.poo.tp1.martinasantacruz.cliente.cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


// Es una clase ABSTRACTA que sirve como base para otras clases
// (CuentaCorriente, CajaDeAhorro y CuentaConvertibilidad).


@Getter // genera los métodos para consultar los atributos
@ToString // genera toString() para mostrar los datos del objeto
@AllArgsConstructor // genera un constructor con todos los atributos


public abstract class cuenta {


    private final int nroCuenta;


    @Setter
    private float saldo;


    private final cliente cliente;


    public abstract void depositar(float monto); // ingresar dinero


    public abstract void extraer(float monto); // extraer dinero
}


// depositar y extraer son abstractos y las clases hijas los implementan.
// nroCuenta y cliente son final porque no se pueden modificar.


