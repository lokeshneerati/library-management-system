package com.acciojob.library_management_system.Services;

import com.acciojob.library_management_system.Enum.CardStatus;
import com.acciojob.library_management_system.Models.LibraryCard;
import com.acciojob.library_management_system.Models.Student;
import com.acciojob.library_management_system.Repositories.CardRepository;
import com.acciojob.library_management_system.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private StudentRepository studentRepository;

    public String addNewCard() {

        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.NEW);
        card.setNoOfBooksIssued(0);
        card = cardRepository.save(card);
        return "The card has been generated with the cardId "+card.getCardId();
    }
    public String associateCardAndStudent(Integer cardId,Integer studentId) {

        LibraryCard card = cardRepository.findById(cardId).get();
        Student student = studentRepository.findById(studentId).get();
        card.setStudent(student); // This if how you set FK
        card.setCardStatus(CardStatus.ACTIVE);

        cardRepository.save(card);
        return "Associating card and student with cardId "+cardId +" and studentId " +studentId;



    }

}
