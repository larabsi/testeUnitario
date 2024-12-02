import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class DescontoTest {
    DescontoTest descontoTest;

    @BeforeEach
    void setUp() {
        descontoTest = new DescontoTest();

    }


    @Test
    public void testeDeveGerarDesconto10() {
        Desconto desconto = new Desconto("Masculino", "DESCONTO10");
        assertEquals("-10%", desconto.definirDesconto());

    }

    @Test
    public void testeMasculinoDeveGerarCupomInvalido() {
        Desconto desconto = new Desconto("Masculino", " ");
        assertEquals("Sem cupom válido", desconto.definirDesconto());

    }

    @Test
    public void testeFemininoDeveGerarCupomMesDaMulher() {
        Desconto desconto = new Desconto("Feminino", "MESDAMULHER");
        assertEquals("-30%", desconto.definirDesconto());

    }

    @Test
    public void testeFemininoDeveGerarCupom15() {
        Desconto desconto = new Desconto("Feminino", "PERFUME15");
        assertEquals("15% OFF em perfumes", desconto.definirDesconto());

    }

    @Test
    public void testeFemininoDeveGerarCupomInvalido() {
        Desconto desconto = new Desconto("Feminino", " ");
        assertEquals("Sem cupom válido", desconto.definirDesconto());

    }

    @Test
    public void testeFemininoDeveGerarCupomInvalido2() {
        try {
            Desconto desconto = new Desconto(" ", " ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo invalido", e.getMessage());
        }


    }

}