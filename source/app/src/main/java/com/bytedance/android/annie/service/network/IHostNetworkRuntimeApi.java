package com.bytedance.android.annie.service.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.DELETE;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PUT;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

/* loaded from: classes23.dex */
public interface IHostNetworkRuntimeApi {
    static {
        Covode.recordClassIndex(11127);
    }

    @DELETE
    Call<String> doDeleteForString(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @GET
    Call<String> doGetForString(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @POST
    @Streaming
    Call<TypedInput> doPostForStream(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list, @Body TypedOutput typedOutput, @ExtraInfo Object obj);

    @POST
    Call<String> doPostForString(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list, @Body TypedOutput typedOutput, @ExtraInfo Object obj);

    @FormUrlEncoded
    @POST
    Call<String> doPostForString(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list, @FieldMap(encode = true) Map<String, String> map2, @ExtraInfo Object obj);

    @PUT
    Call<String> doPutForString(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderList List<Header> list, @Body TypedOutput typedOutput, @ExtraInfo Object obj);

    @GET
    @Streaming
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);
}
