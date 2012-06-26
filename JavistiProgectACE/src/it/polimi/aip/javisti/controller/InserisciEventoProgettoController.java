package it.polimi.aip.javisti.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class InserisciEventoProgettoController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("inserisciEventoProgetto.jsp");
    }
}
