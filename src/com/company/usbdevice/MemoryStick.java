package com.company.usbdevice;

public class MemoryStick implements USBDevice{

    public String name;
    private boolean ejected = false;

    public MemoryStick(String name){
        this.name = name;
    }


    @Override
    public boolean connect() {
        System.out.println("Conncet Memory Stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please ejcect ms first");
            return false;
        }else{
            System.out.println("MS disconnceted");
            return true;
        }

    }


    public void eject(){
        ejected = true;
    }


    @Override
    public String getName() {
        return null;
    }
}
