package it.polimi.aip.javisti.controller.cpage;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class InsallControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/cpage/insall");
        
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/cpage/insall.jsp"));
    }
}
