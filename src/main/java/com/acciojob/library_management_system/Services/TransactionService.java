package com.acciojob.library_management_system.Services;


import com.acciojob.library_management_system.Enum.TransactionStatus;
import com.acciojob.library_management_system.Models.Book;
import com.acciojob.library_management_system.Models.LibraryCard;
import com.acciojob.library_management_system.Models.Transaction;
import com.acciojob.library_management_system.Repositories.BookRepository;
import com.acciojob.library_management_system.Repositories.CardRepository;
import com.acciojob.library_management_system.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public  String  issueBook(int bookId,int cardId) throws Exception {

        Book book = bookRepository.findById(bookId).get();

        LibraryCard card = cardRepository.findById(cardId).get();

        Transaction transaction = new Transaction();

        if(book.getIsIssued()) {
            throw new  Exception("Book is already issued");
        }
        if(card.getNoOfBooksIssued() == 3) {
            throw new  Exception("Card Book issue Limit is reached");
        }

        transaction.setTransactionStatus(TransactionStatus.SUCCESS);
        transaction.setBook(book);
        transaction.setCard(card);

        book.setIsIssued(true);

        card.setNoOfBooksIssued(card.getNoOfBooksIssued() + 1);

        transaction = transactionRepository.save(transaction);
        bookRepository.save(book);
        cardRepository.save(card);

        return "The Transaction is saved with transactionId : "+transaction.getTransactionId();


    }
}
