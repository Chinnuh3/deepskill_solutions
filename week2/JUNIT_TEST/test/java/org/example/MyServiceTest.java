package org.example;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
public class MyServiceTest {
        @Test
        public void testExternalApi() {
            ExternalApi mock =Mockito.mock(ExternalApi.class);
            MyService ser = new MyService(mock);
            ser.fetchData();
            verify(mock).getData();
                }
            }

