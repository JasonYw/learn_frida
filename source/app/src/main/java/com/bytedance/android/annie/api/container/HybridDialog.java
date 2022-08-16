package com.bytedance.android.annie.api.container;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.PK0;

/* loaded from: classes7.dex */
public abstract class HybridDialog extends DialogFragment implements IHybridComponent {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes8.dex */
    public interface IDialogActionListener {
        static {
            Covode.recordClassIndex(10465);
        }

        void onDismiss();

        void onShow();
    }

    static {
        Covode.recordClassIndex(10464);
    }

    public abstract IHybridComponent getHybridComponent();

    public abstract void registerActionListener(IDialogActionListener iDialogActionListener);

    public abstract void setEnableToFull(boolean z);

    public abstract void setEnableToHalf(boolean z);

    public abstract void setOnDestroyCallback(Function0<Unit> function0);

    public abstract void setShowTopClose(boolean z);

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public boolean canGoBack() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return IHybridComponent.DefaultImpls.canGoBack(this);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void close() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        dismiss();
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent != null) {
            hybridComponent.close();
        }
        release();
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void goBack() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        IHybridComponent.DefaultImpls.goBack(this);
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void release() {
        IHybridComponent hybridComponent;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported && (hybridComponent = getHybridComponent()) != null) {
            hybridComponent.release();
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public String containerId() {
        String containerId;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent == null || (containerId = hybridComponent.containerId()) == null) {
            return "";
        }
        return containerId;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public View getHybridView() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent != null) {
            return hybridComponent.getHybridView();
        }
        return null;
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public IHybridComponent.HybridType hybridType() {
        IHybridComponent.HybridType hybridType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (IHybridComponent.HybridType) proxy.result;
        }
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent == null || (hybridType = hybridComponent.hybridType()) == null) {
            return IHybridComponent.HybridType.H5;
        }
        return hybridType;
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
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent != null) {
            hybridComponent.updateData(map);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void load(String str, Map<String, ? extends Object> map) {
        IHybridComponent hybridComponent;
        if (!PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 8).isSupported && (hybridComponent = getHybridComponent()) != null) {
            hybridComponent.load(str, map);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public <P, R> void registerMethod(String str, PK0<P, R> pk0) {
        if (PatchProxy.proxy(new Object[]{str, pk0}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, pk0);
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent != null) {
            hybridComponent.registerMethod(str, pk0);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public <T> void sendJsEvent(String str, T t) {
        if (PatchProxy.proxy(new Object[]{str, t}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, t);
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent != null) {
            hybridComponent.sendJsEvent(str, t);
        }
    }

    @Override // com.bytedance.android.annie.api.card.IHybridComponent
    public void registerMethod(String str, AbstractC13049f.AbstractC13051b abstractC13051b) {
        if (PatchProxy.proxy(new Object[]{str, abstractC13051b}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC13051b);
        IHybridComponent hybridComponent = getHybridComponent();
        if (hybridComponent != null) {
            hybridComponent.registerMethod(str, abstractC13051b);
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
