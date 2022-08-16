package com.amap.api.services.p126a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.amap.api.services.a.cf */
/* loaded from: classes18.dex */
public class C1914cf {

    /* renamed from: d */
    public static Map<Class<? extends AbstractC1913ce>, AbstractC1913ce> f24592d = new HashMap();

    /* renamed from: a */
    public C1917ci f24593a;

    /* renamed from: b */
    public SQLiteDatabase f24594b;

    /* renamed from: c */
    public AbstractC1913ce f24595c;

    /* renamed from: a */
    private boolean m16681a(Annotation annotation) {
        return annotation != null;
    }

    /* renamed from: a */
    public <T> void m16685a(String str, Class<T> cls) {
        synchronized (this.f24595c) {
            String m16693a = m16693a(m16678b(cls));
            if (TextUtils.isEmpty(m16693a)) {
                return;
            }
            this.f24594b = m16676b(false);
            if (this.f24594b == null) {
                return;
            }
            this.f24594b.delete(m16693a, str, null);
            if (this.f24594b != null) {
                this.f24594b.close();
                this.f24594b = null;
            }
        }
    }

    /* renamed from: a */
    public <T> void m16682a(String str, Object obj, boolean z) {
        synchronized (this.f24595c) {
            if (obj == null) {
                return;
            }
            AbstractC1915cg m16678b = m16678b(obj.getClass());
            String m16693a = m16693a(m16678b);
            if (TextUtils.isEmpty(m16693a)) {
                return;
            }
            ContentValues m16689a = m16689a(obj, m16678b);
            if (m16689a == null) {
                return;
            }
            this.f24594b = m16676b(z);
            if (this.f24594b == null) {
                return;
            }
            this.f24594b.update(m16693a, m16689a, str, null);
            if (this.f24594b != null) {
                this.f24594b.close();
                this.f24594b = null;
            }
        }
    }

    /* renamed from: a */
    public <T> void m16683a(String str, Object obj) {
        m16682a(str, obj, false);
    }

    /* renamed from: a */
    public void m16688a(Object obj, String str) {
        synchronized (this.f24595c) {
            List m16677b = m16677b(str, obj.getClass());
            if (m16677b == null || m16677b.size() == 0) {
                m16690a((C1914cf) obj);
            } else {
                m16683a(str, obj);
            }
        }
    }

    /* renamed from: a */
    public <T> void m16690a(T t) {
        m16686a((C1914cf) t, false);
    }

    /* renamed from: a */
    public <T> void m16686a(T t, boolean z) {
        synchronized (this.f24595c) {
            this.f24594b = m16676b(z);
            if (this.f24594b == null) {
                return;
            }
            m16694a(this.f24594b, (SQLiteDatabase) t);
            if (this.f24594b != null) {
                this.f24594b.close();
                this.f24594b = null;
            }
        }
    }

