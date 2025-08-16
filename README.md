# Java Collections Framework — Day 6

This project demonstrates the **Java Collections Framework** in action, focusing on:

- **List → ArrayList**
- **Map → HashMap**
- **Set → HashSet**
- **Sorting custom objects** using `Comparable` and `Comparator`

---

## 🚀 Why Collections Framework?

Arrays in Java are **fixed in size** and provide **limited utilities**.  
The **Collections Framework** provides:

- **Dynamic data structures** (grow/shrink automatically)
- **Ready-made algorithms** (sorting, searching, iteration)
- **Type safety with generics** (`ArrayList<String>`)
- **Consistent APIs** for different data structures

---

## 📚 Key Concepts Covered

### 1. **ArrayList**
- Resizable array
- Fast random access (O(1) for `get()`)
- Example:
  ```java
  ArrayList<String> names = new ArrayList<>();

  2. HashMap

Stores key–value pairs

Keys are unique

Average O(1) access, insertion, deletion

Example:
HashMap<String, Integer> marks = new HashMap<>();
marks.put("Alice", 90);
marks.put("Bob", 85);

3. HashSet

Stores unique elements only

No guaranteed order

Example:
HashSet<String> fruits = new HashSet<>();
fruits.add("Apple");
fruits.add("Banana");

4. Generics

Enforces type safety

Prevents runtime ClassCastException

Example:

ArrayList<String> list = new ArrayList<>();
list.add("Hello");

5. Sorting Custom Objects

Comparable → natural order (inside the class)

Comparator → custom order (outside the class)

🧑‍💻 Example: Student Class
class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return other.marks - this.marks; // Sort by marks (descending)
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

📂 Code File

Path: java-basics/day6/collections.java

Class: CollectionsExample

📝 Program Flow

Create ArrayList<Student> and add students.

Print original list.

Sort by marks using Comparable.

Store data in HashMap<String, Integer> (name → marks).

Store unique marks in a HashSet<Integer>.

🔎 Dry-Run & Output
Input:

students.add(new Student("Alice", 90));
students.add(new Student("Bob", 85));
students.add(new Student("Charlie", 92));

Output:
Original List:
Alice (90)
Bob (85)
Charlie (92)

Sorted by Marks (Descending):
Charlie (92)
Alice (90)
Bob (85)

HashMap (Name → Marks):
{Charlie=92, Alice=90, Bob=85}

Unique Marks:
[92, 90, 85]

✅ Best Practices

Always use Generics for type safety.

Use ArrayList when random access is required.

Use LinkedList when frequent insert/delete is needed.

Use HashMap for fast key-based lookup.

Use HashSet when you need uniqueness.

🏗️ Next Steps

Learn TreeSet and TreeMap for sorted collections.

Explore Streams API (map, filter, collect).

Study Concurrent Collections (ConcurrentHashMap, CopyOnWriteArrayList).

📌 Summary

This project covers the foundations of the Collections Framework —
preparing you for real-world use cases, competitive coding, and system design interviews.
  names.add("Alice");
  names.add("Bob");
