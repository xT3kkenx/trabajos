package commands;
import devices.ElectronicDevice;

public class TurnOffTelevision implements Command {
    private ElectronicDevice device;
    
    public TurnOffTelevision(ElectronicDevice device){
    this.device = device;
    }

    @Override
    public void execute() {
        device.off();
        // TODO Auto-generated method stub
        
    }

    @Override
    public void undo() {
        device.on();
        // TODO Auto-generated method stub
        
    }
    
    
}
