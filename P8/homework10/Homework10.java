package src.P8.homework10;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("xdqiang",21,"stu",1,9000);
        Doctor doctor2 = new Doctor("xdqiang",21,"stu",1,8000);
        System.out.println(doctor1.equals(doctor2));

    }
}
class Doctor{
    String name;
    int age;
    String job;
    int gender;
    double sal;

    public Doctor(String name, int age, String job, int gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        Doctor d = (Doctor)obj;
        return d.name.equals(this.name) && d.job.equals(this.job) && d.age == this.age && d.sal == this.sal && d.gender == this.gender;
    }
}