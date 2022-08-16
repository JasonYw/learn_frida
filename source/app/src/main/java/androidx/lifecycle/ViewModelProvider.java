package androidx.lifecycle;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import p002O.C0002O;
import p003X.AbstractC505875yv;
import p003X.C491595bt;

/* loaded from: classes22.dex */
public class ViewModelProvider {
    public final Factory mFactory;
    public final ViewModelStore mViewModelStore;

    /* loaded from: classes22.dex */
    public interface Factory {
        static {
            Covode.recordClassIndex(1391);
        }

        <T extends ViewModel> T create(Class<T> cls);
    }

    static {
        Covode.recordClassIndex(1390);
    }

    /* renamed from: androidx.lifecycle.ViewModelProvider$a */
    /* loaded from: classes28.dex */
    public static class C0323a extends C491595bt {
        public static C0323a LIZ;
        public Application LIZIZ;

        static {
            Covode.recordClassIndex(1392);
        }

        public C0323a(Application application) {
            this.LIZIZ = application;
        }

        public static C0323a LIZ(Application application) {
            if (LIZ == null) {
                LIZ = new C0323a(application);
            }
            return LIZ;
        }

        @Override // p003X.C491595bt, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(Application.class).newInstance(this.LIZIZ);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.create(cls);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewModelProvider(androidx.lifecycle.AbstractC0326p r3) {
        /*
            r2 = this;
            androidx.lifecycle.ViewModelStore r1 = r3.getViewModelStore()
            boolean r0 = r3 instanceof p003X.AbstractC505895yx
            if (r0 == 0) goto L12
            X.5yx r3 = (p003X.AbstractC505895yx) r3
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.LIZ()
        Le:
            r2.<init>(r1, r0)
            return
        L12:
            X.5bt r0 = p003X.C491595bt.getInstance()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.p):void");
    }

    public <T extends ViewModel> T get(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) get(C0002O.m25086C("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this.mFactory = factory;
        this.mViewModelStore = viewModelStore;
    }

    public ViewModelProvider(AbstractC0326p abstractC0326p, Factory factory) {
        this(abstractC0326p.getViewModelStore(), factory);
    }

    public <T extends ViewModel> T get(String str, Class<T> cls) {
        T t;
        T t2 = (T) this.mViewModelStore.get(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        Factory factory = this.mFactory;
        if (factory instanceof AbstractC505875yv) {
            t = (T) ((AbstractC505875yv) factory).LIZ();
        } else {
            t = (T) factory.create(cls);
        }
        this.mViewModelStore.put(str, t);
        return t;
    }
}
