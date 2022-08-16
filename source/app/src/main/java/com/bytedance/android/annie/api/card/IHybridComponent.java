package com.bytedance.android.annie.api.card;

import android.view.View;
import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import java.util.Map;
import p003X.C106862S5w;
import p003X.C98392Op8;
import p003X.PK0;
import p003X.PTU;

/* loaded from: classes7.dex */
public interface IHybridComponent extends PTU {

    /* loaded from: classes7.dex */
    public interface IOnScrollChangeListener {
        static {
            Covode.recordClassIndex(10461);
        }

        void onScrollChange(IHybridComponent iHybridComponent, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.bytedance.android.annie.api.card.IHybridComponent$a */
    /* loaded from: classes7.dex */
    public interface AbstractC2581a {
        static {
            Covode.recordClassIndex(10462);
        }

        void onJSBridgeCreated(IJSBridgeManager iJSBridgeManager);
    }

    static {
        Covode.recordClassIndex(10458);
    }

    boolean canGoBack();

    void close();

    String containerId();

    View getHybridView();

    void goBack();

    HybridType hybridType();

    void load(String str, Map<String, ? extends Object> map);

    <P, R> void registerMethod(String str, PK0<P, R> pk0);

    void registerMethod(String str, AbstractC13049f.AbstractC13051b abstractC13051b);

    void release();

    <T> void sendJsEvent(String str, T t);

    void setJSBridgeListener(AbstractC2581a abstractC2581a);

    void setOnScrollChangeListener(IOnScrollChangeListener iOnScrollChangeListener);

    void updateData(Map<String, ? extends Object> map);

    /* loaded from: classes12.dex */
    public enum HybridType {
        H5("H5"),
        LYNX(C98392Op8.LYNX_TAG);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String hybridName;

        public static HybridType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (HybridType) (proxy.isSupported ? proxy.result : Enum.valueOf(HybridType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HybridType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (HybridType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(10460);
        }

        HybridType(String str) {
            this.hybridName = str;
        }
    }

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(10459);
        }

        public static boolean canGoBack(IHybridComponent iHybridComponent) {
            return false;
        }

        public static void goBack(IHybridComponent iHybridComponent) {
        }

        public static void setOnScrollChangeListener(IHybridComponent iHybridComponent, IOnScrollChangeListener iOnScrollChangeListener) {
            if (PatchProxy.proxy(new Object[]{iHybridComponent, iOnScrollChangeListener}, null, changeQuickRedirect, true, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(iOnScrollChangeListener);
        }

        public static void setRadius(IHybridComponent iHybridComponent, float f) {
            boolean z = PatchProxy.proxy(new Object[]{iHybridComponent, Float.valueOf(f)}, null, changeQuickRedirect, true, 3).isSupported;
        }

        public static void setRadius(IHybridComponent iHybridComponent, float f, float f2, float f3, float f4) {
            boolean z = PatchProxy.proxy(new Object[]{iHybridComponent, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, changeQuickRedirect, true, 4).isSupported;
        }

        public static /* synthetic */ void load$default(IHybridComponent iHybridComponent, String str, Map map, int i, Object obj) {
            if (PatchProxy.proxy(new Object[]{iHybridComponent, str, map, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1).isSupported) {
                return;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    map = null;
                }
                iHybridComponent.load(str, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
    }
}
