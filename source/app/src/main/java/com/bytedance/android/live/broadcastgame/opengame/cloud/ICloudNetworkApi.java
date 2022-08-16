package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.DELETE;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HEAD;
import com.bytedance.retrofit2.http.HeaderMap;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.OPTIONS;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PUT;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes23.dex */
public interface ICloudNetworkApi {
    static {
        Covode.recordClassIndex(19975);
    }

    @DELETE
    Call<TypedInput> doDelete(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body TypedByteArray typedByteArray);

    @GET
    Call<TypedInput> doGet(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @HEAD
    Call<Unit> doHead(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @OPTIONS
    Call<TypedInput> doOptions(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body TypedByteArray typedByteArray);

    @POST
    Call<TypedInput> doPost(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body TypedByteArray typedByteArray);

    @PUT
    Call<TypedInput> doPut(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @Body TypedByteArray typedByteArray);
}
