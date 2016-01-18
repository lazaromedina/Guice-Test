import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by luislazaro on 18/1/16.
 * lalazaro@keedio.com
 * Keedio
 */
public class AopTest {
   @SayHello
   public void doSomething() {
      System.out.println("i am doing something");
   }

   public static void main(String[] args) {
      Injector injector = Guice.createInjector(new SayHelloModule());
      AopTest aopTest = injector.getInstance(AopTest.class);
      aopTest.doSomething();
   }
}
