package cn.ever.cloud.network_impl;

import cn.ever.cloud.network.retrofit.AbstractC0738a;
import cn.ever.cloud.network.retrofit.AbstractC0739b;
import cn.ever.cloud.network.retrofit.NetCall;
import cn.ever.cloud.network.retrofit.NetRequest;
import cn.ever.cloud.network.retrofit.NetResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.client.SsCall;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class NetworkHelperKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3261);
    }

    public static final NetCall toNetCall(final SsCall ssCall) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ssCall}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (NetCall) proxy.result;
        }
        C106862S5w.LIZ(ssCall);
        return new NetCall() { // from class: cn.ever.cloud.network_impl.NetworkHelperKt$toNetCall$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3262);
            }

            @Override // cn.ever.cloud.network.retrofit.NetCall
            public final void cancel() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
                    return;
                }
                SsCall.this.cancel();
            }

            @Override // cn.ever.cloud.network.retrofit.NetCall
            public final NetResponse execute() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return (NetResponse) proxy2.result;
                }
                Response execute = SsCall.this.execute();
                if (execute != null) {
                    return NetworkHelperKt.toNetResponse(execute);
                }
                return null;
            }

            @Override // cn.ever.cloud.network.retrofit.NetCall
            public final NetRequest getRequest() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
                if (proxy2.isSupported) {
                    return (NetRequest) proxy2.result;
                }
                Request request = SsCall.this.getRequest();
                if (request != null) {
                    return NetworkHelperKt.toNetRequest(request);
                }
                return null;
            }

            @Override // cn.ever.cloud.network.retrofit.NetCall
            public final boolean setThrottleNetSpeed(long j) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 3);
                if (proxy2.isSupported) {
                    return ((Boolean) proxy2.result).booleanValue();
                }
                return SsCall.this.setThrottleNetSpeed(j);
            }
        };
    }

    public static final AbstractC0738a toNetTypedInput(final TypedInput typedInput) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{typedInput}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (AbstractC0738a) proxy.result;
        }
        C106862S5w.LIZ(typedInput);
        return new AbstractC0738a() { // from class: cn.ever.cloud.network_impl.NetworkHelperKt$toNetTypedInput$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3263);
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0738a
            /* renamed from: in */
            public final InputStream mo20558in() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
                if (proxy2.isSupported) {
                    return (InputStream) proxy2.result;
                }
                return TypedInput.this.mo14242in();
            }

            public final long length() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
                if (proxy2.isSupported) {
                    return ((Long) proxy2.result).longValue();
                }
                return TypedInput.this.length();
            }

            public final String mimeType() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                return TypedInput.this.mimeType();
            }
        };
    }

    public static final AbstractC0739b toNetTypedOutput(final TypedOutput typedOutput) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{typedOutput}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (AbstractC0739b) proxy.result;
        }
        C106862S5w.LIZ(typedOutput);
        return new AbstractC0739b() { // from class: cn.ever.cloud.network_impl.NetworkHelperKt$toNetTypedOutput$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3264);
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final String fileName() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                return TypedOutput.this.fileName();
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final long length() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
                if (proxy2.isSupported) {
                    return ((Long) proxy2.result).longValue();
                }
                return TypedOutput.this.length();
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final String mimeType() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                return TypedOutput.this.mimeType();
            }

            @Override // cn.ever.cloud.network.retrofit.AbstractC0739b
            public final void writeTo(OutputStream outputStream) {
                if (PatchProxy.proxy(new Object[]{outputStream}, this, changeQuickRedirect, false, 4).isSupported) {
                    return;
                }
                TypedOutput.this.writeTo(outputStream);
            }
        };
    }

    public static final TypedOutput toTypedOutput(final AbstractC0739b abstractC0739b) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0739b}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (TypedOutput) proxy.result;
        }
        C106862S5w.LIZ(abstractC0739b);
        return new TypedOutput() { // from class: cn.ever.cloud.network_impl.NetworkHelperKt$toTypedOutput$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3265);
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String md5Stub() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String fileName() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                return AbstractC0739b.this.fileName();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final long length() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
                if (proxy2.isSupported) {
                    return ((Long) proxy2.result).longValue();
                }
                return AbstractC0739b.this.length();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String mimeType() {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                return AbstractC0739b.this.mimeType();
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final void writeTo(OutputStream outputStream) {
                if (PatchProxy.proxy(new Object[]{outputStream}, this, changeQuickRedirect, false, 4).isSupported) {
                    return;
                }
                AbstractC0739b.this.writeTo(outputStream);
            }
        };
    }

    public static final NetResponse toNetResponse(Response response) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{response}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (NetResponse) proxy.result;
        }
        C106862S5w.LIZ(response);
        int status = response.getStatus();
        String reason = response.getReason();
        List<Header> headers = response.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(headers, 10));
        for (Header header : headers) {
            Intrinsics.checkNotNullExpressionValue(header, "");
            arrayList.add(TuplesKt.m137to(header.getName(), header.getValue()));
        }
        Map map = MapsKt__MapsKt.toMap(arrayList);
        TypedInput body = response.getBody();
        Intrinsics.checkNotNullExpressionValue(body, "");
        return new NetResponse(status, reason, map, toNetTypedInput(body), response.getExtraInfo());
    }

    public static final Request toSsRequest(NetRequest netRequest) {
        TypedOutput typedOutput = null;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{netRequest}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Request) proxy.result;
        }
        C106862S5w.LIZ(netRequest);
        String method = netRequest.getMethod();
        String url = netRequest.getUrl();
        Map<String, String> headers = netRequest.getHeaders();
        ArrayList arrayList = new ArrayList(headers.size());
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList2 = arrayList;
        AbstractC0739b body = netRequest.getBody();
        if (body != null) {
            typedOutput = toTypedOutput(body);
        }
        return new Request(method, url, arrayList2, typedOutput, netRequest.getPriorityLevel(), netRequest.getResponseStreaming(), netRequest.getMaxLength(), netRequest.getAddCommonParams(), netRequest.getExtraInfo());
    }

    public static final NetRequest toNetRequest(Request request) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{request}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (NetRequest) proxy.result;
        }
        C106862S5w.LIZ(request);
        String method = request.getMethod();
        Intrinsics.checkNotNullExpressionValue(method, "");
        String url = request.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "");
        List<Header> headers = request.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(headers, 10));
        for (Header header : headers) {
            Intrinsics.checkNotNullExpressionValue(header, "");
            arrayList.add(TuplesKt.m137to(header.getName(), header.getValue()));
        }
        Map map = MapsKt__MapsKt.toMap(arrayList);
        TypedOutput body = request.getBody();
        Intrinsics.checkNotNullExpressionValue(body, "");
        return new NetRequest(method, url, map, toNetTypedOutput(body), request.getPriorityLevel(), request.isResponseStreaming(), request.getMaxLength(), request.isAddCommonParam(), request.getExtraInfo());
    }
}
