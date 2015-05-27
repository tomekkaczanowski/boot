package pl.kaczanowscy.tomek.boot.rest;

import java.util.List;

public class SearchResult {

    private List<Document> documents;

    public SearchResult(List<Document> documents) {
        this.documents = documents;
    }

}
