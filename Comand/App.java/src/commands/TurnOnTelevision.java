package commands;
import devices.ElectronicDevice;

public class TurnOnTelevision implements Command {
    private ElectronicDevice device;
    
    public TurnOnTelevision(ElectronicDevice device){
    this.device = device;
    }

    @Override
    public void execute() {
        device.on();
        // TODO Auto-generated method stub
        
    }

    @Override
    public void undo() {
        device.off();
        // TODO Auto-generated method stub
        
    }
    
}
