package com.regurus.shomeserver.control;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.regurus.shomeserver.mqtt.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttCotroller {
    @Autowired
    MqttGateway mqtGateway;
    @PostMapping("/sendMessage")
    public ResponseEntity<?> publish(@RequestBody String mqttMessage){

        try {
            JsonObject convertObject = new Gson().fromJson(mqttMessage, JsonObject.class);
            mqtGateway.sendToMqtt(convertObject.get("message").getAsString(), convertObject.get("topic").getAsString());
            return ResponseEntity.ok("Success");
        }catch(Exception ex) {
            ex.printStackTrace();
            return ResponseEntity.ok("fail");
        }
    }
}
