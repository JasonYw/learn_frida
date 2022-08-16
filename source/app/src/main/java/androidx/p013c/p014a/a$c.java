package androidx.p013c.p014a;

import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p002O.C0002O;
import p003X.C109844TMo;
import p003X.C109845TMp;
import p003X.C109847TMr;

/* renamed from: androidx.c.a.a$c */
/* loaded from: classes10.dex */
public class a$c {
    public final int LIZ;
    public final int LIZIZ;
    public final byte[] LIZJ;

    static {
        Covode.recordClassIndex(780);
    }

    public final Object LIZ(ByteOrder byteOrder) {
        C109845TMp c109845TMp;
        byte b;
        try {
            c109845TMp = new C109845TMp(this.LIZJ);
        } catch (IOException unused) {
            c109845TMp = null;
        } catch (Throwable th) {
            th = th;
            c109845TMp = null;
        }
        try {
            c109845TMp.LIZ = byteOrder;
            boolean z = true;
            int i = 0;
            switch (this.LIZ) {
                case 1:
                case 6:
                    if (this.LIZJ.length != 1 || this.LIZJ[0] < 0 || this.LIZJ[0] > 1) {
                        String str = new String(this.LIZJ, C109844TMo.LJII);
                        try {
                            c109845TMp.close();
                        } catch (IOException unused2) {
                        }
                        return str;
                    }
                    String str2 = new String(new char[]{(char) (this.LIZJ[0] + 48)});
                    try {
                        c109845TMp.close();
                    } catch (IOException unused3) {
                    }
                    return str2;
                case 2:
                case 7:
                    if (this.LIZIZ >= C109844TMo.LJFF.length) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < C109844TMo.LJFF.length) {
                                if (this.LIZJ[i2] != C109844TMo.LJFF[i2]) {
                                    z = false;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (z) {
                            i = C109844TMo.LJFF.length;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i < this.LIZIZ && (b = this.LIZJ[i]) != 0) {
                        if (b >= 32) {
                            sb.append((char) b);
                        } else {
                            sb.append('?');
                        }
                        i++;
                    }
                    String sb2 = sb.toString();
                    try {
                        c109845TMp.close();
                    } catch (IOException unused4) {
                    }
                    return sb2;
                case 3:
                    int[] iArr = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr[i] = c109845TMp.readUnsignedShort();
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused5) {
                    }
                    return iArr;
                case 4:
                    long[] jArr = new long[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        jArr[i] = c109845TMp.LIZ();
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused6) {
                    }
                    return jArr;
                case 5:
                    C109847TMr[] c109847TMrArr = new C109847TMr[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        c109847TMrArr[i] = new C109847TMr(c109845TMp.LIZ(), c109845TMp.LIZ());
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused7) {
                    }
                    return c109847TMrArr;
                case 8:
                    int[] iArr2 = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr2[i] = c109845TMp.readShort();
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused8) {
                    }
                    return iArr2;
                case 9:
                    int[] iArr3 = new int[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        iArr3[i] = c109845TMp.readInt();
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused9) {
                    }
                    return iArr3;
                case 10:
                    C109847TMr[] c109847TMrArr2 = new C109847TMr[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        c109847TMrArr2[i] = new C109847TMr(c109845TMp.readInt(), c109845TMp.readInt());
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused10) {
                    }
                    return c109847TMrArr2;
                case 11:
                    double[] dArr = new double[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        dArr[i] = c109845TMp.readFloat();
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused11) {
                    }
                    return dArr;
                case 12:
                    double[] dArr2 = new double[this.LIZIZ];
                    while (i < this.LIZIZ) {
                        dArr2[i] = c109845TMp.readDouble();
                        i++;
                    }
                    try {
                        c109845TMp.close();
                    } catch (IOException unused12) {
                    }
                    return dArr2;
                default:
                    try {
                        c109845TMp.close();
                    } catch (IOException unused13) {
                    }
                    return null;
            }
        } catch (IOException unused14) {
            if (c109845TMp != null) {
                try {
                    c109845TMp.close();
                } catch (IOException unused15) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (c109845TMp != null) {
                try {
                    c109845TMp.close();
                } catch (IOException unused16) {
                }
            }
            throw th;
        }
    }

