package androidx.collection;

import com.bytedance.covode.number.Covode;
import p003X.C139175d9P;

/* loaded from: classes17.dex */
public class LongSparseArray<E> implements Cloneable {
    public static final Object DELETED = new Object();
    public boolean mGarbage;
    public long[] mKeys;
    public int mSize;
    public Object[] mValues;

    public LongSparseArray() {
        this(10);
    }

    static {
        Covode.recordClassIndex(799);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        if (this.mGarbage) {
            m21192gc();
        }
        return this.mSize;
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    /* renamed from: gc */
    private void m21192gc() {
        int i = this.mSize;
        long[] jArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    /* renamed from: clone */
    public LongSparseArray<E> m25207clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.mKeys = (long[]) this.mKeys.clone();
            longSparseArray.mValues = (Object[]) this.mValues.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            E valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void remove(long j) {
        delete(j);
    }

    public E get(long j) {
        return get(j, null);
    }

    public boolean containsKey(long j) {
        if (indexOfKey(j) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(E e) {
        if (indexOfValue(e) >= 0) {
            return true;
        }
        return false;
    }

    public int indexOfKey(long j) {
        if (this.mGarbage) {
            m21192gc();
        }
        return C139175d9P.LIZ(this.mKeys, this.mSize, j);
    }

    public long keyAt(int i) {
        if (this.mGarbage) {
            m21192gc();
        }
        return this.mKeys[i];
    }

    public void removeAt(int i) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.mGarbage = true;
        }
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            m21192gc();
        }
        return (E) this.mValues[i];
    }

    public LongSparseArray(int i) {
        if (i == 0) {
            this.mKeys = C139175d9P.LIZIZ;
            this.mValues = C139175d9P.LIZJ;
        } else {
            int LIZIZ = C139175d9P.LIZIZ(i);
            this.mKeys = new long[LIZIZ];
            this.mValues = new Object[LIZIZ];
        }
        this.mSize = 0;
    }

    public void delete(long j) {
        int LIZ = C139175d9P.LIZ(this.mKeys, this.mSize, j);
        if (LIZ >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[LIZ];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[LIZ] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            m21192gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void putAll(LongSparseArray<? extends E> longSparseArray) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            put(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
        }
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            m21192gc();
        }
        this.mValues[i] = e;
    }

    public E get(long j, E e) {
        int LIZ = C139175d9P.LIZ(this.mKeys, this.mSize, j);
        if (LIZ >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[LIZ] != DELETED) {
                return (E) objArr[LIZ];
            }
        }
        return e;
    }

    public void append(long j, E e) {
        int i = this.mSize;
        if (i != 0 && j <= this.mKeys[i - 1]) {
            put(j, e);
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            m21192gc();
        }
        int i2 = this.mSize;
        if (i2 >= this.mKeys.length) {
            int LIZIZ = C139175d9P.LIZIZ(i2 + 1);
            long[] jArr = new long[LIZIZ];
            Object[] objArr = new Object[LIZIZ];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = jArr;
            this.mValues = objArr;
        }
        this.mKeys[i2] = j;
        this.mValues[i2] = e;
        this.mSize = i2 + 1;
    }

    public void put(long j, E e) {
        int LIZ = C139175d9P.LIZ(this.mKeys, this.mSize, j);
        if (LIZ >= 0) {
            this.mValues[LIZ] = e;
            return;
        }
        int i = ~LIZ;
        if (i < this.mSize) {
            Object[] objArr = this.mValues;
            if (objArr[i] == DELETED) {
                this.mKeys[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            m21192gc();
            i = ~C139175d9P.LIZ(this.mKeys, this.mSize, j);
        }
        int i2 = this.mSize;
        if (i2 >= this.mKeys.length) {
            int LIZIZ = C139175d9P.LIZIZ(i2 + 1);
            long[] jArr = new long[LIZIZ];
            Object[] objArr2 = new Object[LIZIZ];
            long[] jArr2 = this.mKeys;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = jArr;
            this.mValues = objArr2;
        }
        int i3 = this.mSize;
        if (i3 - i != 0) {
            long[] jArr3 = this.mKeys;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i, objArr4, i4, this.mSize - i);
        }
        this.mKeys[i] = j;
        this.mValues[i] = e;
        this.mSize++;
    }
}
