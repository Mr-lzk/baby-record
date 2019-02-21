package com.gzly.baby.record.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lzk
 * @date 2019/2/18
 */
@Controller
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }
}
