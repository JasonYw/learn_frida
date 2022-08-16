package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3779b;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3801k;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.TrackMiniCardService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.livead.ILiveMiniAppService;
import com.bytedance.android.livesdk.chatroom.p518ui.LiveSwitchButton;
import com.bytedance.android.livesdk.message.model.C8906gu;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88100KnW;
import p003X.C106862S5w;
import p003X.C1KL;
import p003X.C4574547f;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87804Kik;
import p003X.C87811Kir;
import p003X.C87850KjU;
import p003X.C87852KjW;
import p003X.C87890Kk8;
import p003X.C88514KuC;
import p003X.DialogInterface$OnClickListenerC87812Kis;
import p003X.DialogInterface$OnClickListenerC87868Kjm;
import p003X.GOY;
import p003X.LK1;
import p003X.View$OnClickListenerC87817Kix;
import p003X.View$OnClickListenerC87849KjT;
import p003X.View$OnClickListenerC87860Kje;
import p003X.View$OnClickListenerC87862Kjg;
import p003X.View$OnClickListenerC87865Kjj;
import p003X.View$OnClickListenerC87870Kjo;
import p003X.animation.Animation$AnimationListenerC87863Kjh;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog extends FragmentActivity {
    public static ChangeQuickRedirect LIZ;
    public static final float LJFF = LK1.LIZ(2.0f);
    public long LIZIZ;

    /* renamed from: LJ */
    public AbstractC88100KnW<C3561g> f26108LJ;
    public C88514KuC LJIIIIZZ;
    public boolean LJIIJ;
    public HashMap LJIILIIL;
    public final /* synthetic */ C87549Ked LJIIL = new C87549Ked();
    public String LIZJ = "";
    public String LIZLLL = "";
    public int LJI = 750;
    public int LJII = 751;
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(new MiniAppCardSettingDialog$cardViewModel$2(this));
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(new MiniAppCardSettingDialog$processDialog$2(this));

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIL.LIZ(disposable);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 29);
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

    public final C3796c LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3796c) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    public final ProgressDialog LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (ProgressDialog) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(21545);
    }

    public final boolean LIZJ() {
        if (this.LIZIZ != -1) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        finish();
    }

    /* renamed from: LJ */
    public final void m15834LJ() {
        boolean z;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        Boolean LJI = LIZ().LJI();
        if (LJI != null) {
            z = LJI.booleanValue();
        } else {
            z = true;
        }
        this.LJIIIIZZ = new C88514KuC(this, null, "miniapp_panel_cover", z, 1, 1, this.LJI, this.LJII, new C87850KjU(this));
        C88514KuC c88514KuC = this.LJIIIIZZ;
        if (c88514KuC != null) {
            c88514KuC.LIZ();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            this.LJIIL.LIZ();
        }
    }

    private final void LJFF() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        LIZ().LIZIZ(this.LIZIZ, this.LIZJ);
        if (C87811Kir.LIZ() != null) {
            i = 2131586319;
        } else {
            i = 2131586320;
        }
        v$a v_a = new v$a(this, 4);
        v_a.LIZIZ(getString(i));
        v_a.LIZIZ(0, getString(2131586311), DialogInterface$OnClickListenerC87868Kjm.LIZIZ).LIZIZ(1, getString(2131586314), new DialogInterface$OnClickListenerC87812Kis(this)).LIZ(0, true).LIZJ();
    }

    @Override // android.app.Activity
    public final void finish() {
        MethodCollector.m14708i(1501);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(1501);
        } else if (this.LJIIJ) {
            MethodCollector.m14707o(1501);
        } else {
            this.LJIIJ = true;
            ILiveMiniAppService iLiveMiniAppService = (ILiveMiniAppService) ServiceManager.getService(ILiveMiniAppService.class);
            if (iLiveMiniAppService != null) {
                iLiveMiniAppService.setMiniAppActivityStatue(false);
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(this, 2130968794);
            loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC87863Kjh(this));
            ((LinearLayout) LIZ(2131170683)).startAnimation(loadAnimation);
            MethodCollector.m14707o(1501);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 36).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 35).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 34).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
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

    public static final /* synthetic */ void LIZ(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        if (PatchProxy.proxy(new Object[]{miniAppCardSettingDialog}, null, LIZ, true, 28).isSupported) {
            return;
        }
        super.finish();
    }

    private final void LIZ(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ = intent.getLongExtra("room_id", -1L);
        String stringExtra = intent.getStringExtra(Constants.APP_ID);
        Intrinsics.checkNotNullExpressionValue(stringExtra, "");
        this.LIZJ = stringExtra;
        String stringExtra2 = intent.getStringExtra("page");
        Intrinsics.checkNotNullExpressionValue(stringExtra2, "");
        this.LIZLLL = stringExtra2;
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            LJFF();
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        Boolean bool;
        PageDataV2 pageDataV2;
        PageDataV2 pageDataV22;
        if (PatchProxy.proxy(new Object[]{intent}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (intent != null) {
            LIZ(intent);
        }
        C3796c LIZ2 = LIZ();
        String str2 = this.LIZJ;
        String str3 = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[]{str2, str3}, LIZ2, C3796c.LIZ, false, 27).isSupported) {
            C106862S5w.LIZ(str2, str3);
            PageDataV2.ReviewStatus reviewStatus = null;
            if (LIZ2.LIZ(str2, str3)) {
                PageDataV2 LIZ3 = C87811Kir.LIZ();
                if (LIZ3 != null) {
                    pageDataV2 = LIZ3.LIZ();
                } else {
                    pageDataV2 = null;
                }
                LIZ2.LIZJ = pageDataV2;
                PageDataV2 LIZ4 = C87811Kir.LIZ();
                if (LIZ4 != null) {
                    pageDataV22 = LIZ4.LIZ();
                } else {
                    pageDataV22 = null;
                }
                LIZ2.LIZLLL = pageDataV22;
            } else {
                LIZ2.LIZJ = C87811Kir.LIZIZ();
                LIZ2.LIZLLL = C87811Kir.LIZIZ();
            }
            C1KL<String> LIZ5 = LIZ2.LIZ();
            PageDataV2 pageDataV23 = LIZ2.LIZJ;
            if (pageDataV23 != null) {
                str = pageDataV23.LIZIZ();
            } else {
                str = null;
            }
            LIZ2.LIZ((C1KL<C1KL<String>>) LIZ5, (C1KL<String>) str);
            C1KL<Boolean> LIZLLL = LIZ2.LIZLLL();
            PageDataV2 pageDataV24 = LIZ2.LIZJ;
            if (pageDataV24 != null) {
                bool = Boolean.valueOf(pageDataV24.LJFF);
            } else {
                bool = null;
            }
            LIZ2.LIZ((C1KL<C1KL<Boolean>>) LIZLLL, (C1KL<Boolean>) bool);
            C1KL<PageDataV2.ReviewStatus> LJII = LIZ2.LJII();
            PageDataV2 pageDataV25 = LIZ2.LIZJ;
            if (pageDataV25 != null) {
                reviewStatus = pageDataV25.LJII;
            }
            LIZ2.LIZ((C1KL<C1KL<PageDataV2.ReviewStatus>>) LJII, (C1KL<PageDataV2.ReviewStatus>) reviewStatus);
            C87811Kir.LJI.LIZ(new CardSettingViewModel$reload$1(LIZ2));
            LIZ2.LIZ(str2);
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Boolean bool;
        PageDataV2 pageDataV2;
        PageDataV2 pageDataV22;
        Object mo27335getValue;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        PageDataV2.ReviewStatus reviewStatus = null;
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 5).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        setContentView(2131698614);
        getWindow().setGravity(80);
        getWindow().setLayout(-1, -2);
        overridePendingTransition(2130968785, 0);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        LIZ(intent);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            LIZ().LIZLLL().LIZ(this, new MiniAppCardSettingDialog$initView$1(this));
            LiveSwitchButton liveSwitchButton = (LiveSwitchButton) LIZ(2131172584);
            if (liveSwitchButton != null) {
                liveSwitchButton.setOnCheckedChangeListener(new C87852KjW(this));
            }
            LIZ().LIZ().LIZ(this, new MiniAppCardSettingDialog$initView$3(this));
            LIZ().LIZIZ().LIZ(this, new MiniAppCardSettingDialog$initView$4(this));
            LIZ().LIZJ().LIZ(this, new MiniAppCardSettingDialog$initView$5(this));
            ((ImageView) LIZ(2131192311)).setOnClickListener(new View$OnClickListenerC87862Kjg(this));
            ((ConstraintLayout) LIZ(2131192990)).setOnClickListener(new View$OnClickListenerC87849KjT(this));
            ((RelativeLayout) LIZ(2131190119)).setOnClickListener(new View$OnClickListenerC87865Kjj(this));
            LIZ().m15833LJ().LIZ(this, new MiniAppCardSettingDialog$initView$9(this));
            LIZ().LJFF().LIZ(this, new MiniAppCardSettingDialog$initView$10(this));
            C3796c LIZ2 = LIZ();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], LIZ2, C3796c.LIZ, false, 9);
            if (proxy.isSupported) {
                mo27335getValue = proxy.result;
            } else {
                mo27335getValue = LIZ2.LIZIZ.mo27335getValue();
            }
            ((C1KL) mo27335getValue).LIZ(this, new MiniAppCardSettingDialog$initView$11(this));
            LIZ().LJII().LIZ(this, new MiniAppCardSettingDialog$initView$12(this));
            ((TextView) LIZ(2131168721)).setOnClickListener(new View$OnClickListenerC87860Kje(this));
            ((TextView) LIZ(2131168712)).setOnClickListener(View$OnClickListenerC87817Kix.LIZIZ);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            Observable LIZ3 = C87010KQi.LIZ().LIZ(C3779b.class);
            Intrinsics.checkNotNullExpressionValue(LIZ3, "");
            LIZ(C87890Kk8.LIZ(LIZ3, new MiniAppCardSettingDialog$observerData$1(this)));
        }
        C3796c LIZ4 = LIZ();
        String str2 = this.LIZJ;
        String str3 = this.LIZLLL;
        if (!PatchProxy.proxy(new Object[]{str2, str3}, LIZ4, C3796c.LIZ, false, 10).isSupported) {
            C106862S5w.LIZ(str2, str3);
            if (LIZ4.LIZ(str2, str3)) {
                PageDataV2 LIZ5 = C87811Kir.LIZ();
                if (LIZ5 != null) {
                    pageDataV2 = LIZ5.LIZ();
                } else {
                    pageDataV2 = null;
                }
                LIZ4.LIZJ = pageDataV2;
                PageDataV2 LIZ6 = C87811Kir.LIZ();
                if (LIZ6 != null) {
                    pageDataV22 = LIZ6.LIZ();
                } else {
                    pageDataV22 = null;
                }
                LIZ4.LIZLLL = pageDataV22;
            } else {
                LIZ4.LIZJ = C87811Kir.LIZIZ();
                LIZ4.LIZLLL = C87811Kir.LIZIZ();
            }
            C1KL<String> LIZ7 = LIZ4.LIZ();
            PageDataV2 pageDataV23 = LIZ4.LIZJ;
            if (pageDataV23 != null) {
                str = pageDataV23.LIZIZ();
            } else {
                str = null;
            }
            LIZ4.LIZ((C1KL<C1KL<String>>) LIZ7, (C1KL<String>) str);
            C1KL<Boolean> LIZLLL = LIZ4.LIZLLL();
            PageDataV2 pageDataV24 = LIZ4.LIZJ;
            if (pageDataV24 != null) {
                bool = Boolean.valueOf(pageDataV24.LJFF);
            } else {
                bool = null;
            }
            LIZ4.LIZ((C1KL<C1KL<Boolean>>) LIZLLL, (C1KL<Boolean>) bool);
            C1KL<PageDataV2.ReviewStatus> LJII = LIZ4.LJII();
            PageDataV2 pageDataV25 = LIZ4.LIZJ;
            if (pageDataV25 != null) {
                reviewStatus = pageDataV25.LJII;
            }
            LIZ4.LIZ((C1KL<C1KL<PageDataV2.ReviewStatus>>) LJII, (C1KL<PageDataV2.ReviewStatus>) reviewStatus);
            C87811Kir.LJI.LIZ(new CardSettingViewModel$initData$1(LIZ4));
            if (!PatchProxy.proxy(new Object[0], LIZ4, C3796c.LIZ, false, 18).isSupported) {
                Observable LIZ8 = C87010KQi.LIZ().LIZ(C8906gu.class);
                Intrinsics.checkNotNullExpressionValue(LIZ8, "");
                LIZ4.LIZ(C87890Kk8.LIZ(LIZ8, new CardSettingViewModel$observerData$1(LIZ4)));
                Observable LIZ9 = C87010KQi.LIZ().LIZ(C3801k.class);
                Intrinsics.checkNotNullExpressionValue(LIZ9, "");
                LIZ4.LIZ(C87890Kk8.LIZ(LIZ9, new CardSettingViewModel$observerData$2(LIZ4)));
            }
            LIZ4.LIZ(str2);
        }
        ((LinearLayout) LIZ(2131170683)).setOnClickListener(View$OnClickListenerC87870Kjo.LIZ);
        Observable LIZ10 = C87010KQi.LIZ().LIZ(C3779b.class);
        Intrinsics.checkNotNullExpressionValue(LIZ10, "");
        LIZ(C87890Kk8.LIZ(LIZ10, new MiniAppCardSettingDialog$onCreate$2(this)));
        if (!PatchProxy.proxy(new Object[0], TrackMiniCardService.LJI, C87804Kik.LIZ, false, 7).isSupported) {
            C4574547f.LIZ().LIZ("livesdk_small_program_explanation_card_set_show", TrackCommonService.LIZJ.LIZ(), Room.class);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4) {
            LJFF();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        C88514KuC c88514KuC = this.LJIIIIZZ;
        if (c88514KuC != null) {
            c88514KuC.LIZ(i, i2, intent);
        }
    }
}
