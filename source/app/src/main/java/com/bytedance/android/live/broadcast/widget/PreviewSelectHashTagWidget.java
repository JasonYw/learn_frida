package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.depend.hashtag.LiveCircleHashTag;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;
import p003X.AbstractC414762bG;
import p003X.AbstractC449173pf;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C100036PaY;
import p003X.C106862S5w;
import p003X.C134215brD;
import p003X.C134216brE;
import p003X.C2WD;
import p003X.C449593qL;
import p003X.C4574547f;
import p003X.C81918IQm;
import p003X.C86846KKa;
import p003X.C87308Kak;
import p003X.C88454KtE;
import p003X.KKJ;
import p003X.KKL;
import p003X.KKM;
import p003X.KKN;
import p003X.KKO;
import p003X.LK5;

/* loaded from: classes5.dex */
public class PreviewSelectHashTagWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public static final /* synthetic */ KProperty[] LIZJ;
    public ImageView LIZ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public C134215brD f25995LJ;
    public Challenge LJFF;
    public LiveCircleHashTag LJI;
    public LiveCircleHashTag LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public LiveCircleHashTag LJIILL;
    public final Lazy LJIILLIIL = LIZ(C3180k.class);
    public final Lazy LJIIZILJ = LIZ(C3199v.class);
    public final Consumer<AbstractC449173pf<Challenge>> LJIJ = new KKO(this);
    public final Consumer<AbstractC449173pf<LiveCircleHashTag>> LJIJI;
    public final Consumer<AbstractC449173pf<RoomCreateInfo>> LJIJJ;

    static {
        Covode.recordClassIndex(18639);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewSelectHashTagWidget.class, "previewWidgetContext", "getPreviewWidgetContext()Lcom/bytedance/android/live/broadcast/preview/PreviewWidgetContext;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewSelectHashTagWidget.class, "mStartLiveViewModel", "getMStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZJ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    private final C3180k LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (C3180k) (proxy.isSupported ? proxy.result : LIZ(this.LJIILLIIL, this, LIZJ[0]));
    }

    public String LIZ() {
        return "PreviewSelectHashTagWidget";
    }

    public final C3199v LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIZILJ, this, LIZJ[1]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698445;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 23).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final String LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Challenge LJFF = LJFF();
        if (LJFF != null) {
            return LJFF.challengeName;
        }
        return null;
    }

    public final LiveCircleHashTag LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 13);
        if (proxy.isSupported) {
            return (LiveCircleHashTag) proxy.result;
        }
        if (LJII()) {
            return LIZJ().LJIL().LIZ();
        }
        return null;
    }

    public PreviewSelectHashTagWidget() {
        boolean z;
        C86846KKa c86846KKa;
        RoomCreateInfo LIZ = LJIIIIZZ().LIZIZ().LIZ();
        if (LIZ != null && (c86846KKa = LIZ.LJJ) != null) {
            z = c86846KKa.LIZ;
        } else {
            z = false;
        }
        this.LJIILIIL = z;
        this.LJIJI = new KKL(this);
        this.LJIJJ = new KKM(this);
    }

    private final boolean LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(LIZJ().LJIIZILJ().LIZ());
        } catch (Exception unused) {
            if (jSONObject == null) {
                return false;
            }
        }
        if (!jSONObject.has("circle_id") || !jSONObject.has("circle_name")) {
            return false;
        }
        long LIZ = C100036PaY.LIZ(jSONObject.getString("circle_id"), 0L);
        String string = jSONObject.getString("circle_name");
        if (LIZ <= 0 || StringUtils.isEmpty(string)) {
            return false;
        }
        LIZJ().LJIL().LIZ(new LiveCircleHashTag(LIZ, string));
        this.LJI = new LiveCircleHashTag(LIZ, string);
        LIZJ().LJIL().LIZ(this.LJI);
        return true;
    }

    public void LIZIZ() {
        Challenge LJFF;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported) {
            return;
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLIL;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        if (!LIZ.booleanValue() && (LJFF = LJFF()) != null && LJFF.isCategoryBind) {
            String LIZ2 = LK5.LIZ(2131582489);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ(LIZ2);
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(Boolean.TRUE);
        }
    }

    /* renamed from: LJ */
    public final void m15864LJ() {
        C86846KKa c86846KKa;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10).isSupported || LJIIIZ()) {
            return;
        }
        this.LJI = null;
        RoomCreateInfo LIZ = LJIIIIZZ().LIZIZ().LIZ();
        if (LIZ != null && (c86846KKa = LIZ.LJJ) != null) {
            z = c86846KKa.LIZIZ;
        }
        long LIZ2 = C88454KtE.LIZ("live_room_circle_info", "circle_id", 0L);
        String LIZ3 = C88454KtE.LIZ("live_room_circle_info", "circle_name", "");
        if (z && LIZ2 > 0 && !StringUtils.isEmpty(LIZ3)) {
            this.LJIIL = new LiveCircleHashTag(LIZ2, LIZ3);
            LIZJ().LJIL().LIZ(this.LJIIL);
        }
    }

    public final Challenge LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 12);
        if (proxy.isSupported) {
            return (Challenge) proxy.result;
        }
        Challenge LIZ = LIZJ().LJIJJLI().LIZ();
        if (LJIIJJI().LIZ().LIZ() == LiveMode.SCREEN_RECORD) {
            return LIZJ().LJJ().LIZ();
        }
        return LIZ;
    }

    public final boolean LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.PREVIEW_SELECT_HASHTAG_CIRCLE_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue() || !this.LJIILIIL) {
            return false;
        }
        LiveMode LIZ = LJIIJJI().LIZ().LIZ();
        if (LIZ != LiveMode.VIDEO && LIZ != LiveMode.AUDIO) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        super.onResume();
        if (LJFF() == null) {
            Disposable subscribe = LIZJ().LJIJJLI().LIZIZ().subscribe(this.LJIJ);
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            LIZ(subscribe);
        }
        if (LJI() == null) {
            Disposable subscribe2 = LIZJ().LJIL().LIZIZ().subscribe(this.LJIJI);
            Intrinsics.checkNotNullExpressionValue(subscribe2, "");
            LIZ(subscribe2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        C2WD<Challenge> c2wd;
        View view;
        TextView textView;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        this.LIZLLL = (TextView) this.contentView.findViewById(2131176587);
        this.LIZ = (ImageView) this.contentView.findViewById(2131169109);
        String LJIIJ = LJIIJ();
        if (!TextUtils.isEmpty(LJIIJ) && (textView = this.LIZLLL) != null) {
            textView.setText(LJIIJ);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
        hashMap.put("entrance_type", "live_take");
        C4574547f.LIZ().LIZ("livesdk_anchor_challenge_show", hashMap, new Object[0]);
        C3199v LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            c2wd = LIZJ2.LJJ();
        } else {
            c2wd = null;
        }
        Disposable subscribe = c2wd.LIZIZ().subscribe(this.LJIJ);
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        LIZ(subscribe);
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            Disposable subscribe2 = LIZJ().LJIJJLI().LIZIZ().subscribe(this.LJIJ);
            Intrinsics.checkNotNullExpressionValue(subscribe2, "");
            LIZ(subscribe2);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 22).isSupported) {
            LIZJ().LJIJ().LIZ(new PreviewSelectHashTagWidget$getTaskIdFromSourceParam$1(this));
        }
        if (this.contentView != null) {
            this.contentView.setOnClickListener(new KKJ(this, hashMap));
            SettingKey<Integer> settingKey2 = LiveSettingKeys.LIVE_OPEN_LIVE_VIDEO_INTERACT_STYLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (settingKey2.getValue().intValue() > 0) {
                SettingKey<Boolean> settingKey3 = LiveSettingKeys.LIVE_VIDEO_KTV_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                Boolean value2 = settingKey3.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                if (value2.booleanValue() && (view = this.contentView) != null) {
                    view.setBackground(null);
                }
            }
        }
        LIZJ().LJJI().LIZ(new PreviewSelectHashTagWidget$onCreate$2(this));
        Disposable subscribe3 = LIZJ().LJIL().LIZIZ().subscribe(this.LJIJI);
        Intrinsics.checkNotNullExpressionValue(subscribe3, "");
        LIZ(subscribe3);
        Disposable subscribe4 = LJIIIIZZ().LIZIZ().LIZIZ().subscribe(this.LJIJJ);
        Intrinsics.checkNotNullExpressionValue(subscribe4, "");
        LIZ(subscribe4);
        m15864LJ();
        LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewSelectHashTagWidget.LIZLLL():void");
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        AudioInteractMode LIZ;
        if (!PatchProxy.proxy(new Object[]{liveMode}, this, LIZIZ, false, 17).isSupported && liveMode != null) {
            if (liveMode != LiveMode.VIDEO && liveMode != LiveMode.AUDIO) {
                LIZJ().LJIL().LIZ(null);
            } else if (this.LJI != null) {
                LIZJ().LJIL().LIZ(this.LJI);
            } else if (this.LJIIL != null) {
                LIZJ().LJIL().LIZ(this.LJIIL);
            }
            C3258d LIZIZ2 = LIZJ().LJJI().LIZIZ();
            if (LIZIZ2 != null && (abstractC414762bG = LIZIZ2.LIZIZ) != null && (LIZ = abstractC414762bG.LIZ()) != null) {
                LIZ(liveMode, LIZ);
            }
            LIZLLL();
        }
    }

    public void LIZ(String str) {
        C134215brD c134215brD;
        C134215brD c134215brD2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 16).isSupported && (c134215brD = this.f25995LJ) != null && c134215brD.isShowing() && (c134215brD2 = this.f25995LJ) != null) {
            c134215brD2.dismiss();
        }
        Context context = this.context;
        if (context != null) {
            C134216brE c134216brE = new C134216brE((FragmentActivity) context);
            c134216brE.LIZJ(true);
            C134216brE LIZ = c134216brE.LIZ(str);
            LIZ.LIZ(JsBridgeDelegate.GET_URL_OUT_TIME);
            LIZ.LIZIZ(false);
            LIZ.LIZ(false);
            View view = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            if (view.getWidth() > 0) {
                LIZ.LJFF((int) C81918IQm.LIZ(this.context, 5.0f));
            }
            this.f25995LJ = LIZ.LIZ();
            C134215brD c134215brD3 = this.f25995LJ;
            if (c134215brD3 != null) {
                c134215brD3.LIZ();
            }
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            if (view2.getWidth() > 0) {
                C134215brD c134215brD4 = this.f25995LJ;
                if (c134215brD4 != null) {
                    c134215brD4.LIZ(this.contentView, 48, C81918IQm.LIZ(this.context, 100.0f), ((int) C81918IQm.LIZ(this.context, 60.0f)) * (-1));
                    return;
                }
                return;
            }
            View view3 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            view3.getViewTreeObserver().addOnGlobalLayoutListener(new KKN(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void LIZ(LiveMode liveMode, AudioInteractMode audioInteractMode) {
        Challenge LIZ;
        if (!PatchProxy.proxy(new Object[]{liveMode, audioInteractMode}, this, LIZIZ, false, 18).isSupported && LJI() == null && liveMode == LiveMode.AUDIO && (LIZ = audioInteractMode.LIZ()) != null) {
            LIZJ().LJIJJLI().LIZ(LIZ);
            this.LJIJ.accept(C449593qL.LIZ(LIZ));
        }
    }
}
