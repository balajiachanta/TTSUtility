package com.bala.TTSUtility.speech;

import com.bala.TTSUtility.bean.SpeechDetails;
import com.bala.TTSUtility.tts.util.TextToSpeech;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

/**
 * @author Balaji Achanta
 */
@RestController
@Slf4j
public class SpeechController {

    @CrossOrigin
    @PostMapping("/convert/en")
    public void convertEngText(@RequestBody SpeechDetails speechDetails){

        log.info("{}",speechDetails);
        log.info("received request");
        TextToSpeech tts = new TextToSpeech();
        tts.getAvailableVoices().stream().forEach(v -> System.out.println(v));
        tts.speak(speechDetails.getText(),2.0f,false,true);
        tts.speak("if you like my Text to speech please like ..",2.0f,false,false);
    }
}

