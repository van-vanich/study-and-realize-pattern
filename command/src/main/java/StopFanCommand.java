public class StopFanCommand implements ICommand {
    Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("Stopping fan");
        fan.stop();
    }
}
