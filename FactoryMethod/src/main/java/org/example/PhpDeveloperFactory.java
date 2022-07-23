package org.example;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createdDeveloper() {
        return new PhpDeveloper();
    }
}
