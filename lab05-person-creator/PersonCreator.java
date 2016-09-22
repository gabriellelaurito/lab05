
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
    private String phoneNumber;
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
    
    /*
     * Description - Sets the users sex
     */
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    /*
     * Description - Sets the users height
     */
    public void setHeight(int newHeight)
    {
        height = newHeight;
    }

    /*
     * Description - Sets the users weight
     */
    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }

    /*
     * Description - Creates the users SSN
     * Input - int SSN1, int SSN2, int SSN3
     * Output - int SSN1, int SSN2, intSSN3
     * Example - 666-66-6666
     */
    public void setSSN(int SSN1, int SSN2, int SSN3)
    {
        if (SSN1 < 100 || SSN1 > 999)
        {
            System.err.println("Please enter a valid SSN");
        }
        
        else if (SSN2 < 10 || SSN2 > 99)
        {
            System.err.println("Please enter a valid SSN");
        }
        
        else if (SSN3 < 1000 || SSN3 > 9999)
        {
            System.err.println("Please enter a valid SSN");
        }
        
        else
        {
            ssn = SSN1 + "-" + SSN2 + "-" + SSN3;
        }
    
    }
    
    /*
     * Description - Sets the users address
     * Input - String HouseNum, String StreetName, String StreetType
     * Output - String HouseNum, String StreetName, String StreetType
     * Example - 666 Hell Blvd
     */
    public void setAddress(String HouseNum ,String StreetName ,String StreetType)
    {
        address = HouseNum + " " + StreetName + " " + StreetType;
    }
    
    /*
     * Description - Sets the users phone number
     * Input - int areaCode, int numBegin, int numEnd
     * Output - int areaCode, int numBegin, int numEnd
     * Example - 666-666-6666
     */
    public void setPhoneNumber(int areaCode, int numBegin, int numEnd)
    {
        phoneNumber = "100-100-1000";
    
        if (areaCode < 100 || areaCode > 999)
        {
            System.err.println("Please enter a valid areaCode");
        }
        
        else if (numBegin < 100 || numBegin > 999)
        {
            System.err.println("Please enter a valid numBegin");
        }
        
        else if (numEnd < 1000 || numEnd > 9999)
        {
            System.err.println("Please enter a valid numEnd");
        }
        
        else
        {
            phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;
        }
    
    
    
    }
    
    /*
     * Description - Sets the users DOB
     * Input - String Month ,String Day ,String Year
     * Output - String Month ,String Day ,String Year
     * Example - June 6 2006
     */
    public void setDOB(String Month ,String Day ,String Year)
    {
        dob = Month + " " + Day + " " + Year;
    }

    
}
