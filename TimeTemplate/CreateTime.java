package Task03TIME1202.TimeTemplate;
import Task03TIME1202.TimeTemplate.timeStructure.TimeGetters;

public class CreateTime{
    public static class CreateObj extends TimeGetters{
        public CreateObj(){
            this.Hour=0;
            this.Minute=0;
            this.Second=0;
        }
        CreateObj(int Hr, int Min, int Sec){
            this.Hour=Hr;
            this.Minute=Min;
            this.Second=Sec;
        }
    }
}
