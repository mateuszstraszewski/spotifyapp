package pl.straszewski.spotifyapp;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.OAuth2Token;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.straszewski.spotifyapp.model.SpotifyAlbum;

import java.security.Principal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class SpotifyController {

    @Autowired
    private SpotifyApiService apiService;

    @GetMapping("/createPlaylist")
    public Object createPlaylist()
    {
        return apiService.createPlaylist();
    }

    @GetMapping("/album")
    public String getAlbumsByAuthor(OAuth2Token token)
    {

        System.err.println(token.getTokenValue());
        System.err.println(token.getExpiresAt());
        System.err.println(token.getIssuedAt());

        String jwt = token.getTokenValue();
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + jwt);
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity<String> exchange = restTemplate.exchange("https://api.spotify.com/v1/search?q=muse&type=track",
                HttpMethod.GET,
                httpEntity,
                String.class);

        return exchange.getBody();
    }

    @GetMapping("/stats")
    public Object getStats()
    {
        return apiService.getStatsBasedOnId();
    }

    @GetMapping("/browse/new-releases")
    public SpotifyAlbum getNewReleases()
    {
        return apiService.newReleases();
    }

    @GetMapping("/user2")
    public SpotifyAlbum user2()
    {
        return apiService.createPlaylist();
    }

//    @GetMapping("/album/{name}")
//    public Object getAlbum(@PathVariable String name)
//    {
//        return apiService.obtainAlbum(name);
//    }

    @GetMapping("/filtererdQuery")
    public List<String> getFilteredQuery()
    {
        return apiService.filteredQueryResults();
    }

//    @GetMapping("/angularTest")
//    public ResponseEntity<SpotifyAlbum> getAlbum()
//    {
//        SpotifyAlbum album = apiService.getSpecificAlbum();
//        return ResponseEntity.ok()
//                .body(album);
//    }

    @GetMapping("/angularTest/{name}")
    public ResponseEntity getAlbum(@PathVariable String name)
    {
        JSONObject objectToPass = apiService.getSpecificAlbum(name);
        return new ResponseEntity(objectToPass, HttpStatus.OK);
    }

    @GetMapping("/getStats/{id}")
    public ResponseEntity getTrackStats(@PathVariable String id)
    {
        JSONObject objectToPass = apiService.getTrackStatsBasedOnId(id);
        return new ResponseEntity(objectToPass, HttpStatus.OK);
    }

    @GetMapping("/getFeatures/{id}")
    public ResponseEntity getFeatures(@PathVariable String id)
    {
        JSONObject objectToPass = apiService.getTrackFeaturesBasedOnId(id);
        return new ResponseEntity(objectToPass, HttpStatus.OK);
    }

}
