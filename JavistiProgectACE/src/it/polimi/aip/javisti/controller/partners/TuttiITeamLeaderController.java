package it.polimi.aip.javisti.controller.partners;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class TuttiITeamLeaderController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("TuttiITeamLeader.jsp");
    }
}
