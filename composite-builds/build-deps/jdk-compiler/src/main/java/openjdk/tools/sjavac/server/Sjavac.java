package openjdk.tools.sjavac.server;

import openjdk.tools.javac.main.Main.Result;
import java.util.Set;
import java.net.URI;

public interface Sjavac {
    Result compile(String packageName, String chunkId, String[] args, 
                   java.util.List<URI> visibleSources, Set<URI> sources);
    SysInfo getSysInfo();
    void shutdown();
}
