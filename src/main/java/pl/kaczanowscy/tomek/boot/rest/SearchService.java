package pl.kaczanowscy.tomek.boot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kaczanowscy.tomek.boot.DocumentRepository;

import java.util.List;

@Service
public class SearchService {

    private final DocumentRepository documentRepository;

    @Autowired
    public SearchService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> findDocuments() {
        return documentRepository.all();
    }
}
