package main.com.fisa;

import main.com.fisa.controller.SemanticAnalyzer;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Unidades Intergalacticas");
        SemanticAnalyzer sA = new SemanticAnalyzer();
        System.out.println("resultado " + sA.subtractionAnalyzer("I","L"));
        System.out.println("resultado es mayor" + sA.orderNumber("M","D"));
        sA.repeatedSymbols("MDCCCLIV");
    }
}
