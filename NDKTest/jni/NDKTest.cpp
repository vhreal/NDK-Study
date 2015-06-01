#include <jni.h>
#include <string.h>
extern "C"

jstring Java_com_example_ndktest_MainActivity_NDKTestFromJNI(JNIEnv* env,
		jobject thiz) {
	return env->NewStringUTF("Hello from JNI !");
}
