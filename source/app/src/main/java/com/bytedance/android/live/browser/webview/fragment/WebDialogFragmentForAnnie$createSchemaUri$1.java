package com.bytedance.android.live.browser.webview.fragment;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.annie.api.AnnieHelper;
import com.bytedance.android.live.schema.p437vo.BaseHybridParamVo;
import com.bytedance.android.live.schema.p437vo.PopupHybridParamVo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C109391T5d;

/* loaded from: classes7.dex */
public final class WebDialogFragmentForAnnie$createSchemaUri$1 extends Lambda implements Function3<String, PopupHybridParamVo, BaseHybridParamVo, Uri> {
    public static final WebDialogFragmentForAnnie$createSchemaUri$1 INSTANCE = new WebDialogFragmentForAnnie$createSchemaUri$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23119);
    }

    public WebDialogFragmentForAnnie$createSchemaUri$1() {
        super(3);
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [android.net.Uri, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Uri invoke(String str, PopupHybridParamVo popupHybridParamVo, BaseHybridParamVo baseHybridParamVo) {
        Uri createH5SchemeByUrl;
        String str2 = str;
        PopupHybridParamVo popupHybridParamVo2 = popupHybridParamVo;
        BaseHybridParamVo baseHybridParamVo2 = baseHybridParamVo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2, popupHybridParamVo2, baseHybridParamVo2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str2, popupHybridParamVo2, baseHybridParamVo2);
        if (!TextUtils.isEmpty(baseHybridParamVo2.LJJIJIIJIL)) {
            return Uri.parse(baseHybridParamVo2.LJJIJIIJIL);
        }
        if (baseHybridParamVo2.LIZJ.ordinal() == BaseHybridParamVo.HybridType.LYNX.ordinal()) {
            createH5SchemeByUrl = AnnieHelper.createLynxSchemeByUrl(str2);
        } else {
            createH5SchemeByUrl = AnnieHelper.createH5SchemeByUrl(str2);
        }
        Uri.Builder buildUpon = createH5SchemeByUrl.buildUpon();
        buildUpon.appendQueryParameter("width", String.valueOf(popupHybridParamVo2.LIZIZ));
        buildUpon.appendQueryParameter(C109391T5d.LJFF, String.valueOf(popupHybridParamVo2.LIZJ));
        buildUpon.appendQueryParameter("horizontal_width", String.valueOf(popupHybridParamVo2.LIZLLL));
        buildUpon.appendQueryParameter("horizontal_height", String.valueOf(popupHybridParamVo2.f26652LJ));
        buildUpon.appendQueryParameter("horizontal_height_percent", String.valueOf(popupHybridParamVo2.LJFF));
        buildUpon.appendQueryParameter("horizontal_width_percent", String.valueOf(popupHybridParamVo2.LJI));
        buildUpon.appendQueryParameter("margin", String.valueOf(popupHybridParamVo2.LJII));
        buildUpon.appendQueryParameter("radius", String.valueOf(popupHybridParamVo2.LJIIIIZZ));
        buildUpon.appendQueryParameter("radius_top_left", String.valueOf(popupHybridParamVo2.LJIIJ));
        buildUpon.appendQueryParameter("radius_top_right", String.valueOf(popupHybridParamVo2.LJIIJJI));
        buildUpon.appendQueryParameter("radius_bottom_left", String.valueOf(popupHybridParamVo2.LJIILIIL));
        buildUpon.appendQueryParameter("radius_bottom_right", String.valueOf(popupHybridParamVo2.LJIIL));
        if (popupHybridParamVo2.LJIILJJIL == 80) {
            buildUpon.appendQueryParameter("gravity", "bottom");
        }
        buildUpon.appendQueryParameter("use_bottom_close", String.valueOf(popupHybridParamVo2.LJIILL));
        buildUpon.appendQueryParameter("landscape_custom_height", String.valueOf(popupHybridParamVo2.LJIILLIIL));
        buildUpon.appendQueryParameter("landscape_custom_width", String.valueOf(popupHybridParamVo2.LJIIZILJ));
        buildUpon.appendQueryParameter("landscape_custom_gravity", String.valueOf(popupHybridParamVo2.LJIJ));
        buildUpon.appendQueryParameter("show_dim", String.valueOf(popupHybridParamVo2.LJIJI));
        buildUpon.appendQueryParameter("height_percent", String.valueOf(popupHybridParamVo2.LJJ));
        buildUpon.appendQueryParameter("width_percent", String.valueOf(popupHybridParamVo2.LJJI));
        buildUpon.appendQueryParameter("rate_height", String.valueOf(popupHybridParamVo2.LJJIFFI));
        buildUpon.appendQueryParameter("up_offset_height", String.valueOf(popupHybridParamVo2.LJJIII));
        buildUpon.appendQueryParameter("up_status_bar_bg_color", String.valueOf(popupHybridParamVo2.LJJIIZ));
        buildUpon.appendQueryParameter("open_animate", String.valueOf(popupHybridParamVo2.LJJIJIIJI));
        buildUpon.appendQueryParameter("mask_alpha", String.valueOf(popupHybridParamVo2.LJJIJL));
        buildUpon.appendQueryParameter("close_icon_position", String.valueOf(popupHybridParamVo2.LJJIZ));
        buildUpon.appendQueryParameter("type", "popup");
        return buildUpon.build();
    }
}
