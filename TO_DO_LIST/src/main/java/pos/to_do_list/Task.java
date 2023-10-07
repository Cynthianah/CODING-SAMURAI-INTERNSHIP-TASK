/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.to_do_list;

import java.util.Date;

/**
 *
 * @author admin
 */
class Task {
    private String title;
    private String description;
    private String dueDate;
    private boolean isComplete;

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isComplete = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        isComplete = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nDue Date: " + dueDate +
               "\nStatus: " + (isComplete ? "Completed" : "Incomplete");
    }
}
