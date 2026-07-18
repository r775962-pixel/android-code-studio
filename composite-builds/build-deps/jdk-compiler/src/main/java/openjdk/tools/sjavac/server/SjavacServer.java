package openjdk.tools.sjavac.server;

import java.io.File;

public class SjavacServer {
    public static final String LINE_TYPE_RC = "RC";

    public static File getPortFile(String portFileName) {
        return new File(System.getProperty("java.io.tmpdir"), portFileName);
    }
}
