package com.wl.webdemo.controller;

import com.wl.webdemo.domain.City;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/v1")
public class DemoController {

    @RequestMapping(value = "/city/list",method = RequestMethod.GET)
    public ResponseEntity getCityList(){

        City city = new City();
        city.setCode(1);
        city.setName("上海");

        Map map = new HashMap();
        map.put("city",city);

        return new ResponseEntity(map,HttpStatus.OK);
    }

}
