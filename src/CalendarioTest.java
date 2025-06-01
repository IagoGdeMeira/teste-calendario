import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import paranavai.calendario.Calendario;

public class CalendarioTest {
    @Test
    public void testSemParametros() {
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario();
        assertNotNull(resultado);
        System.out.println(resultado);
    }

    @Test
    public void testComUmParametro() {
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario("2020");
        assertTrue(resultado.contains("2020"));
        System.out.println(resultado);
    }

    @Test
    public void testComDoisParametros() {
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario("4", "2020");
        assertTrue(resultado.contains("Abril 2020"));
        System.out.println(resultado);
    }

    @Test
    public void testGregoriano() {
        Calendario calendario = new Calendario();
        String resultado = calendario.getCalendario("10", "1752");
        assertTrue(resultado.contains("Outubro 1752") && resultado.contains("4 15"));
        System.out.println(resultado);
    }
}