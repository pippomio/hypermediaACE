package it.polimi.aip.javisti.controller.aree_tematiche;

import java.util.List;

import it.polimi.aip.javisti.model.Tema;
import it.polimi.aip.javisti.service.TemaService;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TutteLeAreeController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        TemaService temaService = new TemaService();
        List<Tema> listaTemi = temaService.getAllThemes();
        requestScope("listaTemi", listaTemi);
        System.out.println(listaTemi);
        return forward("TutteLeAree.jsp");
    }
}
