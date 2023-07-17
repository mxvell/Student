import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Group {
    File fileGroup = new File("fileGroup.txt");
    private Student[] studentsArray = new Student[10];
    private int max;


    public void add(Student student) throws MyException {
        boolean isAdd = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
                isAdd = true;
                break;
            }
        }
        try {
            if (!isAdd) {
                throw new MyException();
            }
        } catch (MyException e) {
            e.getMessage();
        }

    }

    public void addInteractive() throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write student name: ");
        String name = sc.nextLine();
        System.out.println("Write Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Sex: ");
        String sex = sc.nextLine();
        System.out.println("Write age student: ");
        int age = sc.nextInt();
        System.out.println("Write weight: ");
        double weight = sc.nextDouble();
        System.out.println("Write course student: ");
        String course = sc.nextLine();
        this.add(new Student(name, lastName, sex, age, weight, course));
    }

    public String findByLastName(String lastName) {
        for (Student student : studentsArray) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student.showInfo();
            }
        }
        return " we don't add new student";
    }



    //    public String deleteStudent(String lastName) {
//        for (Student student : studentsArray) {
//            if (student != null && student.getLastName().equals(lastName)) {
//                return student.showInfo();
//            }
//
//        }
//        return "student delete " + lastName;
//    }
//    public void deleteStudent(String lastName) {
//        for (int i = 0; i < studentsArray.length; i++) {
//            if (studentsArray[i] == null) {
//                continue;
//            }
//            String studentLastName = studentsArray[i].getLastName();
//            if (studentLastName.equals(lastName)) {
//                studentsArray[i] = null;
//                max--;
//            }
//
//        }
//    }
    public void deleteStudent(String name) {
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] != null && studentsArray[i].getName().equals(name)) {
                studentsArray[i] = null;
                System.out.println(name + "was removed");
                return;
            }
        }
        System.out.println("Can't find student " + name);
    }

    public void saveStudentFile() throws IOException{
        try (PrintWriter printWriter = new PrintWriter(fileGroup) ){
            for (Student student : studentsArray){
                if (student != null){
                    printWriter.println(student.getName() + ";" + student.getLastName() + ";" + student.getSex() + ";" + student.getWeight() + ";" + student.getCourse());
                }
            }
        }catch (IOException e){
            e.getMessage();
        }
    }

    public void sortGroup(String param) {
        Arrays.sort(studentsArray, (st1, st2) -> {
            if ((st1 != null) && (st2 == null)) {
                return -1;
            } else if ((st1 == null) && (st2 != null)) {
                return 1;
            } else if ((st1 == null) && (st2 == null)) {
                return 0;
            } else {
                switch (param) {
                    case "name":
                        return st1.getName().compareTo(st2.getName());
                    case "lastName":
                        return st1.getLastName().compareTo(st2.getLastName());
                    case "sex":
                        return st1.getSex().compareTo(st2.getSex());
                    case "course":
                        return st1.getCourse().compareTo(st2.getCourse());
                    case "age":
                        return st1.getAge() - st2.getAge();
                    default:
                        System.out.println("Uk parameter");
                }
            }
            return 0;
        });
    }


    public void info() {
        System.out.println(Arrays.toString(studentsArray) + " \n ");
    }

}



