package com.mycompany.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import recentModels.models.Event;
import recentModels.models.FkBadgingEvent;

public class TestDeserialisationFkBadgingEvent {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello World!");
        ObjectMapper objectMapper = new ObjectMapper();

        String fkBadgeEvent = "{\n" +
                "    \"event\": \"USER_FK_BADGE\",\n" +
                "    \"ugcBadges\": \"FK_BADGE\",\n" +
                "    \"tier\": 1,\n" +
                "    \"accountIds\": [\"ACCF058EE562AB34C048BDB3D59E52540E6U\"]\n" +
                "}";
        Event event4 = objectMapper.readValue(fkBadgeEvent, FkBadgingEvent.class);
        System.out.println(event4);

    }
}