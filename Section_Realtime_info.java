package com.ensat.entities;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Section_Realtime_info entity.
 */
@Entity
public class Section_Realtime_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    @OneToOne
    @MapsId
    @JoinColumn(name = "section_id")
    private Section section;

    private Integer temprature;
    private Integer humidity;
    private Integer fire;


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemprature() {
        return temprature;
    }

    public void setTemprature(Integer temprature) {
        this.temprature = temprature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getFire() {
        return fire;
    }

    public void setFire(Integer fire) {
        this.fire = fire;
    }
}
