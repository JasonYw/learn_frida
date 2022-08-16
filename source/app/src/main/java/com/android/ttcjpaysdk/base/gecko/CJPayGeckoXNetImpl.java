package com.android.ttcjpaysdk.base.gecko;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.stream.BufferOutputStream;
import com.bytedance.geckox.net.INetWork;
import com.bytedance.geckox.net.Response;
import com.bytedance.geckox.utils.CloseableUtils;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.umeng.message.proguard.C34037f;
import java.io.BufferedInputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p002O.C0002O;
import p003X.C521886je;

/* loaded from: classes23.dex */
public final class CJPayGeckoXNetImpl implements INetWork {
    public static ChangeQuickRedirect LIZ;
    public CJPayGeckoXNetApi LIZIZ;

    /* loaded from: classes23.dex */
    public interface CJPayGeckoXNetApi {
        static {
            Covode.recordClassIndex(6080);
        }

        @GET
        Call<String> doGet(@Url String str);

        @FormUrlEncoded
        @POST
        Call<String> doPost(@Url String str, @FieldMap Map<String, String> map);

        @GET
        @Streaming
        Call<TypedInput> downloadFile(@Url String str, @HeaderList List<Header> list);

        @POST
        Call<String> postBody(@Url String str, @Body TypedByteArray typedByteArray);
    }

    static {
        Covode.recordClassIndex(6079);
    }

    private Map<String, String> LIZ(List<Header> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (Header header : list) {
                hashMap.put(header.getName(), header.getValue());
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.geckox.net.INetWork
    public final Response doGet(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Response) proxy.result;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        new StringBuilder();
        String m25085C = C0002O.m25085C(parse.getScheme(), "://", parse.getHost());
        if (this.LIZIZ == null && !TextUtils.isEmpty(m25085C)) {
            this.LIZIZ = (CJPayGeckoXNetApi) C521886je.LIZ(m25085C, CJPayGeckoXNetApi.class);
        }
        SsResponse<String> execute = this.LIZIZ.doGet(str).execute();
        return new Response(LIZ(execute.headers()), execute.body(), execute.code(), execute.raw().getReason());
    }

    @Override // com.bytedance.geckox.net.INetWork
    public final Response doPost(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Response) proxy.result;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        new StringBuilder();
        String m25085C = C0002O.m25085C(parse.getScheme(), "://", parse.getHost());
        if (this.LIZIZ == null && !TextUtils.isEmpty(m25085C)) {
            this.LIZIZ = (CJPayGeckoXNetApi) C521886je.LIZ(m25085C, CJPayGeckoXNetApi.class);
        }
        SsResponse<String> execute = this.LIZIZ.postBody(str, new TypedByteArray("application/json", str2.getBytes(Charset.forName(C34037f.f43302f)), new String[0])).execute();
        return new Response(LIZ(execute.headers()), execute.body(), execute.code(), execute.raw().getReason());
    }

    @Override // com.bytedance.geckox.net.INetWork
    public final Response doPost(String str, List<Pair<String, String>> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Response) proxy.result;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        new StringBuilder();
        String m25085C = C0002O.m25085C(parse.getScheme(), "://", parse.getHost());
        if (this.LIZIZ == null && !TextUtils.isEmpty(m25085C)) {
            this.LIZIZ = (CJPayGeckoXNetApi) C521886je.LIZ(m25085C, CJPayGeckoXNetApi.class);
        }
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (Pair<String, String> pair : list) {
                hashMap.put(pair.first, pair.second);
            }
        }
        SsResponse<String> execute = this.LIZIZ.doPost(str, hashMap).execute();
        return new Response(LIZ(execute.headers()), execute.body(), execute.code(), execute.raw().getReason());
    }

    @Override // com.bytedance.geckox.net.INetWork
    public final void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) {
        int i;
        BufferedInputStream bufferedInputStream;
        MethodCollector.m14708i(358);
        if (PatchProxy.proxy(new Object[]{str, new Long(j), bufferOutputStream}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(358);
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            MethodCollector.m14707o(358);
            return;
        }
        new StringBuilder();
        String m25085C = C0002O.m25085C(parse.getScheme(), "://", parse.getHost());
        if (this.LIZIZ == null && !TextUtils.isEmpty(m25085C)) {
            this.LIZIZ = (CJPayGeckoXNetApi) C521886je.LIZ(m25085C, CJPayGeckoXNetApi.class);
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                SsResponse<TypedInput> execute = this.LIZIZ.downloadFile(str, null).execute();
                i = execute.code();
                try {
                    bufferedInputStream = new BufferedInputStream(execute.body().mo14242in());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
        }
        try {
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED);
                if (read != -1) {
                    bufferOutputStream.write(bArr, 0, read);
                } else {
                    CloseableUtils.close(bufferedInputStream);
                    MethodCollector.m14707o(358);
                    return;
                }
            }
        } catch (Exception e3) {
            e = e3;
            RuntimeException runtimeException = new RuntimeException(C0002O.m25082C("downloadFile failed, code: ", Integer.valueOf(i), ", url:", str, ", caused by:", e.getMessage()), e);
            MethodCollector.m14707o(358);
            throw runtimeException;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            CloseableUtils.close(bufferedInputStream2);
            MethodCollector.m14707o(358);
            throw th;
        }
    }
}
