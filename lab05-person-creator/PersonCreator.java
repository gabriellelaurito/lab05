
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String firstName, lastName, sex, address;
    private int age, feet, inches, weight, socialSecurity, phoneNumber, dob, height1, height2;
    
    public PersonCreator (String name)
    {}
    //First and last names
    public void getName(String name1,String name2)
    {
        firstName = name1;
        lastName = name2;
    }
    //Sex
    public void getGender(String sex)
    {
      if(sex != "male" || sex != "female")
        System.err.println("That is not a valid input.");
    }
    //Height
    public void getHeight(int feet, int inches)
    {
        if(0 < feet || feet < 10)
            System.err.println("That is not a valid height");
            else
            height1 = feet;
        if(0 <= inches || inches < 13)
            System.err.println("That is not a valid height");
            else
            height2 = inches;
    }
    //Shows all values
    public void printPerson()
    {System.out.println("Full name: "+ firstName +" " + lastName);
            
    }     
}
