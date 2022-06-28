package pl.straszewski.spotifyapp.modelAnalysis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "start",
        "duration",
        "confidence",
        "loudness",
        "tempo",
        "tempo_confidence",
        "key",
        "key_confidence",
        "mode",
        "mode_confidence",
        "time_signature",
        "time_signature_confidence"
})
public class Section{

    @JsonProperty("start")
    public Double start;
    @JsonProperty("duration")
    public Double duration;
    @JsonProperty("confidence")
    public Double confidence;
    @JsonProperty("loudness")
    public Double loudness;
    @JsonProperty("tempo")
    public Double tempo;
    @JsonProperty("tempo_confidence")
    public Double tempo_confidence;
    @JsonProperty("key")
    public Integer key;
    @JsonProperty("key_confidence")
    public Double key_confidence;
    @JsonProperty("mode")
    public Integer mode;
    @JsonProperty("mode_confidence")
    public Double mode_confidence;
    @JsonProperty("time_signature")
    public Integer time_signature;
    @JsonProperty("time_signature_confidence")
    public Integer time_signature_confidence;
}
