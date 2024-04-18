package P4;

import java.util.ArrayList;
import java.util.List;

public class TrackingSystem {
    private List<Package> packages;

    public TrackingSystem() {
        this.packages = new ArrayList<>();
    }

    public void addPackage(Package pkg) {
        packages.add(pkg);
    }

    public void updatePackageStatus(String id, String status, String location) {
        for (Package pkg : packages) {
            if (pkg.getId().equals(id)) {
                pkg.updateStatus(status, location);
                return;
            }
        }
        System.out.println("Package with ID " + id + " not found.");
    }

    public void printPackageStatus(String id) {
        for (Package pkg : packages) {
            if (pkg.getId().equals(id)) {
                System.out.println("Package ID: " + pkg.getId());
                System.out.println("Status: " + pkg.getStatus());
                System.out.println("Location: " + pkg.getLocation());
                return;
            }
        }
        System.out.println("Package with ID " + id + " not found.");
    }
}
