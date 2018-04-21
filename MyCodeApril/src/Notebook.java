public class Notebook extends Computer {
    private String name;
    boolean Cover = false;
    Notebook(String name, String cpu , String rumType, int rumMemory, String videocardName, int videocardMemory){
        super(cpu,rumType,rumMemory,videocardName,videocardMemory);
        this.name = name;
    }
    Notebook(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void openCover(){
        Cover = true;
    }
    public void closeCover(){
        Cover = false;
    }
    public boolean getCover(){
        return Cover;
    }
}
