package androidx.room;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: androidx.room.d */
/* loaded from: classes13.dex */
public final class C0401d {
    public final Set<LiveData> LIZ = Collections.newSetFromMap(new IdentityHashMap());
    public final RoomDatabase LIZIZ;

    static {
        Covode.recordClassIndex(1847);
    }

    public C0401d(RoomDatabase roomDatabase) {
        this.LIZIZ = roomDatabase;
    }
}
