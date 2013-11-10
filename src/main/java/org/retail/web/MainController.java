package org.retail.web;

import java.security.Principal;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.retail.system.RetailConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Paul Kulitski
 */
@Controller
public class MainController extends BaseController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public ModelAndView showMainPage(HttpServletRequest request, HttpSession session,
            Locale locale, Model model) {
        ModelAndView mav = new ModelAndView("main");
        Principal principal = request.getUserPrincipal();
        if (principal != null && request.isUserInRole("GUEST")) {
            mav.addObject("user", "Guest");
        } else {
            mav.addObject(RetailConstants.VIEW_USER, principal);
        }
        return mav;
    }

    @RequestMapping(value = "/l", method = RequestMethod.GET)
    public ModelAndView showL(HttpServletRequest request, HttpSession session,
            Locale locale, Model model) {
        ModelAndView mav = new ModelAndView("l");
        return mav;
    }
}
