package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static String ERROR = "Erro";
    public static void main(String[] args) {
        System.out.println(calcAcimaDaMedia(args));
    }
    public static String calcAcimaDaMedia(String[] args){

        if(args.length != 7){
            return ERROR;
        }
        Integer soma = 0;
        List<Integer> numeros = new ArrayList<>();
        for(var arg:args){
            try {
                Integer numero = Integer.parseInt(arg);
                soma += numero;
                numeros.add(numero);
            }
            catch (NumberFormatException e){
                return ERROR;
            }
        }

        Integer media = soma / 7;
        Integer acimaDaMedia = 0;
        for(var numero:numeros){
            if(numero > media){
                acimaDaMedia +=1;
            }
        }

        return acimaDaMedia.toString();
    };
}