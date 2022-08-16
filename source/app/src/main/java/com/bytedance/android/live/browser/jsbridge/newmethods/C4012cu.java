package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.app.Activity;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.SelfEmoji;
import com.bytedance.android.live.browser.jsbridge.base.C3915cp;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.AbstractC5789a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC81158Hyq;
import p003X.C106862S5w;
import p003X.C109391T5d;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.cu */
/* loaded from: classes27.dex */
public final class C4012cu extends AbstractC81158Hyq<C3915cp, Object> {
    public static ChangeQuickRedirect LIZ;
    public final Activity LIZIZ;

    static {
        Covode.recordClassIndex(22759);
    }

    public C4012cu(Activity activity) {
        this.LIZIZ = activity;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(Object obj, C13052h c13052h) {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonElement jsonElement4;
        JsonElement jsonElement5;
        String asString;
        JsonElement jsonElement6;
        String asString2;
        JsonElement jsonElement7;
        String asString3;
        JsonElement jsonElement8;
        C3915cp c3915cp = (C3915cp) obj;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[]{c3915cp, c13052h}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3915cp, c13052h);
            SelfEmoji selfEmoji = new SelfEmoji();
            JsonObject jsonObject = c3915cp.LIZ;
            JsonArray jsonArray = null;
            if (jsonObject != null && (jsonElement8 = jsonObject.get(C33968a.f42937f)) != null) {
                str = jsonElement8.getAsString();
            } else {
                str = null;
            }
            selfEmoji.f25738id = str;
            if (jsonObject != null && (jsonElement7 = jsonObject.get("width")) != null && (asString3 = jsonElement7.getAsString()) != null) {
                i = Integer.parseInt(asString3);
            } else {
                i = 0;
            }
            selfEmoji.viewWidth = i;
            if (jsonObject != null && (jsonElement6 = jsonObject.get(C109391T5d.LJFF)) != null && (asString2 = jsonElement6.getAsString()) != null) {
                i2 = Integer.parseInt(asString2);
            } else {
                i2 = 0;
            }
            selfEmoji.viewHeight = i2;
            if (jsonObject != null && (jsonElement5 = jsonObject.get("is_gif")) != null && (asString = jsonElement5.getAsString()) != null) {
                z = Boolean.parseBoolean(asString);
            }
            selfEmoji.isGif = z;
            if (jsonObject != null && (jsonElement4 = jsonObject.get("web_uri")) != null) {
                str2 = jsonElement4.getAsString();
            } else {
                str2 = null;
            }
            selfEmoji.webUri = str2;
            if (jsonObject != null && (jsonElement3 = jsonObject.get("animate_type")) != null) {
                str3 = jsonElement3.getAsString();
            } else {
                str3 = null;
            }
            selfEmoji.animateType = str3;
            if (jsonObject != null && (jsonElement2 = jsonObject.get("display_name")) != null) {
                str4 = jsonElement2.getAsString();
            } else {
                str4 = null;
            }
            selfEmoji.displayName = str4;
            if (jsonObject != null && (jsonElement = jsonObject.get("url_list")) != null) {
                jsonArray = jsonElement.getAsJsonArray();
            }
            ArrayList arrayList = new ArrayList();
            if (jsonArray != null) {
                for (JsonElement jsonElement9 : jsonArray) {
                    Intrinsics.checkNotNullExpressionValue(jsonElement9, "");
                    String asString4 = jsonElement9.getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString4, "");
                    arrayList.add(asString4);
                }
            }
            selfEmoji.mUrls = arrayList;
            ImageModel imageModel = new ImageModel();
            imageModel.setUrls(arrayList);
            imageModel.width = selfEmoji.viewWidth;
            imageModel.height = selfEmoji.viewHeight;
            imageModel.setUri(selfEmoji.webUri);
            selfEmoji.animatedImage = imageModel;
            selfEmoji.staticImage = selfEmoji.animatedImage;
            String str5 = c3915cp.LIZIZ;
            if (str5 != null && str5.hashCode() == 96417 && str5.equals("add")) {
                ((AbstractC5789a) ServiceManager.getService(AbstractC5789a.class)).LIZIZ(this.LIZIZ, selfEmoji);
            } else {
                ((AbstractC5789a) ServiceManager.getService(AbstractC5789a.class)).LIZ(this.LIZIZ, selfEmoji);
            }
        }
    }
}
