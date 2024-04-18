package P4;

public class Package {
    private String id;
    private String status;
    private String location;

    public Package(String id) {
        this.id = id;
        this.status = "Pending";
        this.location = "Warehouse";
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public void updateStatus(String status, String location) {
        this.status = status;
        this.location = location;
        System.out.println("Package " + id + " status updated: " + status);
    }
}
