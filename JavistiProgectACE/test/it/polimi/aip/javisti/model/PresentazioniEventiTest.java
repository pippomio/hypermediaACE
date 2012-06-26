package it.polimi.aip.javisti.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PresentazioniEventiTest extends AppEngineTestCase {

    private PresentazioniEventi model = new PresentazioniEventi();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
