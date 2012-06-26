package it.polimi.aip.javisti.controller;

import it.polimi.aip.javisti.service.progettoService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import org.slim3.util.RequestMap;

public class InserimentoProgettoController extends Controller {

    private progettoService service = new progettoService();
    
    @Override
    public Navigation run() throws Exception {
        System.out.println("sono qua");
        service.addProgetto(new RequestMap(this.request));
        return redirect(this.basePath);
    }
}
