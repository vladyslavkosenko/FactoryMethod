package org.example;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createdDeveloper() {
        return new CppDeveloper();
    }
}
