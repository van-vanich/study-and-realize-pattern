public class StartFanCommand implements ICommand {
    Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("Starting fan");
        fan.start();
    }
}
