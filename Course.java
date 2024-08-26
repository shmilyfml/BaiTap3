/*
 * @ (#) Course.java      1.0     8/25/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

/*
 * @description:
 * @author: Quan Nguyen
 * @date:   8/25/2024
 * @version:   1.0
 */
public class Course {
    // Attributes
    private String id;
    private String title;
    private int credit;
    private String department;

    // Constructors
    public Course(String id, String title, int credit, String department) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    public Course() {
        this("", "", 0, "");
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().length() < 3)
            throw new IllegalArgumentException("ID must have at least 3 characters");
        int len = id.length();
        for (int i = 0; i < len; i++) {
            char ch = id.charAt(i);
            if (!Character.isLetterOrDigit(ch))  // Corrected logic
                throw new IllegalArgumentException("ID must contain only letters or digits");
        }
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {  // Changed return type to void
        this.credit = credit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%-10s %-30s %10d %-20s", id, title, credit, department);  // Corrected format
    }
}