package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Session")
public class SessionController {



    @RequestMapping("/set")
    @ResponseBody
    public String set(HttpSession httpSession) {

        httpSession.setAttribute("username", "admin");

        return "ok";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(HttpSession httpSession) {

        Object v= httpSession.getAttribute("username");
        if(v==null)
        {
            return "null";
        }
        else
        {
            return v.toString()+"6";
        }

    }


}
