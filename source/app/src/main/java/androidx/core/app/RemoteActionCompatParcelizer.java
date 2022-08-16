package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0434a;
import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public class RemoteActionCompatParcelizer {
    static {
        Covode.recordClassIndex(916);
    }

    public static RemoteActionCompat read(AbstractC0434a abstractC0434a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.LIZ = (IconCompat) abstractC0434a.LIZIZ((AbstractC0434a) remoteActionCompat.LIZ, 1);
        remoteActionCompat.LIZIZ = abstractC0434a.LIZIZ(remoteActionCompat.LIZIZ, 2);
        remoteActionCompat.LIZJ = abstractC0434a.LIZIZ(remoteActionCompat.LIZJ, 3);
        remoteActionCompat.LIZLLL = (PendingIntent) abstractC0434a.LIZIZ((AbstractC0434a) remoteActionCompat.LIZLLL, 4);
        remoteActionCompat.f20247LJ = abstractC0434a.LIZIZ(remoteActionCompat.f20247LJ, 5);
        remoteActionCompat.LJFF = abstractC0434a.LIZIZ(remoteActionCompat.LJFF, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0434a abstractC0434a) {
        abstractC0434a.LIZ(remoteActionCompat.LIZ, 1);
        abstractC0434a.LIZ(remoteActionCompat.LIZIZ, 2);
        abstractC0434a.LIZ(remoteActionCompat.LIZJ, 3);
        abstractC0434a.LIZ(remoteActionCompat.LIZLLL, 4);
        abstractC0434a.LIZ(remoteActionCompat.f20247LJ, 5);
        abstractC0434a.LIZ(remoteActionCompat.LJFF, 6);
    }
}
