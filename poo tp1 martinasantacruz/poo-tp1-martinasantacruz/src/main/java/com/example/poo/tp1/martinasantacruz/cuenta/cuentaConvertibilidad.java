package com.example.poo.tp1.martinasantacruz.cuenta;


import com.example.poo.tp1.martinasantacruz.cliente.clienteEmpresa;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter // consulta los atributos
@ToString(callSuper = true) // muestra también los datos heredados


public class cuentaConvertibilidad extends cuentaCorriente {


    @Setter
    private float saldoDolares; // saldo disponible en dólares


    public cuentaConvertibilidad(
            int nroCuenta,
            float saldo,
            clienteEmpresa cliente,
            float montoAutorizado,
            float saldoDolares) {


        super(nroCuenta, saldo, cliente, montoAutorizado);
        this.saldoDolares = saldoDolares;
    }


    // Deposita dinero en el saldo en dólares
    public void depositarDolares(float cantidad) {
        if (cantidad > 0) {
            setSaldoDolares(getSaldoDolares() + cantidad);
        }
    }


    // Extrae dinero del saldo en dólares
    public void extraerDolares(float cantidad) {
        if (cantidad > 0 && cantidad <= getSaldoDolares()) {
            setSaldoDolares(getSaldoDolares() - cantidad);
        }
    }


    // Convierte pesos a dólares usando una tasa recibida como parámetro
    public void convertirPesosADolar(float cantidad, float tasa) {
        if (cantidad > 0 && tasa > 0) {
            float dolares = cantidad / tasa;
            setSaldoDolares(getSaldoDolares() + dolares);
        }
    }


    // Convierte dólares a pesos usando una tasa recibida como parámetro
    public void convertirDolarAPeso(float cantidad, float tasa) {
        if (cantidad > 0 && tasa > 0) {
            float pesos = cantidad * tasa;
            setSaldo(getSaldo() + pesos);
        }
    }
}


