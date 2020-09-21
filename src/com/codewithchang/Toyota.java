package com.codewithchang;

public class Toyota extends Vehicle{
    private String model;
    private String trim;
    private String engine;
    private boolean isInsured;
    private boolean isUsed;

    /*
    This is the constructor
     */
    public Toyota (String color, boolean is4x4, String model, String trim, String engine, boolean isInsured, boolean isUsed) {
        super(color, is4x4);
        this.model = model;
        this.trim = trim;
        this.engine = engine;
        this.isInsured = isInsured;
        this.isUsed = isUsed;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return this.trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean getIsInsured() {
        return this.isInsured;
    }

    public void setIsInsured(boolean isInsured) {
        this.isInsured = isInsured;
    }

    public boolean getIsUsed() {
        return this.isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", engine='" + engine + '\'' +
                ", isInsured=" + isInsured +
                ", isUsed=" + isUsed +
                '}';
    }
}