package com.franco.scanner;

import java.util.Scanner;

public class ScannerClass {
    private int numero;
    private String nombre;
    private char letra;
    private Scanner scanner;

    public ScannerClass() {//cuando se crea un objeto de esta clase se crea un scanner
        scanner = new Scanner(System.in);
    }

    public void ScannerNumero() {//metodos publicos //metodo para escanear un numero
        //scanner = new Scanner(System.in);
        this.numero = scanner.nextInt();
    }

    public int getNumero() {
        return numero;
    }

    public void ScannerNombre(){
        //scanner = new Scanner(System.in);
        this.nombre = scanner.nextLine();
    }

    public String getNombre(){
        return nombre;
    }

    public void ScannerLetra(){
        //scanner = new Scanner(System.in);
        this.letra = scanner.next().charAt(0);
    }

    public char getLetra(){
        return letra;
    }

    public Scanner getScanner() {//para retornar scanner para cerrarlo
        return scanner;
    }
}
