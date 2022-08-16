package com.alibaba.wireless.security.jaq;

import com.bytedance.covode.number.Covode;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public class JAQException extends Exception {

    /* renamed from: a */
    public int f21823a;

    static {
        Covode.recordClassIndex(4558);
    }

    public JAQException(int i) {
        this.f21823a = i;
    }

    public JAQException(String str, int i) {
        super(str);
        this.f21823a = i;
    }

    public JAQException(String str, Throwable th, int i) {
        super(str, th);
        this.f21823a = i;
    }

    public JAQException(Throwable th, int i) {
        super(th);
        this.f21823a = i;
    }

    public int getErrorCode() {
        return this.f21823a;
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
        this.f21823a = i;
    }
}
