package com.company;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.id =1;
        bankAccount.name = "Nuraiym";
        bankAccount.balance= 100000;
        System.out.println("id пользовтаель " + bankAccount.id);
        System.out.println("Имя пользователя" + bankAccount.name);
        System.out.println("Баланс пользователя" + bankAccount.balance);

    }
}
