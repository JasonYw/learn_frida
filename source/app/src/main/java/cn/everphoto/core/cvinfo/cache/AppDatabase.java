package cn.everphoto.core.cvinfo.cache;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.AbstractC116295VqD;
import p003X.AbstractC116349Vr5;
import p003X.AbstractC116356VrC;
import p003X.C106011Roj;

/* loaded from: classes13.dex */
public abstract class AppDatabase extends RoomDatabase {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(3535);
    }

    public abstract AbstractC116356VrC LIZ();

    public abstract AbstractC116349Vr5 LIZIZ();

    public abstract AbstractC116295VqD LIZJ();

    public static AppDatabase LIZ(String str) {
        String m25085C;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (AppDatabase) proxy.result;
        }
        Context LIZ2 = C106011Roj.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 2);
        if (proxy2.isSupported) {
            m25085C = (String) proxy2.result;
        } else {
            m25085C = C0002O.m25085C("db_photos_", str, ".db");
        }
        RoomDatabase.Builder databaseBuilder = Room.databaseBuilder(LIZ2, AppDatabase.class, m25085C);
        databaseBuilder.fallbackToDestructiveMigration();
        return (AppDatabase) databaseBuilder.build();
    }
}
