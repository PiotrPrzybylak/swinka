package org.masteukodeu.swinka;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SwinkaController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
