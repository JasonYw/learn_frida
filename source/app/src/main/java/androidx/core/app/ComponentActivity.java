package androidx.core.app;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.p1594ss.android.ugc.aweme.lego.Lego;
import java.lang.reflect.Field;
import p003X.AbstractC138469cy1;
import p003X.C106862S5w;
import p003X.C138460cxs;
import p003X.C138628d0a;
import p003X.C141300dhl;
import p003X.C14L;
import p003X.C4FL;
import p003X.FragmentC106217Rs3;

/* loaded from: classes17.dex */
public class ComponentActivity extends Activity implements AbstractC138469cy1, LifecycleOwner {
    public SimpleArrayMap<Class<? extends C0236a>, C0236a> mExtraDataMap = new SimpleArrayMap<>();
    public LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);

    /* renamed from: androidx.core.app.ComponentActivity$a */
    /* loaded from: classes13.dex */
    public static class C0236a {
        static {
            Covode.recordClassIndex(882);
        }
    }

    static {
        Covode.recordClassIndex(881);
    }

    public void androidx_core_app_ComponentActivity__onStop$___twin___() {
        super.onStop();
    }

    /* renamed from: androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___ */
    public void m21186xb33a969c(int i) {
        super.setRequestedOrientation(i);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        m21184xd70bc288(this, bundle);
    }

    @Override // android.app.Activity
    public void onStop() {
        m21185x89f009cb(this);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        m21183x8cdfc297(this, i);
    }

    /* renamed from: getLifecycle */
    public Lifecycle mo29786getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void androidx_core_app_ComponentActivity__onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC106217Rs3.LIZ(this);
    }

    @Override // p003X.AbstractC138469cy1
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends C0236a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.markState(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(C0236a c0236a) {
        this.mExtraDataMap.put(c0236a.getClass(), c0236a);
    }

    /* renamed from: androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m21185x89f009cb(ComponentActivity componentActivity) {
        componentActivity.androidx_core_app_ComponentActivity__onStop$___twin___();
        int i = Build.VERSION.SDK_INT;
        try {
            componentActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && C138460cxs.LIZ(decorView, keyEvent)) {
            return true;
        }
        return C138460cxs.LIZ(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && C138460cxs.LIZ(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* renamed from: androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_AndroidOActivityLancet_setRequestedOrientation */
    public static void m21183x8cdfc297(ComponentActivity componentActivity, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            componentActivity.m21186xb33a969c(i);
            return;
        }
        TypedArray obtainStyledAttributes = componentActivity.obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            componentActivity.m21186xb33a969c(i);
        }
    }

    /* renamed from: androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_AndroidOActivityLancet_onCreate */
    public static void m21184xd70bc288(ComponentActivity componentActivity, Bundle bundle) {
        if (!PatchProxy.proxy(new Object[]{componentActivity}, null, C4FL.LIZ, true, 4).isSupported && Build.VERSION.SDK_INT == 26) {
            TypedArray obtainStyledAttributes = componentActivity.obtainStyledAttributes(new int[]{16842840});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            int requestedOrientation = componentActivity.getRequestedOrientation();
            obtainStyledAttributes.recycle();
            if (z && requestedOrientation != -1) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(componentActivity)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        String simpleName = componentActivity.getClass().getSimpleName();
        if (!PatchProxy.proxy(new Object[]{simpleName}, null, C4FL.LIZ, true, 2).isSupported && Lego.INSTANCE.isBootFinish() && !PatchProxy.proxy(new Object[]{simpleName}, null, C138628d0a.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(simpleName);
            if (C14L.LIZJ.LIZIZ == 1 && C14L.LIZLLL.LIZIZ(simpleName)) {
                C141300dhl.LIZIZ(C14L.LIZLLL.LIZ(simpleName));
            }
        }
        componentActivity.androidx_core_app_ComponentActivity__onCreate$___twin___(bundle);
    }
}
