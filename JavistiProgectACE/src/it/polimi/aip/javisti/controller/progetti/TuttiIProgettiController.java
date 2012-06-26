package it.polimi.aip.javisti.controller.progetti;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TuttiIProgettiController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("TuttiIProgetti.jsp");
    }
}
