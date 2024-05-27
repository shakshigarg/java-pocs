package newModels.models;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "event",include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "user_category_badge", value = CategoryBadgeEvent.class),
        @JsonSubTypes.Type(name = "user_fk_badge", value = FkBadgingEvent.class)
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FDPEvent {

    private Event event;

    @JsonCreator
    public FDPEvent(@JsonProperty("event")Event event) {
        this.event = event;
    }

    public String getEvent() {
        return event.name();
    }

}
