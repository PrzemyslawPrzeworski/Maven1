package pl.coderslab;

import org.apache.log4j.Logger;


public class App {

    static Logger log = Logger.getLogger("pl.coderslab");//dostęp zawsze dlatego static

    public static void main(String[] args) {
        //log.debug("Test debug");
        log.error("Some error");
    }
}