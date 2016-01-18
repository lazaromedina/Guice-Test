import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by luislazaro on 18/1/16.
 * lalazaro@keedio.com
 * Keedio
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface SayHello {
   // Do nothing; used by Google Guice to intercept certain methods.
}
