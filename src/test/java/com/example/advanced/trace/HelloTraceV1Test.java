package com.example.advanced.trace;

import com.example.advanced.app.trace.HelloTraceV1;
import com.example.advanced.app.trace.TraceStatus;
import org.junit.jupiter.api.Test;

public class HelloTraceV1Test {
    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.end(status);
    }
    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus status = trace.begin("hello");
        trace.exception(status, new IllegalStateException());
    }
}
