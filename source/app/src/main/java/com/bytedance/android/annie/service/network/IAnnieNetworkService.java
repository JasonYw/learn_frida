package com.bytedance.android.annie.service.network;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bytedance.android.annie.service.AbstractC2627b;
import com.bytedance.covode.number.Covode;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface IAnnieNetworkService extends AbstractC2627b {
    static {
        Covode.recordClassIndex(11126);
    }

    InputStream doPost(String str, String str2, Map<String, String> map, Map<String, Object> map2);

    AnnieCall<AnnieResponse> downloadFile(boolean z, int i, String str, List<Pair<String, String>> list, Object obj);

    AnnieCall<AnnieResponse> downloadFileStreaming(boolean z, int i, String str, List<Pair<String, String>> list, Object obj);

    AnnieCall<AnnieResponse> get(String str, List<Pair<String, String>> list);

    AnnieCall<AnnieResponse> get(String str, List<Pair<String, String>> list, Boolean bool);

    Map<String, String> getCommonParams();

    String getHostDomain();

    String getNetworkAccessType();

    void handleFetchError(View view, String str, String str2, Throwable th);

    void handleStatusCodeInterception(JsonObject jsonObject, Context context);

    AnnieCall<AnnieResponse> post(String str, List<Pair<String, String>> list, String str2, byte[] bArr);

    AnnieCall<AnnieResponse> post(String str, List<Pair<String, String>> list, String str2, byte[] bArr, Boolean bool);

    AnnieCall<AnnieResponse> uploadFile(int i, String str, List<Pair<String, String>> list, String str2, byte[] bArr, long j, String str3);
}
