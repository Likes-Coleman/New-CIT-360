/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleman
 */
import java.util.HashMap;
//import java.util.logging.Handler;

public class appController {

    private HashMap<String, Handler> handlerMap = new HashMap();

    public void handleRequest(String command, HashMap<String, Object> data) {
        Handler commandHandler = handlerMap.get(command);
        if (commandHandler != null) {
            commandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, Handler acHandler) {
        handlerMap.put(aCommand, acHandler);
    }

}