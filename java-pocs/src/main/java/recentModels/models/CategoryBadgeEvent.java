package recentModels.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryBadgeEvent extends BadgingEvent {
    private String category;
    private List<String> accountIds;

    public CategoryBadgeEvent(@JsonProperty("event") Events event,
                              @JsonProperty("ugcBadges") UGCBadges ugcBadges,
                              @JsonProperty("category") String category,
                              @JsonProperty("accountIds") List<String> accountIds) {
        super(event, ugcBadges);
        this.category = category;
        this.accountIds = accountIds;
    }


    public String getCategory() {
        return category;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }


}
