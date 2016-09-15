
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String firstName, lastName, sex, address, street, town, state, q, m, n, o, gender;
    private int age, feet, inches, weight, socialSecurity, phoneNumber, dob, height1, height2, houseNum, zip, d, e, f, SSN, a, b, c, g, h, i, month, date, year, k, p;
    private int first, second, third, num1, num2, num3;
    
    public PersonCreator (String name)
    {}
    /*First and last names
     * Input: String
     * Output: No output. The value of name1 and name2 will become enter value name.
     * Example: Enter in firstName Gabrielle, name1 = Gabrielle
     */
    public void getName(String name1,String name2)
    {
        firstName = name1;
        lastName = name2;
    }
    /*Sex
     * Input: String
     * Output: No output. The value of sex will become the enter value name.
     * Example: Enter male into z, sex = male
     */
    public void getSex(String z)
    {
      if(z != "male" && z != "female")
        System.err.println("That is not a valid input.");
        else
        gender = z;
    }
    /*Height
     * Input: int
     * Output: No output. The value of feet and inches will become the value enter name.
     * Example: Enter 5 into feet, height1 = 5
     */
    public void getHeight(int feet, int inches)
    {
        height1 = feet;
        height2 = inches;
        if(0 >= feet || feet >= 9)
            System.err.println("That is not a valid height.");
            else
            height1 = feet;
        if(0 >= inches || inches >= 13)
            System.err.println("That is not a valid height.");
            else
            height2 = inches;
    }
    /*Address
     * Input: String and int
     * Output: No output. The value of k-p will become the value enter name.
     * Example: enter 53 into k, houseNum = 53; Enter "Garden City" for n, town = "Garden City
     */
    public void getAddress(int k, String q, String m, String n, String o, int p)
    {
        houseNum = k;
        address = q;
        street = m;
        town = n;
        state = o;
        zip = p;
        if(k < 0)
            System.err.println("That is not a vaild house number.");
        if(p < 10000 || p >= 100000)
            System.err.println("That is not a vaild zip code.");
    }
    /*Social Security Number
     * Input: int
     * Output: No output. The value of d-e will become the value enter name.
     * Example: Enter 111 into d, first = 111
     */
    public void SSN(int d, int e, int f)
    {
        first = d;
        second = e;
        third = f;
        if(d < 100 || d >= 1000 || e < 10 || e > 100 || f < 1000 || f >= 10000)
            System.err.println("That is not a valid Social Security Number.");
    }
    /*Phone Number
     * Input: int
     * Output:No output. The value of a-c will become the value enter name.
     * Example: Enter 100 into a, numb1 = 100
     */
    public void getPhonenumber(int a, int b, int c)
    {
        num1 = a;
        num2 = b;
        num3 = c;
        if(a < 100 || a >= 1000 || b <= 100 || b > 1000 || c < 1000 || c >= 10000)
        System.err.println("That is not a valid phone number.");
    }
    /*Date of Birth
     * Input: int
     * Output: No output. The value of g-h will become the value enter name.
     * Example: enter 3 into g, month = 3
     */
    public void getDateofBirth(int g, int h, int i)
    {
        month = g;
        date = h;
        year = i;
        if(g < 0 || g > 13 || h < 0 || h > 32 || i < 1800 || i > 2017)
        System.err.println("That is not a valid date of birth."); 
    }
    /*Weight
     * Input: int
     * Output: No output. The value of j will become the value enter name.
     * Example: Enter 100 into j, weight = 100
     */
    public void getweight(int j)
    {
        weight = j;
        if(j < 0 || j > 1000)
        System.err.println("That is not a valid weight.");
    }
        
    /*Shows all values
     * Input: 
     * Output:
     * Example:
     */
    public void printPerson()
    {
        System.out.println("Full name: "+ firstName +" "+ lastName);
        System.out.println("Sex: "+ gender); 
        System.out.println("Height: "+ height1 +"'"+ height2 +"''");
        System.out.println("Address: "+ houseNum +", "+ address +", "+ street);
        System.out.println(town +", "+ state + ", "+ zip);
        System.out.println("Social Security Number: "+first+"-"+second+"-"+third);
        System.out.println("Phone Number: "+ num1 +"-"+ num2 +"-"+num3);
        System.out.println("Date of Birth: "+month+"/"+date+"/"+year);
        System.out.println("Weight: "+weight);
    }     
}