    public final int LIZ() {
        return C109844TMo.f12516LJ[this.LIZ] * this.LIZIZ;
    }

    public final String toString() {
        return C0002O.m25083C("(", C109844TMo.LIZLLL[this.LIZ], ", data length:", Integer.valueOf(this.LIZJ.length), ")");
    }

    public static a$c LIZ(String str) {
        byte[] bytes = (str + (char) 0).getBytes(C109844TMo.LJII);
        return new a$c(2, bytes.length, bytes);
    }

    public final int LIZIZ(ByteOrder byteOrder) {
        Object LIZ = LIZ(byteOrder);
        if (LIZ != null) {
            if (LIZ instanceof String) {
                return Integer.parseInt((String) LIZ);
            }
            if (LIZ instanceof long[]) {
                long[] jArr = (long[]) LIZ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (LIZ instanceof int[]) {
                int[] iArr = (int[]) LIZ;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String LIZJ(ByteOrder byteOrder) {
        Object LIZ = LIZ(byteOrder);
        if (LIZ == null) {
            return null;
        }
        if (LIZ instanceof String) {
            return (String) LIZ;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (LIZ instanceof long[]) {
            long[] jArr = (long[]) LIZ;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            return sb.toString();
        } else if (LIZ instanceof int[]) {
            int[] iArr = (int[]) LIZ;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            return sb.toString();
        } else if (LIZ instanceof double[]) {
            double[] dArr = (double[]) LIZ;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            return sb.toString();
        } else if (!(LIZ instanceof C109847TMr[])) {
            return null;
        } else {
            C109847TMr[] c109847TMrArr = (C109847TMr[]) LIZ;
            while (i < c109847TMrArr.length) {
                sb.append(c109847TMrArr[i].LIZ);
                sb.append('/');
                sb.append(c109847TMrArr[i].LIZIZ);
                i++;
                if (i != c109847TMrArr.length) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
            }
            return sb.toString();
        }
    }

    public static a$c LIZ(int i, ByteOrder byteOrder) {
        return LIZ(new int[]{i}, byteOrder);
    }

    public static a$c LIZ(long j, ByteOrder byteOrder) {
        return LIZ(new long[]{j}, byteOrder);
    }

    public static a$c LIZ(C109847TMr c109847TMr, ByteOrder byteOrder) {
        return LIZ(new C109847TMr[]{c109847TMr}, byteOrder);
    }

    public static a$c LIZIZ(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C109844TMo.f12516LJ[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new a$c(9, iArr.length, wrap.array());
    }

    public static a$c LIZIZ(C109847TMr[] c109847TMrArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C109844TMo.f12516LJ[10] * c109847TMrArr.length]);
        wrap.order(byteOrder);
        for (C109847TMr c109847TMr : c109847TMrArr) {
            wrap.putInt((int) c109847TMr.LIZ);
            wrap.putInt((int) c109847TMr.LIZIZ);
        }
        return new a$c(10, c109847TMrArr.length, wrap.array());
    }

    public static a$c LIZ(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C109844TMo.f12516LJ[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new a$c(12, dArr.length, wrap.array());
    }

    public static a$c LIZ(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C109844TMo.f12516LJ[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new a$c(3, iArr.length, wrap.array());
    }

    public static a$c LIZ(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C109844TMo.f12516LJ[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new a$c(4, jArr.length, wrap.array());
    }

    public static a$c LIZ(C109847TMr[] c109847TMrArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C109844TMo.f12516LJ[5] * c109847TMrArr.length]);
        wrap.order(byteOrder);
        for (C109847TMr c109847TMr : c109847TMrArr) {
            wrap.putInt((int) c109847TMr.LIZ);
            wrap.putInt((int) c109847TMr.LIZIZ);
        }
        return new a$c(5, c109847TMrArr.length, wrap.array());
    }

    public a$c(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public a$c(int i, int i2, long j, byte[] bArr) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = bArr;
    }
}
