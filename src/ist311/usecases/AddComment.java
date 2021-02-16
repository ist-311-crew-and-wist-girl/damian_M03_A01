package ist311.usecases;

import java.util.Scanner;

public class AddComment {
    Scanner scnr = new Scanner(System.in);
    String userComment = scnr.next();

    public String getUserComment() {
        return userComment;
    }

    public void setUserComment(String userComment) {
        this.userComment = userComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "userComment='" + userComment + '\'' +
                '}';
    }
}
