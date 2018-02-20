package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class TaskInformation {
    private String title;
    private String date;
    private String details;
    private String completeByDate;
    private String finishDate;
    protected Scanner input = new Scanner(System.in);
    protected List<TaskInformation> newTask = new ArrayList<TaskInformation>();
    protected List<TaskInformation> completedTasks = new ArrayList<TaskInformation>();
    protected List<TaskInformation> incompleteTasks = new ArrayList<TaskInformation>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/DD/yy HH:mm:ss");

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        System.out.println("What is the Title of your task?");
        title = input.nextLine();
        newTask.add(title);
    }

    public String getDate() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("You created your task on " + dateFormat.format(calendar.getTime()));
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCompleteByDate() {
        return completeByDate;
    }

    public void setCompleteByDate(String completeByDate) {
        this.completeByDate = completeByDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
