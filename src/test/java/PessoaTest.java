import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void testeFemininoAbaixoPeso() {
        Pessoa pessoa = new Pessoa(19, "Feminino", 1);
        assertEquals("Abaixo do peso", pessoa.calcularImc());

    }

    @Test
    public void testeFemininoPesoNormal() {
        Pessoa pessoa = new Pessoa(25.7, "Feminino", 1);
        assertEquals("Peso normal", pessoa.calcularImc());

    }

    @Test
    public void testeFemininoMarginalmenteAcimaPeso() {
        Pessoa pessoa = new Pessoa(27.2, "Feminino", 1);
        assertEquals("Marginalmente acima do peso", pessoa.calcularImc());

    }

    @Test
    public void testeFemininoAcimaPeso() {
        Pessoa pessoa = new Pessoa(32.2, "Feminino", 1);
        assertEquals("Acima do peso ideal", pessoa.calcularImc());

    }

    @Test
    public void testeFemininoObeso() {
        Pessoa pessoa = new Pessoa(32.3, "Feminino", 1);
        assertEquals("Obeso", pessoa.calcularImc());

    }

    @Test
    public void testeMasculinoAbaixoPeso() {
        Pessoa pessoa = new Pessoa(20.6, "Masculino", 1);
        assertEquals("Abaixo do peso", pessoa.calcularImc());

    }

    @Test
    public void testeMasculinoPesoNormal() {
        Pessoa pessoa = new Pessoa(26.3, "Masculino", 1);
        assertEquals("Peso normal", pessoa.calcularImc());

    }

    @Test
    public void testeMasculinoMarginalmenteAcimaPeso() {
        Pessoa pessoa = new Pessoa(27.7, "Masculino", 1);
        assertEquals("Marginalmente acima do peso", pessoa.calcularImc());

    }

    @Test
    public void testeMasculinooAcimaPeso() {
        Pessoa pessoa = new Pessoa(31, "Masculino", 1);
        assertEquals("Acima do peso ideal", pessoa.calcularImc());

    }

    @Test
    public void testeMasculinoObeso() {
        Pessoa pessoa = new Pessoa(31.1, "Masculino", 1);
        assertEquals("Obeso", pessoa.calcularImc());

    }

    @Test
    void deveRetornarExcecaoSexoInvalido() {

        try {
            pessoa.setSexo("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo invalido", e.getMessage());
        }

    }
}