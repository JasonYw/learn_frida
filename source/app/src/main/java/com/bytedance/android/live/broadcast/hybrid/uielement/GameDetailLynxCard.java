package com.bytedance.android.live.broadcast.hybrid.uielement;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.annie.api.card.HybridCard;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC89393LJz;
import p003X.C106862S5w;
import p003X.C109465T7z;
import p003X.C436843Py;
import p003X.C88951L2z;
import p003X.C89390LJw;
import p003X.C89391LJx;
import p003X.L6L;
import p003X.ViewTreeObserver$OnScrollChangedListenerC89392LJy;

/* loaded from: classes5.dex */
public final class GameDetailLynxCard extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public HybridCard LIZIZ;
    public long LIZJ;
    public final ConcurrentHashMap<String, Integer> LIZLLL;

    /* renamed from: LJ */
    public AbstractC89393LJz f25903LJ;
    public Map<String, ? extends Object> LJFF;
    public final C88951L2z LJI;
    public ViewTreeObserver$OnScrollChangedListenerC89392LJy LJII;
    public final /* synthetic */ C109465T7z LJIIIIZZ;

    static {
        Covode.recordClassIndex(16783);
    }

    public GameDetailLynxCard(Context context) {
        this(context, null, 0, 6, null);
    }

    public GameDetailLynxCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void LIZJ() {
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            this.LJIIIIZZ.LIZ();
        }
        this.LIZJ = 0L;
        HybridCard hybridCard = this.LIZIZ;
        if (hybridCard != null && (viewTreeObserver = hybridCard.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnScrollChangedListener(this.LJII);
        }
    }

    private final Context getLynxContext() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        Context context = getContext();
        if (!(context instanceof Activity) && (context instanceof ContextThemeWrapper)) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        LIZJ();
        HybridCard hybridCard = this.LIZIZ;
        if (hybridCard != null) {
            hybridCard.release();
            removeView(this.LIZIZ);
        }
        this.LIZIZ = null;
        this.LJFF = null;
        this.LIZLLL.clear();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        LIZIZ();
    }

    private final void LIZ(HybridCard hybridCard) {
        if (!PatchProxy.proxy(new Object[]{hybridCard}, this, LIZ, false, 9).isSupported && hybridCard != null) {
            hybridCard.registerMethod("gamecpLoadingDialog", new C89390LJw(this));
        }
    }

    public final void setCardLifeCycle(AbstractC89393LJz abstractC89393LJz) {
        if (PatchProxy.proxy(new Object[]{abstractC89393LJz}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC89393LJz);
        this.f25903LJ = abstractC89393LJz;
    }

    private final boolean LIZ(String str) {
        Integer num;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Integer num2 = this.LIZLLL.get(str);
        if ((num2 == null || num2.intValue() != 1000) && ((num = this.LIZLLL.get(str)) == null || num.intValue() != 2000)) {
            return true;
        }
        return false;
    }

    public final void LIZ(Map<String, ? extends Object> map) {
        HybridCard hybridCard;
        if (!PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 5).isSupported && (hybridCard = this.LIZIZ) != null) {
            hybridCard.sendJsEvent("gamecpCardUpdateData", C436843Py.LIZ(map));
        }
    }

    private final void LIZIZ(String str, Map<String, ? extends Object> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (map.isEmpty()) {
            L6L.LIZIZ.LIZJ("GameDetailLynxCard", "renderData is empty");
            return;
        }
        Integer num = this.LIZLLL.get(str);
        if (num == null) {
            return;
        }
        if (num.intValue() == 1000) {
            this.LJFF = map;
        } else if (num.intValue() == 2000) {
            LIZ(map);
        }
    }

    public final void LIZ(String str, Map<String, ? extends Object> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, map);
        if (TextUtils.isEmpty(str)) {
            L6L.LIZIZ.LIZLLL("GameDetailLynxCard", C0002O.m25085C("schema: ", str, "  is empty"));
            return;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter(PushConstants.WEB_URL);
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        Uri parse2 = Uri.parse(queryParameter);
        new StringBuilder();
        String m25085C = C0002O.m25085C(parse.buildUpon().clearQuery().toString(), Constants.ACCEPT_TIME_SEPARATOR_SERVER, parse2.buildUpon().clearQuery().toString());
        if (LIZ(m25085C)) {
            LIZIZ();
            Context context = getContext();
            if (!(context instanceof Activity) && (context instanceof ContextThemeWrapper)) {
                context = ((ContextThemeWrapper) context).getBaseContext();
            }
            this.LIZLLL.put(m25085C, 1000);
            Intrinsics.checkNotNullExpressionValue(context, "");
            Uri parse3 = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse3, "");
            this.LIZIZ = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).getHybridCard(context, parse3, new C89391LJx(this, str, m25085C));
            LIZ(this.LIZIZ);
            addView(this.LIZIZ);
            HybridCard hybridCard = this.LIZIZ;
            if (hybridCard != null) {
                hybridCard.load(null, map);
                return;
            }
            return;
        }
        LIZIZ(m25085C, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailLynxCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1289);
        this.LJIIIIZZ = new C109465T7z(200L);
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJI = new C88951L2z();
        this.LJII = new ViewTreeObserver$OnScrollChangedListenerC89392LJy(this);
        MethodCollector.m14707o(1289);
    }

    public /* synthetic */ GameDetailLynxCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
