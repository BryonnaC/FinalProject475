package com.example.finalproject475;

public class ToDo {
    private int mId;
    private String mName;
    private String mDescription;

    public ToDo() {}

    public ToDo(int id, String name, String description) {
        mId = id;
        mName = name;
        mDescription = description;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }
}
