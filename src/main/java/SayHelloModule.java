import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * Created by luislazaro on 18/1/16.
 * lalazaro@keedio.com
 * Keedio
 */
public class SayHelloModule extends AbstractModule {
   @Override
   protected void configure(){
      bindInterceptor(Matchers.any(), Matchers.annotatedWith(SayHello.class),new SayHelloMethodInterceptor());
   }

}


