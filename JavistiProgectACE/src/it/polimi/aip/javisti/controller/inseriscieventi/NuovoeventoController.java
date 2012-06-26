package it.polimi.aip.javisti.controller.inseriscieventi;

import it.polimi.aip.javisti.service.EventoService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestMap;

public class NuovoeventoController extends Controller {

    @Override
    public Navigation run() throws Exception
    {
        EventoService service = new EventoService();
        service.addEvento(new RequestMap(this.request));
        return redirect(this.basePath);
    }
}
