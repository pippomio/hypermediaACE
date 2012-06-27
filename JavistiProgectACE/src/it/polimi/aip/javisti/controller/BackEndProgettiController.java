package it.polimi.aip.javisti.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class BackEndProgettiController extends Controller {

    //chiunque puo' sputtanare il mio progetto !!!
    @Override
    public Navigation run() throws Exception {
        //cococ
        return forward("BackEndProgetti.jsp");
    }
}
