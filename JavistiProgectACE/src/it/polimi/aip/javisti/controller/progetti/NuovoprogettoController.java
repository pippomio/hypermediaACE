package it.polimi.aip.javisti.controller.progetti;

import it.polimi.aip.javisti.service.progettoService;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.util.RequestLocator;

public class NuovoprogettoController extends Controller {

    @Override
    public Navigation run() throws Exception {
     
        System.out.println(" sono nuovo progetto controller ");
        HttpServletRequest request = RequestLocator.get();
        
        String nome=null;
        String descrizione=null;
        String tema=null;
       
   
       for( @SuppressWarnings("rawtypes")
               Enumeration en = request.getAttributeNames(); en.hasMoreElements() ;)
       {
           String attrName = en.nextElement().toString();
           String value= request.getAttribute(attrName).toString();
           System.out.println( "attrName = " + attrName + " value = "  + value );
           if(attrName.equalsIgnoreCase("nome"))
               nome=value;
           if(attrName.equalsIgnoreCase("descrizione"))
               descrizione=value;
           if(attrName.equalsIgnoreCase("tema"))
               tema=value;
          
       }
       
       
       
       progettoService progService = new progettoService();
       progService.addProgetto(nome, descrizione, tema);
        
       return redirect(this.basePath);
    }
}
