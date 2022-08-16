package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6962eq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;
import p003X.C91461M1n;
import p003X.C91463M1p;
import p003X.C91464M1q;
import p003X.H8X;
import p003X.LK1;
import p003X.QB4;
import p003X.RunnableC91462M1o;
import p003X.View$OnClickListenerC91466M1s;

/* loaded from: classes5.dex */
public final class MarqueeNotificationView extends LinearLayoutCompat {
    public static ChangeQuickRedirect LIZ;
    public List<String> LIZIZ;
    public Function1<? super View, Unit> LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public int f26466LJ;
    public final int LJFF;
    public final CompositeDisposable LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final int LJIIIZ;
    public final AttributeSet LJIIJ;
    public HashMap LJIIJJI;

    static {
        Covode.recordClassIndex(30747);
    }

    public MarqueeNotificationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MarqueeNotificationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new HashMap();
        }
        View view = (View) this.LJIIJJI.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIJJI.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AttributeSet getAttributeSet() {
        return this.LJIIJ;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LK1.LIZ((View) this);
        this.LJI.clear();
        ((MarqueeTextSwitcher) LIZ(2131182694)).reset();
    }

    public final void setOnCloseClickListener(Function1<? super View, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        this.LIZJ = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void LIZIZ(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3).isSupported || list.isEmpty()) {
            return;
        }
        this.LIZIZ = list;
        this.LJI.clear();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MarqueeTextSwitcher marqueeTextSwitcher = (MarqueeTextSwitcher) LIZ(2131182694);
        Intrinsics.checkNotNullExpressionValue(marqueeTextSwitcher, "");
        View currentView = marqueeTextSwitcher.getCurrentView();
        boolean z = currentView instanceof C91461M1n;
        T t = currentView;
        if (!z) {
            t = 0;
        }
        objectRef.element = t;
        ((MarqueeTextSwitcher) LIZ(2131182694)).setText(this.LIZIZ.get(0));
        MarqueeTextSwitcher marqueeTextSwitcher2 = (MarqueeTextSwitcher) LIZ(2131182694);
        Intrinsics.checkNotNullExpressionValue(marqueeTextSwitcher2, "");
        View currentView2 = marqueeTextSwitcher2.getCurrentView();
        boolean z2 = currentView2 instanceof C91461M1n;
        T t2 = currentView2;
        if (!z2) {
            t2 = 0;
        }
        objectRef.element = t2;
        C91461M1n c91461M1n = (C91461M1n) objectRef.element;
        if (c91461M1n != null) {
            c91461M1n.postDelayed(new RunnableC91462M1o(objectRef), this.LJFF);
        }
        if (this.LIZIZ.size() == 1) {
            return;
        }
        QB4.LIZ(Observable.interval(this.LJIIIZ, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C91463M1p(this, objectRef), H8X.LIZIZ), this.LJI);
    }

    public final void LIZ(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        if (list.isEmpty()) {
            return;
        }
        LK1.LIZJ(this);
        LIZIZ(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeNotificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2068);
        this.LJIIJ = attributeSet;
        this.LIZIZ = CollectionsKt__CollectionsKt.emptyList();
        this.LJI = new CompositeDisposable();
        this.LIZLLL = LK1.LIZ(13.0f);
        this.f26466LJ = CastProtectorUtils.parseColor("#161823");
        this.LJII = 2130857542;
        this.LJIIIIZZ = 2130857540;
        SettingKey<C6962eq> settingKey = LiveConfigSettingKeys.LIVE_MULTI_REVENUE_MARQUEE_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LJFF = settingKey.getValue().LIZ;
        SettingKey<C6962eq> settingKey2 = LiveConfigSettingKeys.LIVE_MULTI_REVENUE_MARQUEE_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        this.LJIIIZ = settingKey2.getValue().LIZIZ;
        LayoutInflater.from(context).inflate(2131700037, this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.LJIIJ, new int[]{2130773723, 2130773724, 2130773725, 2130773726});
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "");
            this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(3, (int) this.LIZLLL);
            this.f26466LJ = obtainStyledAttributes.getColor(2, this.f26466LJ);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId > 0) {
                this.LJII = resourceId;
                ((ImageView) LIZ(2131182693)).setImageResource(this.LJII);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 > 0) {
                this.LJIIIIZZ = resourceId2;
                ((ImageView) LIZ(2131182692)).setImageResource(this.LJIIIIZZ);
            }
            obtainStyledAttributes.recycle();
            ((MarqueeTextSwitcher) LIZ(2131182694)).setFactory(new C91464M1q(this));
            ((MarqueeTextSwitcher) LIZ(2131182694)).setInAnimation(getContext(), 2130969163);
            ((MarqueeTextSwitcher) LIZ(2131182694)).setOutAnimation(getContext(), 2130969164);
            ((ImageView) LIZ(2131182692)).setOnClickListener(new View$OnClickListenerC91466M1s(this));
        }
        MethodCollector.m14707o(2068);
    }

    public /* synthetic */ MarqueeNotificationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
