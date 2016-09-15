
/**
 * PersonCreator models a person class that has a name, age, sex, height, 
 * weight, social security, address, phone number, and date of birth.
 * 
 * @author (nikkirobertson) 
 * @version (2016.09.13)
 */
public class PersonCreator
{
    // The name of the person.
    private String name;
    // The age of the person.
    private int age;
    // The sex of the person.
    private String sex;
    // The height of the person.
    private int height;
    // The weight of the person.
    private double weight;
    // The social security number
    private int socialSecurity;
    //The address of the person.
    private String address;
    // The phone number of the person.
    private int phoneNumber;
    //The date of birth of the person.
    private int date;
/**
 * Create a person that requires a first and last name.
 */ 
public PersonCreator (String firstName, String lastName)
{
    name = firstName +" "+ lastName;
   
}
    
/**
 * @Assign values to attributes.
 */

public void setAge (int newAge)
{
    age = newAge;
}
public void setSex (String newSex)
{
    sex = newSex;
}
public void setHeight (int newHeight) 
{
    height = newHeight;
}
public void setWeight (int newWeight)
{
    weight = newWeight;
}
public void socialSecurity (int numStart, int numMid, int numEnd)
{
    if (numStart <100 || numStart > 999){
    
        System.err.println("Pleaseusevalidnumber.");
    
    } else if (numMid <10 || numMid > 99){
    
        System.err.println("Pleaseusevalidnumber.");
    } else if (numEnd  <100 || numEnd > 999){
    
        System.err.println("Pleaseusevalidnumber.");
    } else {// if not numStart <100 || numStart>999) is not true do
        socialSecurity = numStart + "-" + numMid + "-" + numEnd;}
}  
public void setAddress (String newAddress) 
{
    address = newAddress;
}
public void changeNumber (int areaCode,int firstNum, int lastNum)
{
    //if area code isn't acceptable, tell user to input something else. 
    if (areaCode <100 || areaCode > 999) {
        
        System.err.println("Pleaseusevalidareacode.");
  
    } else if (firstNum <100 || firstNum > 999){
    
        System.err.println("Pleaseusevalidnumber.");
    } else if (lastNum <100 || lastNum > 999){
        
        System.err.println("Pleaseusevalidnumber.");
    } else {// if not (areaCode <100 || areaCode >999) is not true do
        phoneNumber = areaCode + "-" + firstNum + "-" + lastNum}
    }
    
   
}
public void setdateofBirth (String dateofBirth)
{
    dateofBirth = newdateofBirth;
}
}
