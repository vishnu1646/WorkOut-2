 class FulltimeFaculty extends Faculty {

    public double basicsalary;
    public double allowance;

    FulltimeFaculty(){
        basicsalary = 5000;
        allowance = 0.5;
    }

    FulltimeFaculty(int facultyid){
        super(facultyid);
    }
    void input(double basicsalary, double allowance){
        this.basicsalary = basicsalary;
        this.allowance= allowance;
        super.setSalary(basicsalary + allowance);
    }
}
