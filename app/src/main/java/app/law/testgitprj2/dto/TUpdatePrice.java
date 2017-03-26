package app.law.testgitprj2.dto;

import java.io.Serializable;

public class TUpdatePrice implements Serializable
{
    private String priceId;
    private float priceVal;
    private long lastUpdateTime;
    private String transactionNum;
    private String val1;

    public String getVal1()
    {
        return val1;
    }

    public void setVal1(String val1)
    {
        this.val1 = val1;
    }

    public String getTransactionNum()
    {
        return transactionNum;
    }

    public void setTransactionNum(String transactionNum)
    {
        this.transactionNum = transactionNum;
    }

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
