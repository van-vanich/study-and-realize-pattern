public class DeliveryContext {
    private PackageState packageState;
    private String packageId;

    public DeliveryContext(PackageState packageState, String packageId) {
        this.packageState = packageState;
        this.packageId = packageId;

        if (packageState == null) {
            this.packageState = Acknowledged.instance();
        }
    }

    public PackageState getPackageState() {
        return packageState;
    }

    public void setPackageState(PackageState packageState) {
        this.packageState = packageState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update() {
        packageState.updateState(this);
    }
}
