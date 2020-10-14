package com.bala.TTSUtility.speech;

import com.bala.TTSUtility.bean.SpeechDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Balaji Achanta
 */
@RestController
@Slf4j
public class SpeechController {

    @PostMapping("/convert/en")
    public void convertEngText(@RequestBody SpeechDetails speechDetails){

        log.info("{}",speechDetails);
        log.info("received request");
    }

}

