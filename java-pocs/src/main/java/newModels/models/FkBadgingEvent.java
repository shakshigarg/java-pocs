package newModels.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// WHEN WILL IT GET USED
@JsonIgnoreProperties(ignoreUnknown = true)
public class FkBadgingEvent extends FDPEvent {

    private int tier;
    private List<String> accountIds;
    public UGCBadges ugcBadges;

    public FkBadgingEvent(@JsonProperty("event") Event event,
                          @JsonProperty("ugcBadges") UGCBadges ugcBadges,
                          @JsonProperty("tier") int tier,
                          @JsonProperty("accountIds") List<String> accountIds) {
        super(event);
        this.tier = tier;
        this.accountIds = accountIds;
        this.ugcBadges=ugcBadges;
    }

    public int getTier() {
        return tier;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }

    public UGCBadges getUgcBadges() {
        return ugcBadges;
    }
}
