package com.bytedance.android.live.broadcast.category.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.android.live.broadcast.api.model.CategoryScene;
import com.bytedance.android.live.broadcast.category.C2959a;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C77347GeT;
import p003X.C86904KMg;
import p003X.C86908KMk;
import p003X.C86919KMv;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.KM9;
import p003X.LK5;
import p003X.View$OnClickListenerC86902KMe;

/* loaded from: classes5.dex */
public abstract class PreviewCategoryWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public C86919KMv LIZJ;
    public final CategoryScene LIZLLL;

    /* renamed from: LJ */
    public final Lazy f25799LJ = C77347GeT.LIZ(new PreviewCategoryWidget$mCategoryViewModel$2(this));
    public final Lazy LJFF = LIZ(C3199v.class);
    public final Lazy LJI = LIZ(C3181o.class);
    public final Lazy LJIIL = C77347GeT.LIZ(new PreviewCategoryWidget$mGameCategoryDataHandler$2(this));

    static {
        Covode.recordClassIndex(15171);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewCategoryWidget.class, "mStartLiveViewModel", "getMStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewCategoryWidget.class, "startLiveEventViewModel", "getStartLiveEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    public void LIZ(HashMap<CategoryScene, List<CategoryNode>> hashMap) {
    }

    public final C2970a LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2970a) (proxy.isSupported ? proxy.result : this.f25799LJ.mo27335getValue());
    }

    public final C3199v LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJFF, this, LIZIZ[0]));
    }

    public final C3181o LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C3181o) (proxy.isSupported ? proxy.result : LIZ(this.LJI, this, LIZIZ[1]));
    }

    /* renamed from: LJ */
    public final C2959a m15907LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2959a) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    public abstract void LJFF();

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698442;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC86902KMe(this));
        }
        LIZIZ().m15906LJ().observe(this, new C86904KMg(this));
        LIZIZ().LIZJ().observe(this, new C86908KMk(this));
        LJFF();
    }

    public void LIZ(CategoryScene categoryScene) {
        if (PatchProxy.proxy(new Object[]{categoryScene}, this, LIZ, false, 6).isSupported) {
            return;
        }
        m15907LJ().LIZ(categoryScene);
    }

    public PreviewCategoryWidget(CategoryScene categoryScene) {
        C106862S5w.LIZ(categoryScene);
        this.LIZLLL = categoryScene;
    }

    public void LIZ(CategoryNode categoryNode) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{categoryNode}, this, LIZ, false, 11).isSupported || categoryNode == null) {
            return;
        }
        View view = this.contentView;
        if (view != null && (textView = (TextView) view.findViewById(2131169122)) != null) {
            textView.setText(categoryNode.title);
        }
        if (categoryNode.isOtherCategory && C2959a.LIZLLL.LIZ()) {
            return;
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_SELECT_TAG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue() && Intrinsics.areEqual(LIZIZ().LJIILJJIL().getValue(), Boolean.FALSE)) {
            return;
        }
        C86919KMv c86919KMv = this.LIZJ;
        if (c86919KMv != null) {
            c86919KMv.dismiss();
        }
        this.LIZJ = null;
    }

    public final void LIZ(Integer num) {
        CategoryNode LIZ2;
        TextView textView;
        if (PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (num != null && num.intValue() == 2 && !PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (LIZ2 = LIZJ().LJIILL().LIZ()) != null) {
            LIZJ().LJJ().LIZ(null);
            View view = this.contentView;
            if (view != null && (textView = (TextView) view.findViewById(2131169122)) != null) {
                textView.setText(LK5.LIZ(2131587620));
            }
            List<CategoryNode> value = LIZIZ().LJII().getValue();
            ArrayList arrayList = new ArrayList();
            if (value != null) {
                for (CategoryNode categoryNode : value) {
                    if (!Intrinsics.areEqual(categoryNode.categoryId, LIZ2.categoryId)) {
                        arrayList.add(categoryNode);
                    }
                }
            }
            C87308Kak<String> c87308Kak = AbstractC80293Hkt.LJJI;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(GsonProtectorUtils.toJson(KM9.LIZ(), arrayList));
            LIZIZ().LJII().postValue(arrayList);
        }
        if (!NetworkUtils.isNetworkAvailable(this.context)) {
            C88440Kt0.LIZ(2131582268);
        } else if (this.context instanceof FragmentActivity) {
            C86919KMv c86919KMv = this.LIZJ;
            if (c86919KMv != null) {
                c86919KMv.dismiss();
                this.LIZJ = null;
            }
            this.LIZJ = new C86919KMv();
            C86919KMv c86919KMv2 = this.LIZJ;
            if (c86919KMv2 != null) {
                Context context = this.context;
                if (context != null) {
                    c86919KMv2.show(((FragmentActivity) context).getSupportFragmentManager(), "GameCategoryDialog");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    public void LIZ(String str) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 12).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            View view = this.contentView;
            if (view != null && (textView = (TextView) view.findViewById(2131169122)) != null) {
                textView.setText(str);
            }
            C2WC<String> LJJIIZI = LIZJ().LJJIIZI();
            Intrinsics.checkNotNull(str);
            LJJIIZI.LIZ(str);
        }
        C86919KMv c86919KMv = this.LIZJ;
        if (c86919KMv != null) {
            c86919KMv.dismiss();
        }
        this.LIZJ = null;
    }

    public CategoryNode LIZ(long j, List<? extends CategoryNode> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), list}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (CategoryNode) proxy.result;
        }
        return m15907LJ().LIZ(j, list);
    }
}
