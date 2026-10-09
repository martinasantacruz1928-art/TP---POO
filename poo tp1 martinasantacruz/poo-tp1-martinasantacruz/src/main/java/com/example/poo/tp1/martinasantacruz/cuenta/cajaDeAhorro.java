package com.example.poo.tp1.martinasantacruz.cuenta;


import com.example.poo.tp1.martinasantacruz.cliente.cliente;

import lombok.Getter;
import lombok.Setter;


@Getter // consulta los atributos
public class cajaDeAhorro extends cuenta {


    @Setter
    private float tasaInteres; // tasa de interés de la caja de ahorro


    public cajaDeAhorro(int nroCuenta, float saldo, cliente cliente, float tasaInteres) {
        super(nroCuenta, saldo, cliente); // llama al constructor de la clase padre
        this.tasaInteres = tasaInteres;
    }


    @Override // redefine el método depositar() del padre
    public void depositar(float monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
        }
    }


    @Override // redefine el método extraer() del padre
    public void extraer(float monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        }
    }


    public void aplicarTasaInteres() {
        float saldoActual = getSaldo();


        // Calcula el interés y lo suma al saldo
        setSaldo(saldoActual + (saldoActual * tasaInteres));
    }
}
