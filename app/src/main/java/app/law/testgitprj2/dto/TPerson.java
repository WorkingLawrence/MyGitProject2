package app.law.testgitprj2.dto;


import java.io.Serializable;

public class TPerson implements Serializable
{
    private String personId;
    private String personName;
    private String personAddress;
    private String personPhoneNum;
    private String nickname;
    private String parent;
    private String hello;

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public String getParent()
    {
        return parent;
    }

    public void setParent(String parent)
    {
        this.parent = parent;
    }

    public String getHello()
    {
        return hello;
    }

    public void setHello(String hello)
    {
        this.hello = hello;
    }

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
