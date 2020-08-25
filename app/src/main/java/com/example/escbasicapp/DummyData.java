package com.example.escbasicapp;

import java.util.ArrayList;

public class DummyData {

    public static ArrayList<Contact> contacts = new ArrayList<>();

    static{
        contacts.add(new Contact("곽용우", "010-3744-0844", "kkolbyuyw@gmail.com"));
        contacts.add(new Contact("윤무원", "010-5510-6955", "sample@naver.com"));
        contacts.add(new Contact("임성덕", "010-3584-6955", "ababeeoo@naver.com"));
    }

}
