package it.polimi.aip.javisti.controller.progetti;

import it.polimi.aip.javisti.model.Tema;
import it.polimi.aip.javisti.service.TemaService;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;


public class IndexController extends Controller {

    @Override
    public Navigation run() throws Exception
    {
        TemaService  temaService = new TemaService();
        List<Tema> tuttiTemi = temaService.getAllThemes();
        requestScope("listTemi", tuttiTemi);
        return forward("index.jsp");
    }
}
