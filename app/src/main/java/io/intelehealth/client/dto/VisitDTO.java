
package io.intelehealth.client.dto;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "tbl_visits")
public class VisitDTO {

    @SerializedName("patientuuid")
    @Expose
    private String patientuuid;
    @PrimaryKey
    @NonNull
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("visit_type_uuid")
    @Expose
    private String visitTypeUuid;
    @SerializedName("startdate")
    @Expose
    private String startdate;
    @SerializedName("enddate")
    @Expose
    private String enddate;
    @SerializedName("locationuuid")
    @Expose
    private String locationuuid;
    @SerializedName("creator")
    @Expose
    private Integer creator;
    @SerializedName("syncd")
    @Expose
    private Boolean syncd;

    public String getPatientuuid() {
        return patientuuid;
    }

    public void setPatientuuid(String patientuuid) {
        this.patientuuid = patientuuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVisitTypeUuid() {
        return visitTypeUuid;
    }

    public void setVisitTypeUuid(String visitTypeUuid) {
        this.visitTypeUuid = visitTypeUuid;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getLocationuuid() {
        return locationuuid;
    }

    public void setLocationuuid(String locationuuid) {
        this.locationuuid = locationuuid;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Boolean getSyncd() {
        return syncd;
    }

    public void setSyncd(Boolean syncd) {
        this.syncd = syncd;
    }

}