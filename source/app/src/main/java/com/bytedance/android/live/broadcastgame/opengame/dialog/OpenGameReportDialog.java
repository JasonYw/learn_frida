package com.bytedance.android.live.broadcastgame.opengame.dialog;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.android.live.broadcastgame.opengame.network.GameReportApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.gson.annotations.SerializedName;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C3808916t;
import p003X.C87890Kk8;
import p003X.C88019KmD;
import p003X.C88055Kmn;
import p003X.C88071Kn3;
import p003X.GOY;
import p003X.LK5;
import p003X.View$OnClickListenerC88072Kn4;

/* loaded from: classes5.dex */
public final class OpenGameReportDialog extends FragmentActivity {
    public static ChangeQuickRedirect LIZ;
    public static final C88019KmD LJII = new C88019KmD((byte) 0);
    public int LIZIZ;
    public Function1<? super Integer, Unit> LJI;
    public Disposable LJIIIIZZ;
    public HashMap LJIILIIL;
    public boolean LJIIIZ = true;
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$develop$2(this));
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$roomId$2(this));
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$isAnchor$2(this));
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$appId$2(this));

    /* renamed from: LJ */
    public final Lazy f26057LJ = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$appName$2(this));
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$pluginType$2(this));
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialog$miniAppPagerParams$2(this));

    static {
        Covode.recordClassIndex(20122);
    }

    private final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (String) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return proxy.isSupported ? ((Long) proxy.result).longValue() : ((Number) this.LJIIJJI.mo27335getValue()).longValue();
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new HashMap();
        }
        View view = (View) this.LJIILIIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILIIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : ((Number) this.LJIIL.mo27335getValue()).intValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    /* renamed from: LJ */
    private final String m15848LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (LIZIZ() == PluginType.MINI_APP.value) {
            return BdpAppEventConstant.MICRO_APP;
        }
        return "mini_app";
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        Function1<? super Integer, Unit> function1 = this.LJI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.LIZIZ));
        }
        this.LJI = null;
        Disposable disposable = this.LJIIIIZZ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        this.LIZIZ = 0;
        if (!this.LJIIIZ) {
            LIZLLL();
        }
        this.LJIIIZ = false;
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJIIIIZZ = ((GameReportApi) C3599x.LIZJ.LIZ().LIZ(GameReportApi.class)).getReportReasonList(m15848LJ(), LIZ()).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.m138io()).subscribe(new C88055Kmn(this), C3808916t.LIZ);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 22).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 21).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 8).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 10).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 9).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        setContentView(2131695530);
        getWindow().setGravity(80);
        getWindow().setLayout(-1, -2);
        overridePendingTransition(2130968785, 2130968794);
        if (!StringsKt__StringsJVMKt.isBlank(LIZJ())) {
            TextView textView = (TextView) LIZ(2131171823);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(LK5.LIZ(2131587466, LIZJ()));
        }
        TextView textView2 = (TextView) LIZ(2131171823);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C87890Kk8.LIZ(textView2, Boolean.valueOf(true ^ StringsKt__StringsJVMKt.isBlank(LIZJ())));
        LIZLLL();
        ((ScrollView) LIZ(2131188335)).setOnClickListener(View$OnClickListenerC88072Kn4.LIZ);
    }

    /* loaded from: classes5.dex */
    public static final class InnerPageParams implements Serializable {
        public static final C88071Kn3 Companion = new C88071Kn3((byte) 0);
        public static ChangeQuickRedirect changeQuickRedirect = null;
        public static final long serialVersionUID = 1;
        @SerializedName("path")
        public final String path;
        @SerializedName("query")
        public final String query;

        static {
            Covode.recordClassIndex(20123);
        }

        private Object[] LIZ() {
            return new Object[]{this.path, this.query};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof InnerPageParams) {
                return C106862S5w.LIZ(((InnerPageParams) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenGameReportDialog$InnerPageParams:%s,%s", LIZ());
        }

        public InnerPageParams(String str, String str2) {
            C106862S5w.LIZ(str, str2);
            this.path = str;
            this.query = str2;
        }
    }
}
