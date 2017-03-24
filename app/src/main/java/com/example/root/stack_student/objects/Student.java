package com.example.root.stack_student.objects;

/**
 * Created by Arjemariel J. Requina on 3/24/17.
 */

/**
 * The class used to represent the student from the database to the UI component.
 * Having a class of its own, the student persona of the application serves as one
 * of the main and independent entity in the database and as well as in the UI component
 */

public class Student {
    private int id;
    private String fname;
    private String mname;
    private String lname;
    private int phone_num;
    private String email_add;

    public Student(){
    }

    public Student(int id, String fname, String mname, String lname, int phone_num, String email_add){
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.phone_num = phone_num;
        this.email_add = email_add;
        capitalize_name();
    }

    public Student(String fname, String mname, String lname, int phone_num, String email_add){
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.phone_num = phone_num;
        this.email_add = email_add;
        capitalize_name();
    }

    // Used to capitalize the first letter of each aspect of the name (fname, mname, lname)
    // only if it is not null
    private void capitalize_name(){
        if(this.fname != null){
            this.fname = this.fname.substring(0, 1).toUpperCase() + this.fname.substring(1);
        }
        if(this.mname != null) {
            this.mname = this.mname.substring(0, 1).toUpperCase() + this.mname.substring(1);
        }
        if(this.lname != null){
            this.lname = this.lname.substring(0, 1).toUpperCase() + this.lname.substring(1);
        }
    }

    public int get_id(){
        return this.id;
    }

    public void set_id(int id){
        this.id = id;
    }

    public String get_fname(){
        return this.fname;
    }

    public String get_mname(){
        return this.mname;
    }

    public String get_lname(){
        return this.lname;
    }

    public int get_phone_num(){
        return this.phone_num;
    }

    public String get_email_add(){
        return this.email_add;
    }

    public String get_name(int format){
        if(format == 1) {
            return this.lname + ", " + this.fname + " " + this.mname;
        } else {
            return this.fname + " " + this.mname + " " + this.lname;
        }
    }
}
