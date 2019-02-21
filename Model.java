package Lab1;

public class Model {
    private String firstName;
    private String lastName;
    private int heightInches;
    private double weightKg;
    private boolean traveler;
    private boolean smoker;
    private static String occupation = "Modeling";



    public Model(){
        setFirstName(firstName);
        setLastName(lastName);
        setHeightInches(heightInches);
        setWeightKg(weightKg);
        setTraveler(traveler);
        setSmoker(smoker);
        setOccupation(occupation);
    }



    public Model(String firstName, String lastName, int heightInches, double weightKg, boolean traveler, boolean smoker) {
        this.firstName = firstName = "Hyeock";
        this.lastName = lastName = "Gu";
        this.heightInches = heightInches;
        this.weightKg = weightKg;
        this.traveler = traveler;
        this.smoker = smoker;
        this.occupation = occupation;
    }



    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getHeightInches() {
        return this.heightInches;
    }

    public double getWeightKg() {
        return this.weightKg;
    }

    public boolean getTraveler(){ return  this.traveler; }

    public boolean getSmoker(){ return this.smoker; }



    private void setFirstName(String firstName) {
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeightInches(int height) {
        this.heightInches = heightInches;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public final void setTraveler(boolean traveler) {
        this.traveler = traveler;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public static void setOccupation(String occupation) {
        Model.occupation = occupation;
    }


public void printDetails(){
    System.out.println("Name : " + getFirstName() + "" + getLastName());
    System.out.println("Height : " + getHeightInches() + "inches");
    System.out.println("Weight : " + Math.round(getWeightKg()) + "kg");
    if(true == true){
        System.out.println("Does travel ");
    }else{
        System.out.println("Does not travel ");
    }
    if(smoker == true){
        System.out.println("Does smoke ");
    }else{
        System.out.println("Does not smoke ");
    }
}



//    public void firstName(String firstName){
//        System.out.println(this.firstName + "Hyeock" + firstName);
//    }
//    public void heightInches(int heightInches){
//        System.out.println(this.heightInches + 153 + heightInches);
//        System.out.println("I will grow up!");
//    }
//    public  void weight(double weightKg){
//        System.out.println(this.weightKg + 42.3 + weightKg);
//        System.out.println("It's secret!");
//    }
//    public void traveler(){
//        if (this.traveler){
//            this.traveler = true;
//        }else {
//            System.out.println("You need to travel.");
//        }
//    }
//    public void smoker(){
//        if (this.smoker){
//            this.smoker = false;
//        }else {
//            System.out.println("You should be STOP!");
//        }
//    }


}
