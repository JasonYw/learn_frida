package com.bytedance.android.live.browser;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.api.card.HybridCard;
import com.bytedance.android.annie.api.container.HybridDialog;
import com.bytedance.android.annie.api.container.HybridFragment;
import com.bytedance.android.annie.api.monitor.CommonLifecycle;
import com.bytedance.android.annie.card.base.AbstractC2599d;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.browser.jsbridge.AbstractC3885b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.lynx.p396a.AbstractC5152b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.web.jsbridge2.AbstractC13046b;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import p003X.AbstractC100890PoK;
import p003X.AbstractC100934Pp2;
import p003X.AbstractC101016PqM;
import p003X.AbstractC101303Puz;
import p003X.AbstractC4316636a;
import p003X.C3JU;
import p003X.C3M9;
import p003X.LK8;
import p003X.LX5;
import p003X.P32;

/* loaded from: classes5.dex */
public interface IBrowserService extends IService {
    public static final LK8 Companion = LK8.LIZ;

    /* renamed from: com.bytedance.android.live.browser.IBrowserService$d */
    /* loaded from: classes12.dex */
    public interface AbstractC3873d {
        static {
            Covode.recordClassIndex(21904);
        }

        void LIZ(WebView webView, String str);
    }

    static {
        Covode.recordClassIndex(21900);
    }

    void addHybridDebugTool(Context context, ViewGroup viewGroup, String str, boolean z);

    void addXBridgeList(ArrayList<Class<? extends Object>> arrayList);

    String appendCommonParams(String str);

    AbstractC100890PoK buildFullScreenWebPage(Context context, String str);

    @Deprecated(message = "请使用新容器接口")
    AbstractC100934Pp2 buildHostWebDialog(String str);

    @Deprecated(message = "请使用新容器接口")
    AbstractC100934Pp2 buildLynxDialog(String str, String str2, JSONObject jSONObject);

    @Deprecated(message = "请使用新容器接口")
    AbstractC100934Pp2 buildWebDialog(String str);

    @Deprecated(message = "请使用新容器接口")
    P32 createBrowserFragment(Bundle bundle);

    AbstractC3940c createJsBridgeManager(Activity activity, AbstractC13046b abstractC13046b);

    @Deprecated(message = "请使用新容器接口")
    LX5 createLynxComponent(Activity activity, int i, String str, LynxThreadStrategy lynxThreadStrategy, String str2, C4053p c4053p, AbstractC2599d abstractC2599d, boolean z);

    @Deprecated(message = "请使用新容器接口")
    LX5 createLynxComponent(Activity activity, int i, String str, boolean z, LynxThreadStrategy lynxThreadStrategy, C4053p c4053p, AbstractC2599d abstractC2599d);

    @Deprecated(message = "请使用新容器接口")
    Fragment createLynxFragment(Context context, Bundle bundle);

    @Deprecated(message = "请使用新容器接口")
    Fragment createLynxFragment(Context context, Bundle bundle, C4053p c4053p);

    AbstractC5152b createOpenLynxComponent(Context context, int i, LynxThreadStrategy lynxThreadStrategy, C4053p c4053p, String str);

    @Deprecated(message = "请使用新容器接口")
    C3JU createWebViewRecord(Activity activity, AbstractC3873d abstractC3873d, C3M9 c3m9);

    @Deprecated(message = "请使用新容器接口")
    C3JU createWebViewRecord(Activity activity, String str, AbstractC3873d abstractC3873d, C3M9 c3m9);

    void dismissAllWebDialogs(Activity activity);

    boolean enableDynamicWebOffline(Context context);

    @Deprecated(message = "新增代码勿用此方法")
    String filterRequestUrl(String str);

    @Deprecated(message = "请使用新容器接口")
    AbstractC100934Pp2 generateWebDialogBuilder(String str);

    Map<String, Object> getCacheByScheme(String str);

    JSONObject getCacheJsonByScheme(String str);

    HybridCard getHybridCard(Context context, Uri uri, int i, CommonLifecycle commonLifecycle);

    HybridCard getHybridCard(Context context, Uri uri, CommonLifecycle commonLifecycle);

    HybridCard getHybridCard(Context context, Uri uri, CommonLifecycle commonLifecycle, Bundle bundle);

    HybridFragment getHybridFragment(Context context, Uri uri, CommonLifecycle commonLifecycle);

    HybridFragment getHybridFragment(Context context, Uri uri, CommonLifecycle commonLifecycle, Bundle bundle);

    AbstractC3973g.AbstractC3975c getStateByKey(String str);

    void idleInit();

    void initPrefetch();

    void initRedirectProcessor();

    void prefetch(String str);

    <T extends LiveRecyclableWidget> Class<T> provideBridgeSupportWidgetClass();

    <T extends LiveRecyclableWidget> Class<T> provideTestWidgetClass();

    Observable<String> redirectSchemeByKey(String str, String str2, String str3, String str4, String str5);

    Observable<Unit> registerExternalMethodFactory(AbstractC3885b abstractC3885b);

    Observable<C3952am> registerJsEventSubscriber(String str);

    <T> void registerOrNotifyState(AbstractC4316636a<T> abstractC4316636a, T t);

    <T> void registerStaticState(Function1<? super DataCenter, ? extends AbstractC101016PqM<? extends T>> function1);

    void reportLynxFetchJsbError(View view, String str, String str2, int i, String str3);

    <T> void sendEventToAllJsBridges(String str, T t);

    HybridDialog showHybridDialog(Context context, Uri uri, CommonLifecycle commonLifecycle);

    HybridDialog showHybridDialog(Context context, Uri uri, CommonLifecycle commonLifecycle, Bundle bundle, DialogInterface.OnDismissListener onDismissListener);

    HybridDialog showHybridDialogWithListener(Context context, Uri uri, CommonLifecycle commonLifecycle, DialogInterface.OnDismissListener onDismissListener);

    void tryInitEnvIfNeeded(Context context);

    AbstractC101303Puz webViewMonitorHelper();
}
