package com.franco.scanner;

import java.util.Scanner;

public class ScannerClass {
    private int numero;
    private String nombre;
    private char letra;

    public ScannerClass() {
    }

    public void ScannerNumero() {//metodos publicos //metodo para escanear un numero
        Scanner scanner = new Scanner(System.in);
        this.numero = scanner.nextInt();
    }

    public int getNumero() {
        return numero;
    }

    public void ScannerNombre(){
        Scanner scanner = new Scanner(System.in);
        this.nombre = scanner.nextLine();
    }

    public String getNombre(){
        return nombre;
    }

    public void ScannerLetra(){
        Scanner scanner = new Scanner(System.in);
        this.letra = scanner.next().charAt(0);
    }

    public char getLetra(){
        return letra;
    }
}
