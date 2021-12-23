package ISO2.PrimerProblema;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrincipalTest {

	@Test
	public  void primerTest() {
		Principal principal =new Principal();
		String resultado=principal.ejercicio1(true, false, false, true, true, true, false, true, true, -1, 5, 1200, 1300, 802, 934, 1000, 1003, 500, 548);
		assertEquals(resultado,"Lo mejor es quedarse en casa. ");
	}

}
