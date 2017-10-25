package com.qgzx.entity;

import java.sql.Date;

/**
 * The type Bring info.
 */
public class BringInfo {
    private int id;
    private String name;
    private Date time;
    private String title;
    private String type;
    private String location;
    private String worktime;
    private String workplace;
    private String pay;
    private String people;
    private Date deadline;
    private String sex;
    private String grade;
    private String place;
    private String need;
private String interview;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public Date getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets worktime.
     *
     * @return the worktime
     */
    public String getWorktime() {
        return worktime;
    }

    /**
     * Sets worktime.
     *
     * @param worktime the worktime
     */
    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    /**
     * Gets workplace.
     *
     * @return the workplace
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * Sets workplace.
     *
     * @param workplace the workplace
     */
    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    /**
     * Gets pay.
     *
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * Sets pay.
     *
     * @param pay the pay
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

    /**
     * Gets people.
     *
     * @return the people
     */
    public String getPeople() {
        return people;
    }

    /**
     * Sets people.
     *
     * @param people the people
     */
    public void setPeople(String people) {
        this.people = people;
    }

    /**
     * Gets deadline.
     *
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * Sets deadline.
     *
     * @param deadline the deadline
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Gets grade.
     *
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade the grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Gets place.
     *
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets place.
     *
     * @param place the place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Gets need.
     *
     * @return the need
     */
    public String getNeed() {
        return need;
    }

    /**
     * Sets need.
     *
     * @param need the need
     */
    public void setNeed(String need) {
        this.need = need;
    }

    /**
     * Gets interview.
     *
     * @return the interview
     */
    public String getInterview() {
        return interview;
    }

    /**
     * Sets interview.
     *
     * @param interview the interview
     */
    public void setInterview(String interview) {
        this.interview = interview;
    }

    @Override
    public String toString() {
        return "BringInfo [id=" + id + ", name=" + name + ", time=" + time + ", title=" + title + ", type=" + type
                + ", location=" + location + ", worktime=" + worktime + ", workplace=" + workplace + ", pay=" + pay
                + ", people=" + people + ", deadline=" + deadline + ", sex=" + sex + ", grade=" + grade + ", place="
                + place + ", need=" + need+",interview="+interview + "]";
    }

}
