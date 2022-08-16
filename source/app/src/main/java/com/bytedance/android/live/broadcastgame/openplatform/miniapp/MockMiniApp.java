package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.android.live.broadcastgame.opengame.view.AutoAnimationTextView;
import com.bytedance.bdp.live.livecontainer.base.schema.LiveSchemaInfo;
import com.bytedance.bdp.live.livecontainer.miniapp.C11519i;
import com.bytedance.bdp.live.livecontainer.miniapp.MiniAppPluginEventManager;
import com.bytedance.bdp.live.livecontainer.miniapp.PageConfig;
import com.bytedance.bdp.live.livecontainer.miniapp.PageStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import io.reactivex.Observable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C65258Boy;
import p003X.C87010KQi;
import p003X.C87826Kj6;
import p003X.C87890Kk8;
import p003X.C87941Kkx;
import p003X.C88331KrF;
import p003X.GOY;
import p003X.View$OnClickListenerC87894KkC;
import p003X.View$OnClickListenerC87895KkD;
import p003X.View$OnClickListenerC87896KkE;
import p003X.View$OnClickListenerC87897KkF;
import p003X.View$OnClickListenerC87898KkG;
import p003X.View$OnClickListenerC87899KkH;

/* loaded from: classes5.dex */
public final class MockMiniApp extends AppCompatActivity {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ = "";
    public String LIZJ = "tab/home/index?id=12322";
    public C11519i LIZLLL = new C11519i(null, null, null, null, null, null, null, 127);

    /* renamed from: LJ */
    public final Lazy f26107LJ = LazyKt__LazyJVMKt.lazy(new MockMiniApp$schema$2(this));
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(new MockMiniApp$isAnchor$2(this));
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(new MockMiniApp$params$2(this));
    public HashMap LJII;

    static {
        Covode.recordClassIndex(21470);
    }

