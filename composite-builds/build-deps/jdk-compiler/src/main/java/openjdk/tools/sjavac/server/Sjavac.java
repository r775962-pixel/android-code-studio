package openjdk.tools.sjavac.server;

import openjdk.tools.sjavac.CompileJavaPackages.CompilationSubResult;
import java.util.List;

public interface Sjavac {
    CompilationSubResult compile(String packageName, String[] args);
    SysInfo getSysInfo();
}
