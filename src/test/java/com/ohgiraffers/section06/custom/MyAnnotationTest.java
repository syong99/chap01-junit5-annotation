package com.ohgiraffers.section06.custom;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@EnabledOnOs(value = OS.MAC, disabledReason = "맥에서만 실행")
@Order(2)
@Test
public @interface MyAnnotationTest {
}
