package com.library.listener;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.faces.event.ActionEvent;
import java.io.Serializable;

@Named(value = "transactionEventListener")
@RequestScoped
public class TransactionEventListener implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public void handleBorrowAction(ActionEvent event) {

        System.out.println("Book borrow action triggered");
    }
    
    public void handleReturnAction(ActionEvent event) {

        System.out.println("Book return action triggered");
    }
}

