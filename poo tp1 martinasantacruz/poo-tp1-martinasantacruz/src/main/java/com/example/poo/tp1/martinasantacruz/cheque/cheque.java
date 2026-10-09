package com.example.poo.tp1.martinasantacruz.cheque;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter // consulta los atributos
@Setter // permite modificar los atributos
@ToString // muestra los datos del cheque
@AllArgsConstructor // genera un constructor con todos los atributos


public class cheque {


    private double monto;
    private String bancoEmisor;
    private String fechaPago;
}


