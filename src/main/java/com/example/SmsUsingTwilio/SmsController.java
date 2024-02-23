package com.example.SmsUsingTwilio;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SmsController {
    @Autowired
    private SmsService smsService;

    @PostMapping("/sendSms")
    public String sendSms(@RequestBody SmsDetails smsDetails) {

        smsService.sendSms(smsDetails.getTo(), smsDetails.getMessage());
        return "SMS Sent Successfully";

    }
}