    private final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (String) (proxy.isSupported ? proxy.result : this.f26107LJ.mo27335getValue());
    }

    private final String LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (String) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View view = (View) this.LJII.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJII.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final PageConfig LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (PageConfig) proxy.result;
        }
        return MiniAppPluginEventManager.INSTANCE.getCurPageConfig(this.LIZIZ, this.LIZJ);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        MiniAppPluginEventManager.INSTANCE.notifyMiniAppShow(this.LIZIZ);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 15).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 14).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                    MiniAppPluginEventManager.INSTANCE.notifyMiniAppHide(this.LIZIZ);
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

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        PageStatus pageStatus = MiniAppPluginEventManager.INSTANCE.getCurPageConfig(this.LIZIZ, this.LIZJ).getPageStatus();
        LIZ(pageStatus);
        TextView textView = (TextView) LIZ(2131184884);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText("schema: " + LIZJ() + "\n\n params: " + LIZLLL() + " \n\n 当前页面: " + this.LIZJ + " \n 当前页面状态: " + pageStatus + " \n ");
    }

    public final void LIZ(PageStatus pageStatus) {
        String string;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{pageStatus}, this, LIZ, false, 12).isSupported) {
            return;
        }
        AutoAnimationTextView autoAnimationTextView = (AutoAnimationTextView) LIZ(2131183386);
        Intrinsics.checkNotNullExpressionValue(autoAnimationTextView, "");
        int i = C87826Kj6.LIZIZ[pageStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    string = "";
                } else {
                    string = getString(2131586336);
                }
            } else {
                string = getString(2131586335);
            }
        } else {
            string = getString(2131586338);
        }
        autoAnimationTextView.setText(string);
        AutoAnimationTextView autoAnimationTextView2 = (AutoAnimationTextView) LIZ(2131183386);
        Intrinsics.checkNotNullExpressionValue(autoAnimationTextView2, "");
        if (pageStatus == PageStatus.HIDE) {
            z = false;
        }
        C87890Kk8.LIZ(autoAnimationTextView2, Boolean.valueOf(z));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String LIZ2;
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 4).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 6).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 5).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        setContentView(2131700007);
        LiveSchemaInfo LIZ3 = LiveSchemaInfo.LJII.LIZ(LIZJ());
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            this.LIZIZ = LIZ2;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = this.LJFF.mo27335getValue();
            }
            if (!((Boolean) mo27335getValue).booleanValue()) {
                AutoAnimationTextView autoAnimationTextView = (AutoAnimationTextView) LIZ(2131183386);
                Intrinsics.checkNotNullExpressionValue(autoAnimationTextView, "");
                autoAnimationTextView.setVisibility(8);
                TextView textView = (TextView) LIZ(2131189418);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
            }
            LIZ();
            ((AutoAnimationTextView) LIZ(2131183386)).setOnClickListener(new View$OnClickListenerC87894KkC(this));
            ((AutoAnimationTextView) LIZ(2131183386)).setHalfProgressListener(new MockMiniApp$onCreate$2(this));
            ((TextView) LIZ(2131195954)).setOnClickListener(new View$OnClickListenerC87895KkD(this));
            ((TextView) LIZ(2131176706)).setOnClickListener(new View$OnClickListenerC87899KkH(this));
            ((TextView) LIZ(2131189418)).setOnClickListener(new View$OnClickListenerC87896KkE(this));
            ((TextView) LIZ(2131187765)).setOnClickListener(new View$OnClickListenerC87897KkF(this));
            ((TextView) LIZ(2131169261)).setOnClickListener(new View$OnClickListenerC87898KkG(this));
            Observable LIZ4 = C87010KQi.LIZ().LIZ(C3800g.class);
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            C87890Kk8.LIZ(LIZ4, new MockMiniApp$onCreate$8(this));
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        String str = "";
        if (z) {
            Observable compose = C88331KrF.LIZIZ.LIZ(LIZ(2131183187), getWindow()).map(new C87941Kkx(this)).compose(C100839PnV.LIZJ());
            Intrinsics.checkNotNullExpressionValue(compose, str);
            C87890Kk8.LIZ(compose, new MockMiniApp$mount$2(this));
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            C11519i c11519i = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{"同城旅行"}, c11519i, C11519i.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ("同城旅行");
                c11519i.LIZLLL = "同城旅行";
            }
            C11519i c11519i2 = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{"http://p-boe-sign.bytedance.net/developer/app/tt4a6e3cd3d544f253/icon7280d15~tplv-giyy2m8f28-144x144.jpeg?x-orig-authkey=boeorigin&x-orig-expires=2579070809&x-orig-sign=TYaOqr6v%2B5uuOpkossAULv%2FFi%2Fg%3D"}, c11519i2, C11519i.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ("http://p-boe-sign.bytedance.net/developer/app/tt4a6e3cd3d544f253/icon7280d15~tplv-giyy2m8f28-144x144.jpeg?x-orig-authkey=boeorigin&x-orig-expires=2579070809&x-orig-sign=TYaOqr6v%2B5uuOpkossAULv%2FFi%2Fg%3D");
                c11519i2.f29182LJ = "http://p-boe-sign.bytedance.net/developer/app/tt4a6e3cd3d544f253/icon7280d15~tplv-giyy2m8f28-144x144.jpeg?x-orig-authkey=boeorigin&x-orig-expires=2579070809&x-orig-sign=TYaOqr6v%2B5uuOpkossAULv%2FFi%2Fg%3D";
            }
            C11519i c11519i3 = this.LIZLLL;
            C65258Boy c65258Boy = C65258Boy.LIZIZ;
            String LIZJ = LIZJ();
            Intrinsics.checkNotNullExpressionValue(LIZJ, str);
            String LIZ2 = c65258Boy.LIZ(LIZJ, MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("start_page", this.LIZJ)));
            if (LIZ2 != null) {
                str = LIZ2;
            }
            c11519i3.LIZ(str);
            C11519i c11519i4 = this.LIZLLL;
            String str2 = this.LIZJ;
            if (!PatchProxy.proxy(new Object[]{str2}, c11519i4, C11519i.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(str2);
                c11519i4.LIZIZ = str2;
            }
            C11519i c11519i5 = this.LIZLLL;
            if (!PatchProxy.proxy(new Object[]{"同城旅行"}, c11519i5, C11519i.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ("同城旅行");
                c11519i5.LIZJ = "同城旅行";
            }
        }
        MiniAppPluginEventManager.INSTANCE.mountToLive(this.LIZIZ, this.LIZJ, this.LIZLLL, new MockMiniApp$mount$3(this));
    }
}
