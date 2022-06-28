
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
    "meta",
    "track",
    "bars",
    "beats",
    "sections",
    "segments",
    "tatums"
})
@Generated("jsonschema2pojo")
public class Root {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("track")
    private Track track;
    @JsonProperty("bars")
    private List<Bar> bars = null;
    @JsonProperty("beats")
    private List<Beat> beats = null;
    @JsonProperty("sections")
    private List<Section> sections = null;
    @JsonProperty("segments")
    private List<Segment> segments = null;
    @JsonProperty("tatums")
    private List<Tatum> tatums = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("track")
    public Track getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(Track track) {
        this.track = track;
    }

    @JsonProperty("bars")
    public List<Bar> getBars() {
        return bars;
    }

    @JsonProperty("bars")
    public void setBars(List<Bar> bars) {
        this.bars = bars;
    }

    @JsonProperty("beats")
    public List<Beat> getBeats() {
        return beats;
    }

    @JsonProperty("beats")
    public void setBeats(List<Beat> beats) {
        this.beats = beats;
    }

    @JsonProperty("sections")
    public List<Section> getSections() {
        return sections;
    }

    @JsonProperty("sections")
    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @JsonProperty("tatums")
    public List<Tatum> getTatums() {
        return tatums;
    }

    @JsonProperty("tatums")
    public void setTatums(List<Tatum> tatums) {
        this.tatums = tatums;
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
