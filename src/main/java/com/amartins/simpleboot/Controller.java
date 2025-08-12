package com.amartins.simpleboot;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping
    public String home() {
        String test = "Hello!";
        logger.info("HOME");
        logger.info("Starting home screen");
        return "Hello World";
    }

    @GetMapping("/warning")
    public String warning() {
        logger.info("WARNING");
        logger.warn("SQL Query taking more than 5 minutes to return data");
        return "SQL Query";
    }

    @GetMapping("/errors")
    public String error() {
        logger.info("ERROR");
        logger.error("Rest client error");
        return "Rest client error";
    }

    @GetMapping(value = "/debug", params = { "user" })
    public String debug(String user) {
        logger.info("DEBUG");
        logger.debug("User: {}", user);
        return "Debugging";
    }

}
