package com.ntomlin.subgql.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpotifyArtist {
    private String id = "xyz-123";
    private String name = "Default Name";
    private String thisWillGetMappedToBio = "I grew up in small town before making my break in the big city";
    private List<Map<String, String>> albums = new ArrayList<>();
    public String getId() {
        return id;
    }

    public SpotifyArtist setId(String id) {
        this.id = id;
        return this;
    }

    public String getThisWillGetMappedToBio() {
        return thisWillGetMappedToBio;
    }

    public SpotifyArtist setThisWillGetMappedToBio(String thisWillGetMappedToBio) {
        this.thisWillGetMappedToBio = thisWillGetMappedToBio;
        return this;
    }

    public String getName() {
        return name;
    }

    public SpotifyArtist setName(String name) {
        this.name = name;
        return this;
    }

    public List<Map<String, String>> getAlbums () {
        return albums;
    }

    public SpotifyArtist() {}
}
