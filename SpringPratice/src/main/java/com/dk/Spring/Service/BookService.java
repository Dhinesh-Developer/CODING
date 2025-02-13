package com.dk.Spring.Service;

import com.dk.Spring.Model.Book;
import com.dk.Spring.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public Optional<Book> getBooksById(Long id){
        return bookRepo.findById(id);
    }

    public void saveBook(Book book){
        bookRepo.save(book);
    }

    public void deleteBuId(Long id){
        bookRepo.deleteById(id);
    }
}
