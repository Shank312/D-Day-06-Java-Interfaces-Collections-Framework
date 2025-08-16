
// Import all utility classes (Arraylist, Hashmap, Hashset, Collections, etc.)

import java.util.*;

class Student implements Comparable<Student> {
    String name;            // field to store student's name
    int marks;              // fiels to store student's marks

    // Constructor to initialize name and marks
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
// Implement the compareTo() method of Comparable interface
@Override 
public int compareTo(Student other) {
    // Sort students by marks in decending order
    // If "other" has more marks, result is positive -> other comes first
    return other.marks - this.marks;
    }
    
    // Override toString() so Printing a Student object shows "Name (Marks)"
    @Override
    public String toString() {
        return name + " (" + marks + ") ";

    }
}


// Main class
public class CollectionsExample {
    public static void main(String[] args) {

        // 01. Arraylist of the students
        ArrayList<Student> students = new ArrayList<> ();

        // Add Student objetcts to the ArrayList
        students.add(new Student("Alice", 90));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 92));

        // Print origional list (insertion order)
        System.out.println("Origional List: ");
        for (Student s : students) {
            System.out.println(s);             // calls Student.toString()

        }

        // 02. Sort by marks using comparable

        Collections.sort(students);           // sorts in-place using compareTo method

        // Print the list after sorting 
        System.out.println("\nSorted by Marks (Descending): ");
        for (Student s : students) {
            System.out.println(s);
        }

        // 03. HashMap: Student name -> Marks
        HashMap<String, Integer> marksMap = new HashMap<>();

        // Put each student name as key and marks as value
        for (Student s : students) {
            marksMap.put(s.name, s.marks);
        }

        // Print the HashMap
        // Note: Order is not guaranteed in HashMap
        System.out.println("\nHashMap (Name → Marks):");
        System.out.println(marksMap);

        // -------------------------------
        // 4. HashSet: Unique Marks
        // -------------------------------
        HashSet<Integer> uniqueMarks = new HashSet<>();

        // Add marks to HashSet (duplicates automatically removed)
        for (Student s : students) {
            uniqueMarks.add(s.marks);
        }

        // Print the unique marks
        // Note: HashSet does not maintain order
        System.out.println("\nUnique Marks:");
        System.out.println(uniqueMarks);
    }
}