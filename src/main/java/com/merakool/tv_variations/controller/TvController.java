package com.merakool.tv_variations.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Data
@RestController
@RequestMapping("/goCash")

public class TvController {

    //GET method VTpass variation codes for DSTV bouquets can be accessed with the endpoint
    @GetMapping("/dstv")
    public List<Object> getTvVariations(){
        String uri = "https://api-service.vtpass.com/api/service-variations?serviceID=dstv";
        RestTemplate restTemplate = new RestTemplate();
//        Object[] objects = (Object[]) restTemplate.getForObject(uri,Object.class);
        Object[] objects = new Object[] {restTemplate.getForObject(uri,Object.class)};
        return Arrays.asList(objects);
    }


}
