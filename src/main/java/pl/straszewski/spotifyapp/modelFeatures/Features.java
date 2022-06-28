package pl.straszewski.spotifyapp.modelFeatures;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "acousticness",
        "analysis_url",
        "danceability",
        "duration_ms",
        "energy",
        "id",
        "instrumentalness",
        "key",
        "liveness",
        "loudness",
        "mode",
        "speechiness",
        "tempo",
        "time_signature",
        "track_href",
        "type",
        "uri",
        "valence"
})
public class Features {
    @JsonProperty("acousticness")
    public Double acousticness;
    @JsonProperty("analysis_url")
    public String analysis_url;
    @JsonProperty("danceability")
    public Double danceability;
    @JsonProperty("duration_ms")
    public Integer duration_ms;
    @JsonProperty("energy")
    public Double energy;
    @JsonProperty("id")
    public String id;
    @JsonProperty("instrumentalness")
    public Double instrumentalness;
    @JsonProperty("key")
    public Integer key;
    @JsonProperty("liveness")
    public Double liveness;
    @JsonProperty("loudness")
    public Double loudness;
    @JsonProperty("mode")
    public Integer mode;
    @JsonProperty("speechiness")
    public Double speechiness;
    @JsonProperty("tempo")
    public Double tempo;
    @JsonProperty("time_signature")
    public Integer time_signature;
    @JsonProperty("track_href")
    public String track_href;
    @JsonProperty("type")
    public String type;
    @JsonProperty("uri")
    public String uri;
    @JsonProperty("valence")
    public Double valence;
}
