package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        Developer Developer = new CppDeveloper();
//        Developer.writeCode();
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createdDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty. ");
        }
    }
}
