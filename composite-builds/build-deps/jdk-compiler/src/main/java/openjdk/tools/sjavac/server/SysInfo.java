package openjdk.tools.sjavac.server;

public class SysInfo {
    public final int numCores;
    public final long maxMemory;

    public SysInfo(int numCores, long maxMemory) {
        this.numCores = numCores;
        this.maxMemory = maxMemory;
    }
}
