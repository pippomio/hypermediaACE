package it.polimi.aip.javisti.controller.aree_tematiche;
import java.util.List;

import it.polimi.aip.javisti.model.Risultati;
import it.polimi.aip.javisti.model.Tema;

import javax.servlet.http.HttpServletRequest;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;
import org.slim3.util.RequestLocator;

import com.google.appengine.api.datastore.Key;

public class MostraTemaController extends Controller {

    @Override
    public Navigation run() throws Exception {
        
        System.out.println(" sono mostra tema controller ");
        HttpServletRequest request = RequestLocator.get();
        
        String id_tema = request.getAttribute("id_tema").toString();
        
        Key temaKey = Datastore.createKey(Tema.class, id_tema);
        Tema temaDaVisualizzare = Datastore.get(Tema.class, temaKey);
        
        List<Risultati> listaRisultatiTema =  temaDaVisualizzare.getRisultatiRef().getModelList();
        requestScope("tema", temaDaVisualizzare);
        requestScope("risultatiTema", listaRisultatiTema);
        
        return forward("MostraTema.jsp");
    }
}
