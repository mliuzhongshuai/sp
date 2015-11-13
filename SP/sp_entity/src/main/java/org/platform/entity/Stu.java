package org.platform.entity;

import java.io.Serializable;

/**
 * Created by liuzhongshuai on 15/11/11.
 */
public class Stu implements Serializable {

    private String id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
