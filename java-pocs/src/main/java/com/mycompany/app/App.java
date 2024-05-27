package com.mycompany.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import newModels.models.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonProcessingException {
        System.out.println( "Hello World!" );
        ObjectMapper objectMapper = new ObjectMapper();
//        String fdpEvent = "{\n" +
//                "    \"event\":\"fdp\"\n" +
//                "}";
//        String badgingEvent="{\n" +
//                "    \"event\":\"user_category_badge\",\n" +
//                "    \"ugcBadges\":\"CATEGORY_BADGE\"\n" +
//                "}";
//        String categoryBadgeEvent = "{\n" +
//                "    \"event\":\"fdp\",\n" +
//                "    \"ugcBadges\":\"CATEGORY_BADGE\",\n" +
//                "    \"category\":\"mobile\",\n" +
//                "    \"accountIds\":[\n" +
//                "        \"acc1\",\n" +
//                "        \"acc2\"\n" +
//                "    ]\n" +
//                "}";
        String fkBadgeEvent ="{\n" +
                "    \"event\":\"fdp\",\n" +
                "    \"ugcBadges\":\"FK_BADGE\",\n" +
                "    \"tier\":1,\n" +
                "    \"accountIds\":[\n" +
                "        \"acc1\",\n" +
                "        \"acc2\"\n" +
                "    ]\n" +
                "}";
        //objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        //FDPEvent event1=objectMapper.readValue(val,FDPEvent.class);
//        BadgingEvent event2=objectMapper.readValue(badgingEvent,BadgingEvent.class);
//        //System.out.println(event1);
//        System.out.println(event2);
//
//        FDPEvent event3=objectMapper.readValue(categoryBadgeEvent,CategoryBadgeEvent.class);
//        System.out.println(event3);
//
        FDPEvent event4=objectMapper.readValue(fkBadgeEvent,FkBadgingEvent.class);
        System.out.println(event4);
//        UGCBadges badge = new ObjectMapper().readValue("\"CATEGORY_BADGE\"", UGCBadges.class);
//        System.out.println(badge);
        FDPEvent event = objectMapper.readValue("{\n" +
                "    \"event\":\"user_category_badge\",\n" +
                "    \"newVal\":\"hello\"\n" +
                "}",FDPEvent.class);
        //FDPEvent event = objectMapper.readValue("{\"event\":\"user_category_badge\",\"ugcBadges\":\"CATEGORY_BADGE\",\"category\":\"Fashion\",\"accountIds\":[\"ACCAF8E17213B584FD395484E370B06CF80\"]}",FDPEvent.class);
        System.out.println(event);
        //FDPEvent event = objectMapper.readValue("{\"event\":\"user_badge\",\"ugcBadges\":\"CATEGORY_BADGE\",\"category\":\"Fashion\",\"accountIds\":[\"ACCAF8E17213B584FD395484E370B06CF80\"]}",FDPEvent.class);
    }
}
