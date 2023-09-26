package org.example;

public class Main {
    static String ERROR = "Erro";
    public static void main(String[] args) {
        System.out.println(calcAcimaDaMedia(args));
    }
    public static String calcAcimaDaMedia(String[] args){

        if(args.length != 7){
            return ERROR;
        }
        for(var arg:args){
            try {
                Integer.parseInt(arg);
            }
            catch (NumberFormatException e){
                return ERROR;
            }
        }

        return "0";
    };
}