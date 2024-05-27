package recentModels.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// WHEN WILL IT GET USED
@JsonIgnoreProperties(ignoreUnknown = true)
public class FkBadgingEvent extends BadgingEvent {

    private int tier;
    private List<String> accountIds;
    public UGCBadges ugcBadges;

    public FkBadgingEvent(@JsonProperty("event") Events event,
                          @JsonProperty("ugcBadges") UGCBadges ugcBadges,
                          @JsonProperty("tier") int tier,
                          @JsonProperty("accountIds") List<String> accountIds) {
        super(Events.USER_FK_BADGE, ugcBadges);
        this.tier = tier;
        this.accountIds = accountIds;
    }

    public int getTier() {
        return tier;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }
}
