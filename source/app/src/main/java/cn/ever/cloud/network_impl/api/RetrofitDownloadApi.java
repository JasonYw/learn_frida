package cn.ever.cloud.network_impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

/* loaded from: classes23.dex */
public interface RetrofitDownloadApi {
    static {
        Covode.recordClassIndex(3276);
    }

    @GET("/{spec}/{cloudId}")
    @Streaming
    Call<TypedInput> download(@Path("spec") String str, @Path("cloudId") long j, @HeaderList List<Header> list);

    @GET
    @Streaming
    Call<TypedInput> download(@Url String str, @HeaderList List<Header> list);
}
