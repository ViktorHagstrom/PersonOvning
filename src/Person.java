import java.util.Calendar;

public class Person {

    // Instansvaribler/Field/Egenskaper/Attribut
    String firstName;
    String lastName;
    String dateOfBirth; // YYYY-MM-DD
    double height; // i meter
    double weight; // i kg

    /**
     * En klassmetod som returnerar hela namnet
     * @param p en instansav klassen Person
     * @return fullständigt namn (förnamn + efternamn)
     */
    // Metoder/Operationer/Funktioner
   public static String getName(Person p){ // public är en åtkomstmodifierare
       return p.firstName + " " + p.lastName;
   }
   public static int getAge(Person p){
       // Mer om kalendar på sid 25.

     String calendar = Calendar.getInstance().getTime().toString();
     String thisYearString = calendar.substring(calendar.lastIndexOf(' ' + 1));
     int thisYearInt = Integer.parseInt(thisYearString);
       System.out.println("S" + thisYearString);
       System.out.println("I" + thisYearInt);

     String personYear = p.dateOfBirth.substring(0,4);
     int year = Integer.parseInt(personYear);
       System.out.println(personYear);
       System.out.println(year);

       
       return thisYearInt - year;
   }

    /**
     * En klassmetod som returnerar bmi
     * @param p en referensvariabel av typen Person
     * @return
     */
   public static double getBMI(Person p){
       //Vikt / (Längd*2)double BMI =
       return p.weight /(p.height*2);
   }


   public static String getBMICategory(Person p){

       double BMI = getBMI(p);

       String category;
       if(BMI < 18.5)
           category = "Undervikt";
       else if (BMI < 25)
           category ="Normalvikt";
       else category = "Övervikt";

       return category;
   }

}
