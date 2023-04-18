package com.hairdressing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Entries {

    @Id
    @GeneratedValue
    private Long id;
    private Date fecha;
    private String manualentry;
    private Long amountentry;
    private String entrytype;

    public Entries() {
    }

    public Entries(Long id, Date fecha, String manualentry, Long amountentry, String entrytype) {
        this.id = id;
        this.fecha = fecha;
        this.manualentry = manualentry;
        this.amountentry = amountentry;
        this.entrytype = entrytype;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getManualentry() {
        return manualentry;
    }

    public void setManualentry(String manualentry) {
        this.manualentry = manualentry;
    }

    public Long getAmountentry() {
        return amountentry;
    }

    public void setAmountentry(Long amountentry) {
        this.amountentry = amountentry;
    }

    public String getEntrytype() {
        return entrytype;
    }

    public void setEntrytype(String entrytype) {
        this.entrytype = entrytype;
    }
}
