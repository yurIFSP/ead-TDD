package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void checarStrings(){
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{""}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"a"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"a", "11", "12", "13", "14", "15", "16"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "11", "12", "13", "14", "15", "a"}));
        assertEquals("0",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10", "10", "10", "10"}));
    }

    @Test
    void checarNumerosReais(){
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"1.0"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"1.0", "11", "12", "13", "14", "15", "16"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "11", "12", "13", "14", "15", "1.0"}));
        assertEquals("0",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10", "10", "10", "10"}));
    }

    @Test
    void checarTamanhoDoInput(){
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10","10"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "10", "10"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10","10"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10","10","10"}));
        assertEquals("0",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10","10","10","10"}));
        assertEquals("Erro",Main.calcAcimaDaMedia(new String[]{"10", "10", "10", "10","10","10","10","10"}));
    }

    @Test
    void checarCalculo(){
        //Exemplo 1: Entrada = 2 2 2 2 2 2 3 | Saída = 1
        assertEquals("1",Main.calcAcimaDaMedia(new String[]{"2", "2", "2", "2","2","2","3"}));
        //Exemplo 2: Entrada = 21 10 13 34 30 21 34 | Saída = 3
        assertEquals("3",Main.calcAcimaDaMedia(new String[]{"21", "10", "13", "34","30","21","34"}));
       //Exemplo 3: Entrada = 2 2 2 2 2 2 1| Saída = 6
        assertEquals("6",Main.calcAcimaDaMedia(new String[]{"2", "2", "2", "2","2","2","1"}));
    }
}