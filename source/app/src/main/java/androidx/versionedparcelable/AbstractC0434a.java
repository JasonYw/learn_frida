package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes10.dex */
public abstract class AbstractC0434a {
    public final ArrayMap<String, Method> LIZ;
    public final ArrayMap<String, Method> LIZIZ;
    public final ArrayMap<String, Class> LIZJ;

    static {
        Covode.recordClassIndex(2063);
    }

    public abstract void LIZ();

    public abstract void LIZ(int i);

    public abstract void LIZ(Parcelable parcelable);

    public abstract void LIZ(CharSequence charSequence);

    public abstract void LIZ(String str);

    public abstract void LIZ(boolean z);

    public abstract void LIZ(byte[] bArr);

    public abstract AbstractC0434a LIZIZ();

    public abstract boolean LIZIZ(int i);

    public abstract int LIZJ();

    public abstract void LIZJ(int i);

    public abstract String LIZLLL();

    /* renamed from: LJ */
    public abstract byte[] mo21104LJ();

    public abstract CharSequence LJFF();

    public abstract <T extends Parcelable> T LJI();

    public abstract boolean LJII();

    public final void LIZ(boolean z, int i) {
        LIZJ(i);
        LIZ(z);
    }

    public final void LIZ(byte[] bArr, int i) {
        LIZJ(2);
        LIZ(bArr);
    }

    public final void LIZ(CharSequence charSequence, int i) {
        LIZJ(i);
        LIZ(charSequence);
    }

    public final void LIZ(String str, int i) {
        LIZJ(7);
        LIZ(str);
    }

    public final byte[] LIZIZ(byte[] bArr, int i) {
        return !LIZIZ(2) ? bArr : mo21104LJ();
    }

    public final <T extends AbstractC0435c> T LJIIIIZZ() {
        String LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        return (T) LIZ(LIZLLL, LIZIZ());
    }

    private Method LIZ(Class cls) {
        Method method = this.LIZIZ.get(cls.getName());
        if (method == null) {
            Class LIZIZ = LIZIZ(cls);
            System.currentTimeMillis();
            Method declaredMethod = LIZIZ.getDeclaredMethod("write", cls, AbstractC0434a.class);
            this.LIZIZ.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    private Class LIZIZ(Class<? extends AbstractC0435c> cls) {
        Class cls2 = this.LIZJ.get(cls.getName());
        if (cls2 == null) {
            Class LIZ = C116971W2r.LIZ(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.LIZJ.put(cls.getName(), LIZ);
            return LIZ;
        }
        return cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void LIZIZ(AbstractC0435c abstractC0435c) {
        try {
            LIZ(LIZIZ((Class<? extends AbstractC0435c>) abstractC0435c.getClass()).getName());
        } catch (ClassNotFoundException e) {
            new StringBuilder();
            throw new RuntimeException(C0002O.m25086C(abstractC0435c.getClass().getSimpleName(), " does not have a Parcelizer"), e);
        }
    }

    public final void LIZ(AbstractC0435c abstractC0435c) {
        if (abstractC0435c == null) {
            LIZ((String) null);
            return;
        }
        LIZIZ(abstractC0435c);
        AbstractC0434a LIZIZ = LIZIZ();
        LIZ((AbstractC0434a) abstractC0435c, LIZIZ);
        LIZIZ.LIZ();
    }

    public final void LIZ(int i, int i2) {
        LIZJ(i2);
        LIZ(i);
    }

    public final int LIZIZ(int i, int i2) {
        if (!LIZIZ(i2)) {
            return i;
        }
        return LIZJ();
    }

    public final <T extends Parcelable> T LIZIZ(T t, int i) {
        if (!LIZIZ(i)) {
            return t;
        }
        return (T) LJI();
    }

    private <T extends AbstractC0435c> T LIZ(String str, AbstractC0434a abstractC0434a) {
        try {
            Method method = this.LIZ.get(str);
            if (method == null) {
                System.currentTimeMillis();
                method = C116971W2r.LIZ(str, true, AbstractC0434a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0434a.class);
                this.LIZ.put(str, method);
            }
            return (T) method.invoke(null, abstractC0434a);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw e4.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    private <T extends AbstractC0435c> void LIZ(T t, AbstractC0434a abstractC0434a) {
        try {
            LIZ(t.getClass()).invoke(null, t, abstractC0434a);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw e4.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final <T extends AbstractC0435c> T LIZIZ(T t, int i) {
        if (!LIZIZ(1)) {
            return t;
        }
        return (T) LJIIIIZZ();
    }

    public final void LIZ(Parcelable parcelable, int i) {
        LIZJ(i);
        LIZ(parcelable);
    }

    public final CharSequence LIZIZ(CharSequence charSequence, int i) {
        if (!LIZIZ(i)) {
            return charSequence;
        }
        return LJFF();
    }

    public final String LIZIZ(String str, int i) {
        if (!LIZIZ(7)) {
            return str;
        }
        return LIZLLL();
    }

    public final void LIZ(AbstractC0435c abstractC0435c, int i) {
        LIZJ(1);
        LIZ(abstractC0435c);
    }

    public final boolean LIZIZ(boolean z, int i) {
        if (!LIZIZ(i)) {
            return z;
        }
        return LJII();
    }

    public AbstractC0434a(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.LIZ = arrayMap;
        this.LIZIZ = arrayMap2;
        this.LIZJ = arrayMap3;
    }
}
