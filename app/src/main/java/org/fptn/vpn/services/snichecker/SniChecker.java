package org.fptn.vpn.services.snichecker;

import android.util.Log;

import org.fptn.vpn.database.entity.ServerEntity;
import org.fptn.vpn.enums.BypassCensorshipMethod;

import java.util.Random;

public class SniChecker {
    private final String TAG = getClass().getSimpleName();
    private final ServerEntity selectedServer;
    private final BypassCensorshipMethod bypassCensorshipMethod;

    public final Random RANDOM = new Random();

    public SniChecker(ServerEntity selectedServer, BypassCensorshipMethod bypassCensorshipMethod) {
        this.selectedServer = selectedServer;
        this.bypassCensorshipMethod = bypassCensorshipMethod;
    }

    public boolean checkSni(String sni) {
        Log.d(TAG, "checkSni: " + sni);

        // todo: replace with real check
        try {
            long sleepTime = RANDOM.nextInt(1000) + 100;
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }

        return RANDOM.nextInt(1000) > 950;
    }
}
