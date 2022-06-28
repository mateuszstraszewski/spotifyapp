package pl.straszewski.spotifyapp.modelAnalysis;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "analyzer_version",
        "platform",
        "detailed_status",
        "status_code",
        "timestamp",
        "analysis_time",
        "input_process"
})

@Generated("jsonschema2pojo")
public class Meta{

    @JsonProperty("analyzer_version")
    public String analyzer_version;

    @JsonProperty("platform")
    public String platform;

    @JsonProperty("detailed_status")
    public String detailed_status;

    @JsonProperty("status_code")
    public Integer status_code;

    @JsonProperty("timestamp")
    public Integer timestamp;

    @JsonProperty("analysis_time")
    public Double analysis_time;

    @JsonProperty("input_process")
    public String input_process;


    @JsonProperty("analyzer_version")
    public String getAnalyzer_version() {
        return analyzer_version;
    }

    @JsonProperty("analyzer_version")
    public void setAnalyzer_version(String analyzer_version) {
        this.analyzer_version = analyzer_version;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("detailed_status")
    public String getDetailed_status() {
        return detailed_status;
    }

    @JsonProperty("detailed_status")
    public void setDetailed_status(String detailed_status) {
        this.detailed_status = detailed_status;
    }

    @JsonProperty("status_code")
    public Integer getStatus_code() {
        return status_code;
    }

    @JsonProperty("status_code")
    public void setStatus_code(Integer status_code) {
        this.status_code = status_code;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("analysis_time")
    public Double getAnalysis_time() {
        return analysis_time;
    }

    @JsonProperty("analysis_time")
    public void setAnalysis_time(Double analysis_time) {
        this.analysis_time = analysis_time;
    }

    @JsonProperty("input_process")
    public String getInput_process() {
        return input_process;
    }

    @JsonProperty("input_process")
    public void setInput_process(String input_process) {
        this.input_process = input_process;
    }
}
