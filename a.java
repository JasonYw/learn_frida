Class aClass = XposedHelpers.findClass("com.bytedance.retrofit2.SsHttpCall", packageParam.classLoader);

XposedBridge.hookAllMethods(aClass, "getResponseWithInterceptorChain", new XC_MethodHook() {

@Override

protected void beforeHookedMethod(MethodHookParam param) throws Throwable {

super.beforeHookedMethod(param);

}

@Override

protected void afterHookedMethod(MethodHookParam param) throws Throwable {

super.afterHookedMethod(param);

Object o = param.getResult();

if (o != null) {

Object rawRes = XposedHelpers.getObjectField(o, "rawResponse");

Object body = XposedHelpers.getObjectField(rawRes, "body");

byte[] bytes = (byte[]) XposedHelpers.getObjectField(body, "bytes");

String data = byte2String(bytes);

String url = (String) XposedHelpers.getObjectField(rawRes, "url");

}

}

});private static String byte2String(byte[] bytes) {

try {

return new String(bytes, "utf-8");

} catch (Exception e) {

return "异常转换";

}

}