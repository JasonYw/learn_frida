package com.bytedance.android.live.broadcast.filter.message.entry;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcast.filter.message.p265a.C3011e;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.core.widget.AbstractC4165j;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.popup.C9162c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C116971W2r;
import p003X.C86475K5t;
import p003X.C87064KSk;
import p003X.C87068KSo;
import p003X.C87308Kak;
import p003X.DialogC87063KSj;
import p003X.KDS;
import p003X.KSW;
import p003X.KSX;
import p003X.KSY;
import p003X.LK1;
import p003X.LK5;
import p003X.View$OnClickListenerC87055KSb;
import p003X.View$OnClickListenerC87056KSc;

/* loaded from: classes5.dex */
public final class FilterLineEntryWidget extends LiveRecyclableWidget implements Observer<KVData>, AbstractC4165j, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public CheckBox LIZIZ;
    public CheckBox LIZJ;
    public Disposable LIZLLL;

    /* renamed from: LJ */
    public DialogC87063KSj f25825LJ;
    public C9162c LJFF;
    public View LJI;
    public TextView LJII;
    public Disposable LJIIIIZZ;

    static {
        Covode.recordClassIndex(15828);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698297;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.widget.AbstractC4165j
    public final void LIZIZ() {
        View view;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (view = this.contentView) != null) {
            LK1.LIZ(view);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        DialogC87063KSj dialogC87063KSj;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        Disposable disposable = this.LIZLLL;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJIIIIZZ;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        this.dataCenter.removeObserver(this);
        DialogC87063KSj dialogC87063KSj2 = this.f25825LJ;
        if (dialogC87063KSj2 != null && dialogC87063KSj2.isShowing() && (dialogC87063KSj = this.f25825LJ) != null) {
            C116971W2r.LIZ(dialogC87063KSj);
        }
    }

    @Override // com.bytedance.android.live.core.widget.AbstractC4165j
    public final void LIZ() {
        MethodCollector.m14708i(1250);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1250);
            return;
        }
        View view = this.contentView;
        if (view != null) {
            LK1.LIZJ(view);
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6950G;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ2 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (!LIZ2.booleanValue()) {
                    C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f6950G;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                    c87308Kak2.LIZ(Boolean.TRUE);
                    View inflate = LayoutInflater.from(getContext()).inflate(2131699143, (ViewGroup) null);
                    View findViewById = inflate.findViewById(2131178529);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "");
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = LK5.LIZ(20.0f);
                        this.LJFF = C9162c.LIZIZ(getContext()).LIZ(inflate).LIZ(5L).LIZLLL(true).LIZJ();
                        this.contentView.postDelayed(new KSX(this), 300L);
                        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BASE_POPUP_MANAGER_ENABLE;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        if (!settingKey.getValue().booleanValue()) {
                            ((KDS) Single.timer(5L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).m149as(autoDispose())).LIZ(new KSW(this), C86475K5t.LIZ);
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        MethodCollector.m14707o(1250);
                        throw nullPointerException;
                    }
                }
            }
            MethodCollector.m14707o(1250);
            return;
        }
        MethodCollector.m14707o(1250);
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        C3011e c3011e;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 6).isSupported) {
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, "data_anchor_filter_config_update") && (c3011e = C87064KSk.f8482LJ.LIZ().LIZIZ) != null) {
                LIZ(c3011e);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = (CheckBox) findViewById(2131187171);
        this.LIZJ = (CheckBox) findViewById(2131187172);
        this.LJI = findViewById(2131181631);
        this.LJII = (TextView) findViewById(2131194144);
    }

    private final void LIZ(C3011e c3011e) {
        boolean z;
        boolean z2;
        if (PatchProxy.proxy(new Object[]{c3011e}, this, LIZ, false, 7).isSupported) {
            return;
        }
        CheckBox checkBox = this.LIZIZ;
        if (checkBox != null) {
            C87068KSo c87068KSo = c3011e.LIZJ;
            if (c87068KSo != null) {
                z2 = c87068KSo.LIZLLL;
            } else {
                z2 = false;
            }
            checkBox.setChecked(z2);
        }
        CheckBox checkBox2 = this.LIZJ;
        if (checkBox2 != null) {
            C87068KSo c87068KSo2 = c3011e.LIZJ;
            if (c87068KSo2 != null) {
                z = c87068KSo2.f8485LJ;
            } else {
                z = false;
            }
            checkBox2.setChecked(z);
        }
        int LIZ2 = C87064KSk.f8482LJ.LIZ().LIZ();
        if (LIZ2 > 0) {
            TextView textView = this.LJII;
            if (textView != null) {
                textView.setText(LK5.LIZ(2131583223, Integer.valueOf(LIZ2)));
                return;
            }
            return;
        }
        TextView textView2 = this.LJII;
        if (textView2 != null) {
            textView2.setText(LK5.LIZ(2131583236));
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.dataCenter.observe("data_anchor_filter_config_update", this);
        CheckBox checkBox = this.LIZIZ;
        if (checkBox != null) {
            checkBox.setOnClickListener(new View$OnClickListenerC87056KSc(this));
        }
        CheckBox checkBox2 = this.LIZJ;
        if (checkBox2 != null) {
            checkBox2.setOnClickListener(new View$OnClickListenerC87055KSb(this));
        }
        View view = this.LJI;
        if (view != null) {
            view.setOnClickListener(new KSY(this));
        }
        Boolean value = C87064KSk.f8482LJ.LIZ().LIZJ.getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        Intrinsics.checkNotNullExpressionValue(value, "");
        boolean booleanValue = value.booleanValue();
        C3011e c3011e = C87064KSk.f8482LJ.LIZ().LIZIZ;
        if (booleanValue && c3011e != null) {
            LIZ(c3011e);
        } else {
            this.LJIIIIZZ = C87064KSk.f8482LJ.LIZ().LIZ(this.dataCenter);
        }
    }
}
