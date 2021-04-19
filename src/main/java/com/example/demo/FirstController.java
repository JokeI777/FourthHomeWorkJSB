package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;


@Controller
public class FirstController {

    @GetMapping("/get_Headers")
    public String getHeaders(Model model, HttpServletRequest request){
        var headers = new StringBuilder();
        var headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            headers.append(headerName);
            headers.append(": ");
            headers.append(request.getHeader(headerName) + ";");
        }
        model.addAttribute("html", headers.toString());

        return "html";
    }
}