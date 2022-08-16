package com.bef.effectsdk.game;

import android.opengl.GLES20;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes10.dex */
public class RenderTextureUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static float[] vertexArray = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    public static float[] uvArray = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static float[] flipY_uvArray = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    public static FloatBuffer getFlipY_uvBuffer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (FloatBuffer) proxy.result;
        }
        return getFloatBuffer(flipY_uvArray);
    }

    public static FloatBuffer getUVBuffer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (FloatBuffer) proxy.result;
        }
        return getFloatBuffer(uvArray);
    }

    public static FloatBuffer getVertexBuffer() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (FloatBuffer) proxy.result;
        }
        return getFloatBuffer(vertexArray);
    }

    static {
        Covode.recordClassIndex(9570);
    }

    public static FloatBuffer getFloatBuffer(float[] fArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fArr}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (FloatBuffer) proxy.result;
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int generateBlankTexture(int i, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i * i2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(0.0f);
        asFloatBuffer.position(0);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, asFloatBuffer);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static FloatBuffer getUVBufferWithParams(float f, float f2, float f3, float f4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (FloatBuffer) proxy.result;
        }
        return getFloatBuffer(new float[]{f, f3, f2, f3, f, f4, f2, f4});
    }

    public static FloatBuffer getVertexBufferWithParams(float f, float f2, float f3, float f4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (FloatBuffer) proxy.result;
        }
        return getFloatBuffer(new float[]{f, f3, f2, f3, f, f4, f2, f4});
    }
}
