package com.bytedance.android.live.browser;

import android.app.Activity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.annie.api.bridge.BaseJSBridgeMethodFactory;
import com.bytedance.android.annie.api.bridge.FragmentStateFulProvider;
import com.bytedance.android.annie.api.bridge.IJSBridgeManager;
import com.bytedance.android.annie.api.bridge.RegisterPolicy;
import com.bytedance.android.live.browser.jsbridge.AbstractC3885b;
import com.bytedance.android.live.browser.jsbridge.AbstractC3940c;
import com.bytedance.android.live.browser.jsbridge.AbstractC3973g;
import com.bytedance.android.live.browser.jsbridge.event.C3952am;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.p311c.AbstractC4059b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC13046b;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13040ah;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import p003X.PK0;

/* renamed from: com.bytedance.android.live.browser.k */
/* loaded from: classes8.dex */
public interface AbstractC4051k {
    static {
        Covode.recordClassIndex(23059);
    }

    PK0<?, ?> LIZ(DialogFragment dialogFragment);

    AbstractC3940c LIZ(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, int i);

    AbstractC3940c LIZ(Activity activity, AbstractC13046b abstractC13046b, int i);

    AbstractC3940c LIZ(AbstractC4059b abstractC4059b, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient, int i);

    AbstractC3940c LIZ(AbstractC4059b abstractC4059b, AbstractC13046b abstractC13046b, int i);

    AbstractC3973g.AbstractC3976d LIZ(String str, IJSBridgeManager iJSBridgeManager);

    AbstractC13049f<?, ?> LIZ(View view);

    Observable<Unit> LIZ(BaseJSBridgeMethodFactory baseJSBridgeMethodFactory);

    Observable<Unit> LIZ(AbstractC3885b abstractC3885b);

    Observable<C3952am> LIZ(String str);

    List<String> LIZ();

    Map<String, FragmentStateFulProvider<? extends AbstractC13049f<?, ?>>> LIZ(Fragment fragment);

    Map<String, PK0<?, ?>> LIZ(C13040ah c13040ah, RegisterPolicy registerPolicy);

    void LIZ(IJSBridgeManager iJSBridgeManager);

    <T> void LIZ(String str, T t);

    PK0<?, ?> LIZIZ(DialogFragment dialogFragment);

    <T extends LiveRecyclableWidget> Class<T> LIZIZ();

    Map<String, AbstractC13049f.AbstractC13051b> LIZIZ(C13040ah c13040ah, RegisterPolicy registerPolicy);

    void LIZJ();
}
