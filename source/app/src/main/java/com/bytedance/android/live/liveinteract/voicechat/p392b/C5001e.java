package com.bytedance.android.live.liveinteract.voicechat.p392b;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractC92843Mhp;
import p003X.AnonymousClass425;
import p003X.C106862S5w;
import p003X.C81290I2i;
import p003X.C81292I2k;
import p003X.C81293I2l;
import p003X.C99727PPl;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.b.e */
/* loaded from: classes3.dex */
public final class C5001e {
    public static ChangeQuickRedirect LIZ;
    public final String[] LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;

    /* renamed from: LJ */
    public boolean f26479LJ;
    public Runnable LJFF;
    public WeakReference<AbstractC5002a> LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIJ;
    public WeakReference<FragmentActivity> LJIIJJI;
    public Handler LJI = new Handler(Looper.getMainLooper());
    public final Application.ActivityLifecycleCallbacks LJIIL = new C81292I2k(this);
    public final Application.ActivityLifecycleCallbacks LJIILIIL = new C81293I2l(this);
    public final AbstractC92843Mhp LJIIIZ = new C81290I2i(this);

    /* renamed from: com.bytedance.android.live.liveinteract.voicechat.b.e$a */
    /* loaded from: classes3.dex */
    public interface AbstractC5002a {
        static {
            Covode.recordClassIndex(30892);
        }

        void LIZ(boolean z);
    }

    static {
        Covode.recordClassIndex(30891);
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && this.LJIIJ) {
            AnonymousClass425.LIZ().unregisterActivityLifecycleCallbacks(this.LJIIL);
            AnonymousClass425.LIZ().unregisterActivityLifecycleCallbacks(this.LJIILIIL);
            this.LJIIJ = false;
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported || this.LIZJ == null) {
            return;
        }
        this.LJIIJ = true;
        AnonymousClass425.LIZ().registerActivityLifecycleCallbacks(this.LJIIL);
        AnonymousClass425.LIZ().registerActivityLifecycleCallbacks(this.LJIILIIL);
    }

    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && this.LJIIJ) {
            Runnable runnable = this.LJFF;
            if (runnable != null) {
                this.LJI.removeCallbacks(runnable);
            }
            AnonymousClass425.LIZ().unregisterActivityLifecycleCallbacks(this.LJIIL);
            this.LJIIJ = false;
        }
    }

    public final void LIZLLL() {
        FragmentActivity fragmentActivity;
        FragmentManager supportFragmentManager;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LJIIJ) {
            AnonymousClass425.LIZ().unregisterActivityLifecycleCallbacks(this.LJIIL);
            this.LJIIJ = false;
        }
        AnonymousClass425.LIZ().unregisterActivityLifecycleCallbacks(this.LJIILIIL);
        WeakReference<FragmentActivity> weakReference = this.LJIIJJI;
        if (weakReference != null && (fragmentActivity = weakReference.get()) != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.LJIIIZ);
        }
    }

    public C5001e() {
        SettingKey<String[]> settingKey = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_CHECK_CONTENT_COMMON;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LIZIZ = settingKey.getValue();
        SettingKey<String[]> settingKey2 = LiveSettingKeys.INTERACT_ACTIVITY_PERMISSION_GUARANTOR_CHECK_CONTENT;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        this.LIZJ = settingKey2.getValue();
        SettingKey<String[]> settingKey3 = LiveSettingKeys.INTERACT_FRAGMENT_PERMISSION_GUARANTOR_CHECK_CONTENT;
        Intrinsics.checkNotNullExpressionValue(settingKey3, "");
        this.LIZLLL = settingKey3.getValue();
    }

    public final void LIZ(AbstractC5002a abstractC5002a) {
        if (PatchProxy.proxy(new Object[]{abstractC5002a}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5002a);
        this.LJII = new WeakReference<>(abstractC5002a);
    }

    public final void LIZ(FragmentActivity fragmentActivity) {
        if (PatchProxy.proxy(new Object[]{fragmentActivity}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(fragmentActivity);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (supportFragmentManager != null) {
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.LJIIIZ, false);
        }
        this.LJIIJJI = new WeakReference<>(fragmentActivity);
    }

    public final boolean LIZ(Activity activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(activity);
        String name = activity.getClass().getName();
        String[] strArr = this.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(strArr, "");
        for (String str : strArr) {
            C99727PPl.LIZIZ.LIZIZ("InteractLiveCorePermissionGuarantor", "common check target activity:" + name + ',' + str);
            if (!TextUtils.isEmpty(name)) {
                Intrinsics.checkNotNullExpressionValue(name, "");
                Intrinsics.checkNotNullExpressionValue(str, "");
                if (StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) str, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
