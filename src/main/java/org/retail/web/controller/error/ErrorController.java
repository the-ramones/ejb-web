package org.retail.web.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Paul Kulitski
 */
@Controller
public class ErrorController {

    @RequestMapping(value = "400", method = RequestMethod.GET)
    public String badrequest(Model model) {
        return "errors/400";
    }

    @RequestMapping(value = "403", method = RequestMethod.GET)
    public String missing(Model model) {
        return "errors/403";
    }

    @RequestMapping(value = "404", method = RequestMethod.GET)
    public String notfound(Model model) {
        return "errors/404";
    }

    @RequestMapping(value = "405", method = RequestMethod.GET)
    public String notallowed(Model model) {
        return "errors/405";
    }

    @RequestMapping(value = "500", method = RequestMethod.GET)
    public String internal(Model model) {
        return "errors/500";
    }

    @RequestMapping(value = "error", method = RequestMethod.GET)
    public String generror(Model model) {
        return "errors/error";
    }
}
