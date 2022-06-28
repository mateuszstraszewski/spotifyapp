package pl.straszewski.spotifyapp.modelAnalysis; 
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

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
public class Root {

    @JsonProperty("meta")
    public Meta meta;
    @JsonProperty("track")
    public Track track;
    @JsonProperty("bars")
    public List<Bar> bars;
    @JsonProperty("beats")
    public List<Beat> beats;
    @JsonProperty("sections")
    public List<Section> sections;
    @JsonProperty("segments")
    public List<Segment> segments;
    @JsonProperty("tatums")
    public List<Tatum> tatums;
}
