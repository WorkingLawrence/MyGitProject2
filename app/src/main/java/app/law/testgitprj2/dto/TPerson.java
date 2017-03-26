package app.law.testgitprj2.dto;


import java.io.Serializable;

public class TPerson implements Serializable
{
    private String personId;

    public String getPersonId()
    {
        return personId;
    }

    public void setPersonId(String personId)
    {
        this.personId = personId;
    }
}
