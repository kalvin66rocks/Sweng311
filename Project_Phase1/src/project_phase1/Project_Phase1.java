/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_phase1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Kevin Brenneman
 */
public class Project_Phase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vector<Student> students = new Vector<>(1, 1);
        Vector<Room> rooms = new Vector<>(1, 1);
        String control = "true";
        boolean inputValid = false;
        boolean add = true;

        //create loop logic menu
        while (!control.equals("12")) {
            System.out.printf("Please select which operation you would like to perform\n");
            System.out.printf("Select the number of the option you would like to select\n");
            System.out.printf("1.  Add a room\n");
            System.out.printf("2.  Delete a room\n");
            System.out.printf("3.  Add a course\n");
            System.out.printf("4.  Delete a course\n");
            System.out.printf("5.  Add a student\n");
            System.out.printf("6.  Delete a student\n");
            System.out.printf("7.  Display all active courses\n");
            System.out.printf("8.  Display all courses in a room\n");
            System.out.printf("9.  Display all courses taken by a student\n");
            System.out.printf("10. Display all courses at a certian time\n");
            System.out.printf("11. Add students to an existing course\n");
            System.out.printf("12. Exit the Program\n");
            control = input.next();
            switch (control) {
                case "1":
                    //allow the user to add rooms
                    boolean added = false;
                    int add_room = 0;
                    //get the room from the user
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter room number to add: ");
                            add_room = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                    }
                    inputValid = false;
                    add = true;
                    //check to see if the room already exists
                    for (int i = 0; i < rooms.size(); i++) {
                        if (rooms.get(i).get_number() == add_room) {
                            add = false;
                        }
                    }
                    //create a new room or inform the user that the room already exists
                    if (add == true) {
                        rooms.add(new Room(add_room));
                    } else if (add == false) {
                        System.out.printf("Room already exists\nRoom not added\n");
                    }
                    break;
                case "2":
                    //allow the user to enter a room to be deleted
                    boolean found = false;
                    int delete_room = 0;
                    //get the room to delete from the user
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter room number to delete: ");
                            delete_room = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                    }
                    inputValid = false;
                    //loop through the rooms
                    for (int i = 0; i < rooms.size(); i++) {
                        //if the room matches the query
                        if (rooms.get(i).get_number() == delete_room) {
                            //delete the room and inform the user
                            found = true;
                            rooms.remove(i);
                            System.out.printf("Room %d deleted\n", delete_room);
                        }
                    }
                    //inform the user that the room was not found
                    if (found == false) {
                        System.out.printf("Room %d not found\n", delete_room);
                    }
                    break;
                case "3":
                    //allows the user to add a course and assign students to the course
                    String course_add;
                    int room_select = 0;
                    int class_time = 0;
                    boolean exists = false;
                    boolean conflicts = false;
                    boolean added_1 = false;
                    //has the user enter data about the course and validate it
                    System.out.printf("Enter the name of the course that you would like to add: ");
                    course_add = input.next();
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Select the room you would like to place %s: ", course_add);
                            room_select = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                    }
                    inputValid = false;
                    //check to see if a room already exitst
                    for (int i = 0; i < rooms.size(); i++) {
                        if (rooms.get(i).get_number() == room_select) {
                            exists = true;
                        }
                    }
                    //if a room already exists then we will not create a new one
                    if (!exists) {
                        System.out.printf("Room not found, new room created\n");
                        rooms.add(new Room(room_select));
                    }
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter the time of the class. (valid are 9 - 17): ");
                            class_time = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                        if (class_time < 9 || class_time > 17) {
                            System.out.printf("Invalid time, Please enter a valid time\n");
                            inputValid = false;
                        }
                    }
                    boolean is_course = false;
                    for (int i = 0; i < rooms.size(); i++) //loops through courses
                    {
                        for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                            if (rooms.get(i).courses.get(j).getName().toLowerCase().equals(course_add.toLowerCase())) {
                                if (rooms.get(i).courses.get(j).getTime() == class_time) {
                                    is_course = true;
                                }
                            }
                        }
                    }
                    if(!is_course){
                    inputValid = false;
                    //loop through the rooms
                    for (int i = 0; i < rooms.size(); i++) {
                        //if we see the same room
                        if (rooms.get(i).get_number() == room_select) {
                            //loop through the courses
                            for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                                //if the courses have the same room and time then throw a conflict
                                if (rooms.get(i).courses.get(j).getTime() == class_time) {
                                    conflicts = true;
                                }
                            }
                        }
                    }
                    //if there is a class in this room at the current time
                    if (conflicts == true) {
                        System.out.printf("There is already a class in room %d at time %d\n", room_select, class_time);
                    }
                    //if there is not already a class in the room at the current time
                    if (conflicts == false) {
                        for (int i = 0; i < rooms.size(); i++) {
                            if (rooms.get(i).get_number() == room_select) {
                                rooms.get(i).courses.add(new Course(course_add, class_time, rooms.get(i)));
                            }
                        }
                        boolean add_more = true;
                        //while the user wants to add more students
                        while (add_more) {
                            //displays some prompts to the user
                            System.out.println("Add students by entering their first then last name or -1 to stop enetering stidents");
                            System.out.println("If a student does not exist, you will be prompted to enter their phone number");
                            //System.out.println("if you are not given a confirmation that the student was added then that student has a time conflict");
                            boolean exists1 = false;
                            String first_add;
                            String last_add;
                            boolean has_class = false;
                            int room_element = 0;
                            int student_element = 0;
                            long phone = 0;
                            System.out.printf("First name: ");
                            first_add = input.next();
                            //checks to see if the user wants to escape student input
                            if (first_add.equals("-1")) {
                                add_more = false;
                            }
                            //only continues if we are not escaping
                            if (!first_add.equals("-1")) {
                                System.out.printf("Last name: ");
                                last_add = input.next();
                                //checks to see if the student alread exits
                                for (int i = 0; i < students.size(); i++) {
                                    if (students.get(i).get_first().toLowerCase().equals(first_add.toLowerCase()) && students.get(i).get_last().toLowerCase().equals(last_add.toLowerCase())) {
                                        exists1 = true;
                                        student_element = i;
                                        break;
                                    }
                                }
                                //if the entered student does not exists then prompts the user for the rest of the students information
                                if (!exists1) {
                                    while (!inputValid) {
                                        //gets the input from the user
                                        try {
                                            System.out.printf("Student not found\nEnter a phone number for %s %s: ", first_add, last_add);
                                            phone = input.nextLong();
                                            inputValid = true;
                                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                                        catch (InputMismatchException e) {
                                            System.out.println("\nInvalid Input, that is not a number\n");
                                            input.nextLine();
                                            inputValid = false;
                                        }
                                        if (inputValid) {
                                            //verifies that we are getting a valid phone number from the user
                                            if (phone < 1000000000) {
                                                System.out.printf("That is not a valid phone number, please enter a valid 10 digit phone number\n");
                                                inputValid = false;
                                            }
                                        }
                                    }
                                }
                                inputValid = false;
                                //loops through all the rooms

                                for (int i = 0; i < rooms.size(); i++) {
                                    //saves the value the room is at for later use
                                    if (rooms.get(i).get_number() == room_select) {
                                        room_element = i;
                                    }
                                    //loops through all the courses
                                    for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                                        //loops through all the students taking those courses
                                        if (rooms.get(i).courses.get(j).getTime() == class_time) {
                                            for (int k = 0; k < rooms.get(i).courses.get(j).students.size(); k++) {
                                                //checks to see if we have a matching student
                                                if (rooms.get(i).courses.get(j).students.get(k).get_first().toLowerCase().equals(first_add.toLowerCase()) && rooms.get(i).courses.get(j).students.get(k).get_last().toLowerCase().equals(last_add.toLowerCase())) {
                                                    //signals that we have a conflict
                                                    has_class = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                //if the student does not already exist
                                if (!exists1) {
                                    //add the student to the list of active students
                                    students.add(new Student(first_add, last_add, phone));
                                    //add the student to the course
                                    rooms.get(room_element).courses.lastElement().students.add(students.lastElement());
                                    //let the user know that the student was successfully added
                                    System.out.printf("Student successfully added to class and created\n");
                                    added_1 = true;
                                }
                                //if the student already exist and dos 
                                if (!has_class && exists1) {
                                    rooms.get(room_element).courses.lastElement().students.add(students.get(student_element));
                                    System.out.printf("Student successfully added to class but already created \n");
                                    added_1 = true;
                                }
                                //if the student has a time conflict
                                if (has_class) {
                                    System.out.printf("%s %s has a conflict and was not added\n", first_add, last_add);
                                }
                            }
                            //if the user wants to stop entry make sure the cours has atleast one student
                            if (first_add.equals("-1")) {
                                add_more = false;
                                //if the user has not added alteast 1 student, do not allow them to quit
                                if (added_1 == false) {
                                    add_more = true;
                                    //inform the user they need to add a student to quit
                                    System.out.printf("You must add atleast 1 student to the class\n");
                                }
                            }
                        }
                    }
                    }
                    if(is_course){
                        System.out.printf("That class already exists. Please use 11. Add students to existing course\n");
                    }
                    break;
                case "4":
                    //allows the user to delete a course
                    String course_delete;
                    boolean course_deleted = false;
                    //has the user enter the name of the course the want to delete
                    System.out.printf("Enter the course that you would like to delete:");
                    course_delete = input.next();
                    //loops through rooms
                    for (int j = 0; j < rooms.size(); j++) {
                        //loops through courses
                        for (int i = 0; i < rooms.get(j).courses.size(); i++) {
                            //checks for a matching course
                            if (rooms.get(j).courses.get(i).getName().toLowerCase().equals(course_delete.toLowerCase())) {
                                //deletes the matching course
                                rooms.get(j).courses.remove(i);
                                course_deleted = true;
                            }
                        }
                    }
                    //informs the user if a course was deleted or not
                    if (course_deleted == true) {
                        System.out.printf("Course %s deleted\n", course_delete);
                    } else if (course_deleted == false) {
                        System.out.printf("Course %s does not exist\n", course_delete);
                    }
                    break;
                case "5":
                    //lets the user individually add a student seperately of a class
                    String first;
                    String last;
                    long phone = 0;
                    //prompts the user to enter a first and last name
                    System.out.printf("Please enter the first name: ");
                    first = input.next();
                    System.out.printf("Please enter the last name: ");
                    last = input.next();
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter phone number: ");
                            phone = input.nextLong();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                        //ensures that the user has entered a valid phone number 
                        if (inputValid) {
                            if (phone < 1000000000) {
                                System.out.printf("That is not a valid phone number, please enter a valid 10 digit phone number\n");
                                inputValid = false;
                            }
                        }
                    }
                    inputValid = false;
                    students.add(new Student(first, last, phone));
                    break;
                case "6":
                    //delete student
                    String first_delete;
                    String last_delete;
                    boolean removed = false;
                    //prompts the user to eneter a first and last name
                    System.out.printf("Please enter the first name: ");
                    first_delete = input.next();
                    System.out.printf("Please enter the last name: ");
                    last_delete = input.next();
                    //loops through the list of active students
                    for (int i = 0; i < students.size(); i++) {
                        //checks for a match on first name
                        if (students.get(i).get_first().toLowerCase().equals(first_delete.toLowerCase())) {
                            //checks for a match on last name
                            if (students.get(i).get_last().toLowerCase().equals(last_delete.toLowerCase())) {
                                //removes the matching element
                                students.remove(i);
                                removed = true;
                            }
                        }
                    }
                    //loops through all the rooms
                    for (int i = 0; i < rooms.size(); i++) {
                        //loops through all the courses
                        for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                            //loops through all the students taking those courses
                            for (int k = 0; k < rooms.get(i).courses.get(j).students.size(); k++) {
                                //checks to see if we have a matching student
                                if (rooms.get(i).courses.get(j).students.get(k).get_first().toLowerCase().equals(first_delete.toLowerCase()) && rooms.get(i).courses.get(j).students.get(k).get_last().toLowerCase().equals(last_delete.toLowerCase())) {
                                    rooms.get(i).courses.get(j).students.remove(k);
                                }
                            }
                        }
                    }

                    //put for loop logic here to delete student from classes/rooms
                    //prints out a message on whether or not anything was deleted
                    if (removed == true) {
                        System.out.printf(" %s %s deleted\n", first_delete, last_delete);
                    }
                    if (removed == false) {
                        System.out.printf(" %s %s is not an active student\n", first_delete, last_delete);
                    }
                    break;
                case "7":
                    //displays all active courses
                    //for loop to loop through all the rooms
                    for (int j = 0; j < rooms.size(); j++) {
                        //for loop to loop through all of the courses in each of the rooms
                        for (int i = 0; i < rooms.get(j).courses.size(); i++) {
                            System.out.printf("\n%s room %d\n", rooms.get(j).courses.get(i).toString(), rooms.get(j).get_number());
                        }
                    }
                    break;
                case "8":
                    //allows the user to search for classes by entering a room number
                    int search_room = 0;
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter a room to display all courses held in it ");
                            search_room = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                    }
                    inputValid = false;
                    boolean found1 = false;
                    System.out.printf("Matching courses for room %d displayed below:\n", search_room);
                    //loops through all the rooms
                    for (int i = 0; i < rooms.size(); i++) {
                        //checks to see if we have a matching room
                        if (rooms.get(i).get_number() == search_room) {
                            //loop to display all thr courses in that room
                            for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                                //only prints out if we actually have courses in that room
                                found1 = true;
                                System.out.printf("Course %s Time %d\n", rooms.get(i).courses.get(j).getName(), rooms.get(i).courses.get(j).getTime());
                            }
                        }
                    }
                    //if there are no courses found in a given room
                    if (!found1) {
                        System.out.printf("No courses in room %d\n", search_room);
                    }
                    //room
                    break;
                case "9":
                    //allows the user to display courses taken by a student of which they put in the first and last name for
                    String first_search;
                    String last_search;
                    boolean has_a_class = false;
                    System.out.printf("Enter the first and last name of the student that you would like to search for\n");
                    System.out.printf("First name: ");
                    first_search = input.next();
                    System.out.printf("Last name: ");
                    last_search = input.next();
                    //loops through all the rooms
                    for (int i = 0; i < rooms.size(); i++) {
                        //loops through all the courses
                        for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                            //loops through all the students taking those courses
                            for (int k = 0; k < rooms.get(i).courses.get(j).students.size(); k++) {
                                //checks to see if we have a matching student
                                if (rooms.get(i).courses.get(j).students.get(k).get_first().toLowerCase().equals(first_search.toLowerCase()) && rooms.get(i).courses.get(j).students.get(k).get_last().toLowerCase().equals(last_search.toLowerCase())) {
                                    //displays to the user if we get a match and gives some detail on that match
                                    //problem whenever we cycle through i and j are same whenever displaying courses that match
                                    //so we always see the first course course number of times
                                    System.out.printf("%s %s has %s at %d in room %d\n", first_search, last_search, rooms.get(i).courses.get(j).getName(), rooms.get(i).courses.get(j).getTime(), rooms.get(i).get_number());
                                    has_a_class = true;
                                }
                            }
                        }
                    }
                    //if there are no matches found inform the user
                    if (has_a_class == false) {
                        System.out.printf("%s %s does not have any classes\n", first_search, last_search);
                    }
                    break;
                case "10":
                    //lets the user search for courses offered at a particular time
                    int search_time = 0;
                    boolean match = false;
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter the time of the class to seach for (valid are 9 - 17): ");
                            search_time = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                        //makes sure the user has entered a valid time for a class
                        if (search_time < 9 || search_time > 17) {
                            System.out.printf("Invalid time, Please enter a valid time\n3");
                            inputValid = false;
                        }
                    }
                    System.out.printf("Courses at the selected time diplayed below:\n");
                    inputValid = false;
                    //cycles through all the rooms
                    for (int i = 0; i < rooms.size(); i++) {
                        //cycles thrugh all the courses
                        for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                            //if the search time matches the time the course occurs
                            if (rooms.get(i).courses.get(j).getTime() == search_time) {
                                System.out.printf("%s in room %s\n", rooms.get(i).courses.get(j).getName(), rooms.get(i).get_number());
                                match = true;
                            }
                        }
                    }
                    //if no courses match the time entered
                    if (match == false) {
                        System.out.printf("No courses found at time %d\n", search_time);
                    }
                    break;
                case "11":
                    //allows the user to add a course and assign students to the course
                    String course_search;
                    int index_room = 0;
                    int index_course = 0;
                    int room_time = 0;
                    boolean course_exists = false;
                    //has the user enter data about the course and validate it
                    System.out.printf("Enter the name of the course that you would like to add students to: ");
                    course_search = input.next();
                    //checks to see if the entered course already exists
                    //loops through rooms
                    while (!inputValid) {
                        //gets the input from the user
                        try {
                            System.out.printf("Enter the time of the class. (valid are 9 - 17): ");
                            room_time = input.nextInt();
                            inputValid = true;
                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                        catch (InputMismatchException e) {
                            System.out.println("\nInvalid Input, that is not a number\n");
                            input.nextLine();
                            inputValid = false;
                        }
                        if (room_time < 9 || room_time > 17) {
                            System.out.printf("Invalid time, Please enter a valid time\n");
                            inputValid = false;
                        }
                    }
                    inputValid = false;
                    for (int i = 0; i < rooms.size(); i++) //loops through courses
                    {
                        for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                            if (rooms.get(i).courses.get(j).getName().toLowerCase().equals(course_search.toLowerCase())) {
                                if (rooms.get(i).courses.get(j).getTime() == room_time) {
                                    course_exists = true;
                                    //saves the indexes of students and courses so that we can add to them later in the case statement
                                    index_room = i;
                                    index_course = j;
                                }
                            }
                        }
                    }

                    //if a course doesnot exist, prompt the user of how they can can add it
                    if (!course_exists) {
                        System.out.printf("Class does not exist, please use: 3. Add course\n");
                    }
                    //if the course exists
                    if (course_exists) {
                        boolean add_more = true;
                        //while the user wants to add more students
                        while (add_more) {
                            //displays some prompts to the user
                            System.out.println("Add students by entering their first then last name or -1 to stop enetering stidents");
                            System.out.println("If a student does not exist, you will be prompted to enter their phone number");
                            //System.out.println("if you are not given a confirmation that the student was added then that student has a time conflict");
                            boolean exists1 = false;
                            String first_add;
                            String last_add;
                            boolean has_class = false;
                            int room_element = 0;
                            int student_element = 0;
                            phone = 0;
                            System.out.printf("First name: ");
                            first_add = input.next();
                            //checks to see if the user wants to escape student input
                            if (first_add.equals("-1")) {
                                add_more = false;
                            }
                            //only continues if we are not escaping
                            if (!first_add.equals("-1")) {
                                System.out.printf("Last name: ");
                                last_add = input.next();
                                //checks to see if the student alread exits
                                for (int i = 0; i < students.size(); i++) {
                                    if (students.get(i).get_first().toLowerCase().equals(first_add.toLowerCase()) && students.get(i).get_last().toLowerCase().equals(last_add.toLowerCase())) {
                                        exists1 = true;
                                        student_element = i;
                                        break;
                                    }
                                }
                                //if the entered student does not exists then prompts the user for the rest of the students information
                                if (!exists1) {
                                    while (!inputValid) {
                                        //gets the input from the user
                                        try {
                                            System.out.printf("Student not found\nEnter a phone number for %s %s: ", first_add, last_add);
                                            phone = input.nextLong();
                                            inputValid = true;
                                        } //catches an exceptions that we might get for a mismatch of input entered by the user
                                        catch (InputMismatchException e) {
                                            System.out.println("\nInvalid Input, that is not a number\n");
                                            input.nextLine();
                                            inputValid = false;
                                        }
                                        if (inputValid) {
                                            //verifies that we are getting a valid phone number from the user
                                            if (phone < 1000000000) {
                                                System.out.printf("That is not a valid phone number, please enter a valid 10 digit phone number\n");
                                                inputValid = false;
                                            }
                                        }
                                    }
                                }
                                inputValid = false;
                                //loops through all the rooms

                                for (int i = 0; i < rooms.size(); i++) {
                                    //saves the value the room is at for later use

                                    //loops through all the courses
                                    for (int j = 0; j < rooms.get(i).courses.size(); j++) {
                                        //loops through all the students taking those courses
                                        if (rooms.get(i).courses.get(j).getTime() == rooms.get(index_room).courses.get(index_course).getTime()) {
                                            for (int k = 0; k < rooms.get(i).courses.get(j).students.size(); k++) {
                                                //checks to see if we have a matching student
                                                if (rooms.get(i).courses.get(j).students.get(k).get_first().toLowerCase().equals(first_add.toLowerCase()) && rooms.get(i).courses.get(j).students.get(k).get_last().toLowerCase().equals(last_add.toLowerCase())) {
                                                    //signals that we have a conflict
                                                    has_class = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                //if the student does not already exist
                                if (!exists1) {
                                    //add the student to the list of active students
                                    students.add(new Student(first_add, last_add, phone));
                                    //add the student to the course
                                    rooms.get(index_room).courses.get(index_course).students.add(students.lastElement());
                                    //let the user know that the student was successfully added
                                    System.out.printf("Student successfully added to class and created\n");
                                }
                                //if the student already exist and dos 
                                if (!has_class && exists1) {
                                    rooms.get(index_room).courses.get(index_course).students.add(students.get(student_element));
                                    System.out.printf("Student successfully added to class but already created \n");
                                }
                                //if the student has a time conflict
                                if (has_class) {
                                    System.out.printf("%s %s has a conflict and was not added\n", first_add, last_add);
                                }
                            }
                        }
                    }
                    break;
                case "12":
                    //does nothing, just a proper case statement so that we can exit the program
                    break;
                default:
                    System.out.printf("Invalid Selction\n");
                    break;
            }
        }
    }
}
