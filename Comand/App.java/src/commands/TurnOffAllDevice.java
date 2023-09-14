package commands;
import java.util.List;

import devices.ElectronicDevice;

public class TurnOffAllDevice implements Command {
    List<ElectronicDevice> allDevices;

    public TurnOffAllDevice(
        List<ElectronicDevice> newDevices) {
            allDevices = newDevices;
        }

    @Override
    public void execute() {
        for (ElectronicDevice device : allDevices)
        device.off();
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : allDevices)
        device.on();
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'undo'");
    }
    
}
