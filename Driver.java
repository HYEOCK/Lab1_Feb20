package Lab1;

public class Driver {
    public static void main(String[] args) {
        Model m1 = new Model("Hyeock", "Gu", 72, 45.1, false, true );
        System.out.println("Name : " + m1.getFirstName() + "" + m1.getLastName());
        System.out.println("Height : " + m1.getHeightInches());
        System.out.println("Weight : " + m1.getWeightKg());
        System.out.println("travel? : " + m1.getTraveler());
        System.out.println("smoke? : " + m1.getSmoker());




    }
}

