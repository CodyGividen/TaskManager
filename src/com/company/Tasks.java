package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Tasks {
    protected Scanner input = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/yy HH:mm:ss");
    private String title;
    private String date;
    private String details;
    private String completeByDate;
    private String finishByDate;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("What is the Title of your task?");
        title = input.nextLine();


    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        System.out.println("You created your task on " + dateFormat.format(calendar.getTime()));
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
        System.out.println("What would you like to add to the details of your task?");
        details = input.nextLine();
    }

    public String getCompleteByDate() {
        return completeByDate;
    }

    public void setCompleteByDate(String completeByDate) {
        this.completeByDate = completeByDate;
        System.out.println("What would you like the due date of this task to be?");
        completeByDate = dateFormat.format(calendar.getTime());
    }

    public String getFinishByDate() {
        return finishByDate;
    }

    public void setFinishByDate(String finishByDate) {
        this.finishByDate = finishByDate;
        System.out.println("What date do you need to complete this by?");
        finishByDate = input.nextLine();
    }
}
