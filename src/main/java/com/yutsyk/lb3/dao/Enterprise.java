package com.yutsyk.lb3.dao;


import lab3.enterprise_yutsyk.Activity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Enterprises")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true,name = "name")
    private String name;
    private String ceo;
    private String founder;
    private int year;
    private int month;
    private int day;
    private Activity activity;
    private int staff;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enterprise that = (Enterprise) o;
        return year == that.year &&
                month == that.month &&
                day == that.day &&
                staff == that.staff &&
                name.equals(that.name) &&
                ceo.equals(that.ceo) &&
                founder.equals(that.founder) &&
                activity == that.activity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ceo, founder, year, month, day, activity, staff);
    }
}
