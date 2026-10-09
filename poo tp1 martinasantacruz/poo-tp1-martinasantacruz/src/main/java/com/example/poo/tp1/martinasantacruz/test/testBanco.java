package com.example.poo.tp1.martinasantacruz.test;

import com.example.poo.tp1.martinasantacruz.cheque.cheque;
import com.example.poo.tp1.martinasantacruz.cliente.clienteEmpresa;
import com.example.poo.tp1.martinasantacruz.cliente.clienteIndividual;
import com.example.poo.tp1.martinasantacruz.cuenta.cajaDeAhorro;
import com.example.poo.tp1.martinasantacruz.cuenta.cuentaConvertibilidad;
import com.example.poo.tp1.martinasantacruz.cuenta.cuentaCorriente;

public class testBanco { 
//la clase pueda ser accesible desde otras clases


    public static void main(String[] args) {


// Creo los clientes
        clienteIndividual clienteIndividual =
                new clienteIndividual(1, "Martina", "Santa Cruz", "12345678");


        clienteEmpresa clienteEmpresa =
                new clienteEmpresa(2, "Matufia", "27-12345678-9");




// Creo un cheque
        cheque cheque =
                new cheque(5000, "Banco Galicia", "30/09/2026");




// Creo y pruebo una caja de ahorro
        cajaDeAhorro caja =
                new cajaDeAhorro(1001, 10000, clienteIndividual, 0.05f);
                // 5% de tasa de interés, tipo float (expresado en decimal)


        caja.depositar(5000);
        caja.extraer(2000);
        caja.aplicarTasaInteres();




// Creo y pruebo una cuenta corriente
        cuentaCorriente cuentaCorriente =
                new cuentaCorriente(2001, 10000, clienteIndividual, 5000);


        cuentaCorriente.depositar(3000);
        cuentaCorriente.depositarEfectivo(2000);
        cuentaCorriente.extraer(4000);




// Creo y pruebo una cuenta convertibilidad
        cuentaConvertibilidad cuentaConvertibilidad =
                new cuentaConvertibilidad(3001, 20000, clienteEmpresa, 5000, 1000);


        cuentaConvertibilidad.depositar(3000);
        cuentaConvertibilidad.depositarEfectivo(2000);
        cuentaConvertibilidad.extraer(4000);
        cuentaConvertibilidad.depositarDolares(100);
        cuentaConvertibilidad.extraerDolares(50);
        cuentaConvertibilidad.convertirPesosADolar(1000, 1000);
        cuentaConvertibilidad.convertirDolarAPeso(50, 1000);




// Muestro los resultados
        System.out.println(clienteIndividual);
        System.out.println(clienteEmpresa);
        System.out.println(cheque);
        System.out.println(caja);
        System.out.println(cuentaCorriente);
        System.out.println(cuentaConvertibilidad);
    }
}
