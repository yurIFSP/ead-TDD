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
}