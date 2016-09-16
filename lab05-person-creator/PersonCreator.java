
/**
 * Write a description of class PersonCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;
    private String ssn;
    private String address;
    private int phoneNumber;
    private String dob;

    public PersonCreator(String first, String last)
    {
        name = first + " " + last;
    }

    public void setAge(int newAge)
    {
        if (newAge > 10 && newAge < 99)
        {
           age = newAge;
        }

        else
        {
          System.err.println("Please enter a valid age");
        }

    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public void setHeight(int newHeight)
    {
        height = newHeight;
    }

    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }
}
