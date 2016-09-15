
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String firstName, lastName, sex, address, street, town, state, male, female, q, m, n, o;
    private int age, feet, inches, weight, socialSecurity, phoneNumber, dob, height1, height2, houseNum, zip, d, e, f, SSN, a, b, c, g, h, i, month, date, year, k, p;
    private int first, second, third, num1, num2, num3;
    
    public PersonCreator (String name)
    {}
    //First and last names
    public void getName(String name1,String name2)
    {
        firstName = name1;
        lastName = name2;
    }
    //Sex
    public void getSex(String z)
    {
      if(z != male || z != female)
        System.err.println("That is not a valid input.");
        else
        sex = z;
    }
    //Height
    public void getHeight(int feet, int inches)
    {
        height1 = feet;
        height2 = inches;
        if(0 > feet || feet > 9)
            System.err.println("That is not a valid height.");
            else
            height1 = feet;
        if(0 >= inches || inches > 13)
            System.err.println("That is not a valid height.");
            else
            height2 = inches;
    }
    //Address
    public void getAddress(int houseNum, String address, String street, String town, String state, int zip)
    {
        houseNum = k;
        address = q;
        street = m;
        town = n;
        state = o;
        zip = p;
        if(k < 0)
            System.err.println("That is not a vaild house number.");
        if(p <= 10000 || p > 100000)
            System.err.println("That is not a vaild zip code.");
    }
    //Social Security Number
    public void SSN(int d, int e, int f)
    {
        first = d;
        second = e;
        third = f;
        if(d <= 100 || d > 1000 || e <= 10 || e > 100 || f <= 1000 || f > 10000)
            System.err.println("That is not a valid Social Security Number.");
    }
    //Phone Number
    public void getPhonenumber(int a, int b, int c)
    {
        num1 = a;
        num2 = b;
        num3 = c;
        if(a <= 100 || a > 1000 || b <= 100 || b > 1000 || c <= 1000 || c > 10000)
        System.err.println("That is not a valid phone number.");
    }
    //Date of Birth
    public void getDateofBirth(int g, int h, int i)
    {
        month = g;
        date = h;
        year = i;
        if(g < 0 || g > 13 || h < 0 || h > 32 || i < 1800 || i > 2017)
        System.err.println("That is not a valid date of birth."); 
    }
    //Weight
    public void getweight(int j)
    {
        weight = j;
        if(j < 0 || j > 400)
        System.err.println("That is not a valid weight.");
    }
        
    //Shows all values
    public void printPerson()
    {
        System.out.println("Full name: "+ firstName +" "+ lastName);
        System.out.println("Sex: "+ sex); 
        System.out.println("Height: "+ feet +"'"+ inches +"''");
        System.out.println("Address: "+ houseNum +", "+ address +", "+ street);
        System.out.println(town +", "+ state + ", "+ zip);
        System.out.println("Social Security Number: "+first+"-"+second+"-"+third);
        System.out.println("Phone Number: "+ num1 +"-"+ num2 +"-"+num3);
        System.out.println("Date of Birth: "+month+"/"+date+"/"+year);
        System.out.println("Weight: "+weight);
    }     
}
