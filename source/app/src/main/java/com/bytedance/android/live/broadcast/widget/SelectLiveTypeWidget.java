package com.bytedance.android.live.broadcast.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.LiveTypeButton;
import com.bytedance.android.live.broadcast.preview.AbstractC3178e;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C86826KJg;
import p003X.C87308Kak;
import p003X.KK5;
import p003X.KK8;
import p003X.KN8;
import p003X.LK5;
import p003X.LLY;

/* loaded from: classes5.dex */
public class SelectLiveTypeWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZIZ;
    public static final /* synthetic */ KProperty[] LIZJ;
    public final Lazy LIZ = LIZ(C3199v.class);
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(18783);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SelectLiveTypeWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZJ = new KProperty[]{propertyReference1Impl};
    }

    private final C3199v LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LIZ, this, LIZJ[0]));
    }

    public String LIZ() {
        return "SelectLiveTypeWidget";
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131700848;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a225";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        AbstractC3178e abstractC3178e;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2).isSupported) {
            return;
        }
        super.onCreate();
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7145dN;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        this.LIZLLL = LIZ.booleanValue();
        LJIIJJI().LIZ().LIZ(LIZJ());
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported && (abstractC3178e = (AbstractC3178e) KN8.LIZJ().LIZIZ().LIZ(AbstractC3178e.class)) != null) {
            LIZ(abstractC3178e.LIZ(LJIIJJI()), LJIIJJI());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.bytedance.android.livesdkapi.depend.model.live.LiveMode] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, com.bytedance.android.livesdkapi.depend.model.live.LiveMode] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, com.bytedance.android.livesdkapi.depend.model.live.LiveMode] */
    private final LiveMode LIZJ() {
        T t;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4);
        if (proxy.isSupported) {
            return (LiveMode) proxy.result;
        }
        if (this.LIZLLL) {
            return LiveMode.MEDIA;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t2 = 0;
        objectRef.element = null;
        try {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LIZIZ().LJIJ().LIZ(new SelectLiveTypeWidget$getLiveMode$1(objectRef));
            } else {
                String LIZ = LIZIZ().LJIIZILJ().LIZ();
                if (LIZ != null) {
                    t2 = LiveMode.createBySchemeLiveScene(new JSONObject(LIZ).optString("live_scene"));
                }
                objectRef.element = t2;
            }
        } catch (Exception unused) {
            ALogger.m15800e("SelectLiveTypeWidget", "sourceParams json parse error");
        }
        if (objectRef.element == 0) {
            try {
                C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJLIIIJLJLI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                String LIZ2 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                t = LiveMode.valueOf(LIZ2);
            } catch (Exception e) {
                ALogger.m15800e("SelectLiveTypeWidget", "LiveMode.valueOf e " + e);
                t = LiveMode.VIDEO;
            }
            objectRef.element = t;
            if (objectRef.element == LiveMode.MEDIA) {
                objectRef.element = LiveMode.VIDEO;
            }
        }
        SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_ANCHOR_SCREENSHOT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        if (!settingKey2.getValue().booleanValue() && objectRef.element == LiveMode.SCREEN_RECORD) {
            objectRef.element = LiveMode.VIDEO;
        }
        ?? r0 = C86826KJg.LIZJ;
        if (r0 != 0) {
            objectRef.element = r0;
        }
        LiveMode liveMode = (LiveMode) objectRef.element;
        if (liveMode == null) {
            return LiveMode.VIDEO;
        }
        return liveMode;
    }

    public void LIZ(List<LiveTypeButton> list, C3180k c3180k) {
        MethodCollector.m14708i(1381);
        if (PatchProxy.proxy(new Object[]{list, c3180k}, this, LIZIZ, false, 5).isSupported) {
            MethodCollector.m14707o(1381);
            return;
        }
        C106862S5w.LIZ(list, c3180k);
        if (CollectionUtils.isEmpty(list)) {
            MethodCollector.m14707o(1381);
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(2131168426);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        for (LiveTypeButton liveTypeButton : list) {
            View inflate = LayoutInflater.from(getContext()).inflate(2131700849, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "");
            ((ImageView) inflate.findViewById(2131168414)).setBackgroundResource(liveTypeButton.unselectedDrawableId);
            TextView textView = (TextView) inflate.findViewById(2131168416);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(getContext().getString(liveTypeButton.titleId));
            c3180k.LIZ().LIZIZ().subscribe(new KK5(this, inflate, liveTypeButton));
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            ((LinearLayout) view2.findViewById(2131168426)).addView(inflate);
            inflate.setOnClickListener(new KK8(liveTypeButton.liveMode, this, c3180k, list));
            TextView textView2 = (TextView) inflate.findViewById(2131168416);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            LLY.LIZ(inflate, textView2.getText().toString());
            if (list.indexOf(liveTypeButton) < list.size() - 1) {
                View view3 = new View(getContext());
                view3.setBackgroundColor(LK5.LIZIZ(2131628151));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 0.5f), (int) UIUtils.dip2Px(getContext(), 12.0f));
                layoutParams.leftMargin = (int) UIUtils.dip2Px(getContext(), 12.0f);
                layoutParams.rightMargin = (int) UIUtils.dip2Px(getContext(), 12.0f);
                layoutParams.gravity = 16;
                View view4 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                ((LinearLayout) view4.findViewById(2131168426)).addView(view3, layoutParams);
                view3.setPadding(0, (int) UIUtils.dip2Px(getContext(), 2.0f), 0, 0);
            }
        }
        MethodCollector.m14707o(1381);
    }
}
