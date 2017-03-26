package app.law.testgitprj2.dto;

import java.io.Serializable;

public class TUpdatePrice implements Serializable
{
    private String priceId;
    private float priceVal;
    private long lastUpdateTime;

    public String getPriceId()
    {
        return priceId;
    }

    public void setPriceId(String priceId)
    {
        this.priceId = priceId;
    }

    public float getPriceVal()
    {
        return priceVal;
    }

    public void setPriceVal(float priceVal)
    {
        this.priceVal = priceVal;
    }

    public long getLastUpdateTime()
    {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime)
    {
        this.lastUpdateTime = lastUpdateTime;
    }

}
