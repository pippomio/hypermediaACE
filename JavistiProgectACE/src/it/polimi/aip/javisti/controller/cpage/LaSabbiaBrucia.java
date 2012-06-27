package it.polimi.aip.javisti.controller.cpage;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class LaSabbiaBrucia extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("insall.jsp");
    }
}
