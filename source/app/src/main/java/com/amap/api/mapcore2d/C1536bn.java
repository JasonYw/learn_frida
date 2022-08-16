package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.amap.api.mapcore2d.bn */
/* loaded from: classes19.dex */
public class C1536bn<T> implements List<T> {

    /* renamed from: a */
    public LinkedList<T> f23032a = new LinkedList<>();

    static {
        Covode.recordClassIndex(5084);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized void clear() {
        this.f23032a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean isEmpty() {
        return this.f23032a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        return this.f23032a.listIterator();
    }

    @Override // java.util.List
    public synchronized ListIterator<T> listIterator() {
        return this.f23032a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public synchronized int size() {
        return this.f23032a.size();
    }

    @Override // java.util.List, java.util.Collection
    public synchronized Object[] toArray() {
        return this.f23032a.toArray();
    }

    /* renamed from: a */
    public synchronized void m18267a(T t) {
        add(t);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean contains(Object obj) {
        return this.f23032a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean containsAll(Collection<?> collection) {
        return this.f23032a.containsAll(collection);
    }

    @Override // java.util.List
    public synchronized int indexOf(Object obj) {
        return this.f23032a.indexOf(obj);
    }

    @Override // java.util.List
    public synchronized int lastIndexOf(Object obj) {
        return this.f23032a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public synchronized T remove(int i) {
        return this.f23032a.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        return this.f23032a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        return this.f23032a.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean add(T t) {
        try {
        } catch (Throwable unused) {
            return true;
        }
        return this.f23032a.add(t);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.f23032a.addAll(collection);
    }

    @Override // java.util.List
    public synchronized T get(int i) {
        T t;
        try {
            t = this.f23032a.get(i);
        } catch (Exception e) {
            C1569cm.m18147a(e, "SyncList", "get");
        }
        return t;
    }

    @Override // java.util.List
    public synchronized ListIterator<T> listIterator(int i) {
        return this.f23032a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized boolean remove(Object obj) {
        return this.f23032a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public synchronized <V> V[] toArray(V[] vArr) {
        return (V[]) this.f23032a.toArray(vArr);
    }

    @Override // java.util.List
    public synchronized void add(int i, T t) {
        this.f23032a.add(i, t);
    }

    @Override // java.util.List
    public synchronized boolean addAll(int i, Collection<? extends T> collection) {
        return this.f23032a.addAll(i, collection);
    }

    @Override // java.util.List
    public synchronized T set(int i, T t) {
        return this.f23032a.set(i, t);
    }

    @Override // java.util.List
    public synchronized List<T> subList(int i, int i2) {
        return this.f23032a.subList(i, i2);
    }
}
