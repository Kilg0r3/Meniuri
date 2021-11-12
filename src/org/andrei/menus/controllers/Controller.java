package org.andrei.menus.controllers;

import org.andrei.menus.services.XMLProducerService;

public class Controller {

    private XMLProducerService xmlProducerService;

    public Controller() {
        xmlProducerService = new XMLProducerService();
    }

    public void produceXML() {
        xmlProducerService.produceXML();
    }

}
