public class ParttimeFaculty extends Faculty{
    public double hours;
    public double rate;

    ParttimeFaculty(){
        hours = 0;
        rate = 100;
    }

    ParttimeFaculty(int facultyid){
        super(facultyid);
    }
    void input(double hours,double rate){
        this.rate = rate;
        this.hours = hours;
        super.setSalary(hours*rate);
    }

}
