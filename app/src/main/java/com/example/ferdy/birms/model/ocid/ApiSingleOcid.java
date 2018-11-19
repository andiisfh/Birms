package com.example.ferdy.birms.model.ocid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Andi Insanudin on 19/11/18.
 */
public class ApiSingleOcid {

    @SerializedName("data")
    private DataItem data;

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private String status;

    public void setData(DataItem data){
        this.data = data;
    }

    public DataItem getData(){
        return data;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return
                "ApiOcid{" +
                        "data = '" + data + '\'' +
                        ",message = '" + message + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}
