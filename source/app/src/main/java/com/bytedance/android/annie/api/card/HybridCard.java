package com.bytedance.android.annie.api.card;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C4V3;
import p003X.PK0;

/* loaded from: classes7.dex */
public abstract class HybridCard extends C4V3 implements IHybridComponent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public IHybridComponent mCurrentHybridComponent;

    static {
        Covode.recordClassIndex(10457);
    }

    public HybridCard(Context context) {
        this(context, null, 0, 6, null);
    }

    public HybridCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void loadSchema(Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(uri);
    }

    public abstract void onPause();

    public abstract void onResume();

    public void updateScreenMetrics(int i, int i2) {
    }

    public final IHybridComponent getMCurrentHybridComponent() {
        return this.mCurrentHybridComponent;
    }

    public boolean canGoBack() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return IHybridComponent.DefaultImpls.canGoBack(this);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void close() {
        IHybridComponent iHybridComponent;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported && (iHybridComponent = this.mCurrentHybridComponent) != null) {
            iHybridComponent.close();
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public String containerId() {
        String containerId;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent == null || (containerId = iHybridComponent.containerId()) == null) {
            return "";
        }
        return containerId;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public View getHybridView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            return iHybridComponent.getHybridView();
        }
        return null;
    }

    public void goBack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        IHybridComponent.DefaultImpls.goBack(this);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public IHybridComponent.HybridType hybridType() {
        IHybridComponent.HybridType hybridType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (IHybridComponent.HybridType) proxy.result;
        }
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent == null || (hybridType = iHybridComponent.hybridType()) == null) {
            return IHybridComponent.HybridType.H5;
        }
        return hybridType;
    }

    public void release() {
        IHybridComponent iHybridComponent;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported && (iHybridComponent = this.mCurrentHybridComponent) != null) {
            iHybridComponent.release();
        }
    }

    public final void setMCurrentHybridComponent(IHybridComponent iHybridComponent) {
        this.mCurrentHybridComponent = iHybridComponent;
    }

    public void setJSBridgeListener(IHybridComponent.AbstractC2581a abstractC2581a) {
        if (PatchProxy.proxy(new Object[]{abstractC2581a}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC2581a);
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.setJSBridgeListener(abstractC2581a);
        }
    }

    public void setOnScrollChangeListener(IHybridComponent.IOnScrollChangeListener iOnScrollChangeListener) {
        if (PatchProxy.proxy(new Object[]{iOnScrollChangeListener}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(iOnScrollChangeListener);
        IHybridComponent.DefaultImpls.setOnScrollChangeListener(this, iOnScrollChangeListener);
    }

    public void updateData(Map<String, ? extends Object> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.updateData(map);
        }
    }

    @Override // p003X.C4V3, p003X.PTU
    public void setRadius(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        if (hybridType() == IHybridComponent.HybridType.LYNX) {
            super.setRadius(f);
            return;
        }
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.setRadius(f);
        }
    }

    public void load(String str, Map<String, ? extends Object> map) {
        IHybridComponent iHybridComponent;
        if (!PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 9).isSupported && (iHybridComponent = this.mCurrentHybridComponent) != null) {
            iHybridComponent.load(str, map);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public <P, R> void registerMethod(String str, PK0<P, R> pk0) {
        if (PatchProxy.proxy(new Object[]{str, pk0}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, pk0);
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.registerMethod(str, pk0);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public <T> void sendJsEvent(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, t);
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.sendJsEvent(str, t);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void registerMethod(String str, AbstractC13049f.AbstractC13051b abstractC13051b) {
        if (PatchProxy.proxy(new Object[]{str, abstractC13051b}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC13051b);
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.registerMethod(str, abstractC13051b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HybridCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    @Override // p003X.C4V3, p003X.PTU
    public void setRadius(float f, float f2, float f3, float f4) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        if (hybridType() == IHybridComponent.HybridType.LYNX) {
            super.setRadius(f, f2, f3, f4);
            return;
        }
        IHybridComponent iHybridComponent = this.mCurrentHybridComponent;
        if (iHybridComponent != null) {
            iHybridComponent.setRadius(f, f2, f3, f4);
        }
    }

    public /* synthetic */ HybridCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
