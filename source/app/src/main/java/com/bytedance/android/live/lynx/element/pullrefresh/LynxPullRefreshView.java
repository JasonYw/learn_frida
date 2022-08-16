package com.bytedance.android.live.lynx.element.pullrefresh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1543ui.LynxBaseUI;
import com.lynx.tasm.behavior.p1543ui.LynxUI;
import com.lynx.tasm.behavior.p1543ui.UIGroup;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import p003X.AbstractC145002efc;
import p003X.C106862S5w;
import p003X.C144975efB;
import p003X.C144976efC;
import p003X.C144977efD;
import p003X.C144979efF;
import p003X.Q3Z;

/* loaded from: classes19.dex */
public class LynxPullRefreshView extends UIGroup<SmartRefreshLayout> {
    public static final C144979efF Companion = new C144979efF((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mEnableRefresh = true;
    public boolean mEnableLoadMore = true;

    static {
        Covode.recordClassIndex(32221);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxBaseUI, com.lynx.tasm.behavior.p1543ui.UIParent
    public boolean needCustomLayout() {
        return true;
    }

    public LynxPullRefreshView(LynxContext lynxContext) {
        super(lynxContext);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxBaseUI);
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @LynxUIMethod
    public void finishRefresh(ReadableMap readableMap) {
        if (PatchProxy.proxy(new Object[]{readableMap}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(readableMap);
        ALogger.m15797i("LynxPullRefreshView", "finishRefresh -> params = " + readableMap);
        ((SmartRefreshLayout) this.mView).LIZ();
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxBaseUI, com.lynx.tasm.behavior.p1543ui.UIParent
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (ViewGroup.LayoutParams) proxy.result;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public SmartRefreshLayout mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (SmartRefreshLayout) proxy.result;
        }
        if (context == null) {
            return null;
        }
        this.mEnableRefresh = true;
        this.mEnableLoadMore = false;
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(context);
        smartRefreshLayout.LIZJ(this.mEnableRefresh);
        smartRefreshLayout.LIZIZ(this.mEnableLoadMore);
        smartRefreshLayout.LIZ(new Q3Z(context));
        smartRefreshLayout.LIZIZ(60.5f);
        smartRefreshLayout.LJFF(true);
        smartRefreshLayout.LIZLLL(1.25f);
        smartRefreshLayout.LIZJ(0.9f);
        smartRefreshLayout.LIZ(new C144975efB(this, context));
        smartRefreshLayout.LIZ(new C144976efC(this, context));
        smartRefreshLayout.LIZ((AbstractC145002efc) new C144977efD(this, context));
        return smartRefreshLayout;
    }

    @Override // com.lynx.tasm.behavior.p1543ui.UIGroup, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (PatchProxy.proxy(new Object[]{lynxBaseUI, Integer.valueOf(i)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxBaseUI);
        ALogger.m15801d("LynxPullRefreshView", "insertChild " + lynxBaseUI + LoggerUtil.BLANK_TAG + i);
        onInsertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) this.mView;
            View view = ((LynxUI) lynxBaseUI).getView();
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, smartRefreshLayout, SmartRefreshLayout.LIZ, false, 43);
            if (proxy.isSupported) {
                Object obj = proxy.result;
            } else {
                smartRefreshLayout.LIZ(view, -1, -1);
            }
        }
    }
}
