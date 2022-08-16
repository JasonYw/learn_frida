package com.bytedance.android.live.lynx.open;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.event.LynxDetailEvent;
import com.lynx.tasm.p1544ui.image.FrescoImageView;
import com.lynx.tasm.p1544ui.image.UIImage;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C109340T3e;

/* loaded from: classes10.dex */
public final class OpenImage extends UIImage<FrescoImageView> {
    public static final C109340T3e Companion = new C109340T3e((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32251);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenImage(LynxContext lynxContext) {
        super(lynxContext);
        C106862S5w.LIZ(lynxContext);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView */
    public final /* bridge */ /* synthetic */ View mo29230createView(Context context) {
        return mo29230createView(context);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final FrescoImageView mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (FrescoImageView) proxy.result;
        }
        FrescoImageView mo29230createView = super.mo29230createView(context);
        mo29230createView.setFadeDuration(300);
        return mo29230createView;
    }

    private final boolean isAWebImageUrl(Uri uri) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String str2 = null;
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, "http")) {
            if (uri != null) {
                str2 = uri.getScheme();
            }
            if (!Intrinsics.areEqual(str2, "https")) {
                return false;
            }
        }
        return true;
    }

    @LynxProp(name = "fade-duration")
    public final void setFadeDuration(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported && getView() != 0) {
            ((FrescoImageView) getView()).setFadeDuration(i);
        }
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.image.AbsUIImage
    public final void setSource(String str) {
        Object createFailure;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            createFailure = Uri.parse(str);
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = null;
        }
        if (isAWebImageUrl((Uri) createFailure)) {
            LynxDetailEvent lynxDetailEvent = new LynxDetailEvent(getSign(), "error");
            lynxDetailEvent.addDetail("errMsg", "WebImage is not allowed.");
            lynxDetailEvent.addDetail("errCode", 40001);
            LynxContext lynxContext = getLynxContext();
            Intrinsics.checkNotNullExpressionValue(lynxContext, "");
            lynxContext.getEventEmitter().sendCustomEvent(lynxDetailEvent);
            super.setSource(null);
            return;
        }
        super.setSource(str);
    }
}
