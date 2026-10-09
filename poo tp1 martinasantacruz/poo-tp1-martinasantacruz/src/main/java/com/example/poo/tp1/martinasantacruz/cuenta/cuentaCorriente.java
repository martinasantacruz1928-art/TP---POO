package com.example.poo.tp1.martinasantacruz.cuenta;


import com.example.poo.tp1.martinasantacruz.cliente.cliente;

import lombok.Getter;
import lombok.Setter;


@Getter // consulta los atributos
public class cuentaCorriente extends cuenta {


    @Setter
    private float montoAutorizado; // dinero extra que puede utilizar la cuenta


    public cuentaCorriente(int nroCuenta, float saldo, cliente cliente, float montoAutorizado) {
        super(nroCuenta, saldo, cliente); // llama al constructor de la clase padre
        this.montoAutorizado = montoAutorizado;
    }


    @Override // redefine el método depositar() del padre
    public void depositar(float monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
        }
    }


    public void depositarEfectivo(float monto) {
        depositar(monto);
    }


    @Override // redefine el método extraer() del padre
    public void extraer(float monto) {


        // Permite extraer usando también el monto autorizado
        if (monto > 0 && monto <= getSaldo() + montoAutorizado) {
            setSaldo(getSaldo() - monto);
        }
    }
}


