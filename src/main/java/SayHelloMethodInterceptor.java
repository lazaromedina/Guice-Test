import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by luislazaro on 18/1/16.
 * lalazaro@keedio.com
 * Keedio
 */
//Intercepts calls on an interface on its way to the target.
public class SayHelloMethodInterceptor implements MethodInterceptor {
   public Object invoke(MethodInvocation invocation) throws Throwable {
      System.out.println("hola");
      return invocation.proceed();
   }
}
