package com.benchmark.network;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p003X.AbstractC103912Qvy;
import p003X.C103911Qvx;
import p003X.C75509Fpv;

/* loaded from: classes8.dex */
public class BXNetWorkController {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static AbstractC103912Qvy mNetWorker;

    static {
        Covode.recordClassIndex(9700);
    }

    public static String getNetworkClassify() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C75509Fpv.LIZ();
    }

    public static void init() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        mNetWorker = new C103911Qvx();
    }

    public static ByteBenchResponse execute(ByteBenchRequest byteBenchRequest) {
        InputStream LIZ;
        MethodCollector.m14708i(787);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{byteBenchRequest}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            ByteBenchResponse byteBenchResponse = (ByteBenchResponse) proxy.result;
            MethodCollector.m14707o(787);
            return byteBenchResponse;
        }
        ByteBenchResponse byteBenchResponse2 = new ByteBenchResponse();
        AbstractC103912Qvy abstractC103912Qvy = mNetWorker;
        if (abstractC103912Qvy != null) {
            try {
                LIZ = abstractC103912Qvy.LIZ(byteBenchRequest);
                byteBenchResponse2.mHttpCode = byteBenchRequest.mCode;
                byteBenchResponse2.mMessage = byteBenchRequest.mMessage;
            } catch (IOException e) {
                byteBenchResponse2.mMessage = e.getMessage();
            }
            if (LIZ == null) {
                byteBenchResponse2.mErrorCode = -1;
                MethodCollector.m14707o(787);
                return byteBenchResponse2;
            }
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_VIEW_SCROLLED];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = LIZ.read(bArr, 0, AccessibilityEventCompat.TYPE_VIEW_SCROLLED);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteBenchResponse2.mData = byteArrayOutputStream.toString();
            byteBenchResponse2.mErrorCode = 0;
            MethodCollector.m14707o(787);
            return byteBenchResponse2;
        }
        byteBenchResponse2.mErrorCode = -1;
        MethodCollector.m14707o(787);
        return byteBenchResponse2;
    }

    public static boolean downloadFile(String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC103912Qvy abstractC103912Qvy = mNetWorker;
        if (abstractC103912Qvy == null) {
            return false;
        }
        return abstractC103912Qvy.LIZ(str, str2, str3);
    }
}
