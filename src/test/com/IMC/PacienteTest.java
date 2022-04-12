package test.com.IMC;

import com.IMC.Paciente;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Paciente Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>abr 11, 2022</pre>
 */
public class PacienteTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: diagnostico(Paciente paciente)
     */
    @Test
    public void testDiagnostico1() throws Exception {
        Paciente pac1 = new Paciente(40.0, 1.70);
        assertEquals(13.84, pac1.getImc(), 0.1);
        assertEquals("Baixo peso muito grave", pac1.diagnostico(pac1));
    }

    @Test
    public void testDiagnostico2() throws Exception {

        Paciente pac2 = new Paciente(49.0, 1.70);
        assertEquals(16.9, pac2.getImc(), 0.1);
        assertEquals("Baixo peso grave", pac2.diagnostico(pac2));
    }

    @Test
    public void testDiagnostico3() throws Exception {
        Paciente pac3 = new Paciente(50.0, 1.70);
        assertEquals(17.3, pac3.getImc(), 0.1);
        assertEquals("Baixo peso", pac3.diagnostico(pac3));
    }

    @Test
    public void testDiagnostico4() throws Exception {

        Paciente pac4 = new Paciente(80.0, 1.80);
        assertEquals(24.7, pac4.getImc(), 0.1);
        assertEquals("Peso normal", pac4.diagnostico(pac4));
    }

    @Test
    public void testDiagnostico5() throws Exception {

        Paciente pac5 = new Paciente(80.0, 1.70);
        assertEquals(27.6, pac5.getImc(), 0.1);
        assertEquals("Sobrepeso", pac5.diagnostico(pac5));
    }

    @Test
    public void testDiagnostico6() throws Exception {

        Paciente pac6 = new Paciente(90.0, 1.70);
        assertEquals(31.1, pac6.getImc(), 0.1);
        assertEquals("Obesidade grau I", pac6.diagnostico(pac6));
    }

    @Test
    public void testDiagnostico7() throws Exception {

        Paciente pac7 = new Paciente(105.0, 1.70);
        assertEquals(36.3, pac7.getImc(), 0.1);
        assertEquals("Obesidade grau II", pac7.diagnostico(pac7));
    }

    @Test
    public void testDiagnostico8() throws Exception {

        Paciente pac8 = new Paciente(150.0, 1.70);
        assertEquals(51.9, pac8.getImc(), 0.1);
        assertEquals("Obesidade grau III", pac8.diagnostico(pac8));
    }


}



