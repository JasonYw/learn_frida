package cn.ever.cloud.network_impl.api;

import cn.ever.cloud.network.auth.AbstractC0730a;
import cn.ever.cloud.network.entity.NResponse;
import cn.ever.cloud.network.error.ServerError;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.ErrorCode;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import java.io.InterruptedIOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExceptionsKt;
import p003X.C106862S5w;
import p003X.C520346hA;
import p003X.C522476kb;

/* loaded from: classes23.dex */
public final class ApiExecutor {
    public static final C522476kb Companion = new C522476kb((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0730a tokenProvider;

    static {
        Covode.recordClassIndex(3269);
    }

    public ApiExecutor(AbstractC0730a abstractC0730a) {
        C106862S5w.LIZ(abstractC0730a);
        this.tokenProvider = abstractC0730a;
    }

    private final Integer safetyToInt(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    private final <RESP> void checkResponse(SsResponse<RESP> ssResponse) {
        ErrorCode errorCode;
        Integer safetyToInt;
        Integer safetyToInt2;
        int intValue;
        if (PatchProxy.proxy(new Object[]{ssResponse}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (ssResponse != null) {
            int code = ssResponse.code();
            if (ssResponse.isSuccessful()) {
                String headersGet = headersGet(ssResponse, "x-code");
                if (headersGet != null && (safetyToInt2 = safetyToInt(headersGet)) != null && (intValue = safetyToInt2.intValue()) != 0) {
                    throw ServerError.Companion.fromCode(code, intValue);
                }
                RESP body = ssResponse.body();
                if (body != null) {
                    if (body instanceof NResponse) {
                        NResponse nResponse = (NResponse) body;
                        if (nResponse.code != 0) {
                            throw ServerError.Companion.fromResponse(code, nResponse);
                        }
                        return;
                    }
                    return;
                }
                throw ClientError.Companion.networkClientError();
            } else if (500 <= code && 599 >= code) {
                throw ServerError.Companion.serverInternal(code);
            } else {
                if (code == 403) {
                    String headersGet2 = headersGet(ssResponse, "x-everphoto-code");
                    Integer num = null;
                    if (headersGet2 != null && (safetyToInt = safetyToInt(headersGet2)) != null) {
                        errorCode = ErrorCode.Companion.findByCode(safetyToInt.intValue());
                    } else {
                        errorCode = null;
                    }
                    if (errorCode != ErrorCode.SERVER_NO_AUTH) {
                        String headersGet3 = headersGet(ssResponse, "x-everphoto-code");
                        if (headersGet3 != null) {
                            num = safetyToInt(headersGet3);
                        }
                        LogHelper.INSTANCE.m20554e("ApiExecutor", "unexpected error, status code is " + code + " and x-everphoto-code is " + num + '.');
                        throw ServerError.Companion.serverInternal(code);
                    }
                    throw new ServerError(code, errorCode);
                } else if (code == 401) {
                    throw new ServerError(code, ErrorCode.SERVER_NO_AUTH);
                } else {
                    return;
                }
            }
        }
        throw ClientError.Companion.networkClientError();
    }

    private final void monitorSuccess(String str, int i) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        MonitorKit.INSTANCE.network("request", str, Integer.valueOf(i), "success");
    }

    private final <T> String headersGet(SsResponse<T> ssResponse, String str) {
        T t;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ssResponse, str}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        List<Header> headers = ssResponse.headers();
        Intrinsics.checkNotNullExpressionValue(headers, "");
        Iterator<T> it = headers.iterator();
        while (true) {
            if (it.hasNext()) {
                t = it.next();
                Header header = (Header) t;
                Intrinsics.checkNotNullExpressionValue(header, "");
                if (Intrinsics.areEqual(header.getName(), str)) {
                    break;
                }
            } else {
                t = null;
                break;
            }
        }
        Header header2 = (Header) t;
        if (header2 == null) {
            return null;
        }
        return header2.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Thread] */
    public final /* synthetic */ <RESP> Object suspendCall(Call<RESP> call, Continuation<? super SsResponse<RESP>> continuation) {
        SsResponse<RESP> execute;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{call, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C520346hA.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        cancellableContinuationImpl.invokeOnCancellation(new ApiExecutor$suspendCall$2$1(objectRef));
        try {
            objectRef.element = Thread.currentThread();
            if (!call.isExecuted()) {
                execute = call.execute();
            } else {
                execute = call.mo27378clone().execute();
            }
            objectRef.element = null;
            Result.m30308constructorimpl(execute);
            cancellableContinuationImpl.resumeWith(execute);
        } catch (Exception e) {
            if (!(e instanceof InterruptedException) && !(e instanceof InterruptedIOException)) {
                Object createFailure = ResultKt.createFailure(e);
                Result.m30308constructorimpl(createFailure);
                cancellableContinuationImpl.resumeWith(createFailure);
            } else {
                LogHelper logHelper = LogHelper.INSTANCE;
                logHelper.m20553i("ApiExecutor", call + " is cancelled");
                Object createFailure2 = ResultKt.createFailure(ExceptionsKt.CancellationException("call has been cancelled", e));
                Result.m30308constructorimpl(createFailure2);
                cancellableContinuationImpl.resumeWith(createFailure2);
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(2:8|(12:10|11|12|(1:(1:(1:16)(2:32|33))(6:34|35|24|(1:26)(1:30)|27|28))(1:36)|17|(1:19)(1:31)|20|(2:22|23)|24|(0)(0)|27|28))|73|11|12|(0)(0)|17|(0)(0)|20|(0)|24|(0)(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r1 = cn.ever.cloud.utils.LogHelper.INSTANCE;
        r11 = new java.lang.StringBuilder("url=");
        r0 = r14.request();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
        r0 = r0.getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
        r11.append(r0);
        r11.append(", ");
        r11.append(r2);
        r1.m20554e("ApiExecutor", r11.toString());
        r1 = r2.getCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
        if (r1 == cn.ever.cloud.utils.error.ErrorCode.SERVER_NO_AUTH.getCode()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
        r3.tokenProvider.onTokenExceeded();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        if (r0 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
        r0 = r14.request();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
        if (r0 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
        r5 = r0.getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0114, code lost:
        r3.monitorError(r5, r2.getCode(), r2.getHumanMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013c, code lost:
        r4 = r4 + 1;
        r1 = cn.ever.cloud.utils.LogHelper.INSTANCE;
        r11 = new java.lang.StringBuilder("url=");
        r0 = r14.request();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0148, code lost:
        if (r0 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014a, code lost:
        r0 = r0.getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014e, code lost:
        r11.append(r0);
        r11.append(", retry=");
        r11.append(r4);
        r1.m20553i("ApiExecutor", r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0161, code lost:
        if (r4 >= 3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0163, code lost:
        r0 = r14.request();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0167, code lost:
        if (r0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0169, code lost:
        r5 = r0.getUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016d, code lost:
        r3.monitorError(r5, r2.getCode(), r2.getHumanMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x017b, code lost:
        r7.L$0 = r3;
        r7.L$1 = r14;
        r7.I$0 = r4;
        r7.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0189, code lost:
        if (kotlinx.coroutines.DelayKt.delay(1000, r7) == r10) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x018b, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0179, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0126, code lost:
        if (r1 != cn.ever.cloud.utils.error.ErrorCode.SERVER_INTERNAL.getCode()) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0138, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[Catch: EpError -> 0x00d0, TryCatch #0 {EpError -> 0x00d0, blocks: (B:17:0x0066, B:19:0x0075, B:20:0x0079, B:24:0x0096, B:26:0x00bf, B:27:0x00c3, B:35:0x0093), top: B:12:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[Catch: EpError -> 0x00d0, TryCatch #0 {EpError -> 0x00d0, blocks: (B:17:0x0066, B:19:0x0075, B:20:0x0079, B:24:0x0096, B:26:0x00bf, B:27:0x00c3, B:35:0x0093), top: B:12:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0189 -> B:17:0x0066). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <RESP> java.lang.Object execute(com.bytedance.retrofit2.Call<RESP> r14, kotlin.coroutines.Continuation<? super RESP> r15) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.network_impl.api.ApiExecutor.execute(com.bytedance.retrofit2.Call, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void monitorError(String str, int i, String str2) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        MonitorKit.INSTANCE.network("request", str, Integer.valueOf(i), str2);
    }
}
