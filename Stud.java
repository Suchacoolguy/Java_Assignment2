public class Stud {
    public String name;
    public double kor, eng, math;

    public Stud(String iName, double iKor, double iEng, double iMath)
    {
        name = iName;
        kor = iKor; eng = iEng; math = iMath;
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
