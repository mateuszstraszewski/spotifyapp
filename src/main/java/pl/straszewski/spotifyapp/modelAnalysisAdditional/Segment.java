
package pl.straszewski.spotifyapp.modelAnalysisAdditional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start",
    "duration",
    "confidence",
    "loudness_start",
    "loudness_max",
    "loudness_max_time",
    "loudness_end",
    "pitches",
    "timbre"
})
@Generated("jsonschema2pojo")
public class Segment {

    @JsonProperty("start")
    private Double start;
    @JsonProperty("duration")
    private Double duration;
    @JsonProperty("confidence")
    private Double confidence;
    @JsonProperty("loudness_start")
    private Double loudnessStart;
    @JsonProperty("loudness_max")
    private Double loudnessMax;
    @JsonProperty("loudness_max_time")
    private Double loudnessMaxTime;
    @JsonProperty("loudness_end")
    private Integer loudnessEnd;
    @JsonProperty("pitches")
    private List<Double> pitches = null;
    @JsonProperty("timbre")
    private List<Double> timbre = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("start")
    public Double getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Double start) {
        this.start = start;
    }

    @JsonProperty("duration")
    public Double getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("loudness_start")
    public Double getLoudnessStart() {
        return loudnessStart;
    }

    @JsonProperty("loudness_start")
    public void setLoudnessStart(Double loudnessStart) {
        this.loudnessStart = loudnessStart;
    }

    @JsonProperty("loudness_max")
    public Double getLoudnessMax() {
        return loudnessMax;
    }

    @JsonProperty("loudness_max")
    public void setLoudnessMax(Double loudnessMax) {
        this.loudnessMax = loudnessMax;
    }

    @JsonProperty("loudness_max_time")
    public Double getLoudnessMaxTime() {
        return loudnessMaxTime;
    }

    @JsonProperty("loudness_max_time")
    public void setLoudnessMaxTime(Double loudnessMaxTime) {
        this.loudnessMaxTime = loudnessMaxTime;
    }

    @JsonProperty("loudness_end")
    public Integer getLoudnessEnd() {
        return loudnessEnd;
    }

    @JsonProperty("loudness_end")
    public void setLoudnessEnd(Integer loudnessEnd) {
        this.loudnessEnd = loudnessEnd;
    }

    @JsonProperty("pitches")
    public List<Double> getPitches() {
        return pitches;
    }

    @JsonProperty("pitches")
    public void setPitches(List<Double> pitches) {
        this.pitches = pitches;
    }

    @JsonProperty("timbre")
    public List<Double> getTimbre() {
        return timbre;
    }

    @JsonProperty("timbre")
    public void setTimbre(List<Double> timbre) {
        this.timbre = timbre;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
