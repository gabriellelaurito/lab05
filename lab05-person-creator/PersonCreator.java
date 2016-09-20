
public class PersonCreator
{
    /*
     * Description - Fields that the user will fill out
     */
    private String name;
    private int age;
    private String sex;
    private int height;
    private int weight;
    private String ssn;
    private String address;
    private int phoneNumber;
    private String dob;

    /*
     * Description - Creates the users name: First Name and Last Name
     * Input - String first name, String last name
     * Output - String first name, String last name
     * Example - Alex Blackwood
     */
    public PersonCreator(String first, String last)
    {
        name = first + " " + last;
    }

    /*
     * Description - Sets the users age
     * Input - int, users age
     * Output - int, users age 
     */
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

    public void setSSN(int SSN1, int SSN2, int SSN3)
    {
        if (SSN1 < 100 || SSN1 > 999)
        {
            System.err.println("Please enter a valid SSN");
        }
        
        else if (SSN2 < 100 || SSN2 > 999)
        {
            System.err.println("Please enter a valid SSN");
        }
        
        else if (SSN3 < 100 || SSN3 > 999)
        {
            System.err.println("Please enter a valid SSN");
        }
        
        else
        {
            ssn = SSN1 + "-" + SSN2 + "-" + SSN3;
        }
    
    }
    
    public void setAddress()
    
}
