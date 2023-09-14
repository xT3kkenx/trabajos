package devices;

public class Radio implements ElectronicDevice {
    private int volumen = 0;
    private String name;

    public Radio(String name){
        this.name = name;
    }

    @Override
    public void off() {
        System.out.println(name + "Radio is on");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void on() {
        System.out.println(name + "Radio is off");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void volumenDown() {
        volumen--;
        System.out.println(name + "Radio Volumen at: " + volumen);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void volumenUp() {
        volumen++;
        System.out.println(name + "Radio Volumen at: " + volumen);
        // TODO Auto-generated method stub
        
    }
    
}
