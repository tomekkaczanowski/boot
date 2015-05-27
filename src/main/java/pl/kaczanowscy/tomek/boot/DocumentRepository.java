package pl.kaczanowscy.tomek.boot;

import pl.kaczanowscy.tomek.boot.rest.Document;

import java.util.List;

public interface DocumentRepository {
    void store(Document document);

    List<Document> all();
}