    /* renamed from: a */
    public <T> List<T> m16684a(String str, Class<T> cls, boolean z) {
        Cursor cursor;
        String str2;
        String str3;
        synchronized (this.f24595c) {
            ArrayList arrayList = new ArrayList();
            AbstractC1915cg m16678b = m16678b(cls);
            String m16693a = m16693a(m16678b);
            if (this.f24594b == null) {
                this.f24594b = m16679a(z);
            }
            if (this.f24594b == null || TextUtils.isEmpty(m16693a) || str == null) {
                return arrayList;
            }
            try {
                cursor = this.f24594b.query(m16693a, null, str, null, null, null, null);
                try {
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        C1901by.m16742a(th, "dbs", "sld");
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    try {
                        if (this.f24594b != null) {
                            this.f24594b.close();
                            this.f24594b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!z) {
                            str2 = "dbs";
                            str3 = "sld";
                            C1901by.m16742a(th, str2, str3);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            if (cursor == null) {
                this.f24594b.close();
                this.f24594b = null;
                if (this.f24594b != null) {
                    this.f24594b.close();
                    this.f24594b = null;
                }
                return arrayList;
            }
            while (cursor.moveToNext()) {
                arrayList.add(m16695a(cursor, cls, m16678b));
            }
            cursor.close();
            try {
                if (this.f24594b != null) {
                    this.f24594b.close();
                    this.f24594b = null;
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    str2 = "dbs";
                    str3 = "sld";
                    C1901by.m16742a(th, str2, str3);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private Field[] m16691a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        if (z) {
            return cls.getSuperclass().getDeclaredFields();
        }
        return cls.getDeclaredFields();
    }

    static {
        Covode.recordClassIndex(5525);
    }

    /* renamed from: a */
    private <T> String m16693a(AbstractC1915cg abstractC1915cg) {
        if (abstractC1915cg == null) {
            return null;
        }
        return abstractC1915cg.m16675a();
    }

    /* renamed from: a */
    private SQLiteDatabase m16679a(boolean z) {
        try {
            if (this.f24594b == null) {
                this.f24594b = this.f24593a.getReadableDatabase();
            }
        } catch (Throwable th) {
            if (!z) {
                C1901by.m16742a(th, "dbs", "grd");
            }
        }
        return this.f24594b;
    }

    /* renamed from: b */
    private <T> AbstractC1915cg m16678b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(AbstractC1915cg.class);
        if (!m16681a(annotation)) {
            return null;
        }
        return (AbstractC1915cg) annotation;
    }

    /* renamed from: b */
    private SQLiteDatabase m16676b(boolean z) {
        try {
            if (this.f24594b == null || this.f24594b.isReadOnly()) {
                if (this.f24594b != null) {
                    this.f24594b.close();
                }
                this.f24594b = this.f24593a.getWritableDatabase();
            }
        } catch (Throwable th) {
            C1901by.m16742a(th, "dbs", "gwd");
        }
        return this.f24594b;
    }

    /* renamed from: a */
    public static synchronized AbstractC1913ce m16692a(Class<? extends AbstractC1913ce> cls) {
        AbstractC1913ce abstractC1913ce;
        synchronized (C1914cf.class) {
            if (f24592d.get(cls) == null) {
                f24592d.put(cls, cls.newInstance());
            }
            abstractC1913ce = f24592d.get(cls);
        }
        return abstractC1913ce;
    }

    /* renamed from: a */
    public static String m16680a(Map<String, String> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : map.keySet()) {
            if (z) {
                sb.append(str);
                sb.append(" = '");
                sb.append(map.get(str));
                sb.append("'");
                z = false;
            } else {
                sb.append(" and ");
                sb.append(str);
                sb.append(" = '");
                sb.append(map.get(str));
                sb.append("'");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public <T> List<T> m16677b(String str, Class<T> cls) {
        return m16684a(str, (Class) cls, false);
    }

    public C1914cf(Context context, AbstractC1913ce abstractC1913ce) {
        try {
            this.f24593a = new C1917ci(context.getApplicationContext(), abstractC1913ce.mo16633a(), null, abstractC1913ce.mo16630b(), abstractC1913ce);
        } catch (Throwable unused) {
        }
        this.f24595c = abstractC1913ce;
    }

    /* renamed from: a */
    private ContentValues m16689a(Object obj, AbstractC1915cg abstractC1915cg) {
        Field[] m16691a;
        ContentValues contentValues = new ContentValues();
        for (Field field : m16691a(obj.getClass(), abstractC1915cg.m16674b())) {
            field.setAccessible(true);
            m16687a(obj, field, contentValues);
        }
        return contentValues;
    }

    /* renamed from: a */
    private <T> void m16694a(SQLiteDatabase sQLiteDatabase, T t) {
        ContentValues m16689a;
        AbstractC1915cg m16678b = m16678b(t.getClass());
        String m16693a = m16693a(m16678b);
        if (TextUtils.isEmpty(m16693a) || sQLiteDatabase == null || (m16689a = m16689a(t, m16678b)) == null) {
            return;
        }
        sQLiteDatabase.insert(m16693a, null, m16689a);
    }

    /* renamed from: a */
    private <T> T m16695a(Cursor cursor, Class<T> cls, AbstractC1915cg abstractC1915cg) {
        Field[] m16691a = m16691a((Class<?>) cls, abstractC1915cg.m16674b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : m16691a) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(AbstractC1916ch.class);
            if (annotation != null) {
                AbstractC1916ch abstractC1916ch = (AbstractC1916ch) annotation;
                int m16672b = abstractC1916ch.m16672b();
                int columnIndex = cursor.getColumnIndex(abstractC1916ch.m16673a());
                switch (m16672b) {
                    case 1:
                        field.set(newInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        continue;
                    case 2:
                        field.set(newInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        continue;
                    case 3:
                        field.set(newInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        continue;
                    case 4:
                        field.set(newInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        continue;
                    case 5:
                        field.set(newInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        continue;
                    case 6:
                        field.set(newInstance, cursor.getString(columnIndex));
                        continue;
                    case 7:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        continue;
                }
            }
        }
        return newInstance;
    }

    /* renamed from: a */
    private void m16687a(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(AbstractC1916ch.class);
        if (annotation == null) {
            return;
        }
        AbstractC1916ch abstractC1916ch = (AbstractC1916ch) annotation;
        try {
            switch (abstractC1916ch.m16672b()) {
                case 1:
                    contentValues.put(abstractC1916ch.m16673a(), Short.valueOf(field.getShort(obj)));
                    return;
                case 2:
                    contentValues.put(abstractC1916ch.m16673a(), Integer.valueOf(field.getInt(obj)));
                    return;
                case 3:
                    contentValues.put(abstractC1916ch.m16673a(), Float.valueOf(field.getFloat(obj)));
                    return;
                case 4:
                    contentValues.put(abstractC1916ch.m16673a(), Double.valueOf(field.getDouble(obj)));
                    return;
                case 5:
                    contentValues.put(abstractC1916ch.m16673a(), Long.valueOf(field.getLong(obj)));
                    return;
                case 6:
                    contentValues.put(abstractC1916ch.m16673a(), (String) field.get(obj));
                    return;
                case 7:
                    contentValues.put(abstractC1916ch.m16673a(), (byte[]) field.get(obj));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
