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

    public Tasks() {
        this.title = title;
        this.date = date;
        this.details = details;
        this.completeByDate = completeByDate;
        this.finishByDate = finishByDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
        System.out.println("What is the Title of your task?");
        title = input.nextLine();


    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = dateFormat.format(calendar.getTime());
        System.out.println("You created your task on " + dateFormat.format(calendar.getTime()));
    }

    public String getDetails() {
        return details;
    }

    public void setDetails() {
        this.details = details;
        System.out.println("What would you like to add to the details of your task?");
        details = input.nextLine();
    }

    public String getCompleteByDate() {
        return completeByDate;
    }

    public void setCompleteByDate() {
        this.completeByDate = completeByDate;
        System.out.println("What would you like the due date of this task to be?");
        completeByDate = dateFormat.format(calendar.getTime());
    }

    public String getFinishByDate() {
        return finishByDate;
    }

    public void setFinishByDate() {
        this.finishByDate = finishByDate;
        System.out.println("What date do you need to complete this by?");
        finishByDate = input.nextLine();
    }
}
