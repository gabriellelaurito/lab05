public class PhoneNumber
{
  /////////////////////////
  //Field vars :: variable to store a phone number
  private String phoneNumber;

  //***********************
  // Constructor :: construct the object of PhoneNumber and
  //                initialize as 100-100-1000
  public PhoneNumber()
  {
  phoneNumber = "100-100-1000";
  }


  //+++++++++++++++++++++++
  //Methods

  //creates a problem because the user can put anything in!!
  /*
  public void changeNumber(String newNumber)
{
  phoneNumber
}
*/

public void changeNumber(int areaCode, int numBegin, int numEnd)
{
  //IF areaCode is bad, tell user to inout something else.
  if (areaCode < 100 || areaCode > 999)
  {
    System.err.println("Please use a valid number");
  }
  phoneNumber = areaCode + "-" + numBegin + "-" + numEnd;
}



}
