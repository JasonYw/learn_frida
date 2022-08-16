package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.annie.api.AnnieHelper;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4255c;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4675a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4702i;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.newpk.widget.PkLynxInfoWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.AbstractC79604HZm;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C414642b4;
import p003X.C458614Br;
import p003X.C79558HXs;
import p003X.C79595HZd;
import p003X.C79596HZe;
import p003X.C79597HZf;
import p003X.C79598HZg;
import p003X.C79599HZh;
import p003X.C79600HZi;
import p003X.C79601HZj;
import p003X.C79602HZk;
import p003X.C80354Hls;
import p003X.HTW;
import p003X.HU6;
import p003X.HU7;
import p003X.HU8;
import p003X.HU9;
import p003X.HUR;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkLynxInfoWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final String LIZJ;
    public AbstractC79604HZm LIZLLL;

    /* renamed from: LJ */
    public LinkedList<String> f26392LJ;
    public LinkedList<String> LJFF;
    public boolean LJI;
    public LynxPkState LJII;
    public AbstractC4255c LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final PkDataContext LJIIJJI;
    public final C80354Hls LJIIL;
    public final CompositeDisposable LJIILIIL;
    public final Observer<AbstractC4256d> LJIILJJIL;
    public final Observer<AbstractC4702i> LJIILL;
    public final Observer<Long> LJIILLIIL;
    public final Observer<AbstractC4675a> LJIIZILJ;
    public final Observer<String> LJIJ;
    public final Observer<AbstractC4255c> LJIJI;
    public final Observer<Long> LJIJJ;
    public final Observer<Boolean> LJIJJLI;
    public final HTW LJIL;
    public final C458614Br LJJ;

    static {
        Covode.recordClassIndex(28807);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 23).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    /* loaded from: classes3.dex */
    public enum LynxPkResult {
        UNDEFINE(-1),
        SUCCESS(1),
        FAILURE(2),
        TIE(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int code;

        public static LynxPkResult valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (LynxPkResult) (proxy.isSupported ? proxy.result : Enum.valueOf(LynxPkResult.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LynxPkResult[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (LynxPkResult[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(28808);
        }

        LynxPkResult(int i) {
            this.code = i;
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported || this.LJII != LynxPkState.PUNISH) {
            return;
        }
        LIZ(LIZ(this.LJIIIIZZ));
    }

    /* loaded from: classes3.dex */
    public enum LynxPkState {
        NONE(0),
        PK(1),
        PK_SETTLE(2),
        PUNISH(3),
        LINKING(4);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int code;

        public static LynxPkState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (LynxPkState) (proxy.isSupported ? proxy.result : Enum.valueOf(LynxPkState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LynxPkState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (LynxPkState[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(28809);
        }

        LynxPkState(int i) {
            this.code = i;
        }
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported || !this.LJJ.LIZIZ()) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = LK5.LIZ(6.0f);
            layoutParams2.topToTop = 2131185184;
            layoutParams2.bottomToBottom = 2131185184;
            ViewGroup viewGroup2 = this.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup2, "");
            viewGroup2.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    public final void LIZ() {
        MethodCollector.m14708i(1977);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1977);
            return;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.LJI = false;
        AbstractC79604HZm abstractC79604HZm = this.LIZLLL;
        if (abstractC79604HZm != null) {
            C79601HZj.LIZ(abstractC79604HZm, null, 1, null);
            MethodCollector.m14707o(1977);
            return;
        }
        MethodCollector.m14707o(1977);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        while (!this.f26392LJ.isEmpty()) {
            String poll = this.f26392LJ.poll();
            Intrinsics.checkNotNullExpressionValue(poll, "");
            LIZ(poll);
        }
        while (!this.LJFF.isEmpty()) {
            String poll2 = this.LJFF.poll();
            Intrinsics.checkNotNullExpressionValue(poll2, "");
            LIZIZ(poll2);
        }
        LynxPkState lynxPkState = this.LJII;
        if (lynxPkState != null) {
            LIZ(lynxPkState);
            LIZJ();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJIIJJI.LJIIIZ.removeObserver(this.LJIILJJIL);
        this.LJIIJJI.LJIIJJI.removeObserver(this.LJIILLIIL);
        this.LJIIJJI.LJIJJLI.removeObserver(this.LJIJI);
        this.LJIIL.LIZJ.removeObserver(this.LJIIZILJ);
        this.LJIIL.f7281LJ.removeObserver(this.LJIJ);
        this.LJIL.LJFF.removeObserver(this.LJIILL);
        this.LJIIL.LJIILLIIL.removeObserver(this.LJIJJ);
        this.LJIIL.LJIJ.removeObserver(this.LJIJJLI);
        this.LJIILIIL.clear();
        AbstractC79604HZm abstractC79604HZm = this.LIZLLL;
        if (abstractC79604HZm != null) {
            abstractC79604HZm.LIZ();
        }
        this.LIZLLL = null;
        this.LJI = false;
        this.f26392LJ.clear();
        this.LJFF.clear();
        this.LJII = LynxPkState.NONE;
        this.LJIIIIZZ = HU9.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, android.net.Uri, java.lang.Object] */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        C2WC<Integer> LLFFF;
        Observable<Integer> LIZIZ;
        Disposable subscribe;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ2 = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ2.booleanValue();
        } else {
            z = false;
        }
        this.LIZIZ = z;
        this.LJIIJJI.LJIIIZ.observeForever(this.LJIILJJIL);
        this.LJIIJJI.LJIIJJI.observeForever(this.LJIILLIIL);
        this.LJIIJJI.LJIJJLI.observeForever(this.LJIJI);
        this.LJIIL.LIZJ.observeForever(this.LJIIZILJ);
        this.LJIIL.f7281LJ.observeForever(this.LJIJ);
        this.LJIL.LJFF.observeForever(this.LJIILL);
        this.LJIIL.LJIILLIIL.observeForever(this.LJIJJ);
        this.LJIIL.LJIJ.observeForever(this.LJIJJLI);
        String str = this.LIZJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        String appendCommonParams = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).appendCommonParams(str);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = AnnieHelper.createLynxSchemeByUrl(appendCommonParams);
        String queryParameter = Uri.parse(this.LIZJ).getQueryParameter("fallback_url");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String LIZJ = C414642b4.LIZJ(queryParameter, C414642b4.LIZ());
        if (LIZJ != null && LIZJ.length() != 0) {
            ?? build = ((Uri) objectRef.element).buildUpon().appendQueryParameter("fallback_url", LIZJ).build();
            Intrinsics.checkNotNullExpressionValue(build, "");
            objectRef.element = build;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZLLL = new C79602HZk(this, objectRef, context, (Uri) objectRef.element);
        LIZLLL();
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LLFFF = LIZ2.LLFFF()) != null && (LIZIZ = LLFFF.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new HUR(this))) != null) {
            QB4.LIZ(subscribe, this.LJIILIIL);
        }
    }

    public static LynxPkResult LIZ(AbstractC4255c abstractC4255c) {
        if (abstractC4255c instanceof HU7) {
            return LynxPkResult.SUCCESS;
        }
        if (abstractC4255c instanceof HU8) {
            return LynxPkResult.FAILURE;
        }
        if (abstractC4255c instanceof HU6) {
            return LynxPkResult.TIE;
        }
        return LynxPkResult.UNDEFINE;
    }

    private final void LIZIZ(JSONObject jSONObject) {
        AbstractC79604HZm abstractC79604HZm;
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 17).isSupported && (abstractC79604HZm = this.LIZLLL) != null) {
            abstractC79604HZm.LIZ("H5_webcastNotification", (String) jSONObject);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 19).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        LIZLLL();
    }

    private final void LIZ(LynxPkResult lynxPkResult) {
        if (PatchProxy.proxy(new Object[]{lynxPkResult}, this, LIZ, false, 12).isSupported || lynxPkResult == LynxPkResult.UNDEFINE) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "pk_result");
        jSONObject.put(C2521l.LJIIL, lynxPkResult.code);
        LIZIZ(jSONObject);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "consecutive_win");
        jSONObject.put(C2521l.LJIIL, Integer.parseInt(str));
        LIZ(jSONObject);
    }

    public final void LIZ(LynxPkState lynxPkState) {
        if (PatchProxy.proxy(new Object[]{lynxPkState}, this, LIZ, false, 10).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "pk_status");
        jSONObject.put(C2521l.LJIIL, lynxPkState.code);
        LIZIZ(jSONObject);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "refresh");
        jSONObject.put(C2521l.LJIIL, str);
        jSONObject.put("show_like_reword", false);
        LIZ(jSONObject);
    }

    public final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 15).isSupported || Intrinsics.areEqual(this.LJIIJJI.LJIIIZ.getValue(), AbstractC4256d.C4259c.LIZIZ)) {
            return;
        }
        LIZIZ(jSONObject);
    }

    public final void LIZ(boolean z) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        if (z) {
            i = 4;
        }
        viewGroup.setVisibility(i);
    }

    public PkLynxInfoWidget(PkDataContext pkDataContext, C80354Hls c80354Hls, HTW htw, C458614Br c458614Br) {
        String value;
        C106862S5w.LIZ(pkDataContext, c80354Hls, htw, c458614Br);
        this.LJIIJJI = pkDataContext;
        this.LJIIL = c80354Hls;
        this.LJIL = htw;
        this.LJJ = c458614Br;
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ENABLE_PK_HYBRID_REFACTORING;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value2 = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        if (value2.booleanValue()) {
            SettingKey<String> settingKey2 = LiveConfigSettingKeys.LIVE_PK_HYBRID_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            value = settingKey2.getValue();
        } else {
            SettingKey<String> settingKey3 = LiveConfigSettingKeys.LIVE_PK_TASK_LYNX_SCHEME;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            value = settingKey3.getValue();
        }
        this.LIZJ = value;
        this.f26392LJ = new LinkedList<>();
        this.LJFF = new LinkedList<>();
        this.LJII = LynxPkState.NONE;
        this.LJIIIIZZ = HU9.LIZIZ;
        this.LJIILIIL = new CompositeDisposable();
        this.LJIILJJIL = new C79596HZe(this);
        this.LJIILL = new C79595HZd(this);
        this.LJIILLIIL = new C79558HXs(this);
        this.LJIIZILJ = new C79598HZg(this);
        this.LJIJ = new C79597HZf(this);
        this.LJIJI = new C79600HZi(this);
        this.LJIJJ = new C79599HZh(this);
        this.LJIJJLI = new Observer<Boolean>() { // from class: X.9Aa
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28816);
            }

            @Override // androidx.lifecycle.Observer
            public final /* synthetic */ void onChanged(Boolean bool) {
                Boolean bool2 = bool;
                if (!PatchProxy.proxy(new Object[]{bool2}, this, LIZ, false, 1).isSupported && bool2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "instant_kill");
                    jSONObject.put(C2521l.LJIIL, bool2.booleanValue());
                    PkLynxInfoWidget.this.LIZ(jSONObject);
                }
            }
        };
    }
}
