package com.bytedance.android.annie.api.container;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.api.bridge.IShareInfoProvider;
import com.bytedance.android.annie.api.bridge.ShareInfo;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.Map;
import p003X.C106862S5w;
import p003X.PK0;

/* loaded from: classes7.dex */
public abstract class HybridFragment extends Fragment implements IShareInfoProvider, IHybridComponent, AbstractC13971f {
    public static ChangeQuickRedirect changeQuickRedirect;
    public IHybridComponent mAnnieCard;

    /* loaded from: classes7.dex */
    public interface IActionListener {
        static {
            Covode.recordClassIndex(10467);
        }

        void onBack();

        void onClose();

        void onShare(ShareInfo shareInfo);
    }

    /* loaded from: classes5.dex */
    public interface ILifeCycleListener {
        static {
            Covode.recordClassIndex(10468);
        }

        void onActivityResult(int i, int i2, Intent intent);
    }

    static {
        Covode.recordClassIndex(10466);
    }

    public abstract void back();

    public abstract void cancelLoading();

    public abstract boolean disableDragDown();

    @Override // com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneFullName() {
        return "com/bytedance/android/annie/api/container/HybridFragment";
    }

    @Override // com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneSimpleName() {
        return "HybridFragment";
    }

    public abstract void setCloseByGesture(boolean z);

    public abstract void setHybridTitle(String str);

    public final IHybridComponent getMAnnieCard() {
        return this.mAnnieCard;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public boolean canGoBack() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return IHybridComponent.DefaultImpls.canGoBack(this);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public String containerId() {
        String containerId;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        IHybridComponent iHybridComponent = this.mAnnieCard;
        if (iHybridComponent == null || (containerId = iHybridComponent.containerId()) == null) {
            return "";
        }
        return containerId;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public View getHybridView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        IHybridComponent iHybridComponent = this.mAnnieCard;
        if (iHybridComponent != null) {
            return iHybridComponent.getHybridView();
        }
        return null;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void goBack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
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
        IHybridComponent iHybridComponent = this.mAnnieCard;
        if (iHybridComponent == null || (hybridType = iHybridComponent.hybridType()) == null) {
            return IHybridComponent.HybridType.H5;
        }
        return hybridType;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void release() {
        IHybridComponent iHybridComponent;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported && (iHybridComponent = this.mAnnieCard) != null) {
            iHybridComponent.release();
        }
    }

    public final boolean canBack() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IHybridComponent iHybridComponent = this.mAnnieCard;
        if (iHybridComponent == null) {
            return false;
        }
        return iHybridComponent.canGoBack();
    }

    public final void setMAnnieCard(IHybridComponent iHybridComponent) {
        this.mAnnieCard = iHybridComponent;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void setOnScrollChangeListener(IHybridComponent.IOnScrollChangeListener iOnScrollChangeListener) {
        if (PatchProxy.proxy(new Object[]{iOnScrollChangeListener}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(iOnScrollChangeListener);
        IHybridComponent.DefaultImpls.setOnScrollChangeListener(this, iOnScrollChangeListener);
    }

    @Override // p003X.PTU
    public void setRadius(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        IHybridComponent.DefaultImpls.setRadius(this, f);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void updateData(Map<String, ? extends Object> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        IHybridComponent iHybridComponent = this.mAnnieCard;
        if (iHybridComponent != null) {
            iHybridComponent.updateData(map);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void load(String str, Map<String, ? extends Object> map) {
        IHybridComponent iHybridComponent;
        if (!PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 7).isSupported && (iHybridComponent = this.mAnnieCard) != null) {
            iHybridComponent.load(str, map);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public <P, R> void registerMethod(String str, PK0<P, R> pk0) {
        if (PatchProxy.proxy(new Object[]{str, pk0}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, pk0);
        IHybridComponent iHybridComponent = this.mAnnieCard;
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
        IHybridComponent iHybridComponent = this.mAnnieCard;
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
        IHybridComponent iHybridComponent = this.mAnnieCard;
        if (iHybridComponent != null) {
            iHybridComponent.registerMethod(str, abstractC13051b);
        }
    }

    @Override // p003X.PTU
    public void setRadius(float f, float f2, float f3, float f4) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        IHybridComponent.DefaultImpls.setRadius(this, f, f2, f3, f4);
    }
}
