package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager;

import com.bytedance.android.live.broadcastgame.opengame.network.AnchorGameNetApi;
import com.bytedance.android.live.broadcastgame.opengame.network.C3535aa;
import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.android.live.broadcastgame.opengame.network.model.OpenPlatformRespExtra;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87463KdF;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class MiniAppAnchorPluginManager$checkLastPluginStatus$2 extends Lambda implements Function3<String, Long, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $copy;

    static {
        Covode.recordClassIndex(21743);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppAnchorPluginManager$checkLastPluginStatus$2(Ref.ObjectRef objectRef) {
        super(3);
        this.$copy = objectRef;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager.MiniAppAnchorPluginManager$checkLastPluginStatus$2$1 */
    /* loaded from: classes5.dex */
    public static final class C38571<T> implements Consumer<C5171b<C3535aa, OpenPlatformRespExtra>> {
        public static ChangeQuickRedirect LIZ;
        public static final C38571 LIZIZ = new C38571();

        static {
            Covode.recordClassIndex(21744);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(C5171b<C3535aa, OpenPlatformRespExtra> c5171b) {
            if (!PatchProxy.proxy(new Object[]{c5171b}, this, LIZ, false, 1).isSupported) {
                C87911KkT.LIZIZ.LIZ("开播后恢复app/stop请求成功", "OpenApiSupportPluginRuntime");
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.manager.MiniAppAnchorPluginManager$checkLastPluginStatus$2$2 */
    /* loaded from: classes5.dex */
    public static final class C38582<T> implements Consumer<Throwable> {
        public static ChangeQuickRedirect LIZ;
        public static final C38582 LIZIZ = new C38582();

        static {
            Covode.recordClassIndex(21745);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                C87911KkT c87911KkT = C87911KkT.LIZIZ;
                Intrinsics.checkNotNullExpressionValue(th2, "");
                c87911KkT.LIZ(th2, "OpenApiSupportPluginRuntime", "开播后恢复app/stop");
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(String str, Long l, String str2) {
        String str3;
        JSONObject LIZIZ;
        String str4 = str;
        long longValue = l.longValue();
        String str5 = str2;
        if (!PatchProxy.proxy(new Object[]{str4, new Long(longValue), str5}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str4, str5);
            AnchorGameNetApi anchorGameNetApi = (AnchorGameNetApi) C3599x.LIZJ.LIZ().LIZ(AnchorGameNetApi.class);
            C87463KdF c87463KdF = (C87463KdF) this.$copy.element;
            if (c87463KdF == null || (LIZIZ = c87463KdF.LIZIZ()) == null || (str3 = LIZIZ.toString()) == null) {
                str3 = "{}";
            }
            anchorGameNetApi.sendAppStop(str4, str5, longValue, str3).subscribe(C38571.LIZIZ, C38582.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
