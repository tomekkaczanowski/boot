package pl.kaczanowscy.tomek.boot;

import org.springframework.stereotype.Repository;
import pl.kaczanowscy.tomek.boot.rest.Document;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDocumentRepository implements DocumentRepository{

    private final List<Document> documents;

    public InMemoryDocumentRepository() {
        this.documents = new ArrayList<>();
    }

    @Override
    public void store(Document document) {
        documents.add(document);
    }

    @Override
    public List<Document> all() {
        return documents;
    }
}
