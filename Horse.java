//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross

public class Horse {
    //creating attributes
    String name;
    String gender;
    int birthYear;
    int birthMonth;
    int birthDay;
    int age;
    String oldNames[];
    int numberOfNames = 0;

    //constructor
    public Horse (String horseName,String horseGender,int year,int month,int day){
        gender = horseGender; //setting gender to horseGender
        name = horseName; //setting name to horseName
        birthYear = year; //setting birthYear to year
        birthMonth = month; //setting birthMonth to month
        birthDay = day; //setting birthDay to day
    }

    //setting horse age
    public void setAge (int currentYear,int currentMonth) {
        int year = currentYear - birthYear;
        int month = currentMonth - birthMonth;
        if (month < 0) {
            age = year + month;
        } else {
            age = year;
        }
    }

    //changing horse age on birthday
    public void Birthday (int currentMonth,int currentDay) {
        if (currentMonth == birthMonth) { //checking if currentMonth is their birthMonth
            if (currentDay == birthDay) { //checking if currentDay is birthDay
                age++; //adding 1 to age
                System.out.println("Happy birthday, "+name+"! "+name+" turned "+age+".");
            }
        }
    }

    //changing horse's name
    public void nameChange (String newName) {
        oldNames[numberOfNames] = name; //setting last index of oldName array to name
        numberOfNames++; //adding 1 to number of names
        name = newName; //setting name to newName
    }

    public String toString () {
        return name;
    }

    //printing horse details
    public void printHorse () {
        System.out.println(name+" is a "+age+" year old "+gender+" horse");
    }

    public static void main(String[] args) {

        //creating new horse named "Jet"
        Horse horse1 = new Horse("Jet", "male", 2000, 10, 27);
        //creating new horse named "Minx"
        Horse horse2 = new Horse("Minx", "female", 2015, 6, 19);
        //creating new horse named "Kai"
        Horse horse3 = new Horse("Kai", "male", 2007, 9, 11);

        //setting horse1 age
        horse1.setAge(2022, 10);
        //setting horse2 age
        horse2.setAge(2022, 10);
        //setting horse3 age
        horse3.setAge(2022, 10);

        //running Birthday for horse1
        horse1.Birthday(10, 27);
        //printing horse1
        horse1.printHorse();
        //printing horse2
        horse2.printHorse();
        //printing horse3
        horse3.printHorse();
    }
}