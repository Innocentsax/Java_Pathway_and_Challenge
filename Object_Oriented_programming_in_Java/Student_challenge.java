public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}



public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++){
            LPAStudent student = new LPAStudent("SQ16" + i,
                    switch (i){
                case 1 -> "Innocent"; case 2 -> "Charles"; case 3 -> "Udo";
                case 4 -> "Harry"; case 5 -> "Babe"; default -> "Auonymous";
                    }, "02- July 1996", "Java Class");

            System.out.println(student);

        }

        Student pojoStudent = new Student("SQ16A3", "SeniorDevs", "12/06/2023", "Java-16");
        LPAStudent recordStudent = new LPAStudent("SQ16A4", "Paul", "12/06/2023", "Java-16");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}

public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}
