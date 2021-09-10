package dstask;

public class Person {
    private String name;
    private int age;
    
    public Person(){};
    public Person(String name, int age){
        
        this.name = name;
        this.age = age;
        
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    
    void setAge(int age){
        this.age = age;
    }
    
    int getAge(){
        return age;
    }
            
            
    public String toString(){
        return "[" + name + ", " + age + "]";
    }
    
}
