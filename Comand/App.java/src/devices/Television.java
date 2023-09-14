package devices;

public class Television implements ElectronicDevice {
    private int volumen = 0;
    private String name;

    public Television(String name){
        this.name = name;
    }

    @Override
    public void off() {
        System.out.println(name + "Television is on");
        // TODO Auto-generated method stub
        
    }
    @Override
    public void on() {
        System.out.println(name + "Television is off");
        // TODO Auto-generated method stub
        
    }
    @Override
    public void volumenDown() {
        volumen--;
        System.out.println(name + "Television Volumen at: " + volumen);
        // TODO Auto-generated method stub
        
    }
    @Override
    public void volumenUp() {
        volumen++;
        System.out.println(name + "Television Volumen at: " + volumen);
        // TODO Auto-generated method stub
        
    }
    
}
