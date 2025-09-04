package test;

import calculadora.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculadoraTest extends Object {

    @org.junit.jupiter.api.Test
    void soma () {
        Calculadora calc = new Calculadora();
        assertEquals (4.0, calc.soma (1.0, 3.0), "Deve dar 4 como resultado.");

    }
    @Test
    void subtracao () {
        Calculadora calc = new Calculadora();
        assertEquals(3.0, calc.subtracao(5.0, 2.0), "Deve dar 3 como resultado");
    }
    @Test
    void multiplicacao () {
        Calculadora calc = new Calculadora();
        assertEquals(6.0, calc.multiplicacao(2.0, 3.0), "Deve dar 6 como resultado.");
    }
    @Test
    void divisao () {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.divisao(10.0, 5.0), "Deve dar 2 como resultado");

    }
    @Test
    void potenciacao () {
        Calculadora calc = new Calculadora();
        assertEquals(4.0, calc.potenciacao(2.0, 2.0), "Deve dar 4 como resultado");
    }
}