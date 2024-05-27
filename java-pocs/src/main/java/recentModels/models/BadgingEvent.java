package recentModels.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BadgingEvent extends Event {

    public UGCBadges ugcBadges;
    public BadgingEvent(Events event) {
        super(event);
    }

    public BadgingEvent(@JsonProperty("event") Events event,
                        @JsonProperty("ugcBadges") UGCBadges ugcBadges) {
        super(event);
        this.ugcBadges = ugcBadges;
    }

    public UGCBadges getUgcBadges() {
        return ugcBadges;
    }
}
