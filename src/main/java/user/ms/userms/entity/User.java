package user.ms.userms.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")

public class User {
    String usid;
    int balance;

    public User (String usid, int balance) {
        this.usid = usid;
        this.balance = balance;
    }

    public String getUsid() {
        return this.usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}