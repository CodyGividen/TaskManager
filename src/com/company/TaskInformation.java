package com.company;


import java.util.ArrayList;
import java.util.List;

public class TaskInformation extends Tasks{
    protected List<TaskInformation> newTask = new ArrayList<TaskInformation>();
    protected List<TaskInformation> completedTasks = new ArrayList<TaskInformation>();
    protected List<TaskInformation> incompleteTasks = new ArrayList<TaskInformation>();


    String task;


    protected void addTask(){
        TaskInformation taskInformation = new TaskInformation();
        taskInformation.setTitle();
        taskInformation.setDetails();
        taskInformation.setDate();
        taskInformation.setFinishByDate();

    }
    protected void removeTask(){

    }
    protected void viewTask(){

    }
    protected void selectViewTasks(){

    }
    protected void addIncompleteList(){

    }
    protected void addCompleteList(){

    }
//    public void fullTask(){
//        task = (getTitle() + " " + getDate() + " " + getDetails() + " " + getFinishByDate());
//        //newTask.add();
//    }
}
