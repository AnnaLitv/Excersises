package com.company.lesson10.model;

public class Task {
    private int idTask;
    private String description;
    private int emploeeId;

    public Task() {
    }

    public Task(int idTask, String description, int emploeeId) {
        this.idTask = idTask;
        this.description = description;
        this.emploeeId = emploeeId;
    }

    public Task(String description, int emploeeId) {
        this.description = description;
        this.emploeeId = emploeeId;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmploeeId() {
        return emploeeId;
    }

    public void setEmploeeId(int emploeeId) {
        this.emploeeId = emploeeId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "idTask=" + idTask +
                ", description='" + description + '\'' +
                ", emploeeId=" + emploeeId +
                '}';
    }
}
