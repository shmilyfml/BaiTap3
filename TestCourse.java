/*
 * @ (#) TestCourse.java      1.0     8/25/2024
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
public class TestCourse {
    public static void main(String[] args) {


        CourseList courselist = new CourseList(10);
        initData(courselist);

        System.out.printf("%-10s %-30s %10s %-20s%n", "ID", "Title", "Credit", "Department");
        Course[] temp = courselist.getCourses();
        for (Course c : temp) {
            if (c != null)
                System.out.println(c);
        }
    }

    private static void initData(CourseList courselist) {
        Course c1 = new Course("CS101", "Java Programming", 3, "CS");
        Course c2 = new Course("CS102", "Data Structures", 3, "CS");
        // Adding courses to the CourseList
        courselist.addCourse(c1);
        courselist.addCourse(c2);
    }
}