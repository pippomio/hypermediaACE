package it.polimi.aip.javisti.controller.aree_tematiche;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TutteLeAreeController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("TutteLeAree.jsp");
    }
}
