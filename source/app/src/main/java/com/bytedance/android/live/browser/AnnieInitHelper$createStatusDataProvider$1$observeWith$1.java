package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C101081PrP;
import p003X.C106862S5w;
import p003X.PK0;

/* loaded from: classes8.dex */
public final class AnnieInitHelper$createStatusDataProvider$1$observeWith$1 extends Lambda implements Function2<String, PK0<JsonObject, JsonObject>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101081PrP this$0;

    static {
        Covode.recordClassIndex(21861);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieInitHelper$createStatusDataProvider$1$observeWith$1(C101081PrP c101081PrP) {
        super(2);
        this.this$0 = c101081PrP;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(String str, PK0<JsonObject, JsonObject> pk0) {
        String str2 = str;
        PK0<JsonObject, JsonObject> pk02 = pk0;
        if (!PatchProxy.proxy(new Object[]{str2, pk02}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2, pk02);
            this.this$0.LIZJ.registerMethod(str2, pk02);
        }
        return Unit.INSTANCE;
    }
}
