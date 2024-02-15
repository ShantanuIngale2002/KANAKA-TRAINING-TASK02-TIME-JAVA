package Task03TIME1202;

import java.util.ArrayList;
import java.util.Scanner;

import Task03TIME1202.TimeTemplate.CreateTime.CreateObj;

public class Time {
    public static void main(String[] args) {
        ArrayList<CreateObj> TimeList = new ArrayList<CreateObj>();

        int superSwitchChoice,indiceChoice,objIndex;
        int store,iterate;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n\n+++++  HELLO DEAR VISITER WELCOME TO TIME MENU +++++\nEnter the operation you want to perform\n1. Enter the new TIME  ||  2. Add Existing Times || 3. Print All Existing Times\nEnter : ");
            
            superSwitchChoice=sc.nextInt();

            switch (superSwitchChoice) {
                
                case 1:{
                    CreateObj obj=new CreateObj();
                    System.out.print("Enter the hours : ");
                    store=sc.nextInt();
                    while(!obj.setHour(store)){
                        System.out.print("\nInvalid Hour, Enter the hours again : ");
                        store=sc.nextInt();
                    }
                    System.out.print("Enter the Minutes : ");
                    store=sc.nextInt();
                    while(!obj.setMinute(store)){
                        System.out.print("\nInvalid Minutes, Enter the Minutes again : ");
                        store=sc.nextInt();
                    }
                    System.out.print("Enter the Seconds : ");
                    store=sc.nextInt();
                    while(!obj.setSecond(store)){
                        System.out.print("\nInvalid Seconds, Enter the Seconds again : ");
                        store=sc.nextInt();
                    }
                    System.out.println("Time is Successfully Added");
                    TimeList.add(obj);

                    if(TimeList.size()==1){
                        TimeList.add(obj);
                    }

                    break;
                }

                    
                case 2:{
                    System.out.println("Total Number of Active Time are "+(TimeList.size()-1));
                    if(TimeList.size()<3){
                        System.out.println("Unsufficient amount of Objects, Must Add some");
                        continue;
                    }
                    CreateObj obj=new CreateObj();
                    obj.addTime_multi(TimeList.get(0), TimeList.get(1));
                    System.out.println("\nThe total Addition becomes : "+obj.getHour()+" Hrs.  "+obj.getMinute()+" Mins.  "+obj.getSecond()+" Secs.");
                    break;
                }

                case 3:{
                    if(TimeList.size()==0){
                        System.out.println("Unsufficient amount of Objects (ie. 0), So Must Add some.");
                        continue;
                    }
                    for(int i=1;i<TimeList.size();i++){
                        System.out.println(i+". "+" Hours : "+TimeList.get(i).getHour()+"  Minutes : "+TimeList.get(i).getMinute()+"  Seconds : "+TimeList.get(i).getSecond());
                    }
                    break;
                }
            
            

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            

            // System.out.println("\n\n\n");
            // sc.close();
        }
    }
}

