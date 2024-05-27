import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

class ClassWithStatics {
    public static String getString() {
        return "String";
    }

    public static int getInt() {
        return 1;
    }
}

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassWithStatics.class)
public class StubJustOneStatic {
    @Test
    public void test() {
        PowerMockito.mockStatic(ClassWithStatics.class);

        when(ClassWithStatics.getString()).thenReturn("Hello!");

        System.out.println("String: " + ClassWithStatics.getString());
        System.out.println("Int: " + ClassWithStatics.getInt());
    }
}