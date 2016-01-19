
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by luislazaro on 18/1/16.
 * lalazaro@keedio.com
 * Keedio
 * @see <https://docs.oracle.com/javase/tutorial/java/annotations/declaring.html>
 */
//The marked annotation is retained by the JVM so it can be used by the runtime environment.
@Retention(RetentionPolicy.RUNTIME)
// can be applied to a method-level annotation
@Target({ElementType.METHOD})
public @interface SayHello {
   // Do nothing; used by Google Guice to intercept certain methods.
}
