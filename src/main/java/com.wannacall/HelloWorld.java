package com.wannacall;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class HelloWorld implements HttpFunction {

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
        response.setStatusCode(200);
        response.getWriter().write("Hello, World!");
    }
}