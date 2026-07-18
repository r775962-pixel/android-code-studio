package openjdk.tools.sjavac.comp;

import java.net.URI;
import java.util.Set;
import openjdk.tools.javac.main.Main.Result;
import openjdk.tools.sjavac.server.Sjavac;
import openjdk.tools.sjavac.server.SysInfo;

/**
 *  <p><b>This is NOT part of any supported API.
 *  If you write code that depends on this, you do so at your own risk.
 *  This code and its internal interfaces are subject to change or
 *  deletion without notice.</b>
 */
public class PooledSjavac implements Sjavac {

    final Sjavac delegate;

    public PooledSjavac(Sjavac delegate, int poolsize) {
        this.delegate = delegate;
    }

    @Override
    public Result compile(String packageName, String chunkId, String[] args, 
                         java.util.List<URI> visibleSources, Set<URI> sources) {
        return delegate.compile(packageName, chunkId, args, visibleSources, sources);
    }

    @Override
    public SysInfo getSysInfo() {
        return delegate.getSysInfo();
    }

    @Override
    public void shutdown() {
        delegate.shutdown();
    }
}
