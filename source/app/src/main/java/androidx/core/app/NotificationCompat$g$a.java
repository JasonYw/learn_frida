package androidx.core.app;

import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import p003X.GQD;
import p003X.GQE;

/* loaded from: classes2.dex */
public final class NotificationCompat$g$a {
    public final CharSequence LIZ;
    public final long LIZIZ;
    public final GQE LIZJ;
    public Bundle LIZLLL = new Bundle();

    /* renamed from: LJ */
    public String f20245LJ;
    public Uri LJFF;

    static {
        Covode.recordClassIndex(906);
    }

    public static NotificationCompat$g$a LIZ(Bundle bundle) {
        GQE gqe;
        IconCompat iconCompat;
        try {
            if (bundle.containsKey("text") && bundle.containsKey("time")) {
                if (bundle.containsKey("person")) {
                    gqe = GQE.LIZ(bundle.getBundle("person"));
                } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                    Person person = (Person) bundle.getParcelable("sender_person");
                    GQD gqd = new GQD();
                    gqd.LIZ(person.getName());
                    if (person.getIcon() != null) {
                        iconCompat = IconCompat.createFromIcon(person.getIcon());
                    } else {
                        iconCompat = null;
                    }
                    gqd.LIZ(iconCompat);
                    gqd.LIZ(person.getUri());
                    gqd.LIZIZ(person.getKey());
                    gqd.LIZ(person.isBot());
                    gqd.LIZIZ(person.isImportant());
                    gqe = gqd.LIZ();
                } else if (bundle.containsKey("sender")) {
                    GQD gqd2 = new GQD();
                    gqd2.LIZ(bundle.getCharSequence("sender"));
                    gqe = gqd2.LIZ();
                } else {
                    gqe = null;
                }
                NotificationCompat$g$a notificationCompat$g$a = new NotificationCompat$g$a(bundle.getCharSequence("text"), bundle.getLong("time"), gqe);
                if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                    notificationCompat$g$a.f20245LJ = bundle.getString("type");
                    notificationCompat$g$a.LJFF = (Uri) bundle.getParcelable("uri");
                }
                if (bundle.containsKey("extras")) {
                    notificationCompat$g$a.LIZLLL.putAll(bundle.getBundle("extras"));
                    return notificationCompat$g$a;
                }
                return notificationCompat$g$a;
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }

    public NotificationCompat$g$a(CharSequence charSequence, long j, GQE gqe) {
        this.LIZ = charSequence;
        this.LIZIZ = j;
        this.LIZJ = gqe;
    }
}
