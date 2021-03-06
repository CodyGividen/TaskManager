package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Tasks {

//    protected List<Tasks> newTask = new ArrayList<Tasks>();
//    protected final List<Tasks> completedTasks = new ArrayList<Tasks>();
    private Scanner input = new Scanner(System.in);
    Calendar calendar = Calendar.getInstance();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    private String title;
    private String date;
    private String details;
    private String finishByDate;
    private int month;
    private int day;
    boolean vaidDateDay;
    boolean vaidDateMonth;


    public Tasks () {
        setTitle();
        setDetails();
        setDate();
        setFinishByDate();
    }

    public int getMonth() {//Call month
        return month;
    }

    public void setMonth() {//Set month as int
        try {
            System.out.println(ConsoleColors.YELLOW + "What month would you like this to be due on?" + ConsoleColors.RESET);
            vaidDateMonth = false;
            month = Integer.parseInt(input.nextLine());
            if(month <= 12 && month >=1) {
                vaidDateMonth = true;
                } else {
                    System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Try again!!" + ConsoleColors.RESET);
                    setMonth();
                }
        }catch (InputMismatchException ime){
            System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Try again!!" + ConsoleColors.RESET);
            input.nextLine();
            setMonth();
        }
    }

    public int getDay() {//Call day
        return day;
    }

    public void setDay() {//set day as int
        try {
            System.out.println(ConsoleColors.YELLOW + "What day would you like this to be due on?" + ConsoleColors.RESET);
            day = Integer.parseInt(input.nextLine());
            vaidDateDay = false;
            if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && day <= 31) {
                vaidDateDay = true;
            } else if ((month == 2) && (day <= 28)) {
                vaidDateDay = true;
            } else if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day <= 30)) {
                vaidDateDay = true;
            }else{
                System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Try again!!" + ConsoleColors.RESET);
                setDay();
            }
        }catch (InputMismatchException ime) {
            System.out.println(ConsoleColors.RED + ConsoleColors.RED_BOLD + "Try again!!" + ConsoleColors.RESET);
            input.nextLine();
            setDay();
        }
    }

    public String getTitle() {//Call for title
        return title;
    }

    public void setTitle() {//Set a title
        System.out.println(ConsoleColors.YELLOW + "What is the Title of your task?" + ConsoleColors.RESET);
        title = input.nextLine();


    }

    public String getDate() {//Call Date
        return date;
    }

    public void setDate() {//Set a time based on the time it is in real time
        this.date = dateFormat.format(calendar.getTime());
        System.out.println(ConsoleColors.BLUE + "You created your task on " + dateFormat.format(calendar.getTime()) + ConsoleColors.RESET);
    }

    public String getDetails() {//Call the details user typed in
        return details;
    }

    public void setDetails() {//Set the details
        System.out.println(ConsoleColors.YELLOW + "What would you like the details of your task to be?" + ConsoleColors.RESET);
        details = input.nextLine();
    }

    public String getFinishByDate() {//Call finish by date
        return finishByDate;
    }

    public void setFinishByDate() {// Set finish by date
        setMonth();
        setDay();

    }
}
