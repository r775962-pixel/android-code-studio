package openjdk.tools.sjavac.server;

public class SysInfo {
    public final int numCores;
    public final long totalMemory;

    public SysInfo(int numCores, long totalMemory) {
        this.numCores = numCores;
        this.totalMemory = totalMemory;
    }
}
