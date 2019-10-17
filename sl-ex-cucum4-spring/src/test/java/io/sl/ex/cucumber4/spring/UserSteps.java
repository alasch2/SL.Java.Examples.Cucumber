package io.sl.ex.cucumber4.spring;

import io.cucumber.java.en.Given;
import io.sl.ex.cucumber4.spring.Message;
import io.sl.ex.cucumber4.spring.MessageRepository;
import io.sl.ex.cucumber4.spring.User;
import io.sl.ex.cucumber4.spring.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import static org.junit.Assert.assertTrue;

import java.util.List;

public class UserSteps {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    private User user;

    private void thereIsAUser() {
        user = new User("testuser");
        userRepository.save(user);
    }

    @Given("a User has posted the following messages:")
    public void a_User_has_posted_the_following_messages(List<Message> messages) throws Throwable {
        thereIsAUser();
        for (Message m : messages) {
            m.setAuthor(user);
            messageRepository.save(m);
        }
        assertTrue("No transaction is active",
            TransactionSynchronizationManager.isActualTransactionActive());
    }
}
