package oop1.ex;

public class Account {
    int balance = 0; // 잔액


    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족");
        } else {
            balance -= amount;
        }
    }
}
