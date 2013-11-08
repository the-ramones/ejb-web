package org.retail.web;

import java.security.Principal;
import java.util.Locale;
import javax.enterprise.inject.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.retail.system.RetailConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Paul Kulitski
 */
@Controller
public class MainPageController extends BaseController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
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
}
