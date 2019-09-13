package tree;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author simba@onlying.cn
 * @date 2019/9/14 0:22
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
class test01{
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("LiLei",27));
        studentSet.add(new Student("ZhangSan",24));
        studentSet.add(new Student("LiSi",26));
        studentSet.add(new Student("WangWu",25));

        for (Student student:studentSet){
            System.out.println(student);
        }
    }
}
