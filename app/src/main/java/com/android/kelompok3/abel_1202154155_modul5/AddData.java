package com.android.kelompok3.abel_1202154155_modul5;

/**
 * Created by Lenovo on 24/03/2018.
 */

public class AddData {
    //deklarasi variable
    String todo, desc, prior;

    //konstruktor(adalah method yang pertama kali dijalankan pada saat sebuah objek pertama kali diciptakan)
    public AddData(String todo, String desc, String prior) {
        this.todo = todo;
        this.desc = desc;
        this.prior = prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}


