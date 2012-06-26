package it.polimi.aip.javisti.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RisultatoOttenutoTest extends AppEngineTestCase {

    private RisultatoOttenuto model = new RisultatoOttenuto();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
