package com.acciojob.library_management_system.Services;

import com.acciojob.library_management_system.Models.Author;
import com.acciojob.library_management_system.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public String addAuthor(Author author) {

        author = authorRepository.save(author);
        return "Author has been saved to DB with authorId"+author.getAuthorId();
    }

    public Author findAuthorById(Integer authorId) throws Exception {

        Optional<Author> optionalAuthor = authorRepository.findById(authorId);

        if(optionalAuthor.isEmpty()) {
            throw new Exception("invalid authorId entered");
        }
        Author author = optionalAuthor.get();

        return author;
    }


}
