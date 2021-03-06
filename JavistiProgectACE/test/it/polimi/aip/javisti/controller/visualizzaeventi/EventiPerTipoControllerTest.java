package it.polimi.aip.javisti.controller.visualizzaeventi;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class EventiPerTipoControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/visualizzaeventi/EventiPerTipo");
        EventiPerTipoController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/visualizzaeventi/EventiPerTipo.jsp"));
    }
}
