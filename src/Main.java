import java.io.IOException;

public class Main {
    public static void main(String[] args) throws MyException, IOException {
        Group group = new Group();
        Student st1 = new Student("Max ", "Prachyk ", " Male ", 20, 78, " Computer eng" + " \n");
        Student st2 = new Student("Valia ", "Thymbalyk ", "Female ", 17, 45, " English " + " \n");
        Student st3 = new Student("Sonya ", "Burdelna ", "Female ", 18, 38, "Biolygy " + " \n");
        Student st4 = new Student("Yulana ", "Goncharyk ", "Female ", 18, 55, "Marketing " + "\n");
        Student st5 = new Student("Dima ", "Moskovchyk ", "Male ", 21, 120, "Math " + "\n");
        Student st6 = new Student("Alex ", "Nikiforov ", "Male ", 21, 66, "Geog " + "\n");
        Student st7 = new Student("Yuroslav ", "Gabryk ", "Male ", 20, 75, "Law " + "\n");
        Student st8 = new Student("Nikita ", "Moroka ", "Male ", 15, 80, "Algerba " + "\n");
        Student st9 = new Student("Valia ", "Prachyk ", "Female ", 25, 50, "Art " + "\n");
        Student st10 = new Student("Vlad ", "Bakymenko ", "Male ", 20, 85, "Music " + "\n");
        Student st11 = new Student("11", "Bo", "Male", 20, 85, "Music");
        try {
            group.add(st1);
            group.add(st2);
            group.add(st3);
            group.add(st4);
            group.add(st5);
            group.add(st6);
            group.add(st7);
            group.add(st8);
            group.add(st9);
            group.add(st10);
            group.add(st11);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        group.sortGroup("lastName");
        group.saveStudentFile();
        group.info();


    }
}

