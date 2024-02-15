package Task03TIME1202.TimeTemplate;

public class timeStructure {
    
    public static class Time {
        protected int Hour,Minute,Second;
    }


    public static class TimeSetters extends Time{
        public boolean setHour(int Hr){
            if(0<=Hr && Hr<24){this.Hour=Hr;}
            else{return false;}
            return true;
        }
        public boolean setMinute(int Min){
            if(0<=Min && Min<60){this.Minute=Min;}
            else{return false;}
            return true;
        }
        public boolean setSecond(int Sec){
            if(0<=Sec && Sec<60){this.Second=Sec;}
            else{return false;}
            return true;
        }
        public int setTime(int Hr, int Min, int Sec){
            if(!setHour(Hr)){return -1;}
            if(!setMinute(Min)){return -2;}
            if(!setSecond(Sec)){return -3;}
            return 1;
        }
    }



    public static class TimeGetters extends TimeSetters{
        public int getHour(){return this.Hour;}
        public int getMinute(){return this.Minute;}
        public int getSecond(){return this.Second;}
        public int[] getTime(){return new int[]{getHour(),getMinute(),getSecond()};}

        public void copyTime(TimeGetters obj){
            obj.setHour(this.getHour());
            obj.setMinute(this.getMinute());
            obj.setSecond(this.getSecond());
        }

        public void addTime(TimeGetters obj){
            int totalHr=this.getHour()+obj.getHour();
            int totalMin=this.getMinute()+obj.getMinute();
            int totalSec=this.getSecond()+obj.getSecond();
            
            totalMin+=totalSec/60;
            totalSec%=60;

            totalHr+=totalMin/60;
            totalMin%=60;

            totalHr%=24;

            this.setHour(totalHr);
            this.setMinute(totalMin);
            this.setSecond(totalSec);
        }

        public void addTime_multi(TimeGetters obj1, TimeGetters obj2){
            int totalHr=(obj1.getHour()+obj2.getHour());
            int totalMin=(obj1.getMinute()+obj2.getMinute());
            int totalSec=(obj1.getSecond()+obj2.getSecond());

            totalMin+=totalSec/60;
            totalSec%=60;

            totalHr+=totalMin/60;
            totalMin%=60;

            totalHr%=24;

            this.setHour(totalHr);
            this.setMinute(totalMin);
            this.setSecond(totalSec);
        }
    }


    

}
