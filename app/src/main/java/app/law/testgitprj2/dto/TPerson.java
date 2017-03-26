package app.law.testgitprj2.dto;


import java.io.Serializable;

public class TPerson implements Serializable
{
    private String personId;
    private String personName;
    private String personAddress;
    private String personPhoneNum;

    public String getPersonName()
    {
        return personName;
    }

    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    public String getPersonAddress()
    {
        return personAddress;
    }

    public void setPersonAddress(String personAddress)
    {
        this.personAddress = personAddress;
    }

    public String getPersonPhoneNum()
    {
        return personPhoneNum;
    }

    public void setPersonPhoneNum(String personPhoneNum)
    {
        this.personPhoneNum = personPhoneNum;
    }

    public String getPersonId()
    {
        return personId;
    }

    public void setPersonId(String personId)
    {
        this.personId = personId;
    }
}
