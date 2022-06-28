package pl.straszewski.spotifyapp;

import com.fasterxml.jackson.databind.JsonNode;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.core.OAuth2Token;
import pl.straszewski.spotifyapp.model.Item;
import pl.straszewski.spotifyapp.model.SpotifyAlbum;
import pl.straszewski.spotifyapp.model.Tracks;
import pl.straszewski.spotifyapp.modelAnalysisAdditional.Root;

import java.util.*;

public class SpotifyApiService extends ApiBinding{

    private static final Logger logger = LoggerFactory.getLogger(SpotifyApiService.class);

    public SpotifyApiService(String accessToken) {
        super(accessToken);
    }

    public SpotifyAlbum createPlaylist() {
        //Object response = this.restTemplate.getForObject("https://api.spotify.com/v1/search?q=echokosmos&type=track", Object.class);
        SpotifyAlbum spotifyAlbum = this.restTemplate.getForObject("https://api.spotify.com/v1/search?q=echokosmos&type=track", SpotifyAlbum.class);

        for (Item item : spotifyAlbum.getTracks().getItems()) {
            System.err.println(item.getName());
            System.err.println(item.getId());
        }

        return spotifyAlbum;
    }

    public Root getStatsBasedOnId() {
        SpotifyAlbum spotifyAlbum = this.restTemplate.getForObject("https://api.spotify.com/v1/search?q=echokosmos&type=track", SpotifyAlbum.class);
        for (Item item : spotifyAlbum.getTracks().getItems())
        {
            logger.debug("Name: " + item.getName());
            logger.debug("Id: " + item.getId());
            logger.debug("Uri: " + item.getUri());
        }
        String id = spotifyAlbum.getTracks().getItems().get(0).getId();

        Root forObject = this.restTemplate.getForObject("https://api.spotify.com/v1/audio-analysis/" + id, Root.class);
        logger.debug(String.valueOf(forObject.getBars().size()));
        logger.debug(String.valueOf(forObject.getSegments().size()));
        return forObject;
    }

    public SpotifyAlbum newReleases() {
        SpotifyAlbum newRelease = this.restTemplate.getForObject("https://api.spotify.com/v1/browse/new-releases", SpotifyAlbum.class);

        return newRelease;
    }

    public Object obtainAlbum(String trackName) {
        StringBuilder urlBuild = new StringBuilder();
        urlBuild.append("https://api.spotify.com/v1/search?q=");
        urlBuild.append(trackName);
        urlBuild.append("&type=track");
        String url = urlBuild.toString();
        return this.restTemplate.getForObject(url, Object.class);
    }

    public List<String> filteredQueryResults()
    {
        List<String> result = new ArrayList<>();

        SpotifyAlbum spotifyAlbum = this.restTemplate.getForObject("https://api.spotify.com/v1/search?q=echokosmos&type=track", SpotifyAlbum.class);
        for (Item item : spotifyAlbum.getTracks().getItems())
        {
            StringBuilder sb = new StringBuilder();
            sb.append(item.getName());
            sb.append("; ");
            sb.append(item.getUri());
            sb.append("; ");
            sb.append(item.getId());

            result.add(sb.toString());

            logger.debug("Name: " + item.getName());
            logger.debug("Id: " + item.getId());
            logger.debug("Uri: " + item.getUri());
        }

        return result;
    }

    public JSONObject getSpecificAlbum(String name)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("https://api.spotify.com/v1/search?q=");
        sb.append(name);
        sb.append("&type=track");

        JSONObject result = this.restTemplate.getForObject(sb.toString(), JSONObject.class);
        return result;
    }

    public JSONObject getTrackStatsBasedOnId(String id) {

        JSONObject result = this.restTemplate.getForObject("https://api.spotify.com/v1/audio-analysis/" + id, JSONObject.class);
        return result;
    }

    public JSONObject getTrackFeaturesBasedOnId(String id) {
        JSONObject result = this.restTemplate.getForObject("https://api.spotify.com/v1/audio-features/" + id, JSONObject.class);
        return result;
    }
}
