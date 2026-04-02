package test;

import main.RomanConvert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanConvertTest
{
    private final RomanConvert converter = new RomanConvert();


    @Test
    void convertit_les_valeurs_simples() {
        assertEquals("I", converter.toRoman(1));
        assertEquals("V", converter.toRoman(5));
        assertEquals("X", converter.toRoman(10));
        assertEquals("M", converter.toRoman(1000));
    }

    @Test
    void convertit_les_valeurs_double_ou_triple() {
        assertEquals("II", converter.toRoman(2));
        assertEquals("XX", converter.toRoman(20));
        assertEquals("MMM", converter.toRoman(3000));
    }


    @Test
    void gere_les_cas_soustractifs() {
        assertEquals("IV", converter.toRoman(4));
        assertEquals("IX", converter.toRoman(9));
        assertEquals("XL", converter.toRoman(40));
        assertEquals("XC", converter.toRoman(90));
        assertEquals("CD", converter.toRoman(400));
        assertEquals("CM", converter.toRoman(900));
    }

    @Test
    void gere_les_combinaisons() {
        assertEquals("XIV", converter.toRoman(14));
        assertEquals("XCIX", converter.toRoman(99));
        assertEquals("MCMXCIV", converter.toRoman(1994));
        assertEquals("MMXXVI", converter.toRoman(2026));
        assertEquals("MMMCMXCIX", converter.toRoman(3999));
    }
}
