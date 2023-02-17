package com.company.OOP.polymorphism;

import java.util.Date;

public class GenericFile {

    /*
        *Fragile Base Class Problem

    According to Wikipedia, base or superclasses are considered fragile if seemingly safe modifications to a base class
    may cause derived classes to malfunction.
    To address a fragile base class problem, we can use the final keyword to prevent subclasses from overriding specific
    methods. Proper documentation can also help. And last but not least, the composition should generally be preferred
    over inheritance.
     */

    private String name;
    private String extension;
    private Date dateCreated;
    private String version;
    private byte[] content;

    public GenericFile() {
        this.setDateCreated(new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getFileInfo() {
        return "Generic File Impl";
    }

    public Object read() {
        return content;
    }
}
