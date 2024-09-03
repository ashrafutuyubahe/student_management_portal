package com.ashify.studennt_management_systme.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class ClubMonitor {

    @Id
    private int clubId;
    private String MonitorName;
    private String clubName;

    public ClubMonitor(String clubName, String monitorName, int clubId) {
        this.clubName = clubName;
        MonitorName = monitorName;
        this.clubId = clubId;
    }

    public ClubMonitor(){}


    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getMonitorName() {
        return MonitorName;
    }

    public void setMonitorName(String monitorName) {
        MonitorName = monitorName;
    }

    @Override
    public String toString() {
        return "ClubMonitor{" +
                "clubId=" + clubId +
                ", MonitorName='" + MonitorName + '\'' +
                ", clubName='" + clubName + '\'' +
                '}';
    }
}
