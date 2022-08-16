package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class Room {
    static {
        Covode.recordClassIndex(1825);
    }

    public static <T extends RoomDatabase> RoomDatabase.Builder<T> inMemoryDatabaseBuilder(Context context, Class<T> cls) {
        return new RoomDatabase.Builder<>(context, cls, null);
    }

    public static <T, C> T getGeneratedImplementation(Class<C> cls, String str) {
        String m25085C;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        new StringBuilder();
        String m25086C = C0002O.m25086C(canonicalName.replace('.', '_'), str);
        try {
            if (name.isEmpty()) {
                m25085C = m25086C;
            } else {
                new StringBuilder();
                m25085C = C0002O.m25085C(name, ".", m25086C);
            }
            return (T) C116971W2r.LIZ(m25085C).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException(C0002O.m25083C("cannot find implementation for ", cls.getCanonicalName(), ". ", m25086C, " does not exist"));
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException(C0002O.m25086C("Cannot access the constructor", cls.getCanonicalName()));
        } catch (InstantiationException unused3) {
            throw new RuntimeException(C0002O.m25086C("Failed to create an instance of ", cls.getCanonicalName()));
        }
    }

    public static <T extends RoomDatabase> RoomDatabase.Builder<T> databaseBuilder(Context context, Class<T> cls, String str) {
        if (str != null && str.trim().length() != 0) {
            return new RoomDatabase.Builder<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
