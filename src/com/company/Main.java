package com.company;

import com.company.drive.Drive;
import com.company.drive.HDDDrive;
import com.company.drive.SSDDrive;

public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();

       HDDDrive drive = new HDDDrive();



        Computer computer = new Computer(monitor,drive);

        drive.addFile(new File("pierwszyplik.jpg"));
        drive.listFiles();




        


    }
}
