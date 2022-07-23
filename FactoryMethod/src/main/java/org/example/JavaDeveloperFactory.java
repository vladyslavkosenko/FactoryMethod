package org.example;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createdDeveloper() {
        return new  JavaDeveloper();
    }
}
