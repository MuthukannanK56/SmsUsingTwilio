package com.example.SmsUsingTwilio;

import com.twilio.*;
import com.twilio.rest.api.v2010.account.Message;

import com.twilio.type.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class SmsService {
    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String phoneNumber;

    public void sendSms(String to, String message) {
        Twilio.init(accountSid, authToken);
        Message.creator(
                        new PhoneNumber(to),
                        new PhoneNumber(phoneNumber),
                        message).create();
    }
}
