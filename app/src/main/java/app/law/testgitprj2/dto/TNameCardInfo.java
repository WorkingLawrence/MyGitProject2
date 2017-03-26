package app.law.testgitprj2.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class TNameCardInfo implements Serializable
{
    private String namecardId;
    private String name;
    private String gender;
    private int age;
    private String company;
    private String department;
    private String title;
    private String phoneNum;
    private String email;
    private String webSite;
    private ArrayList<String> tags;
    private long lastModifiedDate;

    public String getNamecardId()
    {
        return namecardId;
    }

    public void setNamecardId(String namecardId)
    {
        this.namecardId = namecardId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getWebSite()
    {
        return webSite;
    }

    public void setWebSite(String webSite)
    {
        this.webSite = webSite;
    }

    public ArrayList<String> getTags()
    {
        return tags;
    }

    public void setTags(ArrayList<String> tags)
    {
        this.tags = tags;
    }

    public long getLastModifiedDate()
    {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(long lastModifiedDate)
    {
        this.lastModifiedDate = lastModifiedDate;
    }


}
