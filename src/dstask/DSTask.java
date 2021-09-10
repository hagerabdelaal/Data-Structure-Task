
package dstask;

import java.util.ArrayList;
import java.util.Scanner;


public class DSTask {

    public static void main(String[] args) {
         
        
        //Task 1 
        int[] arr  = new int[5];
        System.out.println("Enter 5 Integer Numbers:");
        Scanner scn = new Scanner(System.in);
        int temp;
        
        for(int i = 0; i < arr.length ; i++){
            arr[i]= scn.nextInt();
        }
                      
        for (int i = 0; i < arr.length ; i++) 
        {
            for (int j = i + 1; j < arr.length ; j++) { 
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Numbers Sorted ascendingly:");
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }   
            
        
        //Task 2
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println("Enter Persons' Name and Age in One Line Seperated With a comma");
        System.out.println("Press 0 to print all Person's data");
        for(;;){
            Person p = new Person();
            Scanner dis=new Scanner(System.in);
            String pName;
            int pAge;
            String line;
            String[] lineVector;

            line = dis.nextLine(); //read name,age
            if(line.equals("0"))
                break;

            //separate all values by comma
            lineVector = line.split(",");

            //parsing the values 
            pName=lineVector[0];
            pAge=Integer.parseInt((lineVector[1]));

            p.setName(pName);
            p.setAge(pAge); 
            personList.add(p);
        }

        for(Person person : personList)
            System.out.println(person);
        
       
        

    }
    
}
