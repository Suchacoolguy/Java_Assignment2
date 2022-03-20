package Stud;

public class Study {
    public String name;
    public double kor, eng, math;

    public Study(String name, double kor, double eng, double math)
    {
        this.name = name;
        this.kor = kor; this.eng = eng; this.math = math;
    }
    String getName()
    {
        return name;
    }
    double getAverage()
    {
        return (kor + eng + math) / 3;
    }
}
