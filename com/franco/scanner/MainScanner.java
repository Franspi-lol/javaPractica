package com.franco.scanner;

public class MainScanner {
    public static void main(String[] args) {
        ScannerClass scanner = new ScannerClass();
        scanner.ScannerNumero();
        System.out.println(scanner.getNumero());
        scanner.getScanner().nextLine();//limpiar buffer
        scanner.ScannerNombre();
        System.out.println(scanner.getNombre());
        //scanner.getScanner().nextLine();//limpiar buffer//solo hace falta con el numero

        scanner.getScanner().close();//cerrar scanner
    }
}
