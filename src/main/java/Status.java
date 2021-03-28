import com.fasterxml.jackson.annotation.JsonProperty;

public class Status {
    boolean verified;
    int sentCount;

    public Status(@JsonProperty("verified") boolean verified,
                  @JsonProperty("sentCount") int sentCount) {
        this.verified = verified;
        this.sentCount = sentCount;
    }

    public boolean isVerified() {
        return verified;
    }
}
