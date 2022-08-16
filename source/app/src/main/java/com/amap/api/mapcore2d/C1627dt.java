package com.amap.api.mapcore2d;

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

/* renamed from: com.amap.api.mapcore2d.dt */
/* loaded from: classes18.dex */
public class C1627dt {

    /* renamed from: d */
    public static Map<Class<? extends AbstractC1626ds>, AbstractC1626ds> f23399d = new HashMap();

    /* renamed from: a */
    public C1630dw f23400a;

    /* renamed from: b */
    public SQLiteDatabase f23401b;

    /* renamed from: c */
    public AbstractC1626ds f23402c;

    /* renamed from: a */
    private boolean m17810a(Annotation annotation) {
        return annotation != null;
    }

    /* renamed from: a */
    public <T> void m17814a(String str, Class<T> cls) {
        synchronized (this.f23402c) {
            String m17822a = m17822a(m17807b(cls));
            if (TextUtils.isEmpty(m17822a)) {
                return;
            }
            this.f23401b = m17805b(false);
            if (this.f23401b == null) {
                return;
            }
            this.f23401b.delete(m17822a, str, null);
            if (this.f23401b != null) {
                this.f23401b.close();
                this.f23401b = null;
            }
        }
    }

    /* renamed from: a */
    public <T> void m17811a(String str, Object obj, boolean z) {
        synchronized (this.f23402c) {
            if (obj == null) {
                return;
            }
            AbstractC1628du m17807b = m17807b(obj.getClass());
            String m17822a = m17822a(m17807b);
            if (TextUtils.isEmpty(m17822a)) {
                return;
            }
            ContentValues m17818a = m17818a(obj, m17807b);
            if (m17818a == null) {
                return;
            }
            this.f23401b = m17805b(z);
            if (this.f23401b == null) {
                return;
            }
            this.f23401b.update(m17822a, m17818a, str, null);
            if (this.f23401b != null) {
                this.f23401b.close();
                this.f23401b = null;
            }
        }
    }

    /* renamed from: a */
    public <T> void m17812a(String str, Object obj) {
        m17811a(str, obj, false);
    }

    /* renamed from: a */
    public void m17817a(Object obj, String str) {
        synchronized (this.f23402c) {
            List m17806b = m17806b(str, obj.getClass());
            if (m17806b == null || m17806b.size() == 0) {
                m17819a((C1627dt) obj);
            } else {
                m17812a(str, obj);
            }
        }
    }

    /* renamed from: a */
    public <T> void m17819a(T t) {
        m17815a((C1627dt) t, false);
    }

    /* renamed from: a */
    public <T> void m17815a(T t, boolean z) {
        synchronized (this.f23402c) {
            this.f23401b = m17805b(z);
            if (this.f23401b == null) {
                return;
            }
            m17823a(this.f23401b, (SQLiteDatabase) t);
            if (this.f23401b != null) {
                this.f23401b.close();
                this.f23401b = null;
            }
        }
    }

