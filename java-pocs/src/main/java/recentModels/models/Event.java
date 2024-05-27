package recentModels.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "event",include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "USER_CATEGORY_BADGE", value = CategoryBadgeEvent.class),
        @JsonSubTypes.Type(name = "USER_FK_BADGE", value = FkBadgingEvent.class)
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Event {

    private Events event;

    protected Event(@JsonProperty("event")Events event) {
        this.event = event;
    }

    public String getEvent() {
        return event.name();
    }

}
