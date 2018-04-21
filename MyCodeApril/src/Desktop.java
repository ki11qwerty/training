public class Desktop extends Computer {
    private String name;
    private boolean EnableAcDc = false;
    Desktop(String name, String cpu , String rumType, int rumMemory, String videocardName, int videocardMemory){
        super(cpu,rumType,rumMemory,videocardName,videocardMemory);
        this.name = name;
    }
    Desktop(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void turnOn(){
        EnableAcDc = true;
    }
    public void turnOff(){
        EnableAcDc = false;
    }

}
