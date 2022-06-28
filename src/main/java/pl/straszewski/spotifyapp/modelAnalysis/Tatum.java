package pl.straszewski.spotifyapp.modelAnalysis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "start",
        "duration",
        "confidence"
})
public class Tatum{

    @JsonProperty("start")
    public Double start;
    @JsonProperty("duration")
    public Double duration;
    @JsonProperty("confidence")
    public Double confidence;
}
