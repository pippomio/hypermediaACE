package it.polimi.aip.javisti.controller;

import it.polimi.aip.javisti.service.progettoService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ProgettoControllerController extends Controller {

    @Override
    public Navigation run() throws Exception {
        String descrizione;
        progettoService service = new progettoService();
        
        descrizione = service.getDescrizioneProgetto();
        
        requestScope("descrizione", descrizione);
        return forward("ProgettoController.jsp");
    }
}
