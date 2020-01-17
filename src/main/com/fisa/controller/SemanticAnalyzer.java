package main.com.fisa.controller;


import main.com.fisa.model.RomanNumber;
import main.com.fisa.model.RomanNumerals;


public class SemanticAnalyzer {

    RomanNumerals rN = new RomanNumerals();


    public void repeatedSymbols(String sentence) {
        for (String symbol : rN.getSymbols()) {
            long total = sentence.chars()
                    .mapToObj(i -> (char) i)
                    .filter((l) -> l == symbol.charAt(0))
                    .count();
            System.out.println("SIMBOlo :" + symbol + " : " + total);
        }
    }



    public boolean orderNumber(String firstSymbol, String secondSymbol){
        return (rN.getValueRomanNumber(firstSymbol) > rN.getValueRomanNumber(secondSymbol));
    }

    public boolean subtractionAnalyzer(String firstSymbol, String secondSymbol){
        if(firstSymbol.equals("I")){ return (secondSymbol.equals("V") || secondSymbol.equals("X"));
        }
        if(firstSymbol.equals("X")){ return (secondSymbol.equals("L") || secondSymbol.equals("C"));
        }
        if(firstSymbol.equals("C")){ return (secondSymbol.equals("D") || secondSymbol.equals("M"));
        }
        return false;
    }
}
