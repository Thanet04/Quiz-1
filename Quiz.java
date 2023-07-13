class Quiz {
 public static void main(String[] args) {
    student s1 = new student();
    s1.getID(65022544);
    s1.getName("Thanet");
    s1.getaddmission(2);
    s1.getGPA(3.69); 
    s1.ShowDetails();
 }
    
}

class student{
    int ID;
    String Name;
    int addmissionYear;
    double GPA;

    student(){
        this.ID = 0;
        this.Name = "JIN";
        this.addmissionYear = 1;
        this.GPA = 4.00;
    }

    public int  getID(int newID){
        this.ID = newID;
        return ID;
    }

    public String getName(String newName){
        this.Name = newName;
        return Name;
    }
   
    public int  getaddmission(int newaddmission){
        this.addmissionYear = newaddmission;
        return addmissionYear;
    }

    public double  getGPA(double newGPA){
        this.GPA = newGPA;
        return GPA;
    }

    public void ShowDetails(){
        System.out.println("ID :"+this.ID);
        System.out.println("Name :"+this.Name);
        System.out.println("addmissionYear :"+this.addmissionYear);
        System.out.println("GPA :"+this.GPA);
    }
}