package com.ntomlin.subgql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ntomlin.subgql.models.SpotifyArtist;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SpotifyResolver implements GraphQLQueryResolver {
    public List<SpotifyArtist> getArtists () {
        return Collections.singletonList(new SpotifyArtist());
    }

    public List<Map<String, String>> getAlbums () {
        Map map = new HashMap<String, String>();
        map.put("id", "123");
        map.put("title", "Toxicity");

        return Collections.singletonList(map);
    }
}
