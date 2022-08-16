package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C413602Yo;
import p003X.C439913aj;
import p003X.C86897KLz;
import p003X.KM0;
import p003X.KM1;
import p003X.KM2;
import p003X.KN9;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public class PreviewSelectTitleWidget extends AbsRecyclablePreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJI;
    public static final /* synthetic */ KProperty[] LJII;
    public int LJIIIIZZ;
    public final Lazy LJFF = LIZ(C439913aj.class);
    public final Lazy LJIIJ = LIZ(C3199v.class);
    public final Lazy LJIIJJI = LIZ(C3181o.class);
    public int LJIIL = LK5.LIZLLL(2131429408);
    public String LJIIIZ = "";

    static {
        Covode.recordClassIndex(18653);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewSelectTitleWidget.class, "previewSelectTitleContext", "getPreviewSelectTitleContext()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewSelectTitleContext;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewSelectTitleWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(PreviewSelectTitleWidget.class, "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl3);
        LJII = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewSelectTitleWidget";
    }

    public final C439913aj LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 1);
        return (C439913aj) (proxy.isSupported ? proxy.result : LIZ(this.LJFF, this, LJII[0]));
    }

    /* renamed from: LJ */
    public final C3199v m15863LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIJ, this, LJII[1]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698483;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a243";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJI, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    public final String LJFF() {
        LiveMode liveMode;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C2WC<LiveMode> c2wc = m15863LJ().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.MEDIA) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            String string = context.getResources().getString(2131583221);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "");
        String string2 = context2.getResources().getString(2131583220);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final void LIZ(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, LJI, false, 10).isSupported && view != null) {
            view.setOnTouchListener(new KN9(this, view));
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJI, false, 9).isSupported) {
            return;
        }
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(i)};
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        LiveEditText liveEditText = (LiveEditText) view.findViewById(2131193092);
        Intrinsics.checkNotNullExpressionValue(liveEditText, "");
        liveEditText.setFilters(inputFilterArr);
    }

    public final void LIZIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LJI, false, 8).isSupported) {
            return;
        }
        if (m15863LJ().LJJJJL().LIZ().intValue() != 0 && liveMode == LiveMode.VIDEO) {
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                LK1.LIZIZ(viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null) {
            LK1.LIZJ(viewGroup2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LJI, false, 7).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        LIZIZ(liveMode);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        LiveMode liveMode;
        Object LIZ;
        LiveMode liveMode2;
        C3VF user;
        Disposable subscribe;
        Disposable LIZ2;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJI, false, 4).isSupported) {
            return;
        }
        super.onInit(objArr);
        int i = this.LJIIIIZZ;
        if (i != 0) {
            LIZ(i);
        } else {
            LIZ(this.LJIIL);
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        LiveEditText liveEditText = (LiveEditText) view.findViewById(2131193092);
        Intrinsics.checkNotNullExpressionValue(liveEditText, "");
        liveEditText.setHint(LJFF());
        C3180k LIZIZ = LIZIZ();
        IUser iUser = null;
        if (LIZIZ != null && (LIZ2 = LIZIZ.LIZ(new PreviewSelectTitleWidget$onInit$$inlined$let$lambda$1(this))) != null) {
            LIZ(LIZ2);
        }
        C439913aj LIZLLL = LIZLLL();
        if (LIZLLL != null && (subscribe = LIZLLL.LIZ().LIZIZ().subscribe(new KM2(this))) != null) {
            LIZ(subscribe);
        }
        C2WC<LiveMode> c2wc = m15863LJ().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.MEDIA) {
            LIZLLL().LIZ().LIZ(30);
        }
        C413602Yo.LIZ(m15863LJ().LJJJJL(), new PreviewSelectTitleWidget$onInit$3(this));
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJI, false, 3);
        if (proxy.isSupported) {
            LIZ = proxy.result;
        } else {
            LIZ = LIZ(this.LJIIJJI, this, LJII[2]);
        }
        ((C3181o) LIZ).m15892LJ().observe(this, new KM0(this));
        if (!PatchProxy.proxy(new Object[0], this, LJI, false, 5).isSupported) {
            C2WC<LiveMode> c2wc2 = m15863LJ().LIZJ;
            if (c2wc2 != null) {
                liveMode2 = c2wc2.LIZ();
            } else {
                liveMode2 = null;
            }
            if (liveMode2 != LiveMode.MEDIA) {
                IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                if (iUserService != null && (user = iUserService.user()) != null) {
                    iUser = user.LIZ();
                }
                if (iUser instanceof User) {
                    String nickName = ((User) iUser).getNickName();
                    if (this.LJIIIZ.length() == 0 && !TextUtils.isEmpty(nickName)) {
                        if (nickName.length() >= 8) {
                            new StringBuilder();
                            String substring = nickName.substring(0, 8);
                            Intrinsics.checkNotNullExpressionValue(substring, "");
                            Context context = this.context;
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            nickName = C0002O.m25086C(substring, context.getResources().getString(2131582615));
                        }
                        Context context2 = this.context;
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        String string = context2.getResources().getString(2131587157, nickName);
                        View view2 = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view2, "");
                        LiveEditText liveEditText2 = (LiveEditText) view2.findViewById(2131193092);
                        Intrinsics.checkNotNullExpressionValue(liveEditText2, "");
                        liveEditText2.setHint("");
                        View view3 = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view3, "");
                        ((LiveEditText) view3.findViewById(2131193092)).setText(string);
                        View view4 = this.contentView;
                        Intrinsics.checkNotNullExpressionValue(view4, "");
                        AppCompatEditText appCompatEditText = (AppCompatEditText) view4.findViewById(2131193092);
                        Intrinsics.checkNotNullExpressionValue(appCompatEditText, "");
                        Editable mo25203getText = appCompatEditText.mo25203getText();
                        if (mo25203getText != null) {
                            View view5 = this.contentView;
                            Intrinsics.checkNotNullExpressionValue(view5, "");
                            ((LiveEditText) view5.findViewById(2131193092)).setSelection(mo25203getText.length());
                        }
                        C2WC<String> LJII2 = m15863LJ().LJII();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        LJII2.LIZ(string);
                        this.LJIIIZ = string;
                        LIZLLL().LIZIZ().LIZ(0);
                    }
                }
            }
        }
        View view6 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        ((LiveEditText) view6.findViewById(2131193092)).setOnFocusChangeListener(new KM1(this));
        View view7 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        ((LiveEditText) view7.findViewById(2131193092)).addTextChangedListener(new C86897KLz(this));
    }
}
