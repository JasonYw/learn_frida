package androidx.collection;

import com.bytedance.covode.number.Covode;
import p003X.C139175d9P;

/* loaded from: classes17.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public static final Object DELETED = new Object();
    public boolean mGarbage;
    public int[] mKeys;
    public int mSize;
    public Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    static {
        Covode.recordClassIndex(802);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        if (this.mGarbage) {
            m21191gc();
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
    private void m21191gc() {
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
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
    public SparseArrayCompat<E> m25208clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
            return sparseArrayCompat;
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

    public void remove(int i) {
        delete(i);
    }

    public E get(int i) {
        return get(i, null);
    }

    public boolean containsKey(int i) {
        if (indexOfKey(i) >= 0) {
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

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            m21191gc();
        }
        return C139175d9P.LIZ(this.mKeys, this.mSize, i);
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            m21191gc();
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
            m21191gc();
        }
        return (E) this.mValues[i];
    }

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.mKeys = C139175d9P.LIZ;
            this.mValues = C139175d9P.LIZJ;
        } else {
            int LIZ = C139175d9P.LIZ(i);
            this.mKeys = new int[LIZ];
            this.mValues = new Object[LIZ];
        }
        this.mSize = 0;
    }

    public void delete(int i) {
        int LIZ = C139175d9P.LIZ(this.mKeys, this.mSize, i);
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
            m21191gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void putAll(SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            put(sparseArrayCompat.keyAt(i), sparseArrayCompat.valueAt(i));
        }
    }

    public void removeAtRange(int i, int i2) {
        int min = Math.min(this.mSize, i2 + i);
        while (i < min) {
            removeAt(i);
            i++;
        }
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            m21191gc();
        }
        this.mValues[i] = e;
    }

    public E get(int i, E e) {
        int LIZ = C139175d9P.LIZ(this.mKeys, this.mSize, i);
        if (LIZ >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[LIZ] != DELETED) {
                return (E) objArr[LIZ];
            }
        }
        return e;
    }

    public void append(int i, E e) {
        int i2 = this.mSize;
        if (i2 != 0 && i <= this.mKeys[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            m21191gc();
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int LIZ = C139175d9P.LIZ(i3 + 1);
            int[] iArr = new int[LIZ];
            Object[] objArr = new Object[LIZ];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i3] = i;
        this.mValues[i3] = e;
        this.mSize = i3 + 1;
    }

    public void put(int i, E e) {
        int LIZ = C139175d9P.LIZ(this.mKeys, this.mSize, i);
        if (LIZ >= 0) {
            this.mValues[LIZ] = e;
            return;
        }
        int i2 = ~LIZ;
        if (i2 < this.mSize) {
            Object[] objArr = this.mValues;
            if (objArr[i2] == DELETED) {
                this.mKeys[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            m21191gc();
            i2 = ~C139175d9P.LIZ(this.mKeys, this.mSize, i);
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int LIZ2 = C139175d9P.LIZ(i3 + 1);
            int[] iArr = new int[LIZ2];
            Object[] objArr2 = new Object[LIZ2];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i4 = this.mSize;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.mKeys;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i2, objArr4, i5, this.mSize - i2);
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = e;
        this.mSize++;
    }
}