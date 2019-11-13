package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKLISTS")
public class TaskList {
    private int id;
    private String listname;
    private String description;

    public TaskList(String listname, String description) {
        this.listname = listname;
        this.description = description;
    }

    public TaskList() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    @Column(name="LISTNAME")
    public String getListname() {
        return listname;
    }

    @Column(name="DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
