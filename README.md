# Android_Sandbox
This is a sandbox that will be used during the semester, while we learn to program for Android

### ExpandableLists_Android
- This is an example project on how to create source code for drop down menus for Android Programming
- Create a Title, and then have it drop down with answers

### ANDROID_API2
- This application code is used to demostrate on how to make an API call from Android Studion using Java programming

## Libraries
1. [Volley](https://android.googlesource.com/platform/frameworks/volley) is a library that makes networking for Android apps easier and most importantly, faster.

## Programming Concepts for Android API
**Gradle Add** -  build.gradle(Module: app)
```
~compile~ 'com.android.volley:volley:1.1.1' <-- This is Deprecated. Use the "implementation" below
implementation 'com.android.volley:volley:1.1.1'

ReSync your app after adding the add on
```
## Programming Concepts for Android API
**AndroidManifest - Internet Permissions** -  b
```
    <uses-permission android:name="android.permission.INTERNET" />

```

## Programming Concepts for Android API
**Single API call with a single item of data being returned** -  For sharing elements between activities 
```
JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
                "https://jsonplaceholder.typicode.com/todos/1", null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d("JSON:", "onResponse: " + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error", "onErrorResponse: " + error.getMessage());

            }
        });

        requestQueue.add(jsonObjectRequest);
```
** API with multiple values and a single call with data being returned** -  
```
JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                "https://jsonplaceholder.typicode.com/todos", null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("JSON:", "onResponse: " + response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error", "onErrorResponse: " + error.getMessage());

            }
        });

        requestQueue.add(jsonArrayRequest);
```
** API with multiple values and multipel data criteria being pulled, based on id, title and completed** -  
```
JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                "https://jsonplaceholder.typicode.com/todos", (JSONArray) null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {


                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        Log.d("JSonArray", "onResponse: "
                                + jsonObject.getString("id") +
                                " "+jsonObject.getString("title"));
                        boolean d = jsonObject.getBoolean("completed");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        requestQueue.add(jsonArrayRequest);
```
# ANDROID NOTIFICATIONS
Android Notifications provides a list of broken down sections that will guide you through how to create a local connection, create a token, Save Items to web service/Fire Cloud Messaging DB
![Android Notifications - Intro ](https://github.com/pointparkuniversity/Android_Sandbox/blob/master/AndroidNotifications.png)
https://youtu.be/5NUa_vvEEaU
![Android Notifications - Create Token ](https://github.com/pointparkuniversity/Android_Sandbox/blob/master/NotificationsCreateToken.png)
https://youtu.be/vWPM49pn9Tk
![Android Notifications - Save Items ](https://github.com/pointparkuniversity/Android_Sandbox/blob/master/NotificationsSavingItems.png)
https://youtu.be/oX671RJhMrQ

