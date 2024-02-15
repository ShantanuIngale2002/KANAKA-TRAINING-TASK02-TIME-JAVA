package Task03TIME1202;
import java.util.ArrayList;
import java.util.Scanner;

import Task03TIME1202.TimeTemplate.CreateTime.CreateObj;

public class simpleTime {
    public static void main(String[] args) {

        ArrayList<CreateObj>TimeList=new ArrayList<CreateObj>(2);
        int superSwitchChoice,store;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n\n+++++  HELLO DEAR VISITER WELCOME TO TIME MENU +++++\nEnter the operation you want to perform\n1. Enter Time into Objects  ||  2. Print and Add Object Times \nEnter : ");
            superSwitchChoice=sc.nextInt();
            switch (superSwitchChoice) {
                case 1:{
                    for(int i=0;i<2;i++){
                        CreateObj obj=new CreateObj();
                        System.out.print("Obj"+(i+1)+" :: Enter the hours : ");
                        store=sc.nextInt();
                        while(!obj.setHour(store)){
                            System.out.print("\nInvalid Hour, Enter the hours again : ");
                            store=sc.nextInt();
                        }
                        System.out.print("Obj"+(i+1)+" :: Enter the Minutes : ");
                        store=sc.nextInt();
                        while(!obj.setMinute(store)){
                            System.out.print("\nInvalid Minutes, Enter the Minutes again : ");
                            store=sc.nextInt();
                        }
                        System.out.print("Obj"+(i+1)+" :: Enter the Seconds : ");
                        store=sc.nextInt();
                        while(!obj.setSecond(store)){
                            System.out.print("\nInvalid Seconds, Enter the Seconds again : ");
                            store=sc.nextInt();
                        }
                        System.out.println("Time is Successfully Added for Object "+(i+1));
                        TimeList.add(obj);
                    }
                    break;
                }

                case 2:{
                    if(TimeList.size()==0){
                        System.out.println("Unsufficient amount of Objects (ie. 0), So Must Add time first.");
                        continue;
                    }
                    for(int i=0;i<2;i++){
                        System.out.println((i+1)+".      "+TimeList.get(i).getHour()+" Hrs     "+TimeList.get(i).getMinute()+" Minutes     "+TimeList.get(i).getSecond()+" Seconds.");
                    }
                    CreateObj newObj=new CreateObj();
                    newObj.addTime_multi(TimeList.get(0), TimeList.get(1));
                    System.out.println("\nThe total Addition becomes : "+newObj.getHour()+" Hrs.  "+newObj.getMinute()+" Mins.  "+newObj.getSecond()+" Secs.");
                    break;
                }

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            
        }
    }
    
}
