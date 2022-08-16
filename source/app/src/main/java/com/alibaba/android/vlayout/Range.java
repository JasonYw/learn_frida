package com.alibaba.android.vlayout;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.Comparable;
import java.util.Objects;

/* loaded from: classes19.dex */
public final class Range<T extends Comparable<? super T>> {
    public final T mLower;
    public final T mUpper;

    static {
        Covode.recordClassIndex(4348);
    }

    public final T getLower() {
        return this.mLower;
    }

    public final T getUpper() {
        return this.mUpper;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        return Objects.hash(this.mLower, this.mUpper);
    }

    public final String toString() {
        return String.format("[%s, %s]", this.mLower, this.mUpper);
    }

    public final Range<T> extend(T t) {
        if (t != null) {
            return extend(t, t);
        }
        throw new IllegalArgumentException("value must not be null");
    }

    public final T clamp(T t) {
        if (t != null) {
            if (t.compareTo(this.mLower) < 0) {
                return this.mLower;
            }
            if (t.compareTo(this.mUpper) > 0) {
                return this.mUpper;
            }
            return t;
        }
        throw new IllegalArgumentException("value must not be null");
    }

    public final boolean contains(Range<T> range) {
        boolean z;
        boolean z2;
        if (range != null) {
            if (range.mLower.compareTo(this.mLower) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (range.mUpper.compareTo(this.mUpper) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("value must not be null");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.mLower.equals(range.mLower) && this.mUpper.equals(range.mUpper)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.android.vlayout.Range<T> extend(com.alibaba.android.vlayout.Range<T> r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L2d
            T extends java.lang.Comparable<? super T> r1 = r4.mLower
            T extends java.lang.Comparable<? super T> r0 = r3.mLower
            int r2 = r1.compareTo(r0)
            T extends java.lang.Comparable<? super T> r1 = r4.mUpper
            T extends java.lang.Comparable<? super T> r0 = r3.mUpper
            int r0 = r1.compareTo(r0)
            if (r2 > 0) goto L1c
            if (r0 < 0) goto L17
            return r4
        L17:
            if (r2 >= 0) goto L1c
            T extends java.lang.Comparable<? super T> r1 = r4.mLower
            goto L21
        L1c:
            if (r0 > 0) goto L1f
            return r3
        L1f:
            T extends java.lang.Comparable<? super T> r1 = r3.mLower
        L21:
            if (r0 > 0) goto L2a
            T extends java.lang.Comparable<? super T> r0 = r3.mUpper
        L25:
            com.alibaba.android.vlayout.Range r0 = create(r1, r0)
            return r0
        L2a:
            T extends java.lang.Comparable<? super T> r0 = r4.mUpper
            goto L25
        L2d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "range must not be null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.Range.extend(com.alibaba.android.vlayout.Range):com.alibaba.android.vlayout.Range");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 >= 0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.android.vlayout.Range<T> intersect(com.alibaba.android.vlayout.Range<T> r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L2f
            T extends java.lang.Comparable<? super T> r1 = r4.mLower
            T extends java.lang.Comparable<? super T> r0 = r3.mLower
            int r2 = r1.compareTo(r0)
            T extends java.lang.Comparable<? super T> r1 = r4.mUpper
            T extends java.lang.Comparable<? super T> r0 = r3.mUpper
            int r0 = r1.compareTo(r0)
            if (r2 > 0) goto L19
            if (r0 < 0) goto L17
            return r3
        L17:
            if (r2 < 0) goto L21
        L19:
            if (r0 > 0) goto L1c
            return r4
        L1c:
            if (r2 <= 0) goto L21
            T extends java.lang.Comparable<? super T> r1 = r4.mLower
            goto L23
        L21:
            T extends java.lang.Comparable<? super T> r1 = r3.mLower
        L23:
            if (r0 < 0) goto L2c
            T extends java.lang.Comparable<? super T> r0 = r3.mUpper
        L27:
            com.alibaba.android.vlayout.Range r0 = create(r1, r0)
            return r0
        L2c:
            T extends java.lang.Comparable<? super T> r0 = r4.mUpper
            goto L27
        L2f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "range must not be null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.vlayout.Range.intersect(com.alibaba.android.vlayout.Range):com.alibaba.android.vlayout.Range");
    }

    public final boolean contains(T t) {
        boolean z;
        boolean z2;
        if (t != null) {
            if (t.compareTo(this.mLower) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (t.compareTo(this.mUpper) <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("value must not be null");
    }

    public static <T extends Comparable<? super T>> Range<T> create(T t, T t2) {
        return new Range<>(t, t2);
    }

    public Range(T t, T t2) {
        if (t != null) {
            if (t2 != null) {
                this.mLower = t;
                this.mUpper = t2;
                if (t.compareTo(t2) <= 0) {
                    return;
                }
                throw new IllegalArgumentException("lower must be less than or equal to upper");
            }
            throw new IllegalArgumentException("upper must not be null");
        }
        throw new IllegalArgumentException("lower must not be null");
    }

    public final Range<T> extend(T t, T t2) {
        if (t != null) {
            if (t2 != null) {
                int compareTo = t.compareTo(this.mLower);
                int compareTo2 = t2.compareTo(this.mUpper);
                if (compareTo >= 0) {
                    if (compareTo2 <= 0) {
                        return this;
                    }
                    t = this.mLower;
                }
                if (compareTo2 <= 0) {
                    t2 = this.mUpper;
                }
                return create(t, t2);
            }
            throw new IllegalArgumentException("upper must not be null");
        }
        throw new IllegalArgumentException("lower must not be null");
    }

    public final Range<T> intersect(T t, T t2) {
        if (t != null) {
            if (t2 != null) {
                int compareTo = t.compareTo(this.mLower);
                int compareTo2 = t2.compareTo(this.mUpper);
                if (compareTo <= 0) {
                    if (compareTo2 >= 0) {
                        return this;
                    }
                    t = this.mLower;
                }
                if (compareTo2 >= 0) {
                    t2 = this.mUpper;
                }
                return create(t, t2);
            }
            throw new IllegalArgumentException("upper must not be null");
        }
        throw new IllegalArgumentException("lower must not be null");
    }
}
