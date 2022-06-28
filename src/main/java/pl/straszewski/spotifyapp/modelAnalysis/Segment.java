package pl.straszewski.spotifyapp.modelAnalysis; 
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "start",
        "duration",
        "confidence",
        "loudness_start",
        "loudness_max_time",
        "loudness_max",
        "loudness_end",
        "pitches",
        "timbre"
})
public class Segment{

    @JsonProperty("start")
    public Double start;
    @JsonProperty("duration")
    public Double duration;
    @JsonProperty("confidence")
    public Double confidence;
    @JsonProperty("loudness_start")
    public Double loudness_start;
    @JsonProperty("loudness_max_time")
    public Double loudness_max_time;
    @JsonProperty("loudness_max")
    public Double loudness_max;
    @JsonProperty("loudness_end")
    public Integer loudness_end;
    @JsonProperty("pitches")
    public List<Double> pitches;
    @JsonProperty("timbre")
    public List<Double> timbre;
}
