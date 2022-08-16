package androidx.collection;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class LruCache<K, V> {
    public int createCount;
    public int evictionCount;
    public int hitCount;
    public final LinkedHashMap<K, V> map;
    public int maxSize;
    public int missCount;
    public int putCount;
    public int size;

    static {
        Covode.recordClassIndex(800);
    }

    public V create(K k) {
        return null;
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
    }

    public int sizeOf(K k, V v) {
        return 1;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.hitCount + this.missCount;
        if (i2 != 0) {
            i = (this.hitCount * 100) / i2;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i));
    }

    public LruCache(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public void resize(int i) {
        if (i > 0) {
            synchronized (this) {
                this.maxSize = i;
            }
            trimToSize(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V remove(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.map.remove(k);
                if (remove != null) {
                    this.size -= safeSizeOf(k, remove);
                }
            }
            if (remove != null) {
                entryRemoved(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final V get(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                V v = this.map.get(k);
                if (v != null) {
                    this.hitCount++;
                    return v;
                }
                this.missCount++;
                V create = create(k);
                if (create == null) {
                    return null;
                }
                synchronized (this) {
                    this.createCount++;
                    put = this.map.put(k, create);
                    if (put != null) {
                        this.map.put(k, put);
                    } else {
                        this.size += safeSizeOf(k, create);
                    }
                }
                if (put != null) {
                    entryRemoved(false, k, create, put);
                    return put;
                }
                trimToSize(this.maxSize);
                return create;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
        new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
        throw new java.lang.IllegalStateException(p002O.C0002O.m25086C(getClass().getName(), ".sizeOf() is reporting inconsistent results!"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.size     // Catch: java.lang.Throwable -> L6a
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L11
            int r0 = r4.size     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L51
        L11:
            int r0 = r4.size     // Catch: java.lang.Throwable -> L6a
            if (r0 <= r5) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L6a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6a
            if (r0 != 0) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L6a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L6a
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L6a
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch: java.lang.Throwable -> L6a
            r0.remove(r3)     // Catch: java.lang.Throwable -> L6a
            int r1 = r4.size     // Catch: java.lang.Throwable -> L6a
            int r0 = r4.safeSizeOf(r3, r2)     // Catch: java.lang.Throwable -> L6a
            int r1 = r1 - r0
            r4.size = r1     // Catch: java.lang.Throwable -> L6a
            int r0 = r4.evictionCount     // Catch: java.lang.Throwable -> L6a
            r1 = 1
            int r0 = r0 + r1
            r4.evictionCount = r0     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            r0 = 0
            r4.entryRemoved(r1, r3, r2, r0)
            goto L0
        L4f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            return
        L51:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            java.lang.String r1 = p002O.C0002O.m25086C(r1, r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }

    private int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final V put(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                put = this.map.put(k, v);
                if (put != null) {
                    this.size -= safeSizeOf(k, put);
                }
            }
            if (put != null) {
                entryRemoved(false, k, put, v);
            }
            trimToSize(this.maxSize);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
