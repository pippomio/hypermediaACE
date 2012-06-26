package it.polimi.aip.javisti.controller.partners;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TuttiITeamLeaderControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/partners/TuttiITeamLeader");
        TuttiITeamLeaderController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/partners/TuttiITeamLeader.jsp"));
    }
}
