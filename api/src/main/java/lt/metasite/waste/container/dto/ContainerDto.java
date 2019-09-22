package lt.metasite.waste.container.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import lt.metasite.waste.container.PickupHistory;
import lt.metasite.waste.container.Schedule;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

public class ContainerDto {

    private String containerNo;
    private GeoJsonPoint position;
    private String street;
    private String company;
    private String location;
    private String houseNo;
    private Double capacity;
    private boolean missedPickUp;

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public GeoJsonPoint getPosition() {
        return position;
    }

    public void setPosition(GeoJsonPoint position) {
        this.position = position;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public boolean isMissedPickUp() {
        return missedPickUp;
    }

    public void setMissedPickUp(boolean missedPickUp) {
        this.missedPickUp = missedPickUp;
    }
}
