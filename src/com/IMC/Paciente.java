package com.IMC;

import java.text.DecimalFormat;

public class Paciente {
    private final Double peso;
    private final Double altura;
    private final Double imc;
    private String diagnostico;



    public Paciente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
        imc = peso / (altura * altura);
        diagnostico = null;
    }


    public Object diagnostico(Paciente paciente) {

        if (imc < 16) {
            System.out.println("Baixo peso muito grave, seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Baixo peso muito grave";
        }


        if (imc >= 16 && imc <= 16.99) {
            System.out.println("Baixo peso grave, seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Baixo peso grave";
        }


        if (imc >= 17 && imc <= 18.49) {
            System.out.println("Baixo peso, seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Baixo peso";
        }


        if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("Peso normal, seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Peso normal";
        }


        if (imc >= 25 && imc <= 29.99) {
            System.out.println("Sobrepeso , seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Sobrepeso";
        }


        if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade grau I, seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Obesidade grau I";
        }


        if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade grau II, seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Obesidade grau II";
        }


        if (imc >= 40) {
            System.out.println("Obesidade grau III (obesidade mórbida), seu IMC é : " + new DecimalFormat("#,##0.00").format(imc));
            diagnostico = "Obesidade grau III";
        }
        return diagnostico;
    }
    public Double getImc() {
        return imc;
    }

}
