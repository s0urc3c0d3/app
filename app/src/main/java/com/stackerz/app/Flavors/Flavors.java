package com.stackerz.app.Flavors;

/**
 * Created by ed on 4/11/14.
 */
public class Flavors {

    //constants for field references

    public static final String NAME = "name";
    public static final String RAM = "ram";
    public static final String VCPUS = "vcpus";
    public static final String DISK = "disk";
    public static final String ID = "id";

    //fields
    String name;
    String ram;
    String vcpus;
    String disk;
    String id;


//getters and setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}


