package Aug_ex24082024;

import java.util.*;

public class Lab056 {
    public static void main(String[] args) {
        Student s = new Student(18, "Praveen");
        Student s1 = new Student(1, "Prakash");
        Student s2 = new Student(10, "Iyli");


        List a = new LinkedList();
        //or
        //ArrayList a = new ArrayList();
        a.add(s);
        a.add(s1);
        a.add(s2);
        System.out.println(a);
//        Collections.sort(a);  // -->  This is for Comparable class
        Collections.sort(a, new Sortbyid());
        Collections.sort(a, new Sortbyname());
        Collections.sort(a, new Sortbyid.Sortbydesc());

        System.out.println(a);
    }
}

class Sortbyname implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Sortbyid implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }

static class Sortbydesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}
}
//class Student implements Comparable<Student>{
class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

// This is for id
//    @Override
//    public int compareTo(Student another) {
//        return Integer.compare(this.id, another.id);
//    }

    // This for name
//    @Override
//    public int compareTo(Student another) {
//        return CharSequence.compare(this.name, another.name);
//    }
}