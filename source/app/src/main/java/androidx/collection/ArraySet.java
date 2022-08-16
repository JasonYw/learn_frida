package androidx.collection;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p003X.AbstractC139200d9o;
import p003X.C139175d9P;

/* loaded from: classes17.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {
    public static final int[] INT = new int[0];
    public static final Object[] OBJECT = new Object[0];
    public static Object[] sBaseCache;
    public static int sBaseCacheSize;
    public static Object[] sTwiceBaseCache;
    public static int sTwiceBaseCacheSize;
    public Object[] mArray;
    public AbstractC139200d9o<E, E> mCollections;
    public int[] mHashes;
    public int mSize;

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.mSize;
    }

    public ArraySet() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.mSize <= 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(797);
    }

    private AbstractC139200d9o<E, E> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new AbstractC139200d9o<E, E>() { // from class: androidx.collection.ArraySet.1
                static {
                    Covode.recordClassIndex(798);
                }

                @Override // p003X.AbstractC139200d9o
                public final int LIZ() {
                    return ArraySet.this.mSize;
                }

                @Override // p003X.AbstractC139200d9o
                public final void LIZJ() {
                    ArraySet.this.clear();
                }

                @Override // p003X.AbstractC139200d9o
                public final Map<E, E> LIZIZ() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // p003X.AbstractC139200d9o
                public final int LIZIZ(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                @Override // p003X.AbstractC139200d9o
                public final int LIZ(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                @Override // p003X.AbstractC139200d9o
                public final void LIZ(int i) {
                    ArraySet.this.removeAt(i);
                }

                @Override // p003X.AbstractC139200d9o
                public final Object LIZ(int i, int i2) {
                    return ArraySet.this.mArray[i];
                }

                @Override // p003X.AbstractC139200d9o
                public final E LIZ(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // p003X.AbstractC139200d9o
                public final void LIZ(E e, E e2) {
                    ArraySet.this.add(e);
                }
            };
        }
        return this.mCollections;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.mHashes;
        int i = this.mSize;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return getCollection().LIZLLL().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.mSize;
        Object[] objArr = new Object[i];
        System.arraycopy(this.mArray, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.mSize;
        if (i != 0) {
            freeArrays(this.mHashes, this.mArray, i);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        }
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 14);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    private int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int LIZ = C139175d9P.LIZ(this.mHashes, i, 0);
        if (LIZ < 0) {
            return LIZ;
        }
        if (this.mArray[LIZ] == null) {
            return LIZ;
        }
        int i2 = LIZ + 1;
        while (i2 < i && this.mHashes[i2] == 0) {
            if (this.mArray[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = LIZ - 1; i3 >= 0 && this.mHashes[i3] == 0; i3--) {
            if (this.mArray[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final E valueAt(int i) {
        return (E) this.mArray[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(ArraySet<E> arraySet) {
        this();
        if (arraySet != 0) {
            addAll((ArraySet) arraySet);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return indexOfNull();
        }
        return indexOf(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public ArraySet(int i) {
        if (i == 0) {
            this.mHashes = INT;
            this.mArray = OBJECT;
        } else {
            allocArrays(i);
        }
        this.mSize = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        ensureCapacity(this.mSize + collection.size());
        boolean z = false;
        for (E e : collection) {
            z |= add(e);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean removeAll(ArraySet<? extends E> arraySet) {
        int i = arraySet.mSize;
        int i2 = this.mSize;
        for (int i3 = 0; i3 < i; i3++) {
            remove(arraySet.valueAt(i3));
        }
        if (i2 == this.mSize) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.mSize - 1; i >= 0; i--) {
            if (!collection.contains(this.mArray[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    public final void addAll(ArraySet<? extends E> arraySet) {
        int i = arraySet.mSize;
        ensureCapacity(this.mSize + i);
        if (this.mSize == 0) {
            if (i > 0) {
                System.arraycopy(arraySet.mHashes, 0, this.mHashes, 0, i);
                System.arraycopy(arraySet.mArray, 0, this.mArray, 0, i);
                this.mSize = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            add(arraySet.valueAt(i2));
        }
    }

    public final void append(E e) {
        int hashCode;
        int i = this.mSize;
        if (e == null) {
            hashCode = 0;
        } else {
            hashCode = e.hashCode();
        }
        int[] iArr = this.mHashes;
        if (i < iArr.length) {
            if (i > 0 && iArr[i - 1] > hashCode) {
                add(e);
                return;
            }
            this.mSize = i + 1;
            this.mHashes[i] = hashCode;
            this.mArray[i] = e;
            return;
        }
        throw new IllegalStateException("Array is full");
    }

    public final void ensureCapacity(int i) {
        int[] iArr = this.mHashes;
        if (iArr.length < i) {
            Object[] objArr = this.mArray;
            allocArrays(i);
            int i2 = this.mSize;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i2);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.mSize; i++) {
                try {
                    if (!set.contains(valueAt(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.mSize) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.mSize));
        }
        System.arraycopy(this.mArray, 0, tArr, 0, this.mSize);
        int length = tArr.length;
        int i = this.mSize;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    private void allocArrays(int i) {
        if (i == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCache != null) {
                    Object[] objArr = sTwiceBaseCache;
                    this.mArray = objArr;
                    sTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    sTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCache != null) {
                    Object[] objArr2 = sBaseCache;
                    this.mArray = objArr2;
                    sBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    sBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int hashCode;
        int indexOf;
        if (e == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = e.hashCode();
            indexOf = indexOf(e, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i = ~indexOf;
        int i2 = this.mSize;
        if (i2 >= this.mHashes.length) {
            int i3 = 4;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i3 = 8;
            }
            int[] iArr = this.mHashes;
            Object[] objArr = this.mArray;
            allocArrays(i3);
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.mArray, 0, objArr.length);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
        int i4 = this.mSize;
        if (i < i4) {
            int[] iArr3 = this.mHashes;
            int i5 = i + 1;
            System.arraycopy(iArr3, i, iArr3, i5, i4 - i);
            Object[] objArr2 = this.mArray;
            System.arraycopy(objArr2, i, objArr2, i5, this.mSize - i);
        }
        this.mHashes[i] = hashCode;
        this.mArray[i] = e;
        this.mSize++;
        return true;
    }

    public final E removeAt(int i) {
        Object[] objArr = this.mArray;
        E e = (E) objArr[i];
        int i2 = this.mSize;
        if (i2 <= 1) {
            freeArrays(this.mHashes, objArr, i2);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            int i3 = 8;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr2 = this.mHashes;
                Object[] objArr2 = this.mArray;
                allocArrays(i3);
                this.mSize--;
                if (i > 0) {
                    System.arraycopy(iArr2, 0, this.mHashes, 0, i);
                    System.arraycopy(objArr2, 0, this.mArray, 0, i);
                }
                int i4 = this.mSize;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, this.mHashes, i, i4 - i);
                    System.arraycopy(objArr2, i5, this.mArray, i, this.mSize - i);
                    return e;
                }
            } else {
                this.mSize--;
                int i6 = this.mSize;
                if (i < i6) {
                    int[] iArr3 = this.mHashes;
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, iArr3, i, i6 - i);
                    Object[] objArr3 = this.mArray;
                    System.arraycopy(objArr3, i7, objArr3, i, this.mSize - i);
                }
                this.mArray[this.mSize] = null;
                return e;
            }
        }
        return e;
    }

    private int indexOf(Object obj, int i) {
        int i2 = this.mSize;
        if (i2 == 0) {
            return -1;
        }
        int LIZ = C139175d9P.LIZ(this.mHashes, i2, i);
        if (LIZ < 0) {
            return LIZ;
        }
        if (obj.equals(this.mArray[LIZ])) {
            return LIZ;
        }
        int i3 = LIZ + 1;
        while (i3 < i2 && this.mHashes[i3] == i) {
            if (obj.equals(this.mArray[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = LIZ - 1; i4 >= 0 && this.mHashes[i4] == i; i4--) {
            if (obj.equals(this.mArray[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static void freeArrays(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCacheSize < 10) {
                    objArr[0] = sTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    sTwiceBaseCache = objArr;
                    sTwiceBaseCacheSize++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCacheSize < 10) {
                    objArr[0] = sBaseCache;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    sBaseCache = objArr;
                    sBaseCacheSize++;
                }
            }
        }
    }
}
