package com.franco.scanner;

public class MainScanner {
    public static void main(String[] args) {
        ScannerClass scanner = new ScannerClass();
        scanner.ScannerNumero();
        System.out.println(scanner.getNumero());
        scanner.ScannerNombre();
        System.out.println(scanner.getNombre());
    }
}
