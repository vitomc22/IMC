package com.IMC;

public class Main {

    public static void main(String[] args) {
        Paciente pac = new Paciente(150.0,1.69);
        Paciente pac2 = new Paciente(80.0,1.69);
        Paciente pac3 = new Paciente(50.0,1.69);
        //pac.calcularIMC(pac.peso, pac.altura);
        pac.diagnostico(pac);
        pac2.diagnostico(pac2);
        pac3.diagnostico(pac3);
    }
}
