package com.tywl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HelloController
 * Package:com.tywl.controller
 * Description: <br/>
 *
 * @date:2020/3/20 9:19
 * @author:huchuang
 */

@RestController
public class HelloController {


    @RequestMapping("info")
    public String info()
    {
        return "Hello SpringBoot Info";
    }

    //开发人员写了一句话

    public void print()
    {
        System.out.println("Hello controller");
    }


}
