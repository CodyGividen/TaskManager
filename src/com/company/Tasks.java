package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Tasks {

    protected List<Tasks> newTask = new ArrayList<Tasks>();
    protected final List<Tasks> completedTasks = new ArrayList<Tasks>();
    private Scanner input = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    //    private SimpleDateFormat completeDateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    private String title;
    private String date;
    private String finishedDate;
    private String details;
    //    private String completeByDate;
    private String finishByDate;
    private String editTask;


    public Tasks () {
        setTitle();
        setDetails();
        setDate();
        setFinishByDate();
    }

    //
//    public String getFinishedDate() {
//        return finishedDate;
//    }
//
//    public void setFinishedDate() {
//        this.finishedDate = completeDateFormat.format(calendar.getTime());
//        System.out.println("Your task was added to complete list on " + dateFormat.format(calendar.getTime()));
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
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
        System.out.println("What would you like the details of your task to be?");
        details = input.nextLine();
    }

//    public String getCompleteByDate() {
//        return completeByDate;
//    }
//
//    public void setCompleteByDate() {
//        this.completeByDate = completeByDate;
//        System.out.println("What would you like the due date of this task to be?");
//        completeByDate = dateFormat.format(calendar.getTime());
//    }

    public String getFinishByDate() {
        return finishByDate;
    }

    public void setFinishByDate() {
        System.out.println("What date do you need to complete this by?");
        finishByDate = input.nextLine();
    }
}
