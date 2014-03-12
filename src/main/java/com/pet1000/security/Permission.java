package com.pet1000.security;

import java.lang.annotation.*;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Permission {
	
	String permission();

}
