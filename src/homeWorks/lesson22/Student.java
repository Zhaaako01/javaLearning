package homeWorks.lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;


    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder sb) {
        if (sb.length() > 3) {
            this.name = sb;
        } else {
            System.out.println("Слишком короткое имя");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else System.out.println("Не правильный курс");
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else System.out.println("Не правильная оценка");
    }

    public void showInfo() {
        System.out.println("Имя студента = " + this.getName());
        System.out.println("Курс студента = " + this.getCourse());
        System.out.println("Оценка студента = " + this.getGrade());
    }
}


class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName(new StringBuilder("Alex"));
        student1.setCourse(4);
        student1.setGrade(1.0);

        student1.showInfo();

    }
}