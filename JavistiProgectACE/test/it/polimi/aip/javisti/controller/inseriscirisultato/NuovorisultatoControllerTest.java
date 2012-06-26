package it.polimi.aip.javisti.controller.inseriscirisultato;

import it.polimi.aip.javisti.controller.inserisciRisultati.NuovorisultatoController;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class NuovorisultatoControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/inseriscirisultato/nuovorisultato");
        NuovorisultatoController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is(nullValue()));
    }
}
