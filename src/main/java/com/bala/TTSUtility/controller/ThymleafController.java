package com.bala.TTSUtility.controller;

import com.bala.TTSUtility.bean.SpeechDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Balaji Achanta
 */
@Controller
@Slf4j
public class ThymleafController {


    @GetMapping("/")
    public String homepage(HttpServletRequest request, Map<String,Object> model, @RequestHeader HttpHeaders headers){
       /* headers.forEach((key, value) -> {
            log.info(String.format(
                    "Header '%s' = %s", key, value.stream().collect(Collectors.joining("|"))));
        });*/
        return "home";
    }

}
