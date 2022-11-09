public class Faculty {

    public int facultyid;
    public double salary;

  Faculty(){
      facultyid = 0;
      salary = 3000;
  }
  Faculty(int facultyid){
      this.facultyid = facultyid;
  }
  void input(int facultyid){
      this.facultyid = facultyid;
  }
  void setSalary(double salary){
      this.salary = salary;
  }
  void printSalary(){
      System.out.println("\nFaculty ID : "+facultyid+ "\nSalary : "+salary+"\n");
  }
}
