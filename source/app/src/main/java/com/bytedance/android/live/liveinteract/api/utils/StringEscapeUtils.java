package com.bytedance.android.live.liveinteract.api.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.Locale;
import p002O.C0002O;

/* loaded from: classes8.dex */
public final class StringEscapeUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(25188);
    }

    /* loaded from: classes8.dex */
    public static class StringBuilderWriter extends Writer implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        public static final long serialVersionUID = -146927496096066153L;
        public final StringBuilder builder;

        static {
            Covode.recordClassIndex(25189);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public StringBuilderWriter() {
            this.builder = new StringBuilder();
        }

        public String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return this.builder.toString();
        }

        public StringBuilderWriter(int i) {
            this.builder = new StringBuilder(i);
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo25457append(char c) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Character.valueOf(c)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Writer) proxy.result;
            }
            this.builder.append(c);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 4).isSupported && str != null) {
                this.builder.append(str);
            }
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo25458append(CharSequence charSequence) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Writer) proxy.result;
            }
            this.builder.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            if (!PatchProxy.proxy(new Object[]{cArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 5).isSupported && cArr != null) {
                this.builder.append(cArr, i, i2);
            }
        }

        @Override // java.io.Writer, java.lang.Appendable
        /* renamed from: append */
        public Writer mo25459append(CharSequence charSequence, int i, int i2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Writer) proxy.result;
            }
            this.builder.append(charSequence, i, i2);
            return this;
        }
    }

    public static String LIZ(char c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Character.valueOf(c)}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return Integer.toHexString(c).toUpperCase(Locale.ENGLISH);
    }

    public static String LIZ(String str, boolean z, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, (byte) 0, (byte) 0}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return null;
        }
        try {
            StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(str.length() * 2);
            LIZ(stringBuilderWriter, str, false, false);
            return stringBuilderWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void LIZ(Writer writer, String str, boolean z, boolean z2) {
        MethodCollector.m14708i(1710);
        if (PatchProxy.proxy(new Object[]{writer, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, null, LIZ, true, 6).isSupported) {
            MethodCollector.m14707o(1710);
            return;
        }
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 4095) {
                    writer.write(C0002O.m25086C("\\u", LIZ(charAt)));
                } else if (charAt > 255) {
                    writer.write(C0002O.m25086C("\\u0", LIZ(charAt)));
                } else if (charAt > 127) {
                    writer.write(C0002O.m25086C("\\u00", LIZ(charAt)));
                } else if (charAt < ' ') {
                    switch (charAt) {
                        case '\b':
                            writer.write(92);
                            writer.write(98);
                            break;
                        case '\t':
                            writer.write(92);
                            writer.write(116);
                            break;
                        case '\n':
                            writer.write(92);
                            writer.write(110);
                            break;
                        case 11:
                        default:
                            if (charAt > 15) {
                                writer.write(C0002O.m25086C("\\u00", LIZ(charAt)));
                                break;
                            }
                            writer.write(C0002O.m25086C("\\u000", LIZ(charAt)));
                            break;
                        case '\f':
                            writer.write(92);
                            writer.write(102);
                            break;
                        case '\r':
                            writer.write(92);
                            writer.write(114);
                            writer.write(C0002O.m25086C("\\u000", LIZ(charAt)));
                            break;
                    }
                } else if (charAt != '\"') {
                    if (charAt != '\'') {
                        if (charAt != '/') {
                            if (charAt != '\\') {
                                writer.write(charAt);
                            } else {
                                writer.write(92);
                                writer.write(92);
                            }
                        } else {
                            if (z2) {
                                writer.write(92);
                            }
                            writer.write(47);
                        }
                    } else {
                        if (z) {
                            writer.write(92);
                        }
                        writer.write(39);
                    }
                } else {
                    writer.write(92);
                    writer.write(34);
                }
            }
        }
        MethodCollector.m14707o(1710);
    }
}
