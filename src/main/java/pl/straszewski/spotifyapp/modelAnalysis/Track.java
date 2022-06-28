package pl.straszewski.spotifyapp.modelAnalysis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "num_samples",
        "duration",
        "sample_md5",
        "offset_seconds",
        "window_seconds",
        "analysis_sample_rate",
        "analysis_channels",
        "end_of_fade_in",
        "start_of_fade_out",
        "loudness",
        "tempo",
        "tempo_confidence",
        "time_signature",
        "time_signature_confidence",
        "key",
        "key_confidence",
        "mode",
        "mode_confidence",
        "codestring",
        "code_version",
        "echoprintstring",
        "echoprint_version",
        "synchstring",
        "synch_version",
        "rhythmstring",
        "rhythm_version"
})
public class Track{

    @JsonProperty("num_samples")
    public Integer num_samples;
    @JsonProperty("duration")
    public Double duration;
    @JsonProperty("sample_md5")
    public String sample_md5;
    @JsonProperty("offset_seconds")
    public Integer offset_seconds;
    @JsonProperty("window_seconds")
    public Integer window_seconds;
    @JsonProperty("analysis_sample_rate")
    public Integer analysis_sample_rate;
    @JsonProperty("analysis_channels")
    public Integer analysis_channels;
    @JsonProperty("end_of_fade_in")
    public Integer end_of_fade_in;
    @JsonProperty("start_of_fade_out")
    public Double start_of_fade_out;
    @JsonProperty("loudness")
    public Double loudness;
    @JsonProperty("tempo")
    public Double tempo;
    @JsonProperty("tempo_confidence")
    public Integer tempo_confidence;
    @JsonProperty("time_signature")
    public Integer time_signature;
    @JsonProperty("time_signature_confidence")
    public Integer time_signature_confidence;
    @JsonProperty("key")
    public Integer key;
    @JsonProperty("key_confidence")
    public Double key_confidence;
    @JsonProperty("mode")
    public Integer mode;
    @JsonProperty("mode_confidence")
    public Double mode_confidence;
    @JsonProperty("codestring")
    public String codestring;
    @JsonProperty("code_version")
    public Double code_version;
    @JsonProperty("echoprintstring")
    public String echoprintstring;
    @JsonProperty("echoprint_version")
    public Double echoprint_version;
    @JsonProperty("synchstring")
    public String synchstring;
    @JsonProperty("synch_version")
    public Integer synch_version;
    @JsonProperty("rhythmstring")
    public String rhythmstring;
    @JsonProperty("rhythm_version")
    public Integer rhythm_version;
}