    /* renamed from: a */
    public <T> List<T> m17813a(String str, Class<T> cls, boolean z) {
        Cursor cursor;
        String str2;
        String str3;
        synchronized (this.f23402c) {
            ArrayList arrayList = new ArrayList();
            AbstractC1628du m17807b = m17807b(cls);
            String m17822a = m17822a(m17807b);
            if (this.f23401b == null) {
                this.f23401b = m17808a(z);
            }
            if (this.f23401b == null || TextUtils.isEmpty(m17822a) || str == null) {
                return arrayList;
            }
            try {
                cursor = this.f23401b.query(m17822a, null, str, null, null, null, null);
                try {
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        C1612dl.m17891a(th, "dbs", "sld");
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    try {
                        if (this.f23401b != null) {
                            this.f23401b.close();
                            this.f23401b = null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!z) {
                            str2 = "dbs";
                            str3 = "sld";
                            C1612dl.m17891a(th, str2, str3);
                        }
                    }
                    return arrayList;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
            if (cursor == null) {
                this.f23401b.close();
                this.f23401b = null;
                if (this.f23401b != null) {
                    this.f23401b.close();
                    this.f23401b = null;
                }
                return arrayList;
            }
            while (cursor.moveToNext()) {
                arrayList.add(m17824a(cursor, cls, m17807b));
            }
            cursor.close();
            try {
                if (this.f23401b != null) {
                    this.f23401b.close();
                    this.f23401b = null;
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    str2 = "dbs";
                    str3 = "sld";
                    C1612dl.m17891a(th, str2, str3);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private Field[] m17820a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        if (z) {
            return cls.getSuperclass().getDeclaredFields();
        }
        return cls.getDeclaredFields();
    }

    static {
        Covode.recordClassIndex(5175);
    }

    /* renamed from: a */
    private <T> String m17822a(AbstractC1628du abstractC1628du) {
        if (abstractC1628du == null) {
            return null;
        }
        return abstractC1628du.m17804a();
    }

    /* renamed from: a */
    private SQLiteDatabase m17808a(boolean z) {
        try {
            if (this.f23401b == null) {
                this.f23401b = this.f23400a.getReadableDatabase();
            }
        } catch (Throwable th) {
            if (!z) {
                C1612dl.m17891a(th, "dbs", "grd");
            }
        }
        return this.f23401b;
    }

    /* renamed from: b */
    private <T> AbstractC1628du m17807b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(AbstractC1628du.class);
        if (!m17810a(annotation)) {
            return null;
        }
        return (AbstractC1628du) annotation;
    }

    /* renamed from: b */
    private SQLiteDatabase m17805b(boolean z) {
        try {
            if (this.f23401b == null || this.f23401b.isReadOnly()) {
                if (this.f23401b != null) {
                    this.f23401b.close();
                }
                this.f23401b = this.f23400a.getWritableDatabase();
            }
        } catch (Throwable th) {
            C1612dl.m17891a(th, "dbs", "gwd");
        }
        return this.f23401b;
    }

    /* renamed from: a */
    public static synchronized AbstractC1626ds m17821a(Class<? extends AbstractC1626ds> cls) {
        AbstractC1626ds abstractC1626ds;
        synchronized (C1627dt.class) {
            if (f23399d.get(cls) == null) {
                f23399d.put(cls, cls.newInstance());
            }
            abstractC1626ds = f23399d.get(cls);
        }
        return abstractC1626ds;
    }

    /* renamed from: a */
    public static String m17809a(Map<String, String> map) {
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
    public <T> List<T> m17806b(String str, Class<T> cls) {
        return m17813a(str, (Class) cls, false);
    }

    public C1627dt(Context context, AbstractC1626ds abstractC1626ds) {
        try {
            this.f23400a = new C1630dw(context.getApplicationContext(), abstractC1626ds.mo17746a(), null, abstractC1626ds.mo17743b(), abstractC1626ds);
        } catch (Throwable unused) {
        }
        this.f23402c = abstractC1626ds;
    }

    /* renamed from: a */
    private ContentValues m17818a(Object obj, AbstractC1628du abstractC1628du) {
        Field[] m17820a;
        ContentValues contentValues = new ContentValues();
        for (Field field : m17820a(obj.getClass(), abstractC1628du.m17803b())) {
            field.setAccessible(true);
            m17816a(obj, field, contentValues);
        }
        return contentValues;
    }

    /* renamed from: a */
    private <T> void m17823a(SQLiteDatabase sQLiteDatabase, T t) {
        ContentValues m17818a;
        AbstractC1628du m17807b = m17807b(t.getClass());
        String m17822a = m17822a(m17807b);
        if (TextUtils.isEmpty(m17822a) || sQLiteDatabase == null || (m17818a = m17818a(t, m17807b)) == null) {
            return;
        }
        sQLiteDatabase.insert(m17822a, null, m17818a);
    }

    /* renamed from: a */
    private <T> T m17824a(Cursor cursor, Class<T> cls, AbstractC1628du abstractC1628du) {
        Field[] m17820a = m17820a((Class<?>) cls, abstractC1628du.m17803b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : m17820a) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(AbstractC1629dv.class);
            if (annotation != null) {
                AbstractC1629dv abstractC1629dv = (AbstractC1629dv) annotation;
                int m17801b = abstractC1629dv.m17801b();
                int columnIndex = cursor.getColumnIndex(abstractC1629dv.m17802a());
                switch (m17801b) {
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
    private void m17816a(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(AbstractC1629dv.class);
        if (annotation == null) {
            return;
        }
        AbstractC1629dv abstractC1629dv = (AbstractC1629dv) annotation;
        try {
            switch (abstractC1629dv.m17801b()) {
                case 1:
                    contentValues.put(abstractC1629dv.m17802a(), Short.valueOf(field.getShort(obj)));
                    return;
                case 2:
                    contentValues.put(abstractC1629dv.m17802a(), Integer.valueOf(field.getInt(obj)));
                    return;
                case 3:
                    contentValues.put(abstractC1629dv.m17802a(), Float.valueOf(field.getFloat(obj)));
                    return;
                case 4:
                    contentValues.put(abstractC1629dv.m17802a(), Double.valueOf(field.getDouble(obj)));
                    return;
                case 5:
                    contentValues.put(abstractC1629dv.m17802a(), Long.valueOf(field.getLong(obj)));
                    return;
                case 6:
                    contentValues.put(abstractC1629dv.m17802a(), (String) field.get(obj));
                    return;
                case 7:
                    contentValues.put(abstractC1629dv.m17802a(), (byte[]) field.get(obj));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
