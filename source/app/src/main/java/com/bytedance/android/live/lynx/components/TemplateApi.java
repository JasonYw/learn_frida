package com.bytedance.android.live.lynx.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;

/* loaded from: classes23.dex */
public interface TemplateApi {
    static {
        Covode.recordClassIndex(32185);
    }

    @GET
    Call<TypedInput> getTemplate(@Url String str);
}
