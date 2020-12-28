package com.tms.java.interfaces;

//this interface is used for differentiating varieties of storage;such as:
//one storehouse one storage,one storehouse more storage,more storehouse one storage,more storehouse more storage
public interface IStorage {

     void inBound();
     void outBound();
     void modifyStorage();

}
