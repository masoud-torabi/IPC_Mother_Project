package ir.codeprocess.ipc_mother_project;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class IPC_Main_Service extends Service {
    public IPC_Main_Service() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
