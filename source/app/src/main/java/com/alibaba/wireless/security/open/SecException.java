package com.alibaba.wireless.security.open;

import com.bytedance.covode.number.Covode;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class SecException extends Exception {

    /* renamed from: a */
    public int f21827a;

    static {
        Covode.recordClassIndex(4564);
    }

    public SecException(int i) {
        this.f21827a = i;
    }

    public SecException(String str, int i) {
        super(str);
        this.f21827a = i;
    }

    public SecException(String str, Throwable th, int i) {
        super(str, th);
        this.f21827a = i;
    }

    public SecException(Throwable th, int i) {
        super(th);
        this.f21827a = i;
    }

    public int getErrorCode() {
        return this.f21827a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.println("ErrorCode = " + getErrorCode());
        super.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("ErrorCode = " + getErrorCode());
        super.printStackTrace(printWriter);
    }

    public void setErrorCode(int i) {
        this.f21827a = i;
    }
}
