package com.android.ttcjpaysdk.base.json;

import android.net.Uri;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC103994QxI;

/* loaded from: classes8.dex */
public class CJPayJsonParser {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6274);
    }

    public static <T extends CJPayObject> T createObject(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        try {
            return cls.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T extends CJPayObject> Field[] getDeclaredFields(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (Field[]) proxy.result;
        }
        try {
            return cls.getDeclaredFields();
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T extends CJPayObject> Field[] getFields(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (Field[]) proxy.result;
        }
        try {
            return cls.getFields();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUrlForJson(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("cj_pay_network_api_to_json_url");
                if (optString != null) {
                    Uri parse = Uri.parse(optString);
                    new StringBuilder();
                    return C0002O.m25084C(parse.getScheme(), "://", parse.getHost(), parse.getPath());
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    public static boolean isNotNull(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj != null && !"null".equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public static <T extends CJPayObject> JSONObject toJsonObject(T t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject internalToJsonObject = internalToJsonObject(t);
        if (t != null && internalToJsonObject != null) {
            sendMonitor("obj2json", t.getClass(), System.currentTimeMillis() - currentTimeMillis, internalToJsonObject.length(), null);
        }
        return internalToJsonObject;
    }

    public static <T extends CJPayObject> JSONObject internalToJsonObject(T t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        if (t == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Field[] declaredFields = getDeclaredFields(t.getClass());
        if (declaredFields == null || declaredFields.length == 0) {
            return null;
        }
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                if (field.getAnnotation(AbstractC103994QxI.class) == null) {
                    Class<?> type = field.getType();
                    Object obj = field.get(t);
                    String name = field.getName();
                    if (!type.isPrimitive() && !type.equals(String.class)) {
                        if (List.class.isAssignableFrom(type)) {
                            Class cls = (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                            if (CJPayObject.class.isAssignableFrom(cls)) {
                                JSONArray jSONArray = new JSONArray();
                                for (CJPayObject cJPayObject : (List) obj) {
                                    jSONArray.put(internalToJsonObject(cJPayObject));
                                }
                                jSONObject.put(name, jSONArray);
                            } else if (cls.isPrimitive() || cls.equals(String.class)) {
                                JSONArray jSONArray2 = new JSONArray();
                                for (Object obj2 : (List) obj) {
                                    jSONArray2.put(obj2);
                                }
                                jSONObject.put(name, jSONArray2);
                            }
                        } else if (Map.class.isAssignableFrom(type)) {
                            Type[] actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
                            if (actualTypeArguments[0].equals(String.class) && actualTypeArguments[1].equals(String.class)) {
                                JSONObject jSONObject2 = new JSONObject();
                                for (Map.Entry entry : ((Map) obj).entrySet()) {
                                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                                }
                                if (jSONObject2.keys().hasNext()) {
                                    jSONObject.put(name, jSONObject2);
                                }
                            }
                        } else if (CJPayObject.class.isAssignableFrom(type)) {
                            jSONObject.put(name, internalToJsonObject((CJPayObject) obj));
                        } else if (JSONObject.class.isAssignableFrom(type)) {
                            jSONObject.put(name, obj);
                        }
                    } else {
                        jSONObject.put(name, obj);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static <T extends CJPayObject> T fromJson(String str, Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        long currentTimeMillis = System.currentTimeMillis();
        T t = (T) internalFromJson(str, cls);
        if (str != null) {
            sendMonitor("json2obj", cls, System.currentTimeMillis() - currentTimeMillis, str.length(), null);
        }
        return t;
    }

    public static <T extends CJPayObject> T internalFromJson(String str, Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        try {
            return (T) internalFromJson(new JSONObject(str), cls);
        } catch (Exception unused) {
            return (T) createObject(cls);
        }
    }

    public static <T extends CJPayObject> T fromJson(JSONObject jSONObject, Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, cls}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        long currentTimeMillis = System.currentTimeMillis();
        T t = (T) internalFromJson(jSONObject, cls);
        if (jSONObject != null) {
            sendMonitor("json2obj", cls, System.currentTimeMillis() - currentTimeMillis, jSONObject.length(), jSONObject);
        }
        return t;
    }

    public static <T extends CJPayObject> T internalFromJson(JSONObject jSONObject, Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, cls}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        T t = (T) createObject(cls);
        if (t == null) {
            return t;
        }
        if (jSONObject == null) {
            return t;
        }
        Field[] fields = getFields(cls);
        if (fields != null && fields.length > 0) {
            for (Field field : fields) {
                if (!Modifier.isFinal(field.getModifiers())) {
                    try {
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        if (type.isPrimitive()) {
                            Object opt = jSONObject.opt(field.getName());
                            if (isNotNull(opt)) {
                                field.set(t, opt);
                            }
                        } else if (List.class.isAssignableFrom(type)) {
                            ArrayList arrayList = new ArrayList();
                            Class cls2 = (Class) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                            JSONArray optJSONArray = jSONObject.optJSONArray(field.getName());
                            if (isNotNull(optJSONArray)) {
                                for (int i = 0; i < optJSONArray.length(); i++) {
                                    JSONArray optJSONArray2 = jSONObject.optJSONArray(field.getName());
                                    if (isNotNull(optJSONArray2)) {
                                        JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                                        if (isNotNull(optJSONObject)) {
                                            CJPayObject internalFromJson = internalFromJson(optJSONObject, cls2);
                                            if (isNotNull(internalFromJson)) {
                                                arrayList.add(internalFromJson);
                                            }
                                        } else {
                                            Object opt2 = optJSONArray2.opt(i);
                                            if (isNotNull(opt2)) {
                                                arrayList.add(opt2);
                                            }
                                        }
                                    }
                                }
                                field.set(t, arrayList);
                            }
                        } else if (Map.class.isAssignableFrom(type)) {
                            HashMap hashMap = new HashMap();
                            JSONObject optJSONObject2 = jSONObject.optJSONObject(field.getName());
                            if (isNotNull(optJSONObject2)) {
                                Iterator<String> keys = optJSONObject2.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, optJSONObject2.optString(next));
                                }
                                field.set(t, hashMap);
                            }
                        } else if (String.class.isAssignableFrom(type)) {
                            Object opt3 = jSONObject.opt(field.getName());
                            if (isNotNull(opt3)) {
                                field.set(t, opt3);
                            }
                        } else if (JSONObject.class.isAssignableFrom(type)) {
                            Object opt4 = jSONObject.opt(field.getName());
                            if (isNotNull(opt4)) {
                                field.set(t, opt4);
                            }
                        } else if (CJPayObject.class.isAssignableFrom(type)) {
                            Object opt5 = jSONObject.opt(field.getName());
                            if (isNotNull(opt5) && (opt5 instanceof JSONObject)) {
                                CJPayObject internalFromJson2 = internalFromJson((JSONObject) opt5, (Class<CJPayObject>) type);
                                if (isNotNull(internalFromJson2)) {
                                    field.set(t, internalFromJson2);
                                }
                            } else if (isNotNull(opt5) && (opt5 instanceof String)) {
                                CJPayObject internalFromJson3 = internalFromJson((String) opt5, (Class<CJPayObject>) type);
                                if (isNotNull(internalFromJson3)) {
                                    field.set(t, internalFromJson3);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return t;
    }

    public static void sendMonitor(String str, Class cls, long j, long j2, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, cls, new Long(j), new Long(j2), jSONObject}, null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        try {
            JSONObject LIZ = CJPayParamsUtils.LIZ("", "");
            LIZ.put("type", str);
            LIZ.put("className", cls.getName());
            LIZ.put("time", j);
            LIZ.put("size", j2);
            LIZ.put(PushConstants.WEB_URL, getUrlForJson(jSONObject));
            LIZ.put("server_type", CJPayHostInfo.serverType);
            C2118a.LIZ().LIZ("wallet_rd_json_parser_info", LIZ);
            C2118a.LIZ().LIZ("wallet_rd_json_parser_info", LIZ);
        } catch (Throwable unused) {
        }
    }
}
