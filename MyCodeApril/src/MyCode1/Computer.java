package MyCode1;

public class Computer {
   private String cpu;
   private String rumType;
   private int rumMemory;
   private String videocardName;
   private int videocardMemory;
   public Computer(){
   }
   public Computer(String cpu, String rumType, int rumMemory, String videocardName, int videocardMemory){
       this.cpu = cpu;
       this.rumType = rumType;
       this.rumMemory = rumMemory;
       this.videocardName = videocardName;
       this.videocardMemory = videocardMemory;
   }
   public String getCpu(){                                    // Гетеры
       return cpu;
   }
   public String getRumType(){
       return rumType;
   }
   public int getRumMemmory(){
       return rumMemory;
   }
   public String getVideocardName(){
       return videocardName;
   }
   public int getVideocardMemory(){
       return videocardMemory;
   }
   public void setCpu(String cpu){                             //Сетеры
       this.cpu = cpu;
   }
   public void setRumType(String rumType){
       this.rumType = rumType;
   }
   public void setRumMemmory(int rumMemory){
       this.rumMemory = rumMemory;
   }
   public void setVideocardName(String videocardName){
       this.videocardName = videocardName;
   }
   public void setVideocardMemory(int videocardMemory){
       this.videocardMemory = videocardMemory;
   }


}
