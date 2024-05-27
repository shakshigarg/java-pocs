package newModels.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryBadgeEvent extends FDPEvent {
    private String category;
    private List<String> accountIds;
    private UGCBadges ugcBadges;

    public CategoryBadgeEvent(@JsonProperty("event") String event,
                              @JsonProperty("ugcBadges") UGCBadges ugcBadges,
                              @JsonProperty("category") String category,
                              @JsonProperty("accountIds") List<String> accountIds) {
        super(Event.user_category_badge);
        this.category = category;
        this.ugcBadges=ugcBadges;
        this.accountIds = accountIds;
    }


    public String getCategory() {
        return category;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }

    public UGCBadges getUgcBadges() {
        return ugcBadges;
    }

}
