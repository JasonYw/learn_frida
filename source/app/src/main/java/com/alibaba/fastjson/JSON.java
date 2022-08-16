package com.alibaba.fastjson;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class JSON {
    public static final TypeAdapter<Boolean> booleanAsIntAdapter = new TypeAdapter<Boolean>() { // from class: com.alibaba.fastjson.JSON.1
        static {
            Covode.recordClassIndex(4412);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final Boolean mo28739read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            int i = C10223.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                        }
                        throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
                    }
                    try {
                        if (jsonReader.nextInt() == 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Boolean bool) {
            if (bool == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(bool);
            }
        }
    };
    public static final TypeAdapter<Integer> intAsBooleanAdapter = new TypeAdapter<Integer>() { // from class: com.alibaba.fastjson.JSON.2
        static {
            Covode.recordClassIndex(4413);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final Integer mo28739read(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            int i = C10223.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Integer.valueOf(Boolean.parseBoolean(jsonReader.nextString()) ? 1 : 0);
                        }
                        throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
                    }
                    try {
                        return Integer.valueOf(jsonReader.nextInt());
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                jsonReader.nextNull();
                return null;
            }
            return Integer.valueOf(jsonReader.nextBoolean() ? 1 : 0);
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Integer num) {
            if (num == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(num);
            }
        }
    };

    public static Gson createAdapterGson() {
        return createAdapterGsonBuilder().create();
    }

    static {
        Covode.recordClassIndex(4411);
    }

    /* renamed from: com.alibaba.fastjson.JSON$3 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10223 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];

        static {
            Covode.recordClassIndex(4414);
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static GsonBuilder createAdapterGsonBuilder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Boolean.class, booleanAsIntAdapter);
        gsonBuilder.registerTypeAdapter(Boolean.TYPE, booleanAsIntAdapter);
        gsonBuilder.registerTypeAdapter(Integer.class, intAsBooleanAdapter);
        gsonBuilder.registerTypeAdapter(Integer.TYPE, intAsBooleanAdapter);
        gsonBuilder.setLenient();
        return gsonBuilder;
    }

    public static Gson createAdapterGsonFromGsonBuilder(GsonBuilder gsonBuilder) {
        return gsonBuilder.create();
    }

    public static String toJSONString(Object obj) {
        return GsonProtectorUtils.toJson(createAdapterGson(), obj);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        try {
            return (List) GsonProtectorUtils.fromJson(createAdapterGson(), str, C$Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, cls));
        } catch (NullPointerException unused) {
            return new ArrayList();
        }
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        Gson createAdapterGson = createAdapterGson();
        if (cls == null) {
            return (T) new JSONObject();
        }
        return (T) GsonProtectorUtils.fromJson(createAdapterGson, str, (Class<Object>) cls);
    }
}
